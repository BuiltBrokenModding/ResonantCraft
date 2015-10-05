package com.builtbroken.rc;

import com.builtbroken.mc.core.Engine;
import com.builtbroken.mc.lib.mod.AbstractMod;
import com.builtbroken.mc.lib.mod.AbstractProxy;
import com.builtbroken.rc.common.ObjectManager;
import com.builtbroken.rc.common.libraries.Reference;
import com.builtbroken.rc.common.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author - Kolatra
 */
@Mod(modid = Reference.DOMAIN, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:VoltzEngine")
public final class ResonantCraft extends AbstractMod
{
    protected CommonProxy proxy;

    public ResonantCraft()
    {
        super(Reference.DOMAIN, "ResonantCraft");
    }

    @Override
    public AbstractProxy getProxy()
    {
        return proxy;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
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