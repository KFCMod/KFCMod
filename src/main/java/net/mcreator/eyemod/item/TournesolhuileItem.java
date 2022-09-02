
package net.mcreator.eyemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.eyemod.itemgroup.KfcModCreativeTabItemGroup;
import net.mcreator.eyemod.KfcModModElements;

import java.util.List;

@KfcModModElements.ModElement.Tag
public class TournesolhuileItem extends KfcModModElements.ModElement {
	@ObjectHolder("kfc_mod:tournesolhuile")
	public static final Item block = null;

	public TournesolhuileItem(KfcModModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(KfcModCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tournesolhuile");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("combustible parfait pour faire cuire des frite"));
		}
	}
}
