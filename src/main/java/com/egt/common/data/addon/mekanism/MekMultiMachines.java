package com.egt.common.data.addon.mekanism;

import com.egt.common.data.EGTCreativeTab;
import com.egt.common.data.EGTRecipeTypes;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.common.data.GCYMBlocks;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;

import static com.egt.EGT.REGISTRATE;
import static com.gregtechceu.gtceu.api.machine.multiblock.PartAbility.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;

public class MekMultiMachines {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}

    public static final MultiblockMachineDefinition ENRICHMENT = REGISTRATE
            .multiblock("enrichment", WorkableElectricMultiblockMachine::new)
            .langValue("Large Enrichment")
            .recipeType(EGTRecipeTypes.ENRICHING_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
            .appearanceBlock(GCYMBlocks.CASING_STRESS_PROOF)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("SSSSS", "STTTS", "STTTS", "STTTS", "SSSSS")
                    .aisle("SSSSS", "T###T", "T###T", "T###T", "SSSSS")
                    .aisle("SSSSS", "T###T", "T###T", "T###T", "SSSSS")
                    .aisle("SSSSS", "T###T", "T###T", "T###T", "SSSSS")
                    .aisle("SSSSS", "SS$SS", "SSSSS", "SSSSS", "SSSSS")
                    .where('$', controller(blocks(def.get())))
                    .where('T', blocks(GTBlocks.CASING_TEMPERED_GLASS.get()))
                    .where('#', air())
                    .where('S', blocks(GCYMBlocks.CASING_STRESS_PROOF.get())
                            .or(abilities(IMPORT_ITEMS, EXPORT_ITEMS))
                            .or(abilities(MAINTENANCE).setExactLimit(1))
                            .or(abilities(PARALLEL_HATCH))
                            .or(abilities(INPUT_ENERGY).setMaxGlobalLimited(2)))
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/gcym/stress_proof_casing"), GTCEu.id("block/multiblock/gcym/large_material_press"))
            .register();

    public static final MultiblockMachineDefinition EVAPORATION = REGISTRATE
            .multiblock("thermal_evaporation", CoilWorkableElectricMultiblockMachine::new)
            .langValue("Thermal Evaporation")
            .recipeType(EGTRecipeTypes.EVAPORATING_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
            .appearanceBlock(GCYMBlocks.CASING_WATERTIGHT)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("AAAA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "AAAA")
                    .aisle("AAAA", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "A##A")
                    .aisle("AAAA", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "B##B", "A##A")
                    .aisle("AAAA", "AB$A", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "ABBA", "AAAA")
                    .where('$', controller(blocks(def.get())))
                    .where('A', blocks(GCYMBlocks.CASING_WATERTIGHT.get())
                            .or(abilities(INPUT_ENERGY).setMaxGlobalLimited(2)))
                    .where('B', blocks(GTBlocks.CASING_TEMPERED_GLASS.get())
                            .or(blocks(GCYMBlocks.CASING_WATERTIGHT.get()))
                            .or(abilities(IMPORT_FLUIDS, IMPORT_FLUIDS_1X, IMPORT_FLUIDS_4X, IMPORT_FLUIDS_9X))
                            .or(abilities(EXPORT_FLUIDS, EXPORT_FLUIDS_1X, EXPORT_FLUIDS_4X, EXPORT_FLUIDS_9X))
                            .or(abilities(PARALLEL_HATCH).setMaxGlobalLimited(1)))
                    .where('#', heatingCoils())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/gcym/watertight_casing"), GTCEu.id("block/multiblock/gcym/large_material_press"))
            .register();
}
