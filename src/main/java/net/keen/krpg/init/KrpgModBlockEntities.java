
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.keen.krpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.keen.krpg.block.entity.ReinforcedBarrelBlockEntity;
import net.keen.krpg.KrpgMod;

public class KrpgModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, KrpgMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> REINFORCED_BARREL = register("reinforced_barrel", KrpgModBlocks.REINFORCED_BARREL,
			ReinforcedBarrelBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
