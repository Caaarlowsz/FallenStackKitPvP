package com.fallenstack.fallenkitpvp;


import com.earth2me.essentials.Essentials;
import org.bukkit.plugin.java.JavaPlugin;


public class FallenStackKitPvP extends JavaPlugin{

    public static Essentials getEssentials;
    public void onEnable(){
        this.getCommand("bounty").setExecutor(new BountyCommand());
        this.getCommand("regen").setExecutor(new RegenerationCommand());

        getEssentials = Essentials.getPlugin(Essentials.class);



    }

    public void onDisable(){

    }

}
