package fr.gohansword.advancedfurnace;

import Commands.Commandsmelt;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedFurnace extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("smelt").setExecutor(new Commandsmelt());
        this.saveDefaultConfig();
        String newLine = System.getProperty("line.separator");
        Bukkit.getConsoleSender().sendMessage("   §a________" + newLine + "                   §a| | -- | |" + newLine + "                   §a| |-AF-| |" + newLine + "                   §a| |-->-| |     §8§l[§b§lAdvanced§f§lFurnace§8§l] §8>> §aLoaded successfully ! :)" + newLine + "                   §a| |-AF-| |" + newLine + "                   §a| | -- | |" + newLine + "                 §a§m--------------§r");

    }

    @Override
    public void onDisable() {
        String newLine = System.getProperty("line.separator");
        Bukkit.getConsoleSender().sendMessage("   §c________" + newLine + "                   §c| | -- | |" + newLine + "                   §c| |-AF-| |" + newLine + "                   §c| |-->-| |     §8§l[§b§lAdvanced§f§lFurnace§8§l] §8>> §cUnloaded successfully ! :)" + newLine + "                   §c| |-AF-| |" + newLine + "                   §c| | -- | |" + newLine + "                 §c§m--------------§r");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String newLine = System.getProperty("line.separator");
        String blankline = "&f";

        if (label.equalsIgnoreCase("advancedfurnace")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        this.getConfig().getString("Prefix") + this.getConfig().getString("Usage")));
            }
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (!sender.hasPermission("advancedfurnace.admin")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                this.getConfig().getString("Prefix") + this.getConfig().getString("NoPermission")));
                        return true;
                    }else this.reloadConfig();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            this.getConfig().getString("Prefix") + this.getConfig().getString("Reload")));
                } else if (args[0].equalsIgnoreCase("help")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            this.getConfig().getString("Help") + newLine + blankline + newLine + this.getConfig().getString("CommandHelp") + newLine + this.getConfig().getString("CommandReload") + newLine + this.getConfig().getString("CommandSmelt") + newLine + blankline + newLine + this.getConfig().get("HelpEnd")));
                }
            }
        } else if (label.equalsIgnoreCase("af")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        this.getConfig().getString("Prefix") + this.getConfig().getString("Usage")));
            }
            else if (args.length > 0) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (!sender.hasPermission("advancedfurnace.admin")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                this.getConfig().getString("Prefix") + this.getConfig().getString("NoPermission")));
                        return true;
                    }else
                    this.reloadConfig();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            this.getConfig().getString("Prefix") + this.getConfig().getString("Reload")));
                }else if (args[0].equalsIgnoreCase("help")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            this.getConfig().getString("Help" ) + newLine + blankline + newLine +this.getConfig().getString("CommandHelp") + newLine + this.getConfig().getString("CommandReload") + newLine + this.getConfig().getString("CommandSmelt") + newLine + blankline + newLine + this.getConfig().get("HelpEnd")));
                }
            }
        } return false;
    }
}
