package com.maytok.mcmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import java.util.Map;

import com.maytok.mcmod.MaytokModMod;

public class MaytokDiggerOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MaytokModMod.LOGGER.warn("Failed to load dependency world for procedure MaytokDiggerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MaytokModMod.LOGGER.warn("Failed to load dependency x for procedure MaytokDiggerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MaytokModMod.LOGGER.warn("Failed to load dependency y for procedure MaytokDiggerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MaytokModMod.LOGGER.warn("Failed to load dependency z for procedure MaytokDiggerOnBlockRightClicked!");
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
		level = 2;
		foundBedrock = 0;
		while (foundBedrock == 0) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y - level), (int) z))).getBlock())) {
				level = (level + 1);
			} else {
				foundBedrock = 1;
			}
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 1)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 1))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 1)), false);
			}
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 1)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 0)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 0))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 0)), false);
			}
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z + 0)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 0)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 0))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 0)), false);
			}
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 0)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 1)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 1))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 1)), false);
			}
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z + 1)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z - 1)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z - 1))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 0), (int) (y - level), (int) (z - 1)), false);
			}
			world.setBlockState(new BlockPos((int) (x + 0), (int) (y - level), (int) (z - 1)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 0)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 0))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 0)), false);
			}
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 0)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 1)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 1))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 1)), false);
			}
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z - 1)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z - 1)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z - 1))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - level), (int) (z - 1)), false);
			}
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - level), (int) (z - 1)), Blocks.BARRIER.getDefaultState(), 3);
		}
		if (!BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:wither_immune"))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z + 1)))).getBlock())) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z + 1))), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - level), (int) (z + 1)), false);
			}
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - level), (int) (z + 1)), Blocks.BARRIER.getDefaultState(), 3);
		}
	}
}
