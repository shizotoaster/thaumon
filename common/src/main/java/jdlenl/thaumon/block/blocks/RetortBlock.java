package jdlenl.thaumon.block.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import java.util.List;

public class RetortBlock extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING;
    public static final BooleanProperty WATERLOGGED;

    public RetortBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        list.add(Component.translatable("tooltip.thaumon.canbeplaced"));
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Vec3 offset = state.getOffset(world, pos);
        VoxelShape shape = switch (state.getValue(FACING)) {
            case NORTH ->
                    Shapes.or(box(3.5, 4.5, 8.0, 6.5, 5.5, 9.0), box(6.0, 3.0, 7.0, 9.0, 6.0, 10.0), box(7.0, 0.0, 8.0, 8.0, 1.0, 9.0), box(5.5, 2.0, 6.5, 9.5, 3.0, 10.5));
            case EAST ->
                    Shapes.or(box(7.0, 4.5, 3.5, 8.0, 5.5, 6.5), box(6.0, 3.0, 6.0, 9.0, 6.0, 9.0), box(7.0, 0.0, 7.0, 8.0, 1.0, 8.0), box(5.5, 2.0, 5.5, 9.5, 3.0, 9.5));
            case WEST ->
                    Shapes.or(box(8.0, 4.5, 9.5, 9.0, 5.5, 12.5), box(7.0, 3.0, 7.0, 10.0, 6.0, 10.0), box(8.0, 0.0, 8.0, 9.0, 1.0, 9.0), box(6.5, 2.0, 6.5, 10.5, 3.0, 10.5));
            default ->
                    Shapes.or(box(9.5, 4.5, 7.0, 12.5, 5.5, 8.0), box(7.0, 3.0, 6.0, 10.0, 6.0, 9.0), box(8.0, 0.0, 7.0, 9.0, 1.0, 8.0), box(6.5, 2.0, 5.5, 10.5, 3.0, 9.5));
        };

        return shape.move(offset.x, offset.y, offset.z);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean isWater = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, isWater);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
    }

    @Override
    public SoundType getSoundType(BlockState state) {
        return new SoundType(1.0F, 1.0F,
                SoundEvent.createVariableRangeEvent(ResourceLocation.withDefaultNamespace("block.glass.break")),
                SoundEvent.createVariableRangeEvent(ResourceLocation.withDefaultNamespace("block.glass.step")),
                SoundEvent.createVariableRangeEvent(ResourceLocation.withDefaultNamespace("block.lantern.place")),
                SoundEvent.createVariableRangeEvent(ResourceLocation.withDefaultNamespace("block.lantern.hit")),
                SoundEvent.createVariableRangeEvent(ResourceLocation.withDefaultNamespace("block.glass.fall"))
        );
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
