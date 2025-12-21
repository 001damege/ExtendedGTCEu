package com.egt.common.data.addon.mekanismgenerators;

import com.egt.common.data.EGTCreativeTab;
import com.egt.common.data.EGTRecipeTypes;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.common.data.GCYMBlocks;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import mekanism.generators.common.registries.GeneratorsBlocks;

import static com.egt.EGT.REGISTRATE;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.*;

public class MekGenMultiMachines {
    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}

    public static final MultiblockMachineDefinition FUSION_REACTOR = REGISTRATE
            .multiblock("fusion_reactor", WorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.ALL)
            .recipeType(EGTRecipeTypes.FUSION_REACTOR_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
            .appearanceBlock(GTBlocks.CASING_HSSE_STURDY)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("--A--", "-AFA-", "AFFFA", "-AFA-", "--A--")
                    .aisle("-AFA-", "A###A", "F###F", "A###F", "-AFA-")
                    .aisle("AFFFA", "F###F", "F###F", "F###F", "AFOFA")
                    .aisle("-AFA-", "A###A", "F###F", "A###A", "-IFI-")
                    .aisle("--P--", "-AFA-", "AFFFA", "-IFI-", "--C--")
                    .where('C', controller(blocks(def.get())))
                    .where('-', any())
                    .where('#', air())
                    .where('A', blocks(GTBlocks.CASING_HSSE_STURDY.get()))
                    .where('O', abilities(PartAbility.OUTPUT_ENERGY))
                    .where('I', blocks(GTBlocks.CASING_HSSE_STURDY.get())
                            .or(abilities(PartAbility.IMPORT_FLUIDS, PartAbility.IMPORT_FLUIDS_1X, PartAbility.IMPORT_FLUIDS_4X, PartAbility.IMPORT_FLUIDS_9X)))
                    .where('F', blocks(GTBlocks.FUSION_GLASS.get()))
                    .where('P', blocks(GTBlocks.CASING_HSSE_STURDY.get())
                            .or(abilities(PartAbility.PARALLEL_HATCH)))
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_sturdy_hsse"),
                    GTCEu.id("block/multiblock/fusion_reactor"))
            .register();

    public static final MultiblockMachineDefinition STEAM_TURBINE = REGISTRATE
            .multiblock("steam_turbine", WorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.ALL)
            .recipeType(EGTRecipeTypes.STEAM_TURBINE_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
            .appearanceBlock(GTBlocks.CASING_TUNGSTENSTEEL_TURBINE)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("AAAAAAAAA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "AFFFFFFFA", "AFFFFFFFA", "AAAAOAAAA")
                    .aisle("AAAAAAAAA", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "FMMMMMMMF", "FMMMMMMMF", "AHHHHHHHA")
                    .aisle("AAAAAAAAA", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "FMMMMMMMF", "FMMMMMMMF", "AHHHHHHHA")
                    .aisle("AAAAAAAAA", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "FMMMMMMMF", "FMMMMMMMF", "AHHHHHHHA")
                    .aisle("AAAAAAAAA", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "FMMMRMMMF", "FMMMMMMMF", "AHHHHHHHA")
                    .aisle("AAAAAAAAA", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "FMMMMMMMF", "FMMMMMMMF", "AHHHHHHHA")
                    .aisle("AAAAAAAAA", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "FMMMMMMMF", "FMMMMMMMF", "AHHHHHHHA")
                    .aisle("AAAAAAAAA", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "B-------B", "FMMMMMMMF", "FMMMMMMMF", "AHHHHHHHA")
                    .aisle("AAAAAAAAA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "ABBBBBBBA", "AFFFFFFFA", "AFFFFFFFA", "AAIICIIAA")
                    .where('C', controller(blocks(def.get())))
                    .where('I', blocks(GTBlocks.CASING_TUNGSTENSTEEL_TURBINE.get())
                            .or(abilities(PartAbility.PARALLEL_HATCH).setMaxGlobalLimited(1))
                            .or(abilities(PartAbility.IMPORT_FLUIDS, PartAbility.IMPORT_FLUIDS_1X, PartAbility.IMPORT_FLUIDS_4X, PartAbility.IMPORT_FLUIDS_9X)))
                    .where('A', blocks(GTBlocks.CASING_TUNGSTENSTEEL_TURBINE.get()))
                    .where('B', blocks(GTBlocks.CASING_TEMPERED_GLASS.get()))
                    .where('H', blocks(GCYMBlocks.HEAT_VENT.get()))
                    .where('F', blocks(GTBlocks.FIREBOX_TUNGSTENSTEEL.get()))
                    .where('M', blocks(GCYMBlocks.MOLYBDENUM_DISILICIDE_COIL_BLOCK.get()))
                    .where('R', abilities(PartAbility.ROTOR_HOLDER).setMaxGlobalLimited(1))
                    .where('O', blocks(GTBlocks.CASING_TUNGSTENSTEEL_TURBINE.get())
                            .or(abilities(PartAbility.OUTPUT_ENERGY)))
                    .where('-', air())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/mechanic/machine_casing_turbine_tungstensteel"),
                    GTCEu.id("block/multiblock/generator/large_plasma_turbine"))
            .register();

    public static final MultiblockMachineDefinition FISSION_REACTOR = REGISTRATE
            .multiblock("fission_reactor", WorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.ALL)
            .recipeType(EGTRecipeTypes.FISSION_REACTOR_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
            .appearanceBlock(GTBlocks.CASING_STEEL_SOLID)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("AAAAAAAAAAAAA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "AAAAAAAAAAAAA")
                    .aisle("AAAAAAAAAAAAA", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BR-R-R-R-R-RB", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-R-R-R-R-R-B", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BR-R-R-R-R-RB", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-R-R-R-R-R-B", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BR-R-R-R-R-RB", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-R-R-R-R-R-B", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BR-R-R-R-R-RB", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-R-R-R-R-R-B", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BR-R-R-R-R-RB", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-F-F-F-F-F-B", "B-R-R-R-R-R-B", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BF-F-F-F-F-FB", "BR-R-R-R-R-RB", "ABBBBBBBBBBBA")
                    .aisle("AAAAAAAAAAAAA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "ABBBBBBBBBBBA", "CIIIIPAAAAAAA")
                    .where('C', controller(blocks(def.get())))
                    .where('A', blocks(GTBlocks.CASING_STEEL_SOLID.get()))
                    .where('B', blocks(GTBlocks.CASING_TEMPERED_GLASS.get()))
                    .where('F', blocks(GeneratorsBlocks.FISSION_FUEL_ASSEMBLY.getBlock()))
                    .where('R', blocks(GeneratorsBlocks.CONTROL_ROD_ASSEMBLY.getBlock()))
                    .where('P', blocks(GTBlocks.CASING_STEEL_SOLID.get())
                            .or(abilities(PartAbility.PARALLEL_HATCH)))
                    .where('I', blocks(GTBlocks.CASING_STEEL_SOLID.get())
                            .or(abilities(PartAbility.IMPORT_FLUIDS, PartAbility.IMPORT_FLUIDS_1X, PartAbility.IMPORT_FLUIDS_4X, PartAbility.IMPORT_FLUIDS_9X))
                            .or(abilities(PartAbility.EXPORT_FLUIDS, PartAbility.EXPORT_FLUIDS_1X, PartAbility.EXPORT_FLUIDS_4X, PartAbility.EXPORT_FLUIDS_9X)))
                    .where('-', air())
                    .build())
            .register();
}
