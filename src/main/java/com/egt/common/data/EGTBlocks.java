package com.egt.common.data;

import com.egt.api.block.EGTCoilType;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.gregtechceu.gtceu.common.data.models.GTModels;
import com.gregtechceu.gtceu.data.recipe.CustomTags;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Blocks;

import com.tterrag.registrate.util.entry.BlockEntry;

import static com.egt.EGT.REGISTRATE;

public class EGTBlocks {

    static {
        REGISTRATE.creativeModeTab(() -> EGTCreativeTab.MAIN);
    }

    public static void init() {}

    public static final BlockEntry<CoilBlock> COIL_NEUTRONIUM = createCoilBlock(EGTCoilType.NEUTRONIUM);

    private static BlockEntry<CoilBlock> createCoilBlock(ICoilType type) {
        var block = REGISTRATE
                .block("%s_coil_block".formatted(type.getName()), p -> new CoilBlock(p, type))
                .initialProperties(() -> Blocks.IRON_BLOCK)
                .properties(p -> p.isValidSpawn((state, level, pos, entity) -> false))
                .addLayer(() -> RenderType::cutoutMipped)
                .blockstate(GTModels.createCoilModel(type))
                .tag(CustomTags.MINEABLE_WITH_CONFIG_VALID_PICKAXE_WRENCH)
                .item(BlockItem::new)
                .build()
                .register();
        GTCEuAPI.HEATING_COILS.put(type, block);
        return block;
    }
}
