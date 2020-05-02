package com.fallenstack.fallenkitpvp;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class BountyManager {
    public static HashMap<Player, Integer> bountyList = new HashMap<Player, Integer>();
    public static void BountyMap(Player player, Integer bounty){
        bountyList.put(player, bounty);
        return;
    }


}
