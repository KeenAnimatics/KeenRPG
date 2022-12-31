
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.keen.krpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.keen.krpg.block.ReinforcedBarrelBlock;
import net.keen.krpg.KrpgMod;

public class KrpgModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KrpgMod.MODID);
	public static final RegistryObject<Block> STONE_INFORCED_BARREL = REGISTRY.register("stone_inforced_barrel", () -> new ReinforcedBarrelBlock());
}
