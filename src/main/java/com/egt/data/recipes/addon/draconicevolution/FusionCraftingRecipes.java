package com.egt.data.recipes.addon.draconicevolution;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import com.brandon3055.draconicevolution.init.DEContent;
import com.brandon3055.draconicevolution.init.DETags;

import java.util.function.Consumer;

import static com.egt.EGT.id;
import static com.egt.common.data.EGTRecipeTypes.FUSION_CRAFTING_RECIPES;

public class FusionCraftingRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        FUSION_CRAFTING_RECIPES.recipeBuilder(id("awakened_core"))
                .inputItems(Tags.Items.NETHER_STARS)
                .inputItems(DEContent.CORE_WYVERN, 4)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 4)
                .outputItems(DEContent.CORE_AWAKENED)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_core"))
                .inputItems(DEContent.CHAOS_FRAG_LARGE, 5)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 4)
                .inputItems(DEContent.CORE_AWAKENED, 4)
                .outputItems(DEContent.CORE_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_crafting_injector"))
                .inputItems(DEContent.BASIC_CRAFTING_INJECTOR)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(Tags.Items.GEMS_DIAMOND, 4)
                .inputItems(DEContent.CORE_DRACONIUM, 2)
                .inputItems(DETags.Blocks.STORAGE_BLOCKS_DRACONIUM)
                .outputItems(DEContent.WYVERN_CRAFTING_INJECTOR)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("awakened_crafting_injector"))
                .inputItems(DEContent.WYVERN_CRAFTING_INJECTOR)
                .inputItems(Tags.Items.GEMS_DIAMOND, 4)
                .inputItems(DEContent.CORE_WYVERN, 2)
                .inputItems(DETags.Blocks.STORAGE_BLOCKS_DRACONIUM_AWAKENED)
                .outputItems(DEContent.AWAKENED_CRAFTING_INJECTOR)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_crafting_injector"))
                .inputItems(DEContent.AWAKENED_CRAFTING_INJECTOR)
                .inputItems(Tags.Items.GEMS_DIAMOND, 4)
                .inputItems(DEContent.CHAOS_FRAG_LARGE, 4)
                .inputItems(Items.DRAGON_EGG)
                .outputItems(DEContent.CHAOTIC_CRAFTING_INJECTOR)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("awakened_draconium_block"))
                .inputItems(DEContent.DRACONIUM_BLOCK, 4)
                .inputItems(DEContent.CORE_DRACONIUM, 6)
                .inputItems(DEContent.DRAGON_HEART)
                .outputItems(DEContent.AWAKENED_DRACONIUM_BLOCK, 4)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("reactor_stabilizer"))
                .inputItems(DEContent.REACTOR_PRT_STAB_FRAME)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .inputItems(DEContent.REACTOR_PRT_ROTOR_FULL)
                .inputItems(DEContent.REACTOR_PRT_FOCUS_RING)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 3)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.CHAOS_FRAG_LARGE)
                .outputItems(DEContent.REACTOR_STABILIZER)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("reactor_injector"))
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 4)
                .inputItems(DEContent.REACTOR_PRT_IN_ROTOR)
                .inputItems(Tags.Items.INGOTS_IRON, 2)
                .outputItems(DEContent.REACTOR_INJECTOR)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("reactor_core"))
                .inputItems(DEContent.CHAOS_SHARD)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 4)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 3)
                .inputItems(DEContent.CHAOS_FRAG_LARGE, 2)
                .outputItems(DEContent.REACTOR_CORE)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconium_chest"))
                .inputItems(Tags.Blocks.CHESTS)
                .inputItems(Blocks.FURNACE, 5)
                .inputItems(DEContent.CORE_DRACONIUM, 2)
                .inputItems(Blocks.CRAFTING_TABLE)
                .inputItems(DETags.Blocks.STORAGE_BLOCKS_DRACONIUM)
                .outputItems(DEContent.DRACONIUM_CHEST)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_relay_crystal"))
                .inputItems(DEContent.WYVERN_RELAY_CRYSTAL, 4)
                .inputItems(DEContent.ENERGY_CORE_WYVERN, 4)
                .inputItems(Tags.Items.GEMS_DIAMOND, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .outputItems(DEContent.DRACONIC_RELAY_CRYSTAL, 4)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("advanced_dislocator"))
                .inputItems(DEContent.DISLOCATOR)
                .inputItems(Tags.Items.ENDER_PEARLS, 3)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .outputItems(DEContent.DISLOCATOR_ADVANCED)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_sword"))
                .inputItems(Items.DIAMOND_SWORD)
                .inputItems(DEContent.CORE_DRACONIUM)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 2)
                .inputItems(DEContent.BASIC_RELAY_CRYSTAL, 2)
                .inputItems(DEContent.ENERGY_CORE_WYVERN)
                .outputItems(DEContent.SWORD_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_shovel"))
                .inputItems(Items.DIAMOND_SHOVEL)
                .inputItems(DEContent.CORE_DRACONIUM)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 2)
                .inputItems(DEContent.BASIC_RELAY_CRYSTAL, 2)
                .inputItems(DEContent.ENERGY_CORE_WYVERN)
                .outputItems(DEContent.SHOVEL_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_pickaxe"))
                .inputItems(Items.DIAMOND_PICKAXE)
                .inputItems(DEContent.CORE_DRACONIUM)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 2)
                .inputItems(DEContent.BASIC_RELAY_CRYSTAL, 2)
                .inputItems(DEContent.ENERGY_CORE_WYVERN)
                .outputItems(DEContent.PICKAXE_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_hoe"))
                .inputItems(Items.DIAMOND_HOE)
                .inputItems(DEContent.CORE_DRACONIUM)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 2)
                .inputItems(DEContent.BASIC_RELAY_CRYSTAL, 2)
                .inputItems(DEContent.ENERGY_CORE_WYVERN)
                .outputItems(DEContent.HOE_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_axe"))
                .inputItems(Items.DIAMOND_AXE)
                .inputItems(DEContent.CORE_DRACONIUM)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 2)
                .inputItems(DEContent.BASIC_RELAY_CRYSTAL, 2)
                .inputItems(DEContent.ENERGY_CORE_WYVERN)
                .outputItems(DEContent.AXE_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_bow"))
                .inputItems(Items.BOW)
                .inputItems(DEContent.CORE_DRACONIUM)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 2)
                .inputItems(DEContent.BASIC_RELAY_CRYSTAL, 2)
                .inputItems(DEContent.ENERGY_CORE_WYVERN)
                .outputItems(DEContent.BOW_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_capacitor"))
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 4)
                .inputItems(DEContent.ENERGY_CORE_WYVERN, 4)
                .outputItems(DEContent.CAPACITOR_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("wyvern_chestpiece"))
                .inputItems(Items.DIAMOND_CHESTPLATE)
                .inputItems(DEContent.CORE_DRACONIUM)
                .inputItems(DETags.Items.INGOTS_DRACONIUM, 2)
                .inputItems(DEContent.BASIC_RELAY_CRYSTAL, 2)
                .inputItems(DEContent.ENERGY_CORE_WYVERN)
                .outputItems(DEContent.CHESTPIECE_WYVERN)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_sword"))
                .inputItems(DEContent.SWORD_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.SWORD_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_axe"))
                .inputItems(DEContent.AXE_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.AXE_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_bow"))
                .inputItems(DEContent.BOW_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.BOW_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_hoe"))
                .inputItems(DEContent.HOE_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.HOE_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_pickaxe"))
                .inputItems(DEContent.PICKAXE_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.PICKAXE_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_shovel"))
                .inputItems(DEContent.SHOVEL_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.SHOVEL_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_sword"))
                .inputItems(DEContent.SWORD_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.SWORD_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_capacitor"))
                .inputItems(DEContent.CAPACITOR_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 4)
                .inputItems(DEContent.CORE_AWAKENED)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC, 3)
                .outputItems(DEContent.CAPACITOR_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_chestpiece"))
                .inputItems(DEContent.CHESTPIECE_WYVERN)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.CHESTPIECE_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("draconic_staff"))
                .inputItems(DEContent.CORE_AWAKENED)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 6)
                .inputItems(DEContent.PICKAXE_DRACONIC)
                .inputItems(DEContent.SWORD_DRACONIC)
                .inputItems(DEContent.SHOVEL_DRACONIC)
                .inputItems(DEContent.ENERGY_CORE_DRACONIC)
                .outputItems(DEContent.STAFF_DRACONIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_sword"))
                .inputItems(DEContent.SWORD_DRACONIC)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 6)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.SWORD_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_shovel"))
                .inputItems(DEContent.SHOVEL_DRACONIC)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 6)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.SHOVEL_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_axe"))
                .inputItems(DEContent.AXE_DRACONIC)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 6)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.AXE_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_bow"))
                .inputItems(DEContent.BOW_DRACONIC)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 6)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.BOW_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_hoe"))
                .inputItems(DEContent.HOE_DRACONIC)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 6)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.HOE_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_pickaxe"))
                .inputItems(DEContent.PICKAXE_DRACONIC)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 6)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.PICKAXE_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_capacitor"))
                .inputItems(DEContent.CAPACITOR_DRACONIC)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 4)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC, 3)
                .outputItems(DEContent.CAPACITOR_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_chestpiece"))
                .inputItems(DEContent.CHESTPIECE_DRACONIC)
                .inputItems(Tags.Items.INGOTS_NETHERITE, 4)
                .inputItems(DEContent.CORE_WYVERN)
                .inputItems(DETags.Items.INGOTS_DRACONIUM_AWAKENED, 2)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.CHESTPIECE_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_staff"))
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.CHAOS_FRAG_MEDIUM, 6)
                .inputItems(DEContent.PICKAXE_CHAOTIC)
                .inputItems(DEContent.SWORD_CHAOTIC)
                .inputItems(DEContent.HOE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC)
                .outputItems(DEContent.STAFF_CHAOTIC)
                .duration(200)
                .save(provider);

        FUSION_CRAFTING_RECIPES.recipeBuilder(id("chaotic_staff_alt"))
                .inputItems(DEContent.STAFF_DRACONIC)
                .inputItems(DEContent.CHAOS_FRAG_MEDIUM, 2)
                .inputItems(DEContent.CORE_CHAOTIC)
                .inputItems(DEContent.ENERGY_CORE_CHAOTIC, 3)
                .inputItems(DEContent.CORE_AWAKENED, 2)
                .inputItems(DEContent.CHAOS_FRAG_LARGE, 2)
                .outputItems(DEContent.STAFF_CHAOTIC)
                .duration(200)
                .save(provider);
    }
}
