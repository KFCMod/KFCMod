
package net.mcreator.eyemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

import net.mcreator.eyemod.itemgroup.KfcModCreativeTabItemGroup;
import net.mcreator.eyemod.KfcModModElements;

@KfcModModElements.ModElement.Tag
public class ColonelItem extends KfcModModElements.ModElement {
	@ObjectHolder("kfc_mod:colonel")
	public static final Item block = null;

	public ColonelItem(KfcModModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(KfcModCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(20).saturation(20f)

							.build()));
			setRegistryName("colonel");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
