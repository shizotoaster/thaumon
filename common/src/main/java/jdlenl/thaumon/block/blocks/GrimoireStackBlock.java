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

public class GrimoireStackBlock extends Block implements Waterloggable {
    public static final DirectionProperty FACING;
    public static final BooleanProperty WATERLOGGED;

    public GrimoireStackBlock(AbstractBlock.Settings settings) {
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
                shape = VoxelShapes.union(createCuboidShape(5.0, 1.5, 4.0, 11.0, 2.0, 12.0), new VoxelShape[]{createCuboidShape(5.5, 0.5, 4.25, 10.75, 1.5, 11.75), createCuboidShape(10.5, 0.5, 4.0, 11.0, 1.5, 12.0), createCuboidShape(5.0, 0.0, 4.0, 11.0, 0.5, 12.0), createCuboidShape(4.5, 3.5, 3.5, 10.5, 4.0, 11.5), createCuboidShape(5.0, 2.5, 3.75, 10.25, 3.5, 11.25), createCuboidShape(10.0, 2.5, 3.5, 10.5, 3.5, 11.5), createCuboidShape(4.5, 2.0, 3.5, 10.5, 2.5, 11.5), createCuboidShape(5.25, 5.5, 3.5, 11.25, 6.0, 11.5), createCuboidShape(5.75, 4.5, 3.75, 11.0, 5.5, 11.25), createCuboidShape(10.75, 4.5, 3.5, 11.25, 5.5, 11.5), createCuboidShape(5.25, 4.0, 3.5, 11.25, 4.5, 11.5)});
                break;
            case EAST:
                shape = VoxelShapes.union(createCuboidShape(4.0, 1.5, 5.0, 12.0, 2.0, 11.0), new VoxelShape[]{createCuboidShape(4.25, 0.5, 5.5, 11.75, 1.5, 10.75), createCuboidShape(4.0, 0.5, 10.5, 12.0, 1.5, 11.0), createCuboidShape(4.0, 0.0, 5.0, 12.0, 0.5, 11.0), createCuboidShape(4.5, 3.5, 4.5, 12.5, 4.0, 10.5), createCuboidShape(4.75, 2.5, 5.0, 12.25, 3.5, 10.25), createCuboidShape(4.5, 2.5, 10.0, 12.5, 3.5, 10.5), createCuboidShape(4.5, 2.0, 4.5, 12.5, 2.5, 10.5), createCuboidShape(4.5, 5.5, 5.25, 12.5, 6.0, 11.25), createCuboidShape(4.75, 4.5, 5.75, 12.25, 5.5, 11.0), createCuboidShape(4.5, 4.5, 10.75, 12.5, 5.5, 11.25), createCuboidShape(4.5, 4.0, 5.25, 12.5, 4.5, 11.25)});
                break;
            case WEST:
                shape = VoxelShapes.union(createCuboidShape(4.0, 1.5, 5.0, 12.0, 2.0, 11.0), new VoxelShape[]{createCuboidShape(4.25, 0.5, 5.25, 11.75, 1.5, 10.5), createCuboidShape(4.0, 0.5, 5.0, 12.0, 1.5, 5.5), createCuboidShape(4.0, 0.0, 5.0, 12.0, 0.5, 11.0), createCuboidShape(3.5, 3.5, 5.5, 11.5, 4.0, 11.5), createCuboidShape(3.75, 2.5, 5.75, 11.25, 3.5, 11.0), createCuboidShape(3.5, 2.5, 5.5, 11.5, 3.5, 6.0), createCuboidShape(3.5, 2.0, 5.5, 11.5, 2.5, 11.5), createCuboidShape(3.5, 5.5, 4.75, 11.5, 6.0, 10.75), createCuboidShape(3.75, 4.5, 5.0, 11.25, 5.5, 10.25), createCuboidShape(3.5, 4.5, 4.75, 11.5, 5.5, 5.25), createCuboidShape(3.5, 4.0, 4.75, 11.5, 4.5, 10.75)});
                break;
            default:
                shape = VoxelShapes.union(createCuboidShape(5.0, 1.5, 4.0, 11.0, 2.0, 12.0), new VoxelShape[]{createCuboidShape(5.25, 0.5, 4.25, 10.5, 1.5, 11.75), createCuboidShape(5.0, 0.5, 4.0, 5.5, 1.5, 12.0), createCuboidShape(5.0, 0.0, 4.0, 11.0, 0.5, 12.0), createCuboidShape(5.5, 3.5, 4.5, 11.5, 4.0, 12.5), createCuboidShape(5.75, 2.5, 4.75, 11.0, 3.5, 12.25), createCuboidShape(5.5, 2.5, 4.5, 6.0, 3.5, 12.5), createCuboidShape(5.5, 2.0, 4.5, 11.5, 2.5, 12.5), createCuboidShape(4.75, 5.5, 4.5, 10.75, 6.0, 12.5), createCuboidShape(5.0, 4.5, 4.75, 10.25, 5.5, 12.25), createCuboidShape(4.75, 4.5, 4.5, 5.25, 5.5, 12.5), createCuboidShape(4.75, 4.0, 4.5, 10.75, 4.5, 12.5)});
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
