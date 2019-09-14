package com.github.torumitsutake.robomasterplugin.playerstype;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class SentryRobot {
    Entity SentryCart;
    SentryRobot(Entity entity){
        if(entity.getType() == EntityType.MINECART_CHEST){
            SentryCart = entity;
            entity.setCustomName("Sentry");
            entity.setCustomNameVisible(true);
        }
    }



}
