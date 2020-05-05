package com.fallenstack.fallenkitpvp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.*;


public class BountyListCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if(args.length > 1){
            commandSender.sendMessage(ChatColor.RED + "Error: Invalid Syntax... try /bountylist");
            return true;
        }
        if(BountyManager.bountyList.isEmpty() == true){
            commandSender.sendMessage(ChatColor.RED + "There are no current bounties...");
            return true;
        }
        if(args.length == 0){
            int i = 0;
            HashMap<UUID, Integer> orderedMap = new HashMap<UUID, Integer>();
            List<Map.Entry<UUID,Integer>> orderList = new ArrayList<Map.Entry<UUID, Integer>>(BountyManager.bountyList.entrySet());
            Collections.sort(orderList, Comparator.comparing(Map.Entry<UUID,Integer>::getValue));
            for(Map.Entry<UUID,Integer> entry : BountyManager.bountyList.entrySet()){
                if(i == 4){
                    return true;
                }
                i++;


            }
        }
        else if(args.length == 1){
            if(Utilites.isStringInteger(args[0]) == true){
              int pageNumber = Integer.parseInt(args[0]);

            }
        }

        return true;
    }
}
