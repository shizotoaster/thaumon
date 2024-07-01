package jdlenl.thaumon.block.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
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

public class GrimoireStackBlock extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING;
    public static final BooleanProperty WATERLOGGED;

    public GrimoireStackBlock(BlockBehaviour.Properties settings) {
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
                    Shapes.or(box(5.0, 1.5, 4.0, 11.0, 2.0, 12.0), box(5.5, 0.5, 4.25, 10.75, 1.5, 11.75), box(10.5, 0.5, 4.0, 11.0, 1.5, 12.0), box(5.0, 0.0, 4.0, 11.0, 0.5, 12.0), box(4.5, 3.5, 3.5, 10.5, 4.0, 11.5), box(5.0, 2.5, 3.75, 10.25, 3.5, 11.25), box(10.0, 2.5, 3.5, 10.5, 3.5, 11.5), box(4.5, 2.0, 3.5, 10.5, 2.5, 11.5), box(5.25, 5.5, 3.5, 11.25, 6.0, 11.5), box(5.75, 4.5, 3.75, 11.0, 5.5, 11.25), box(10.75, 4.5, 3.5, 11.25, 5.5, 11.5), box(5.25, 4.0, 3.5, 11.25, 4.5, 11.5));
            case EAST ->
                    Shapes.or(box(4.0, 1.5, 5.0, 12.0, 2.0, 11.0), box(4.25, 0.5, 5.5, 11.75, 1.5, 10.75), box(4.0, 0.5, 10.5, 12.0, 1.5, 11.0), box(4.0, 0.0, 5.0, 12.0, 0.5, 11.0), box(4.5, 3.5, 4.5, 12.5, 4.0, 10.5), box(4.75, 2.5, 5.0, 12.25, 3.5, 10.25), box(4.5, 2.5, 10.0, 12.5, 3.5, 10.5), box(4.5, 2.0, 4.5, 12.5, 2.5, 10.5), box(4.5, 5.5, 5.25, 12.5, 6.0, 11.25), box(4.75, 4.5, 5.75, 12.25, 5.5, 11.0), box(4.5, 4.5, 10.75, 12.5, 5.5, 11.25), box(4.5, 4.0, 5.25, 12.5, 4.5, 11.25));
            case WEST ->
                    Shapes.or(box(4.0, 1.5, 5.0, 12.0, 2.0, 11.0), box(4.25, 0.5, 5.25, 11.75, 1.5, 10.5), box(4.0, 0.5, 5.0, 12.0, 1.5, 5.5), box(4.0, 0.0, 5.0, 12.0, 0.5, 11.0), box(3.5, 3.5, 5.5, 11.5, 4.0, 11.5), box(3.75, 2.5, 5.75, 11.25, 3.5, 11.0), box(3.5, 2.5, 5.5, 11.5, 3.5, 6.0), box(3.5, 2.0, 5.5, 11.5, 2.5, 11.5), box(3.5, 5.5, 4.75, 11.5, 6.0, 10.75), box(3.75, 4.5, 5.0, 11.25, 5.5, 10.25), box(3.5, 4.5, 4.75, 11.5, 5.5, 5.25), box(3.5, 4.0, 4.75, 11.5, 4.5, 10.75));
            default ->
                    Shapes.or(box(5.0, 1.5, 4.0, 11.0, 2.0, 12.0), box(5.25, 0.5, 4.25, 10.5, 1.5, 11.75), box(5.0, 0.5, 4.0, 5.5, 1.5, 12.0), box(5.0, 0.0, 4.0, 11.0, 0.5, 12.0), box(5.5, 3.5, 4.5, 11.5, 4.0, 12.5), box(5.75, 2.5, 4.75, 11.0, 3.5, 12.25), box(5.5, 2.5, 4.5, 6.0, 3.5, 12.5), box(5.5, 2.0, 4.5, 11.5, 2.5, 12.5), box(4.75, 5.5, 4.5, 10.75, 6.0, 12.5), box(5.0, 4.5, 4.75, 10.25, 5.5, 12.25), box(4.75, 4.5, 4.5, 5.25, 5.5, 12.5), box(4.75, 4.0, 4.5, 10.75, 4.5, 12.5));
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

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
