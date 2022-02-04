package com.maytok.mcmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import java.util.Map;

import com.maytok.mcmod.MaytokModMod;

public class PlaceDigFloorProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MaytokModMod.LOGGER.warn("Failed to load dependency world for procedure PlaceDigFloor!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MaytokModMod.LOGGER.warn("Failed to load dependency x for procedure PlaceDigFloor!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MaytokModMod.LOGGER.warn("Failed to load dependency y for procedure PlaceDigFloor!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MaytokModMod.LOGGER.warn("Failed to load dependency z for procedure PlaceDigFloor!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double level = 0;
		double hasPlacedFloor = 0;
		double foundBedrock = 0;
		double foundAir = 0;
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.GLASS.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.GLASS.getDefaultState(), 3);
	}
}
