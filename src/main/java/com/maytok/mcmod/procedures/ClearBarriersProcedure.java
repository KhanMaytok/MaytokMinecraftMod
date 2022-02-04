package com.maytok.mcmod.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.MinecraftServer;
import net.minecraft.block.Blocks;

import java.util.Map;

import com.maytok.mcmod.MaytokModMod;

public class ClearBarriersProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MaytokModMod.LOGGER.warn("Failed to load dependency world for procedure ClearBarriers!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MaytokModMod.LOGGER.warn("Failed to load dependency x for procedure ClearBarriers!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MaytokModMod.LOGGER.warn("Failed to load dependency y for procedure ClearBarriers!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MaytokModMod.LOGGER.warn("Failed to load dependency z for procedure ClearBarriers!");
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
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("deleting barriers"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		level = 2;
		while (level <= 1000) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
					.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z + 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
					.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - level), (int) (z + 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 0), (int) (y - level), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
					.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - level), (int) (z + 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 0), (int) (y - level), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			}
			level = (level + 1);
		}
	}
}
