package com.persival.ferrummod.init;

import com.persival.ferrummod.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            Main.MOD_ID);

    public static final Lazy<SoundEvent> FAKE_TRIPLETS_LAZY = Lazy.of(
            () -> new SoundEvent(new ResourceLocation(Main.MOD_ID, "disc.fake_triplets_disc")));

    public static final RegistryObject<SoundEvent> FAKE_TRIPLETS_MUSIC = SOUNDS.register("fake_triplets_music",
            FAKE_TRIPLETS_LAZY);
}

