package com.asdflj.msbf;

import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onMouseEvent(MouseEvent event) {
        if (event.button > 2) {
            FMLCommonHandler.instance()
                .bus()
                .post(new InputEvent.KeyInputEvent());
        }
    }
}
