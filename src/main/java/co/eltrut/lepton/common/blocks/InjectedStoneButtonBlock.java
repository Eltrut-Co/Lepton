package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class InjectedStoneButtonBlock extends StoneButtonBlock {

	public InjectedStoneButtonBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.POLISHED_BLACKSTONE_BUTTON, group, items);
	}

}
