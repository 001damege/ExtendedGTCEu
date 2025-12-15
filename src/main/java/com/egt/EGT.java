package com.egt;

import com.egt.common.data.EGTCreativeTab;
import com.egt.common.data.EGTMachines;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("removal")
@Mod(EGT.MODID)
public class EGT {
    public static final String MODID = "egt";
    public static final String MOD_NAME = "Extended: GTCEu";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static GTRegistrate REGISTRATE = GTRegistrate.create(MODID);

    public EGT() {
        EGT.init();
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.register(this);

        eventBus.addGenericListener(MachineDefinition.class, this::registerMachines);

        MinecraftForge.EVENT_BUS.register(this);
        REGISTRATE.registerRegistrate();
    }

    public static void init() {
        EGTCreativeTab.init();
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    @SubscribeEvent
    public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        EGTMachines.init();
    }
}
