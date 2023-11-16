package jdlenl.thaumon.block.blocks;

import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import java.util.List;

public class RetortBlock extends Block implements Waterloggable {
    public static final DirectionProperty FACING;
    public static final BooleanProperty WATERLOGGED;

    public RetortBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    public void appendTooltip(ItemStack itemstack, BlockView world, List<Text> list, TooltipContext flag) {
        list.add(Text.translatable("tooltip.thaumon.canbeplaced"));
    }

    public boolean isTransparent(BlockState state, BlockView reader, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public int getOpacity(BlockState state, BlockView worldIn, BlockPos pos) {
        return 0;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d offset = state.getModelOffset(world, pos);
        VoxelShape shape;
        switch (state.get(FACING)) {
            case NORTH:
                shape = VoxelShapes.union(createCuboidShape(3.5, 4.5, 8.0, 6.5, 5.5, 9.0), new VoxelShape[]{createCuboidShape(6.0, 3.0, 7.0, 9.0, 6.0, 10.0), createCuboidShape(7.0, 0.0, 8.0, 8.0, 1.0, 9.0), createCuboidShape(5.5, 2.0, 6.5, 9.5, 3.0, 10.5)});
                break;
            case EAST:
                shape = VoxelShapes.union(createCuboidShape(7.0, 4.5, 3.5, 8.0, 5.5, 6.5), new VoxelShape[]{createCuboidShape(6.0, 3.0, 6.0, 9.0, 6.0, 9.0), createCuboidShape(7.0, 0.0, 7.0, 8.0, 1.0, 8.0), createCuboidShape(5.5, 2.0, 5.5, 9.5, 3.0, 9.5)});
                break;
            case WEST:
                shape = VoxelShapes.union(createCuboidShape(8.0, 4.5, 9.5, 9.0, 5.5, 12.5), new VoxelShape[]{createCuboidShape(7.0, 3.0, 7.0, 10.0, 6.0, 10.0), createCuboidShape(8.0, 0.0, 8.0, 9.0, 1.0, 9.0), createCuboidShape(6.5, 2.0, 6.5, 10.5, 3.0, 10.5)});
                break;
            default:
                shape = VoxelShapes.union(createCuboidShape(9.5, 4.5, 7.0, 12.5, 5.5, 8.0), new VoxelShape[]{createCuboidShape(7.0, 3.0, 6.0, 10.0, 6.0, 9.0), createCuboidShape(8.0, 0.0, 7.0, 9.0, 1.0, 8.0), createCuboidShape(6.5, 2.0, 5.5, 10.5, 3.0, 9.5)});
        }

        return shape.offset(offset.x, offset.y, offset.z);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    public BlockState getPlacementState(ItemPlacementContext context) {
        boolean isWater = context.getWorld().getFluidState(context.getBlockPos()).getFluid() == Fluids.WATER;
        return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().getOpposite()).with(WATERLOGGED, isWater);
    }

    public BlockState rotate(BlockState state, BlockRotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.get(FACING)));
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState facingState, WorldAccess world, BlockPos currentPos, BlockPos facingPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, facing, facingState, world, currentPos, facingPos);
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
        WATERLOGGED = Properties.WATERLOGGED;
    }
}
