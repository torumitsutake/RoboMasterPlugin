package com.github.torumitsutake.robomasterplugin.judgesystemmanager;

import com.github.torumitsutake.robomasterplugin.RoboMasterPlugin;
import com.github.torumitsutake.robomasterplugin.playerstype.Engineer;
import com.github.torumitsutake.robomasterplugin.playerstype.Hero;
import com.github.torumitsutake.robomasterplugin.playerstype.PlayersBase;
import com.github.torumitsutake.robomasterplugin.playerstype.Standard;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayersManager {
    //シングルトン設計
    private static PlayersManager instance;
    private RoboMasterPlugin plugin;



    public static PlayersManager getInstance(){
        if(instance == null){
            instance = new PlayersManager();
        }
        return instance;
    }

    public void setPlugin(RoboMasterPlugin plugin){
        this.plugin = plugin;
    }


    HashMap<Integer, PlayersBase> redPlayer = new HashMap<Integer, PlayersBase>();
    HashMap<Integer, PlayersBase> bluePlayer = new HashMap<Integer, PlayersBase>();

    public void registerPlayer(String team, PlayersBase player,int id){
        if(team.equalsIgnoreCase("red")){
            redPlayer.put(id,player);
        }else{
            bluePlayer.put(id,player);
        }
    }

    public HashMap<Integer,PlayersBase> getRedPlayer(){
        return redPlayer;
    }
    public HashMap<Integer,PlayersBase> getBluePlayer(){
        return bluePlayer;
    }


    public PlayersBase generateRobot(Player p ,int id,String type){
        if(type.equalsIgnoreCase("standard")){
            Standard player = new Standard(p,id);
            return player;

        }else if(type.equalsIgnoreCase("hero")){
            Hero player = new Hero(p,id);
            return player;

        }else if(type.equalsIgnoreCase("engineer")){
            Engineer player = new Engineer(p,id);
            return player;

        }
        return null;

    }



}
