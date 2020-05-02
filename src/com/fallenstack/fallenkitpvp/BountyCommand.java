package com.fallenstack.fallenkitpvp;

import com.earth2me.essentials.Essentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.earth2me.essentials.api.Economy.*;


public class BountyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if(args.length < 2){
            commandSender.sendMessage(ChatColor.RED + "Error: Invalid Syntax, try /bounty <name> <amount>");
            return true;
        }
        if(!(commandSender instanceof Player)){
            commandSender.sendMessage(ChatColor.RED + "Error: Console cannot place bounties on players...");
            return true;
        }
        Player bountySender = (Player) commandSender;
        Player bountiedPlayer = Bukkit.getServer().getPlayer(args[0]);
        if(Utilites.isStringInteger(args[1]) == false){
            commandSender.sendMessage(ChatColor.RED + "Error: Invalid bounty type, bounties cannot have decimals...");
            return true;
        }

        Integer bounty = Integer.parseInt(args[1]);
        if(bounty <= 0){
            bountySender.sendMessage(ChatColor.RED + "Error: Bounty must be at-least $1+");
            return true;
        }
        else {
            //Existing Bounty


            //New Bounty
            if (bountiedPlayer != null) {
                if (bountiedPlayer. == true) {
                    if (Essentials >= bounty) {
                        BountyManager.BountyMap(bountiedPlayer, bounty);
                        // Essentials.getPlayer(bountySender).getBalance().takeBalance(bounty);
                        bountiedPlayer.sendMessage(ChatColor.DARK_RED + "You've got a price on your head of" + bounty + " by " + bountySender);
                        bountySender.sendMessage(ChatColor.GREEN + "You've placed a bounty on " + ChatColor.BLUE + bountiedPlayer + ChatColor.GREEN + "for the amount of " + bounty);
                        return true;
                    } else {
                        bountySender.sendMessage(ChatColor.RED + "Error: You don't have enough money to set that bounty!");
                        return true;
                    }
                } else {

                }
            }
        }
        return true;
    }
}
