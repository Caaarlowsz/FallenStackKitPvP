package com.fallenstack.fallenkitpvp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FireResistanceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {


        if(args.length != 0){
            commandSender.sendMessage(ChatColor.RED + "Error: Invalid syntax... try /fireresistance");
            return true;
        }
        if(!(commandSender instanceof Player)){
            commandSender.sendMessage(ChatColor.RED + "Error: Console is not a player, therefore it cannot have fire resistance...");
            return true;
        }
        Player player = (Player) commandSender;
        player.addPotionEffect((new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 2)));
        player.sendMessage(ChatColor.GREEN + "Fire Resistance activated for 30 seconds...");
        return true;

    }
}
