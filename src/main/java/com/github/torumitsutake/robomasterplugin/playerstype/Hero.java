package com.github.torumitsutake.robomasterplugin.playerstype;

import org.bukkit.entity.Player;

public class Hero extends PlayersBase {
    public Hero(Player player, int id) {

        super(player, id);
        this.setDefaultHP(200);
    }
}
