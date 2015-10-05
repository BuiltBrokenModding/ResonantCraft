package com.builtbroken.rc.common;

import com.builtbroken.rc.common.content.item.ToolCutter;

import net.minecraft.item.Item;

/**
 * @author - Kolatra
 */
public class ObjectManager
{
    public static Item cutter = new ToolCutter();

    public static void registerAll()
    {
        registerBlocks();
        registerItems();
    }

    private static void registerBlocks()
    {

    }

    private static void registerItems()
    {

    }
}
