package net.hystoric.essentials.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.hystoric.essentials.sistemas.*;

public class PlayerJoinListener implements Listener {

	@EventHandler
	public void entrar(PlayerJoinEvent event) {
		event.setJoinMessage("");
		
		if (event.getPlayer().hasPermission("hystoric.master")) {
			Chat.clear();
		}
	}
}