package net.pepega.craftexpanse.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pepega.craftexpanse.CraftExpanse;

import javax.swing.*;

public class ModItems {

    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CraftExpanse.MOD_ID);

    public static final RegistryObject<Item> PEBBLE = ITEMS.register("pebble",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_CHIP = ITEMS.register("diamond_chip",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
