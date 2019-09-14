package com.github.torumitsutake.robomasterplugin.playerstype;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class BaseRobot {
    Entity Basevileager;
    BaseRobot(Entity entity){
        if(entity.getType() == EntityType.VILLAGER){
            Basevileager = entity;
            entity.setCustomName("Base");
            entity.setCustomNameVisible(true);
        }
    }
}
