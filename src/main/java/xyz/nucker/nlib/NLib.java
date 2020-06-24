package xyz.nucker.nlib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NLib extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }
    public String msg(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
    public void log(String message) {
        Bukkit.getLogger().info(ChatColor.translateAlternateColorCodes('&',message));
    }
}
