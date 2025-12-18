package com.egt;

import com.egt.api.EGTValues;
import com.egt.common.data.*;
import com.egt.common.data.addon.ae2.AEMachines;
import com.egt.common.data.addon.draconicevolution.DEMultiMachines;
import com.egt.common.data.addon.mekanism.MekMaterials;
import com.egt.common.data.addon.mekanism.MekMultiMachines;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
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
    public static MaterialRegistry MATERIAL;

    public EGT() {
        EGT.init();
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.register(this);

        eventBus.addGenericListener(MachineDefinition.class, this::registerMachines);
        eventBus.addGenericListener(GTRecipeType.class, this::registerRecipeTypes);

        MinecraftForge.EVENT_BUS.register(this);
        REGISTRATE.registerRegistrate();
    }

    public static void init() {
        EGTCreativeTab.init();
        EGTItems.init();

        if (GTCEu.Mods.isAE2Loaded()) {
            AEMachines.init();
        }

        if (EGT.Mods.isDELoaded()) {
            DEMultiMachines.init();
        }

        if (EGT.Mods.isMekLoaded()) {
            MekMultiMachines.init();
        }
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    @SubscribeEvent
    public void registerMaterialRegistry(MaterialRegistryEvent event) {
        MATERIAL = GTCEuAPI.materialManager.createRegistry(MODID);
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
        if (EGT.Mods.isMekLoaded()) {
            MekMaterials.init();
        }
    }

    @SubscribeEvent
    public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        EGTMachines.init();
        EGTMultiMachines.init();
    }

    @SubscribeEvent
    public void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
        EGTRecipeTypes.init();
    }

    public static boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    public static class Mods {
        public static boolean isDELoaded() {
            return isModLoaded(EGTValues.MODID_DE);
        }

        public static boolean isMekLoaded() {
            return isModLoaded(EGTValues.MODID_MEKANISM);
        }

        public static boolean isEnderIOLoaded() {
            return isModLoaded(EGTValues.MODID_ENDERIO);
        }

        public static boolean isMekGeneratorsLoaded() {
            return isModLoaded(EGTValues.MODID_MEKGENERATORS);
        }
    }
}
