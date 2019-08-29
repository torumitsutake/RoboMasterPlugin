package com.github.torumitsutake.robomasterplugin.playerstype;

import org.bukkit.entity.Player;

public class PlayersBase {

    // variable definition area
    Player standardPlayer;
    int PlayerID = 0;
    int defaultHP = 1000;
    int defaultCooling = 10;




    //Constractor
    public PlayersBase(Player player,int id){
        standardPlayer = player;
        PlayerID = id;
    }


    //Method
    public Player getPlayer(){
        return standardPlayer;
    }

    public int getID(){
        return PlayerID;
    }

    public int getDefaultHP(){
        return defaultHP;
    }

    public void setDefaultHP(int setHP){
        defaultHP = setHP;
    }

    public int getDefaultCooling(){
        return defaultCooling;
    }

    public void setDefaultCooling(int setCooling){
        defaultCooling = setCooling;
    }

}
