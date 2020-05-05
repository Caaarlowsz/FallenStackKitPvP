package com.fallenstack.fallenkitpvp;
import com.earth2me.essentials.Essentials;
import com.earth2me.essentials.User;
import com.earth2me.essentials.api.NoLoanPermittedException;
import com.earth2me.essentials.api.UserDoesNotExistException;
import net.ess3.api.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.math.BigDecimal;


@SuppressWarnings("deprecation")
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
        Player bountySender =  (Player) commandSender;
        User bountiedPlayer = FallenStackKitPvP.ess.getUser(args[0]);
        if(!(bountiedPlayer instanceof User)){
            bountySender.sendMessage(ChatColor.RED + "Error: Cannot place bounties on non-players...");
            return true;
        }
        /*
        if(bountySender == bountiedPlayer){
            bountySender.sendMessage(ChatColor.RED + "Error: You cannot place bounties on yourself...");
            return true;
        */
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
            if(bountiedPlayer != null) {
                    try {
                        if (Economy.hasEnough(bountySender.getName(),bounty)) {
                            BountyManager.addOrReplaceBounty(bountiedPlayer, bounty);
                            Economy.substract(bountySender.getName(), BigDecimal.valueOf(bounty));
                            bountiedPlayer.addMail(ChatColor.DARK_RED + "You've got a price on your head of $" + bounty + " by " + bountySender.getName());
                            bountySender.sendMessage(ChatColor.GREEN + "You've placed a bounty on " + ChatColor.BLUE + bountiedPlayer.getName() + ChatColor.GREEN + " for the amount of " + bounty);
                        } else {
                            bountySender.sendMessage(ChatColor.RED + "Error: You don't have enough money to set that bounty!");
                            return true;
                        }
                    } catch (UserDoesNotExistException | NoLoanPermittedException e) {
                        Bukkit.getLogger().info("***** THIS IS NOT AN ERROR, THE USER WAS SIMPLY NOT FOUND FOR THE BOUNTY IN BUKKIT PLAYER REGISTERY *****");
                        e.printStackTrace();
                        bountySender.sendMessage(ChatColor.RED + "Error: User does not exist...");
                    }

            }
        }
        return true;
    }
}
