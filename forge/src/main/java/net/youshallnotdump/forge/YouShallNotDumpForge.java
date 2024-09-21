package net.youshallnotdump.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("youshallnotdump")
public final class YouShallNotDumpForge {
    public YouShallNotDumpForge() {
        EventBuses.registerModEventBus("youshallnotdump", FMLJavaModLoadingContext.get().getModEventBus());
    }
}
