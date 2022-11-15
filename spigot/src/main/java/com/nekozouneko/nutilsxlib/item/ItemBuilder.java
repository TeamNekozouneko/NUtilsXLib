package com.nekozouneko.nutilsxlib.item;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import com.google.common.collect.HashMultimap;

public interface ItemBuilder {

    default void test() {
    }

    ItemBuilder setDisplayName(String s);

    ItemBuilder setLore(List<String> sl);

    ItemBuilder setAmount(int i);

    ItemBuilder setUnbreakable(boolean b);

    ItemBuilder setCustomModelData(Integer i);

    ItemBuilder addItemFlag(ItemFlag flag);

    ItemBuilder removeItemFlag(ItemFlag flag);

    ItemBuilder addItemFlags(ItemFlag... flags);

    ItemBuilder removeItemFlags(ItemFlag... flags);

    ItemBuilder addEnchant(Enchantment enc, int level, boolean ignoreLevelLimit);

    ItemBuilder removeEnchant(Enchantment enc);

    ItemStack build();

}
