package net.pepega.craftexpanse.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pepega.craftexpanse.CraftExpanse;
import net.pepega.craftexpanse.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftExpanse.MOD_ID);

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            event.accept(ModItems.PEBBLE.get());
            event.getEntries().putBefore(Items.COAL.getDefaultInstance(), ModItems.PEBBLE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(ModItems.DIAMOND_CHIP.get());
            event.getEntries().putBefore(Items.IRON_NUGGET.getDefaultInstance(), ModItems.DIAMOND_CHIP.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(ModBlocks.POLISHED_STONE);
            event.getEntries().putBefore(Items.COBBLESTONE.getDefaultInstance(), ModBlocks.POLISHED_STONE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(ModBlocks.POLISHED_STONE_STAIRS);
            event.getEntries().putBefore(Items.COBBLESTONE.getDefaultInstance(), ModBlocks.POLISHED_STONE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(ModBlocks.POLISHED_STONE_SLAB);
            event.getEntries().putBefore(Items.COBBLESTONE.getDefaultInstance(), ModBlocks.POLISHED_STONE_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(ModBlocks.GRANITE_BRICKS);
            event.getEntries().putBefore(Items.COBBLESTONE.getDefaultInstance(), ModBlocks.GRANITE_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.PEBBLE_DIRT);
            event.getEntries().putBefore(Items.COARSE_DIRT.getDefaultInstance(), ModBlocks.PEBBLE_DIRT.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }


        }
    }
