package chiefarug.mods.skyslands;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("skyslands")
@Mod.EventBusSubscriber(modid = Skyslands.MODID)
public class Skyslands {
    @SuppressWarnings("unused")
    public static final Logger LGGR = LogUtils.getLogger();
    public static final String MODID = "skyslands";

    public Skyslands() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }

}
