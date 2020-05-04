package com.fallenstack.fallenkitpvp;


import com.earth2me.essentials.Essentials;
import org.bukkit.plugin.java.JavaPlugin;


public class FallenStackKitPvP extends JavaPlugin{

    public static Essentials getEssentials;
    public void onEnable(){
        this.getCommand("bounty").setExecutor(new BountyCommand());
        this.getCommand("regeneration").setExecutor(new RegenerationCommand());
        this.getCommand("fireresistance").setExecutor(new FireResistanceCommand());
        this.getCommand("jumpboost").setExecutor(new JumpBoostCommand());
        this.getCommand("speedboost").setExecutor(new SpeedCommand());

        getEssentials = Essentials.getPlugin(Essentials.class);



    }

    public void onDisable(){

    }

}
