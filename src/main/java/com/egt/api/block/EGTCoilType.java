package com.egt.api.block;

import com.egt.EGT;

import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public enum EGTCoilType implements StringRepresentable, ICoilType {

    NEUTRONIUM("neutronium", 13000, 32, 16, GTMaterials.Neutronium, null);

    @NotNull
    @Getter
    private final String name;

    @Getter
    private final int coilTemperature;

    @Getter
    private final int level;

    @Getter
    private final int energyDiscount;

    @NotNull
    @Getter
    private final Material material;

    @NotNull
    @Getter
    private final ResourceLocation texture;

    EGTCoilType(String name, int coilTemperature, int level, int energyDiscount, Material material,
                ResourceLocation texture) {
        this.name = name;
        this.coilTemperature = coilTemperature;
        this.level = level;
        this.energyDiscount = energyDiscount;
        this.material = material;
        this.texture = texture;
    }

    @Override
    public int getTier() {
        return this.ordinal();
    }

    @NotNull
    @Override
    public String toString() {
        return getName();
    }

    @NotNull
    @Override
    public String getSerializedName() {
        return name;
    }
}
