package net.hystoric.essentials.sistemas;

import org.bukkit.Bukkit;

public class Chat {
	
	public static void clear() {
		for (int indice = 0; indice < 500; indice++) {
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("");
		}
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§aChat limpo.");
	}
}