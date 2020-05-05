package com.fallenstack.fallenkitpvp;

import com.earth2me.essentials.User;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.UUID;

public class BountyManager {
    public static HashMap<UUID, Integer> bountyList = new HashMap<UUID, Integer>();
    public static void addOrReplaceBounty(UUID playerUUID, Integer bounty){
        bountyList.put(playerUUID, bounty);
        return;
    }


}
