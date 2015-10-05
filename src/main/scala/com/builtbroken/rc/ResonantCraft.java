package com.builtbroken.rc;

import com.builtbroken.mc.core.Engine;
import com.builtbroken.mc.lib.mod.AbstractMod;
import com.builtbroken.mc.lib.mod.AbstractProxy;
import com.builtbroken.rc.common.ObjectManager;
import com.builtbroken.rc.common.libraries.Reference;
import com.builtbroken.rc.common.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author - Kolatra
 */
@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:VoltzEngine")
public final class ResonantCraft extends AbstractMod
{
    @Mod.Instance(Reference.ID)
    public static ResonantCraft instance;

    @SidedProxy(serverSide = "com.builtbroken.rc.common.proxy.ServerProxy", clientSide = "com.builtbroken.rc.common.proxy.ClientProxy")
    public static CommonProxy proxy;

    public ResonantCraft()
    {
        super(Reference.ID, "ResonantCraft");
    }

    @Override
    public AbstractProxy getProxy()
    {
        return proxy;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Engine.instance.logger().info("Hello Minecraft! Beginning PreInitialization.");
        Engine.requestMultiBlock();
        Engine.requestOres();
        Engine.requestResources();
        ObjectManager.registerAll();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}