
package net.mcreator.eyemod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.eyemod.item.BucketoftendersItem;
import net.mcreator.eyemod.KfcModModElements;

@KfcModModElements.ModElement.Tag
public class KfcModCreativeTabItemGroup extends KfcModModElements.ModElement {
	public KfcModCreativeTabItemGroup(KfcModModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabkfc_mod_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BucketoftendersItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
