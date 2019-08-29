package com.github.torumitsutake.robomasterplugin;

import com.github.torumitsutake.robomasterplugin.judgesystemmanager.PlayersManager;
import com.github.torumitsutake.robomasterplugin.listener.ListenerManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RoboMasterPlugin extends JavaPlugin {

    //Managers
    PlayersManager PM;
    ListenerManager LM;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Loading RoboMasterPlugin...");
        PM = PlayersManager.getInstance();
        LM = ListenerManager.getInstance();
        LM.setPlugin(this);
        LM.firstload();




    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        if(cmd.getName().equalsIgnoreCase("cmd")){

        }

        return false;
    }

}
