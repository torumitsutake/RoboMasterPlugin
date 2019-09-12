package com.github.torumitsutake.robomasterplugin.judgesystemmanager;

public class GameManager {
    private static GameManager instance;

    //シングルトン設計
    public static GameManager getInstance(){
        if(instance == null){
            instance = new GameManager();
        }
        return instance;
    }




    public void init(){


    }

    public void reset(){



    }








}
