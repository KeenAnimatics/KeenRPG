
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.keen.krpg.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KrpgModTabs {
	public static CreativeModeTab TAB_KEEN_RPG;

	public static void load() {
		TAB_KEEN_RPG = new CreativeModeTab("tabkeen_rpg") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.REDSTONE_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
