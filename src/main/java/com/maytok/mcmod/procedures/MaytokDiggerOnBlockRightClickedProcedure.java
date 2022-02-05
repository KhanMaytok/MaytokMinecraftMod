package com.maytok.mcmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
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
		boolean found = false;
		double level = 0;
		double hasPlacedFloor = 0;
		double foundBedrock = 0;
		double foundAir = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double bufferLevel = 0;
		double encontreRompible = 0;
		level = 2;
		bufferLevel = 2;
		encontreRompible = 0;
		while (encontreRompible == 0) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - level), (int) z))).getBlock() == Blocks.BARRIER) {
				level = (level + 1);
			} else {
				encontreRompible = 1;
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
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - level), (int) z))).getBlock() == Blocks.BEDROCK) {
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"fill ~-1 ~-2 ~-1 ~1 ~-20 ~1 air");
			}

			((World) world).getServer().getCommandManager().handleCommand(
				new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
						new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
				"fill ~-1 ~-2 ~-1 ~1 ~-" + level + " ~1 air");

			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
	}
}
