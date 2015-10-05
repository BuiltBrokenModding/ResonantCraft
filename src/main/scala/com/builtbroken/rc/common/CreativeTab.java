package com.builtbroken.rc.common;

import com.builtbroken.mc.lib.mod.ModCreativeTab;

import net.minecraft.item.Item;

/**
 * @author - Kolatra
 */
public class CreativeTab extends ModCreativeTab
{
    public CreativeTab(String name, Item item)
    {
        super(name, item);
    }

    @Override
    public Item getTabIconItem()
    {
        return ObjectManager.cutter;
    }
}
