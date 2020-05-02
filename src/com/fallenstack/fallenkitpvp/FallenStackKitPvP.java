package com.fallenstack.fallenkitpvp;


import org.bukkit.plugin.java.JavaPlugin;


public class FallenStackKitPvP extends JavaPlugin{

    public void onEnable(){
        this.getCommand("bounty").setExecutor(new BountyCommand());


    }
    public void onDisable(){

    }

}
