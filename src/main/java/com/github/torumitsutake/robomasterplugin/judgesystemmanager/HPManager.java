package com.github.torumitsutake.robomasterplugin.judgesystemmanager;

import com.github.torumitsutake.robomasterplugin.playerstype.PlayersBase;
import org.bukkit.event.Listener;

import java.util.HashMap;

public class HPManager implements Listener {
    private static HPManager instance;
    HashMap<PlayersBase,Integer> HPList = new HashMap<PlayersBase,Integer>();

    //シングルトン設計
    public static HPManager getInstance(){
        if(instance == null){
            instance = new HPManager();
        }
        return instance;
    }


    public void init(){
        PlayersManager PM = PlayersManager.getInstance();
        //red side
        HashMap<Integer,PlayersBase> redplayerlist = PM.getRedPlayer();
        for(PlayersBase player: redplayerlist.values()){
            String RobotType = player.getType();
            if(RobotType.equalsIgnoreCase("Standard")){
                HPList.put(player,200);

            }else if(RobotType.equalsIgnoreCase("Hero")){
                HPList.put(player,300);

            }else if(RobotType.equalsIgnoreCase("Engineer")){
                HPList.put(player,500);
            }
        }
        //blue side
        HashMap<Integer,PlayersBase> blueplayerlist = PM.getBluePlayer();
        for(PlayersBase player: redplayerlist.values()){
            String RobotType = player.getType();
            if(RobotType.equalsIgnoreCase("Standard")){
                HPList.put(player,200);

            }else if(RobotType.equalsIgnoreCase("Hero")){
                HPList.put(player,300);

            }else if(RobotType.equalsIgnoreCase("Engineer")){
                HPList.put(player,500);
            }
        }

        //UnplayersRobot


    }

    public int getHP(PlayersBase player){
        int hp = 0;

        return hp;
    }






}
