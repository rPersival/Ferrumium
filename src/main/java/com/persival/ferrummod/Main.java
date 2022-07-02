package com.persival.ferrummod;

import com.persival.ferrummod.util.RegistryHandler;
import com.persival.ferrummod.world.gen.OreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("ferrumium")
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ferrumium";

    public Main() {
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }


    @SubscribeEvent
    public static void onInitBiomesGen(FMLCommonSetupEvent event) { }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
         OreGen.generateOre();
    }
}
