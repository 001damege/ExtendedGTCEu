package com.egt.common.data;

import com.egt.EGT;
import com.egt.common.data.addon.ae2.AEMultiMachines;
import com.egt.common.data.addon.enderio.EIOMachines;
import com.egt.common.data.addon.mekanismgenerators.MekGenMachines;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;
import com.gregtechceu.gtceu.common.data.models.GTMachineModels;
import com.gregtechceu.gtceu.common.machine.multiblock.part.ParallelHatchPartMachine;
import net.minecraft.network.chat.Component;

import static com.egt.EGT.REGISTRATE;
import static com.egt.common.data.EGTMachineUtils.registerSimpleMachines;
import static com.egt.common.data.EGTMachineUtils.registerTieredMachines;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.hvCappedTankSizeFunction;

public class EGTMachines {
    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {
        if (EGT.Mods.isEnderIOLoaded()) {
            EIOMachines.init();
        }

        if (GTCEu.Mods.isAE2Loaded()) {
            AEMultiMachines.init();
        }

        if (EGT.Mods.isMekGeneratorsLoaded()) {
            MekGenMachines.init();
        }
    }

    public static final MachineDefinition[] PARALLEL_HATCH = registerTieredMachines("parallel_hatch",
            ParallelHatchPartMachine::new, (tier, builder) -> builder
                    .langValue(switch (tier) {
                        case 9 -> "Epic";
                        case 10 -> "Epic II";
                        case 11 -> "Epic III";
                        case 12 -> "Epic IV";
                        case 13 -> "Legendary";
                        case 14 -> "MAX";
                        default -> "Simple";
                    } + " Parallel Control Hatch")
                    .rotationState(RotationState.ALL)
                    .abilities(PartAbility.PARALLEL_HATCH)
                    .modelProperty(GTMachineModelProperties.IS_FORMED, false)
                    .modelProperty(GTMachineModelProperties.RECIPE_LOGIC_STATUS, RecipeLogic.Status.IDLE)
                    .model(GTMachineModels.createWorkableTieredHullMachineModel(
                                    GTCEu.id("block/machines/parallel_hatch_mk" + (tier - 4)))
                            .andThen((ctx, prov, model) -> {
                                model.addReplaceableTextures("bottom", "top", "side");
                            }))
                    .tooltips(Component.translatable("gtceu.machine.parallel_hatch_mk" + tier + ".tooltip"),
                            Component.translatable("gtceu.part_sharing.disabled"))
                    .register(), GTValues.UHV, GTValues.UEV, GTValues.UIV, GTValues.UXV, GTValues.OpV, GTValues.MAX);

    public static final MachineDefinition[] NEUTRON_SYNTHESIS = registerSimpleMachines("neutron_synthesis", EGTRecipeTypes.NEUTRON_SYNTHESIS_RECIPES, hvCappedTankSizeFunction);
}