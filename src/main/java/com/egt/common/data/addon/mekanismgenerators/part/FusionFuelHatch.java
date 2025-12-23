package com.egt.common.data.addon.mekanismgenerators.part;

import com.egt.common.data.addon.mekanismgenerators.MekGenMaterials;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.trait.NotifiableFluidTank;
import com.gregtechceu.gtceu.api.transfer.fluid.CustomFluidTank;
import com.gregtechceu.gtceu.common.machine.multiblock.part.FluidHatchPartMachine;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.fluids.FluidStack;

import java.util.Collections;


public class FusionFuelHatch extends FluidHatchPartMachine {
    protected InfiniteFusionFuelTank fuelTank;
    public static final int FLUID_AMOUNT = 2_000_000_000;

    public FusionFuelHatch(IMachineBlockEntity holder, Object... args) {
        super(holder, GTValues.LuV, IO.IN, FLUID_AMOUNT, 1, args);
    }

    @Override
    protected NotifiableFluidTank createTank(int initialCapacity, int slots, Object... args) {
        this.fuelTank = new InfiniteFusionFuelTank(initialCapacity);
        return new NotifiableFluidTank(this, Collections.singletonList(fuelTank), io, IO.BOTH);
    }

    @Override
    protected void updateTankSubscription() {
        if (isWorkingEnabled() && !fuelTank.isFull()) {
            autoIOSubs = subscribeServerTick(autoIOSubs, this::autoIO);
        } else if (autoIOSubs != null) {
            autoIOSubs.unsubscribe();
            autoIOSubs = null;
        }
    }

    @Override
    protected void autoIO() {
        if (getOffsetTimer() % 20 == 0) {
            fuelTank.refillFluid();
            updateTankSubscription();
        }
    }

    @Override
    public boolean swapIO() {
        return false;
    }

    protected static class InfiniteFusionFuelTank extends CustomFluidTank {
        private static final CompoundTag EMPTY = new CompoundTag();
        private static final FluidStack STACK = new FluidStack(MekGenMaterials.DTFuel.getFluid(), Integer.MAX_VALUE);

        public InfiniteFusionFuelTank(int capacity) {
            super(capacity);
        }

        public void refillFluid() {
            super.fill(STACK, FluidAction.EXECUTE);
        }

        public boolean isFull() {
            return getFluidAmount() >= capacity;
        }

        @Override
        public boolean supportsFill(int tank) {
            return false;
        }

        @Override
        public int fill(FluidStack resource, FluidAction action) {
            return 0;
        }

        @Override
        public CompoundTag serializeNBT() {
            return EMPTY;
        }

        @Override
        public void deserializeNBT(CompoundTag nbt) {}
    }
}
