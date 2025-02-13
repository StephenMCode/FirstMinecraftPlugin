package me.stephenmcode.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("StephenMCode's plugin has started");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("StephenMCode's plugin has stopped");

    }
}
