package com.fallenstack.fallenkitpvp;


import com.earth2me.essentials.Essentials;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class FallenStackKitPvP extends JavaPlugin{
    public static Essentials ess;
    public void onEnable(){
        this.getCommand("bounty").setExecutor(new BountyCommand());
        this.getCommand("regeneration").setExecutor(new RegenerationCommand());
        this.getCommand("fireresistance").setExecutor(new FireResistanceCommand());
        this.getCommand("jumpboost").setExecutor(new JumpBoostCommand());
        this.getCommand("speedboost").setExecutor(new SpeedCommand());

        ess = (Essentials) Bukkit.getServer().getPluginManager().getPlugin("Essentials");


    }

    public void onDisable(){


    }

}
