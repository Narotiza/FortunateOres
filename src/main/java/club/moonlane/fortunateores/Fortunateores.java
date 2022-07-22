package club.moonlane.fortunateores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Fortunateores implements ModInitializer {
    public static final Block IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f));
    public static final Block DEEPSLATE_IRON_ORE = new OreBlock(FabricBlockSettings.copy(IRON_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f,3.0f).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block COPPER_ORE = new OreBlock(FabricBlockSettings.copy(IRON_ORE));
    public static final Block DEEPSLATE_COPPER_ORE = new OreBlock(FabricBlockSettings.copy(DEEPSLATE_IRON_ORE));
    public static final Block GOLD_ORE = new OreBlock(FabricBlockSettings.copy(IRON_ORE));
    public static final Block DEEPSLATE_GOLD_ORE = new OreBlock(FabricBlockSettings.copy(DEEPSLATE_IRON_ORE));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("fortunateores","iron_ore"), IRON_ORE);
        Registry.register(Registry.ITEM,  new Identifier("fortunateores","iron_ore"), new BlockItem(IRON_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("fortunateores","deepslate_iron_ore"), DEEPSLATE_IRON_ORE);
        Registry.register(Registry.ITEM,  new Identifier("fortunateores","deepslate_iron_ore"), new BlockItem(DEEPSLATE_IRON_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));



        Registry.register(Registry.BLOCK, new Identifier("fortunateores","copper_ore"), COPPER_ORE);
        Registry.register(Registry.ITEM,  new Identifier("fortunateores","copper_ore"), new BlockItem(COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("fortunateores","deepslate_copper_ore"), DEEPSLATE_COPPER_ORE);
        Registry.register(Registry.ITEM,  new Identifier("fortunateores","deepslate_copper_ore"), new BlockItem(DEEPSLATE_COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));



        Registry.register(Registry.BLOCK, new Identifier("fortunateores","gold_ore"), GOLD_ORE);
        Registry.register(Registry.ITEM,  new Identifier("fortunateores","gold_ore"), new BlockItem(GOLD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier("fortunateores","deepslate_gold_ore"), DEEPSLATE_GOLD_ORE);
        Registry.register(Registry.ITEM,  new Identifier("fortunateores","deepslate_gold_ore"), new BlockItem(DEEPSLATE_GOLD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
