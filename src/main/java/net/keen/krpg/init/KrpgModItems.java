
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.keen.krpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.keen.krpg.KrpgMod;

public class KrpgModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KrpgMod.MODID);
	public static final RegistryObject<Item> REINFORCED_BARREL = block(KrpgModBlocks.REINFORCED_BARREL, KrpgModTabs.TAB_KEEN_RPG);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
