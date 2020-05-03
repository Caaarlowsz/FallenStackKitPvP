package com.fallenstack.fallenkitpvp;

import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.UUID;

public class BountyManager {
    public static HashMap<UUID, Integer> bountyList = new HashMap<UUID, Integer>();
    public static void addOrReplaceBounty(UUID player, Integer bounty){
        bountyList.put(player, bounty);
        return;
    }


}
