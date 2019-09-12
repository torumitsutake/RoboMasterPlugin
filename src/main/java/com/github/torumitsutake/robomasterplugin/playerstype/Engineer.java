package com.github.torumitsutake.robomasterplugin.playerstype;

import org.bukkit.entity.Player;

public class Engineer extends PlayersBase {
    public Engineer(Player player, int id) {

        super(player, id);
        this.setDefaultHP(500);
        RobotType = "Engineer";
    }


}
