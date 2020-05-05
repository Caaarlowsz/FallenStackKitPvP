package com.fallenstack.fallenkitpvp;

import com.earth2me.essentials.User;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.UUID;

public class BountyManager {
    public static HashMap<User, Integer> bountyList = new HashMap<User, Integer>();
    public static void addOrReplaceBounty(User player, Integer bounty){
        bountyList.put(player, bounty);
        return;
    }


}
