package xyz.nucker.nlib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class NLib extends JavaPlugin {


    public String msg(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public void log(String message) {
        Bukkit.getLogger().info(ChatColor.translateAlternateColorCodes('&', message));
    }

    public void reload() {
        reloadConfig();
    }
    public void disablePlugin(Plugin plugin) {
        Bukkit.getPluginManager().disablePlugin(plugin);
    }
    public void enablePlugin(Plugin plugin) {
        Bukkit.getPluginManager().enablePlugin(plugin);
    }
    public void registerCommand(String name, CommandExecutor executor) {
        getCommand(name).setExecutor(executor);
    }
    public void registerEvent(Listener executor) {
        getServer().getPluginManager().registerEvents(executor, this );
    }
}
