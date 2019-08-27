package com.github.torumitsutake.robomasterplugin.com.github.torumitsutake.robomasterplugin.listener;

import com.github.torumitsutake.robomasterplugin.RoboMasterPlugin;

public class ListenerManager {
    //シングルトン設計
    private static ListenerManager instance;
    private RoboMasterPlugin plugin;


    public static ListenerManager getInstance(){
        if(instance == null){
            instance = new ListenerManager();
        }
        return instance;
    }

    public void setPlugin(RoboMasterPlugin plugin){
        this.plugin = plugin;
    }

    //リスナー登録


    public void firstload(){
        //リスナー登録
        SnowBallDamage SBD = new SnowBallDamage();
        plugin.getServer().getPluginManager().registerEvents(SBD, plugin); //SnowBallDamageClass
    }




}
