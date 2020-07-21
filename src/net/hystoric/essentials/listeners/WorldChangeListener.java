package net.hystoric.essentials.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class WorldChangeListener implements Listener {
	
	@EventHandler
	public void change(PlayerTeleportEvent event) {
		if (event.getTo().getWorld().getName().equals("vip")) {
			if (event.getPlayer().hasPermission("essentials.vip")) {
				event.getPlayer().setAllowFlight(true);
				event.getPlayer().setFlying(true);
			}
		}
	}
}