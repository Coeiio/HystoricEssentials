package net.hystoric.essentials.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {
	
	@EventHandler
	public void morrer(PlayerDeathEvent event) {
		event.setDeathMessage("");
	}
}