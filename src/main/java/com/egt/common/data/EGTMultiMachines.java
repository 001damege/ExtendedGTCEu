package com.egt.common.data;

import com.egt.EGT;
import com.egt.common.data.addon.ae2.AEMultiMachines;
import com.egt.common.data.addon.draconicevolution.DEMultiMachines;
import com.egt.common.data.addon.mekanism.MekMultiMachines;
import com.egt.common.data.addon.mekanismgenerators.MekGenMultiMachines;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.AssemblyLineMachine;

import static com.egt.EGT.REGISTRATE;
import static com.gregtechceu.gtceu.api.machine.multiblock.PartAbility.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;

public class EGTMultiMachines {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {
        if (EGT.Mods.isMekLoaded()) {
            MekMultiMachines.init();
        }

        if (GTCEu.Mods.isAE2Loaded()) {
            AEMultiMachines.init();
        }

        if (EGT.Mods.isDELoaded()) {
            DEMultiMachines.init();
        }

        if (EGT.Mods.isMekGeneratorsLoaded()) {
            MekGenMultiMachines.init();
        }
    }

    public static final MultiblockMachineDefinition MEGA_ASSEMBLY_LINE = REGISTRATE
            .multiblock("mega_assembly_line", AssemblyLineMachine::new)
            .rotationState(RotationState.ALL)
            .recipeType(GTRecipeTypes.ASSEMBLY_LINE_RECIPES)
            .recipeModifiers(GTRecipeModifiers.OC_NON_PERFECT, GTRecipeModifiers.PARALLEL_HATCH)
            .appearanceBlock(GTBlocks.CASING_STEEL_SOLID)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("FFFFFFFF", "LLLLLLLL", "GLGGGGLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLG  GLG",
                            "GLG  GLG", "GLGGGGLG", "LLLLLLLL", "GGGGGGGG", "        ")
                    .aisle("FCCCCCCF", "LAAAAAAL", "LALIILAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LAI  IAL",
                            "LAI  IAL", "LALIILAL", "LAAAAAAL", "GCCCCCCG", " SSSSSS ")
                    .aisle("FCFFFFCF", "LALLLLAL", "GLFFFFLG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GIF  FIG",
                            "GIF  FIG", "GLFFFFLG", "LALLLLAL", "GCGGGGCG", " S    S ")
                    .aisle("FCF  FCF", "LAL  LAL", "GIF  FIG", "        ", "        ", "        ", "        ",
                            "        ", "GIF  FIG", "LAL  LAL", "GCG  GCG", " S    S ")
                    .aisle("FCF  FCF", "LAL  LAL", "GIF  FIG", "        ", "        ", "        ", "        ",
                            "        ", "GIF  FIG", "LAL  LAL", "GCG  GCG", " S    S ")
                    .aisle("FCFFFFCF", "LALLLLAL", "GLFFFFLG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GIF  FIG",
                            "GIF  FIG", "GLFFFFLG", "LALLLLAL", "GCGGGGCG", " S    S ")
                    .aisle("FCCCCCCF", "LAAAAAAL", "LALIILAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LAI  IAL",
                            "LAI  IAL", "LALIILAL", "LAAAAAAL", "GCCCCCCG", " SSSSSS ")
                    .aisle("FFFFFFFF", "LLLLLLLL", "GLGGGGLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLG  GLG",
                            "GLG  GLG", "GLGGGGLG", "LLLLLLLL", "GGGGGPDK", "        ")
                    .where('K', controller(blocks(def.get())))
                    .where('S', blocks(GTBlocks.CASING_STEEL_SOLID.get())
                            .or(abilities(INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2)))
                    .where('F', blocks(GTBlocks.CASING_STEEL_SOLID.get()))
                    .where('G', blocks(GTBlocks.CASING_GRATE.get()))
                    .where('C', blocks(GTBlocks.CASING_ASSEMBLY_CONTROL.get()))
                    .where('D', abilities(DATA_ACCESS, OPTICAL_DATA_RECEPTION).setExactLimit(1))
                    .where('L', blocks(GTBlocks.CASING_LAMINATED_GLASS.get()))
                    .where('A', blocks(GTBlocks.CASING_ASSEMBLY_LINE.get()))
                    .where('I', blocks(GTMachines.ITEM_IMPORT_BUS[0].getBlock()).setMinGlobalLimited(5)
                            .setMaxGlobalLimited(16)
                            .or(abilities(EXPORT_ITEMS).setExactLimit(1))
                            .or(abilities(IMPORT_FLUIDS_1X, IMPORT_FLUIDS_4X, IMPORT_FLUIDS_9X).setMaxGlobalLimited(4))
                            .or(blocks(GTBlocks.CASING_LAMINATED_GLASS.get())))
                    .where('P', blocks(GTBlocks.CASING_ASSEMBLY_LINE.get())
                            .or(abilities(PARALLEL_HATCH).setMaxGlobalLimited(1)))
                    .where(' ', any())
                    .build())
            .workableCasingModel(GTCEu.id("gtceu:block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("gtceu:block/multiblock/assembly_line"))
            .register();

    public static final MultiblockMachineDefinition MEGA_ALLOY_BLAST_SMELTER = REGISTRATE
            .multiblock("mega_alloy_blast_smelter", CoilWorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.ALL)
            .recipeType(GCYMRecipeTypes.ALLOY_BLAST_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE,
                    GTRecipeModifiers::ebfOverclock)
            .appearanceBlock(GCYMBlocks.CASING_HIGH_TEMPERATURE_SMELTING)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("---AAA---", "---CCC---", "---CCC---", "---DDD---", "---CCC---", "---CCC---", "---DDD---",
                            "---------", "---------", "---------", "---------", "---------", "---------", "---------",
                            "---------")
                    .aisle("--AAAAA--", "--C###C--", "--C###C--", "--D###D--", "--C###C--", "--C###C--", "--D###D--",
                            "---AAA---", "---------", "---------", "---------", "---------", "---------", "---------",
                            "---------")
                    .aisle("-AAAAAAA-", "-C#####C-", "-C#####C-", "-D#####D-", "-C#####C-", "-C#####C-", "-D#####D-",
                            "--A###A--", "---CCC---", "---CCC---", "---DDD---", "---------", "---------", "---------",
                            "---------")
                    .aisle("AAAAAAAAA", "C#######C", "C#######C", "D#######D", "C#######C", "C#######C", "D#######D",
                            "-A#####A-", "--C###C--", "--C###C--", "--D###D--", "---ACA---", "----C----", "----D----",
                            "----A----")
                    .aisle("AAAAAAAAA", "C#######C", "C#######C", "D#######D", "C#######C", "C#######C", "D#######D",
                            "-A#####A-", "--C###C--", "--C###C--", "--D###D--", "---C#C---", "---C#C---", "---D#D---",
                            "---AFA---")
                    .aisle("AAAAAAAAA", "C#######C", "C#######C", "D#######D", "C#######C", "C#######C", "D#######D",
                            "-A#####A-", "--C###C--", "--C###C--", "--D###D--", "---ACA---", "----C----", "----D----",
                            "----A----")
                    .aisle("-AAAAAAA-", "-C#####C-", "-C#####C-", "-D#####D-", "-C#####C-", "-C#####C-", "-D#####D-",
                            "--A###A--", "---CCC---", "---CCC---", "---DDD---", "---------", "---------", "---------",
                            "---------")
                    .aisle("--AAAAA--", "--C###C--", "--C###C--", "--D###D--", "--C###C--", "--C###C--", "--D###D--",
                            "---AAA---", "---------", "---------", "---------", "---------", "---------", "---------",
                            "---------")
                    .aisle("---A$A---", "---CCC---", "---CCC---", "---DDD---", "---CCC---", "---CCC---", "---DDD---",
                            "---------", "---------", "---------", "---------", "---------", "---------", "---------",
                            "---------")
                    .where('$', controller(blocks(def.get())))
                    .where('-', any())
                    .where('A', blocks(GCYMBlocks.CASING_HIGH_TEMPERATURE_SMELTING.get())
                            .or(abilities(IMPORT_FLUIDS, IMPORT_FLUIDS_1X, IMPORT_FLUIDS_4X, IMPORT_FLUIDS_9X,
                                    IMPORT_ITEMS, INPUT_ENERGY))
                            .or(abilities(PARALLEL_HATCH).setMaxGlobalLimited(1))
                            .or(abilities(MAINTENANCE).setMinGlobalLimited(1))
                            .or(abilities(EXPORT_FLUIDS, EXPORT_FLUIDS_1X, EXPORT_FLUIDS_4X, EXPORT_FLUIDS_9X)
                                    .setMinGlobalLimited(1)))
                    .where('C', heatingCoils())
                    .where('D', blocks(GCYMBlocks.HEAT_VENT.get()))
                    .where('F', abilities(MUFFLER))
                    .where('#', air())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/gcym/high_temperature_smelting_casing"),
                    GTCEu.id("block/multiblock/gcym/blast_alloy_smelter"))
            .register();

    public static final MultiblockMachineDefinition MEGA_CRACKER = REGISTRATE
            .multiblock("mega_cracker", CoilWorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.ALL)
            .recipeType(GTRecipeTypes.CRACKING_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
            .appearanceBlock(GTBlocks.CASING_STAINLESS_CLEAN)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("SSSSSSS", "SSSSSSS", "SSSMSSS", "SSSSSSS", "SSSSSSS")
                    .aisle("AAAAAAA", "A-----A", "A-----A", "A-----A", "AAAAAAA")
                    .aisle("AAAAAAA", "A-----A", "A-----A", "A-----A", "AAAAAAA")
                    .aisle("AAAAAAA", "A-----A", "A-----A", "A-----A", "AAAAAAA")
                    .aisle("SSSSSSS", "SFF$FFS", "SFFFFFS", "SFFFFFS", "SSSSSSS")
                    .where('S', blocks(GTBlocks.CASING_STAINLESS_CLEAN.get()))
                    .where('A', heatingCoils())
                    .where('$', controller(blocks(def.get())))
                    .where('F', blocks(GTBlocks.CASING_STAINLESS_CLEAN.get())
                            .or(abilities(IMPORT_FLUIDS, IMPORT_FLUIDS_1X, IMPORT_FLUIDS_4X, IMPORT_FLUIDS_9X))
                            .or(abilities(EXPORT_FLUIDS, EXPORT_FLUIDS_1X, EXPORT_FLUIDS_4X, EXPORT_FLUIDS_9X))
                            .or(abilities(PARALLEL_HATCH).setMaxGlobalLimited(1))
                            .or(abilities(INPUT_ENERGY).setMaxGlobalLimited(2).setMinGlobalLimited(1))
                            .or(abilities(MAINTENANCE).setMinGlobalLimited(1).setMaxGlobalLimited(1)))
                    .where('M', abilities(MUFFLER))
                    .where('-', any())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_clean_stainless_steel"),
                    GTCEu.id("block/multiblock/cracking_unit"))
            .register();
}
