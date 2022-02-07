package com.maytok.mcmod.procedures;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Util;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import com.maytok.mcmod.MaytokModMod;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class MaytokCleanerUpdateTockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MaytokModMod.LOGGER.warn("Failed to load dependency world for procedure MaytokCleanerUpdateTock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MaytokModMod.LOGGER.warn("Failed to load dependency x for procedure MaytokCleanerUpdateTock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MaytokModMod.LOGGER.warn("Failed to load dependency y for procedure MaytokCleanerUpdateTock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MaytokModMod.LOGGER.warn("Failed to load dependency z for procedure MaytokCleanerUpdateTock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double level = 0;
		double encontreRompible = 0;
		level = 1;
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - level), (int) z))).getBlock() == Blocks.DIRT) {
			level = (level + 1);
		} else {
			encontreRompible = 1;
		}

		TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
		AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
		if (_iitemhandlerref.get() != null) {
			for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
				ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
				Item i = itemstackiterator.getItem().asItem();
				String a = i.getRegistryName().toString();
				if (!world.isRemote()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().func_232641_a_(new StringTextComponent(a), ChatType.SYSTEM, Util.DUMMY_UUID);
						mcserv.getPlayerList().func_232641_a_(new StringTextComponent("oraleeee"), ChatType.SYSTEM, Util.DUMMY_UUID);
				}
			}
		}
	}
}
