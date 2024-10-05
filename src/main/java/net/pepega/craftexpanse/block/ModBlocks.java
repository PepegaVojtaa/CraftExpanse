package net.pepega.craftexpanse.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pepega.craftexpanse.CraftExpanse;
import net.pepega.craftexpanse.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CraftExpanse.MOD_ID);

    public static final RegistryObject<Block> PEBBLE_DIRT = registerBlock("pebble_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<StairBlock> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_DAISY = registerBlock("pink_daisy",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0f).requiresCorrectToolForDrops().sound(SoundType.GRASS)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
