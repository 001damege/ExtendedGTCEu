package com.egt.common.data;

import com.egt.EGT;
import com.egt.api.EGTValues;
import com.egt.common.data.addon.ae2.AEMultiMachines;
import com.egt.common.data.addon.draconicevolution.DEMultiMachines;
import com.egt.common.data.addon.mekanism.MekMultiMachines;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.client.renderer.machine.DynamicRenderHelper;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.AssemblyLineMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.FusionReactorMachine;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;

import java.util.Locale;

import static com.egt.EGT.REGISTRATE;
import static com.egt.common.data.EGTMachineUtils.registerTieredMultis;
import static com.gregtechceu.gtceu.api.GTValues.UHV;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.common.data.models.GTMachineModels.createWorkableCasingMachineModel;

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
    }

    public static final MultiblockMachineDefinition ASSEMBLY_LINE = REGISTRATE
            .multiblock("extra_assembly_line", AssemblyLineMachine::new)
            .rotationState(RotationState.ALL)
            .langValue("Extra Assembly Line")
            .recipeType(GTRecipeTypes.ASSEMBLY_LINE_RECIPES)
            .recipeModifiers(GTRecipeModifiers.OC_NON_PERFECT, GTRecipeModifiers.PARALLEL_HATCH)
            .appearanceBlock(GTBlocks.CASING_STEEL_SOLID)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("FFFFFFFF", "LLLLLLLL", "GLGGGGLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLGGGGLG", "LLLLLLLL", "GGGGGGGG", "        ")
                    .aisle("FCCCCCCF", "LAAAAAAL", "LALIILAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LALIILAL", "LAAAAAAL", "GCCCCCCG", " SSSSSS ")
                    .aisle("FCFFFFCF", "LALLLLAL", "GLFFFFLG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GLFFFFLG", "LALLLLAL", "GCGGGGCG", " S    S ")
                    .aisle("FCF  FCF", "LAL  LAL", "GIF  FIG", "        ", "        ", "        ", "        ", "        ", "GIF  FIG", "LAL  LAL", "GCG  GCG", " S    S ")
                    .aisle("FCF  FCF", "LAL  LAL", "GIF  FIG", "        ", "        ", "        ", "        ", "        ", "GIF  FIG", "LAL  LAL", "GCG  GCG", " S    S ")
                    .aisle("FCFFFFCF", "LALLLLAL", "GLFFFFLG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GIF  FIG", "GLFFFFLG", "LALLLLAL", "GCGGGGCG", " S    S ")
                    .aisle("FCCCCCCF", "LAAAAAAL", "LALIILAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LAI  IAL", "LALIILAL", "LAAAAAAL", "GCCCCCCG", " SSSSSS ")
                    .aisle("FFFFFFFF", "LLLLLLLL", "GLGGGGLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLG  GLG", "GLGGGGLG", "LLLLLLLL", "GGGGGPDK", "        ")
                    .where('K', controller(blocks(def.get())))
                    .where('S', blocks(GTBlocks.CASING_STEEL_SOLID.get())
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2)))
                    .where('F', blocks(GTBlocks.CASING_STEEL_SOLID.get()))
                    .where('G', blocks(GTBlocks.CASING_GRATE.get()))
                    .where('C', blocks(GTBlocks.CASING_ASSEMBLY_CONTROL.get()))
                    .where('D', abilities(PartAbility.DATA_ACCESS, PartAbility.OPTICAL_DATA_RECEPTION).setExactLimit(1))
                    .where('L', blocks(GTBlocks.CASING_LAMINATED_GLASS.get()))
                    .where('A', blocks(GTBlocks.CASING_ASSEMBLY_LINE.get()))
                    .where('I', blocks(GTMachines.ITEM_IMPORT_BUS[0].getBlock()).setMinGlobalLimited(5).setMaxGlobalLimited(16)
                            .or(abilities(PartAbility.EXPORT_ITEMS).setExactLimit(1))
                            .or(abilities(PartAbility.IMPORT_FLUIDS_1X, PartAbility.IMPORT_FLUIDS_4X, PartAbility.IMPORT_FLUIDS_9X).setMaxGlobalLimited(4))
                            .or(blocks(GTBlocks.CASING_LAMINATED_GLASS.get())))
                    .where('P', blocks(GTBlocks.CASING_ASSEMBLY_LINE.get())
                            .or(abilities(PartAbility.PARALLEL_HATCH).setMaxGlobalLimited(1)))
                    .where(' ', any())
                    .build())
            .workableCasingModel(GTCEu.id("gtceu:block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("gtceu:block/multiblock/assembly_line"))
            .register();

    public static final MultiblockMachineDefinition[] FUSION_REACTOR = registerTieredMultis("extra_fusion_reactor", FusionReactorMachine::new, (tier, builder) -> builder
            .rotationState(RotationState.ALL)
            .langValue("Extra Fusion Reactor")
            .recipeType(GTRecipeTypes.FUSION_RECIPES)
            .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, FusionReactorMachine::recipeModifier, GTRecipeModifiers.BATCH_MODE)
            .tooltips(
                    Component.translatable("gtceu.machine.fusion_reactor.capacity", FusionReactorMachine.calculateEnergyStorageFactor(tier, 16) / 1000000L),
                    Component.translatable("gtceu.machine.fusion_reactor.overclocking"),
                    Component.translatable("gtceu.multiblock.%s_fusion_reactor.description".formatted(GTValues.VN[tier].toLowerCase(Locale.ROOT))))
            .appearanceBlock(GCYMBlocks.CASING_ATOMIC)
            .pattern(def -> FactoryBlockPattern.start()
                    .aisle("###############", "######OGO######", "###############")
                    .aisle("######ICI######", "####GGAAAGG####", "######ICI######")
                    .aisle("####CC###CC####", "###EAAOGOAAE###", "####CC###CC####")
                    .aisle("###C#######C###", "##EKEG###GEKE##", "###C#######C###")
                    .aisle("##C#########C##", "#GAE#######EAG#", "##C#########C##")
                    .aisle("##C#########C##", "#GAG#######GAG#", "##C#########C##")
                    .aisle("#I###########I#", "OAO#########OAO", "#I###########I#")
                    .aisle("#C###########C#", "GAG#########GAG", "#C###########C#")
                    .aisle("#I###########I#", "OAO#########OAO", "#I###########I#")
                    .aisle("##C#########C##", "#GAG#######GAG#", "##C#########C##")
                    .aisle("##C#########C##", "#GAE#######EAG#", "##C#########C##")
                    .aisle("###C#######C###", "##EKEG###GEKE##", "###C#######C###")
                    .aisle("####CC###CC####", "###EAAOGOAAE###", "####CC###CC####")
                    .aisle("######ICI######", "####GGAAAGG####", "######IPI######")
                    .aisle("###############", "######OSO######", "###############")
                    .where('S', controller(blocks(def.get())))
                    .where('G', blocks(GTBlocks.FUSION_GLASS.get())
                            .or(blocks(GCYMBlocks.CASING_ATOMIC.get())))
                    .where('E', blocks(GCYMBlocks.CASING_ATOMIC.get())
                            .or(blocks(PartAbility.INPUT_ENERGY.getBlocks(EGTValues.HIGH_TIERS).toArray(Block[]::new))
                                    .setMinGlobalLimited(1).setPreviewCount(16)))
                    .where('C', blocks(GCYMBlocks.CASING_ATOMIC.get()))
                    .where('K', blocks(FusionReactorMachine.getCoilState(tier)))
                    .where('O', blocks(GCYMBlocks.CASING_ATOMIC.get())
                            .or(abilities(PartAbility.EXPORT_FLUIDS)))
                    .where('A', air())
                    .where('I', blocks(GCYMBlocks.CASING_ATOMIC.get())
                            .or(abilities(PartAbility.IMPORT_FLUIDS).setMinGlobalLimited(2)))
                    .where('P', blocks(GCYMBlocks.CASING_ATOMIC.get())
                            .or(abilities(PartAbility.PARALLEL_HATCH)))
                    .where('#', any())
                    .build())
            .modelProperty(GTMachineModelProperties.RECIPE_LOGIC_STATUS, RecipeLogic.Status.IDLE)
            .model(createWorkableCasingMachineModel(GTCEu.id("gtceu:block/casings/gcym/atomic_casing"),
                    GTCEu.id("block/multiblock/fusion_reactor"))
                    .andThen(b -> b.addDynamicRenderer(DynamicRenderHelper::createFusionRingRender)))
            .hasBER(true)
            .register(), UHV);
}
