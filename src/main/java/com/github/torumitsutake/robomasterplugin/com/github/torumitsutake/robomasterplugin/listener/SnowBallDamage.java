package com.github.torumitsutake.robomasterplugin.com.github.torumitsutake.robomasterplugin.listener;

import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class SnowBallDamage implements Listener{

	double SnowballDamage = 10.0;

	@EventHandler
	public void onEntityDamageEvent(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player && e.getDamager() instanceof Snowball){
			e.setDamage(SnowballDamage);
		}

	}





}
