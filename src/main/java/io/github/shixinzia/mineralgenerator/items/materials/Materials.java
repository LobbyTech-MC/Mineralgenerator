package io.github.shixinzia.mineralgenerator.items.materials;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.shixinzia.mineralgenerator.Mineralgenerator;
import io.github.shixinzia.mineralgenerator.categories.Groups;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class Materials {

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_COAL = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_COAL",
            Material.COAL_BLOCK,
            "&7煤炭生成器",
            "&b上面放箱子后",
            "&8源源不断生产出煤炭"
    );
    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_IRON = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_IRON",
            Material.IRON_BLOCK,
            "&7铁锭生成器",
            "&b上面放箱子后",
            "&8源源不断生产出铁锭"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_COPPER = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_COPPER",
            Material.COPPER_BLOCK,
            "&7铜锭生成器",
            "&b上面放箱子后",
            "&8源源不断生产出铜锭"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_GOLD = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_GOLD",
            Material.GOLD_BLOCK,
            "&7金锭生成器",
            "&b上面放箱子后",
            "&8源源不断生产出金锭"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_DIAMOND = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_DIAMOND",
            Material.DIAMOND_BLOCK,
            "&7钻石生成器",
            "&b上面放箱子后",
            "&8源源不断生产出钻石"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_LAPIS = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_LAPIS",
            Material.LAPIS_BLOCK,
            "&7青金石生成器",
            "&b上面放箱子后",
            "&8源源不断生产出青金石"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_REDSTONE = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_REDSTONE",
            Material.REDSTONE_BLOCK,
            "&7红石生成器",
            "&b上面放箱子后",
            "&8源源不断生产出红石"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_EMERALD = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_EMERALD",
            Material.EMERALD_BLOCK,
            "&7绿宝石生成器",
            "&b上面放箱子后",
            "&8源源不断生产出绿宝石"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_QUARTZ = new SlimefunItemStack(
            "MINERALGENERATOR_MINERAL_QUARTZ",
            Material.QUARTZ_BLOCK,
            "&7石英生成器",
            "&b上面放箱子后",
            "&8源源不断生产出石英"
    );

    public static final SlimefunItemStack MINERALGENERATOR_MINERAL_NETHERITE = new SlimefunItemStack(
        "MINERALGENERATOR_MINERAL_NETHERITE",
        Material.NETHERITE_BLOCK,
        "&7下届合金锭生成器",
        "&b上面放箱子后",
        "&8源源不断生产出下届合金锭"
    );
    public static void setup(Mineralgenerator plugin) {

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.COAL), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.COAL),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.COAL_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.COAL_BLOCK)
            }, 30)
            .setItem(Material.COAL)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_IRON,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.IRON_INGOT), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.IRON_INGOT),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.IRON_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.IRON_BLOCK)
            }, 30)
            .setItem(Material.IRON_INGOT)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_COPPER,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.COPPER_INGOT), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.COPPER_INGOT),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.COPPER_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.COPPER_BLOCK)
            }, 30)
            .setItem(Material.COPPER_INGOT)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_GOLD,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.GOLD_INGOT), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.GOLD_INGOT),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.GOLD_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.GOLD_BLOCK)
            }, 30)
            .setItem(Material.GOLD_INGOT)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_DIAMOND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.DIAMOND), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.DIAMOND),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.DIAMOND_BLOCK)
            }, 30)
            .setItem(Material.DIAMOND)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_LAPIS,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.LAPIS_LAZULI), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.LAPIS_LAZULI),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.LAPIS_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.LAPIS_BLOCK)
            }, 30)
            .setItem(Material.LAPIS_LAZULI)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_REDSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.REDSTONE), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.REDSTONE),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.REDSTONE_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.REDSTONE_BLOCK)
            }, 30)
            .setItem(Material.REDSTONE)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_EMERALD,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.EMERALD), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.EMERALD),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.EMERALD_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.EMERALD_BLOCK)
            }, 30)
            .setItem(Material.EMERALD)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_QUARTZ,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.QUARTZ), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.QUARTZ),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.QUARTZ_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.QUARTZ_BLOCK)
            }, 30)
            .setItem(Material.QUARTZ)
            .register(plugin);

        new Mineralgenerators(
            Groups.MINERALGENERATOR_MINERAL,
            Materials.MINERALGENERATOR_MINERAL_NETHERITE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.NETHERITE_INGOT), SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.NETHERITE_INGOT),
                SlimefunItems.ANDROID_MEMORY_CORE, SlimefunItems.GEO_MINER, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                new ItemStack(Material.NETHERITE_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.NETHERITE_BLOCK)
            }, 30)
            .setItem(Material.NETHERITE_INGOT)
            .register(plugin);
    }

}
