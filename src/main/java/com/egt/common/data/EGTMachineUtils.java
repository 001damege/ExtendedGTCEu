package com.egt.common.data;

import com.egt.EGT;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.*;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.registry.registrate.MachineBuilder;
import com.gregtechceu.gtceu.api.registry.registrate.MultiblockMachineBuilder;
import com.gregtechceu.gtceu.common.data.GTMedicalConditions;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import com.gregtechceu.gtceu.config.ConfigHolder;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.function.BiFunction;

import static com.egt.EGT.REGISTRATE;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.*;
import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

public class EGTMachineUtils {

    public static final int[] UH_TIERS = tiersBetween(ZPM, GTCEuAPI.isHighTier() ? MAX : UHV);

    public static MultiblockMachineDefinition[] registerTieredMultis(String name,
                                                                     BiFunction<IMachineBlockEntity, Integer, MultiblockControllerMachine> factory,
                                                                     BiFunction<Integer, MultiblockMachineBuilder, MultiblockMachineDefinition> builder,
                                                                     int... tiers) {
        return registerTieredMultis(REGISTRATE, name, factory, builder, tiers);
    }

    public static MultiblockMachineDefinition[] registerTieredMultis(GTRegistrate registrate, String name,
                                                                     BiFunction<IMachineBlockEntity, Integer, MultiblockControllerMachine> factory,
                                                                     BiFunction<Integer, MultiblockMachineBuilder, MultiblockMachineDefinition> builder,
                                                                     int... tiers) {
        MultiblockMachineDefinition[] defs = new MultiblockMachineDefinition[GTValues.TIER_COUNT];
        for (int tier : tiers) {
            var register = registrate
                    .multiblock(GTValues.VN[tier].toLowerCase(Locale.ROOT) + "_" + name,
                            holder -> factory.apply(holder, tier))
                    .tier(tier);
            defs[tier] = builder.apply(tier, register);
        }
        return defs;
    }

    public static MachineDefinition[] registerTieredMachines(String name,
                                                             BiFunction<IMachineBlockEntity, Integer, MetaMachine> factory,
                                                             BiFunction<Integer, MachineBuilder<MachineDefinition>, MachineDefinition> builder,
                                                             int... tiers) {
        return registerTieredMachines(REGISTRATE, name, factory, builder, tiers);
    }

    public static MachineDefinition[] registerTieredMachines(GTRegistrate registrate, String name,
                                                             BiFunction<IMachineBlockEntity, Integer, MetaMachine> factory,
                                                             BiFunction<Integer, MachineBuilder<MachineDefinition>, MachineDefinition> builder,
                                                             int... tiers) {
        MachineDefinition[] defs = new MachineDefinition[GTValues.TIER_COUNT];
        for (int tier : tiers) {
            var register = registrate
                    .machine(GTValues.VN[tier].toLowerCase(Locale.ROOT) + "_" + name,
                            holder -> factory.apply(holder, tier))
                    .tier(tier);
            defs[tier] = builder.apply(tier, register);
        }
        return defs;
    }

    public static MachineDefinition[] registerSimpleMachines(String name, GTRecipeType recipeType,
                                                             Int2IntFunction tankScalingFunction,
                                                             boolean hasPollutionDebuff) {
        return registerSimpleMachines(REGISTRATE, name, recipeType, tankScalingFunction, hasPollutionDebuff);
    }

    public static MachineDefinition[] registerSimpleMachines(GTRegistrate registrate, String name,
                                                             GTRecipeType recipeType,
                                                             Int2IntFunction tankScalingFunction,
                                                             boolean hasPollutionDebuff) {
        return registerSimpleMachines(registrate, name, recipeType, tankScalingFunction, hasPollutionDebuff,
                ELECTRIC_TIERS);
    }

    public static MachineDefinition[] registerSimpleMachines(String name, GTRecipeType recipeType,
                                                             Int2IntFunction tankScalingFunction) {
        return registerSimpleMachines(REGISTRATE, name, recipeType, tankScalingFunction);
    }

    public static MachineDefinition[] registerSimpleMachines(GTRegistrate registrate, String name,
                                                             GTRecipeType recipeType,
                                                             Int2IntFunction tankScalingFunction) {
        return registerSimpleMachines(registrate, name, recipeType, tankScalingFunction, false);
    }

    public static MachineDefinition[] registerSimpleMachines(String name, GTRecipeType recipeType, int... tiers) {
        return registerSimpleMachines(REGISTRATE, name, recipeType, defaultTankSizeFunction, false, tiers);
    }

    public static MachineDefinition[] registerSimpleMachines(String name, GTRecipeType recipeType) {
        return registerSimpleMachines(REGISTRATE, name, recipeType);
    }

    public static MachineDefinition[] registerSimpleMachines(GTRegistrate registrate, String name,
                                                             GTRecipeType recipeType) {
        return registerSimpleMachines(registrate, name, recipeType, defaultTankSizeFunction);
    }

    public static MachineDefinition @NotNull [] registerSimpleMachines(GTRegistrate registrate, String name,
                                                                       GTRecipeType recipeType,
                                                                       Int2IntFunction tankScalingFunction,
                                                                       boolean hasPollutionDebuff, int... tiers) {
        return registerTieredMachines(registrate, name,
                (holder, tier) -> new SimpleTieredMachine(holder, tier, tankScalingFunction), (tier, builder) -> {
                    if (hasPollutionDebuff) {
                        builder.recipeModifiers(GTRecipeModifiers.ENVIRONMENT_REQUIREMENT
                                .apply(GTMedicalConditions.CARBON_MONOXIDE_POISONING, 100 * tier),
                                GTRecipeModifiers.OC_NON_PERFECT)
                                .conditionalTooltip(defaultEnvironmentRequirement(),
                                        ConfigHolder.INSTANCE.gameplay.environmentalHazards);
                    } else {
                        builder.recipeModifier(GTRecipeModifiers.OC_NON_PERFECT);
                    }
                    return builder
                            .langValue(
                                    "%s %s %s".formatted(GTValues.VLVH[tier], toEnglishName(name), GTValues.VLVT[tier]))
                            .editableUI(SimpleTieredMachine.EDITABLE_UI_CREATOR.apply(EGT.id(name), recipeType))
                            .rotationState(RotationState.NON_Y_AXIS)
                            .recipeType(recipeType)
                            .workableTieredHullModel(EGT.id("block/machines/" + name))
                            .tooltips(workableTiered(tier, GTValues.V[tier], GTValues.V[tier] * 64, recipeType,
                                    tankScalingFunction.applyAsInt(tier), true))
                            .register();
                }, tiers);
    }
}
