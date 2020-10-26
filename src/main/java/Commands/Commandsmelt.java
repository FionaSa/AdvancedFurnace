package Commands;

import fr.gohansword.advancedfurnace.AdvancedFurnace;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class Commandsmelt
        implements CommandExecutor {
    Plugin plugin = AdvancedFurnace.getPlugin(AdvancedFurnace.class);


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String noPermission = this.plugin.getConfig().getString("NoPermission");
        noPermission = colorize(noPermission);
        String unsmeltableItem = this.plugin.getConfig().getString("UnsmeltableItem");
        unsmeltableItem = colorize(unsmeltableItem);
        String successfulSmelt = this.plugin.getConfig().getString("SuccessfulSmelt");
        successfulSmelt = colorize(successfulSmelt);
        String prefix = this.plugin.getConfig().getString("Prefix");
        prefix = colorize(prefix);
        Player player = (Player)sender;
        ItemStack is = player.getInventory().getItemInMainHand();
        Material item = is.getType();
        int amount = is.getAmount();
        boolean worked = false;
        Material newItem = null;
        if (player.hasPermission("advancedfurnace.use")) {
            if (item == Material.PORKCHOP) {
                worked = true;
                newItem = Material.COOKED_PORKCHOP;
            } else if (item == Material.BEEF) {
                worked = true;
                newItem = Material.COOKED_BEEF;
            } else if (item == Material.CHICKEN) {
                worked = true;
                newItem = Material.COOKED_CHICKEN;
            } else if (item == Material.COD) {
                worked = true;
                newItem = Material.COOKED_COD;
            } else if (item == Material.SALMON) {
                worked = true;
                newItem = Material.COOKED_SALMON;
            } else if (item == Material.POTATO) {
                worked = true;
                newItem = Material.BAKED_POTATO;
            } else if (item == Material.MUTTON) {
                worked = true;
                newItem = Material.COOKED_MUTTON;
            } else if (item == Material.KELP) {
                worked = true;
                newItem = Material.DRIED_KELP;
            } else if (item == Material.IRON_ORE) {
                worked = true;
                newItem = Material.IRON_INGOT;
            } else if (item == Material.GOLD_ORE) {
                worked = true;
                newItem = Material.GOLD_INGOT;
            } else if (item == Material.SAND || item == Material.RED_SAND) {
                worked = true;
                newItem = Material.GLASS;
            } else if (item == Material.COBBLESTONE) {
                worked = true;
                newItem = Material.STONE;
            } else if (item == Material.CLAY_BALL) {
                worked = true;
                newItem = Material.BRICK;
            } else if (item == Material.NETHERRACK) {
                worked = true;
                newItem = Material.NETHER_BRICK;
            } else if (item == Material.CLAY) {
                worked = true;
                newItem = Material.TERRACOTTA;
            } else if (item == Material.STONE_BRICKS) {
                worked = true;
                newItem = Material.CRACKED_STONE_BRICKS;
            } else if (item == Material.BLACK_TERRACOTTA) {
                worked = true;
                newItem = Material.BLACK_GLAZED_TERRACOTTA;
            } else if (item == Material.BLUE_TERRACOTTA) {
                worked = true;
                newItem = Material.BLUE_GLAZED_TERRACOTTA;
            } else if (item == Material.BROWN_TERRACOTTA) {
                worked = true;
                newItem = Material.BROWN_GLAZED_TERRACOTTA;
            } else if (item == Material.CYAN_TERRACOTTA) {
                worked = true;
                newItem = Material.CYAN_GLAZED_TERRACOTTA;
            } else if (item == Material.GRAY_TERRACOTTA) {
                worked = true;
                newItem = Material.GRAY_GLAZED_TERRACOTTA;
            } else if (item == Material.GREEN_TERRACOTTA) {
                worked = true;
                newItem = Material.GREEN_GLAZED_TERRACOTTA;
            } else if (item == Material.LIGHT_BLUE_TERRACOTTA) {
                worked = true;
                newItem = Material.LIGHT_BLUE_GLAZED_TERRACOTTA;
            } else if (item == Material.LIGHT_GRAY_TERRACOTTA) {
                worked = true;
                newItem = Material.LIGHT_GRAY_GLAZED_TERRACOTTA;
            } else if (item == Material.LIME_TERRACOTTA) {
                worked = true;
                newItem = Material.LIME_GLAZED_TERRACOTTA;
            } else if (item == Material.MAGENTA_TERRACOTTA) {
                worked = true;
                newItem = Material.MAGENTA_GLAZED_TERRACOTTA;
            } else if (item == Material.ORANGE_TERRACOTTA) {
                worked = true;
                newItem = Material.ORANGE_GLAZED_TERRACOTTA;
            } else if (item == Material.PINK_TERRACOTTA) {
                worked = true;
                newItem = Material.PINK_GLAZED_TERRACOTTA;
            } else if (item == Material.PURPLE_TERRACOTTA) {
                worked = true;
                newItem = Material.PURPLE_GLAZED_TERRACOTTA;
            } else if (item == Material.RED_TERRACOTTA) {
                worked = true;
                newItem = Material.RED_GLAZED_TERRACOTTA;
            } else if (item == Material.WHITE_TERRACOTTA) {
                worked = true;
                newItem = Material.WHITE_GLAZED_TERRACOTTA;
            } else if (item == Material.YELLOW_TERRACOTTA) {
                worked = true;
                newItem = Material.YELLOW_GLAZED_TERRACOTTA;
            } else if (item == Material.DIAMOND_ORE) {
                worked = true;
                newItem = Material.DIAMOND;
            } else if (item == Material.LAPIS_ORE) {
                worked = true;
                newItem = Material.LAPIS_LAZULI;
            } else if (item == Material.REDSTONE_ORE) {
                worked = true;
                newItem = Material.REDSTONE;
            } else if (item == Material.COAL_ORE) {
                worked = true;
                newItem = Material.COAL;
            } else if (item == Material.EMERALD_ORE) {
                worked = true;
                newItem = Material.EMERALD;
            } else if (item == Material.NETHER_QUARTZ_ORE) {
                worked = true;
                newItem = Material.QUARTZ;
            } else if (item == Material.IRON_SWORD || item == Material.IRON_PICKAXE || item == Material.IRON_AXE || item == Material.IRON_SHOVEL || item == Material.IRON_HOE || item == Material.CHAINMAIL_HELMET || item == Material.CHAINMAIL_CHESTPLATE || item == Material.CHAINMAIL_LEGGINGS || item == Material.CHAINMAIL_BOOTS || item == Material.IRON_HELMET || item == Material.IRON_CHESTPLATE || item == Material.IRON_LEGGINGS || item == Material.IRON_BOOTS || item == Material.IRON_HORSE_ARMOR) {
                worked = true;
                newItem = Material.IRON_NUGGET;
            } else if (item == Material.GOLDEN_SWORD || item == Material.GOLDEN_AXE || item == Material.GOLDEN_PICKAXE || item == Material.GOLDEN_SHOVEL || item == Material.GOLDEN_HOE || item == Material.GOLDEN_HELMET || item == Material.GOLDEN_CHESTPLATE || item == Material.GOLDEN_LEGGINGS || item == Material.GOLDEN_BOOTS || item == Material.GOLDEN_HORSE_ARMOR) {
                worked = true;
                newItem = Material.GOLD_NUGGET;
            } else if (item == Material.CACTUS) {
                worked = true;
                newItem = Material.GREEN_DYE;
            } else if (item == Material.BIRCH_LOG || item == Material.SPRUCE_LOG || item == Material.OAK_LOG || item == Material.JUNGLE_LOG || item == Material.ACACIA_LOG || item == Material.DARK_OAK_LOG || item == Material.STRIPPED_ACACIA_LOG || item == Material.STRIPPED_ACACIA_WOOD || item == Material.STRIPPED_BIRCH_LOG || item == Material.STRIPPED_BIRCH_WOOD || item == Material.STRIPPED_DARK_OAK_LOG || item == Material.STRIPPED_DARK_OAK_WOOD || item == Material.STRIPPED_JUNGLE_LOG || item == Material.STRIPPED_JUNGLE_WOOD || item == Material.STRIPPED_OAK_LOG || item == Material.STRIPPED_OAK_WOOD || item == Material.STRIPPED_SPRUCE_LOG || item == Material.STRIPPED_SPRUCE_WOOD || item == Material.ACACIA_WOOD || item == Material.DARK_OAK_WOOD || item == Material.OAK_WOOD || item == Material.BIRCH_WOOD || item == Material.SPRUCE_WOOD || item == Material.JUNGLE_WOOD || item == Material.CRIMSON_STEM || item == Material.WARPED_STEM || item == Material.STRIPPED_CRIMSON_STEM || item == Material.STRIPPED_WARPED_STEM || item == Material.STRIPPED_CRIMSON_HYPHAE || item == Material.STRIPPED_WARPED_HYPHAE) {
                worked = true;
                newItem = Material.CHARCOAL;
            } else if (item == Material.CHORUS_FRUIT) {
                worked = true;
                newItem = Material.POPPED_CHORUS_FRUIT;
            } else if (item == Material.WET_SPONGE) {
                worked = true;
                newItem = Material.SPONGE;
            } else if (item == Material.NETHER_GOLD_ORE) {
                worked = true;
                newItem = Material.GOLD_INGOT;
            } else if (item == Material.POLISHED_BLACKSTONE_BRICKS) {
                worked = true;
                newItem = Material.CRACKED_POLISHED_BLACKSTONE_BRICKS;
            } else if (item == Material.SEA_PICKLE) {
                worked = true;
                newItem = Material.LIME_DYE;
            } else if (item == Material.ANCIENT_DEBRIS) {
                worked = true;
                newItem = Material.NETHERITE_SCRAP;
            }

            if (worked) {
                ItemStack newStack = new ItemStack(newItem, amount);
                player.getInventory().setItemInMainHand(newStack);
                successfulSmelt = successfulSmelt.replace("%OLDITEM%", item.name());
                successfulSmelt = successfulSmelt.replace("%NEWITEM%", newItem.name());
                player.sendMessage(prefix + successfulSmelt);
            } else {
                player.sendMessage(prefix + unsmeltableItem);
            }

        } else {

            player.sendMessage(prefix + noPermission);
        }



        return true;
    }


    public String colorize(String msg) {
        String coloredMsg = "";
        for (int i = 0; i < msg.length(); i++) {

            if (msg.charAt(i) == '&') {
                coloredMsg = coloredMsg + '§';
            } else {
                coloredMsg = coloredMsg + msg.charAt(i);
            }
        }  return coloredMsg;
    }
}
