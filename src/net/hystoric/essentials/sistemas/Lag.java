package net.hystoric.essentials.sistemas;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;

public class Lag {
	
	public static void clear() {
		for (World world : Bukkit.getServer().getWorlds()) {
			for (Entity entity : world.getEntities()) {
				if (entity instanceof Creature) {
					entity.remove();
				}
			}
		}
	}
	
	public static void limpar() {
		for (World world : Bukkit.getServer().getWorlds()) {
			for (Entity entity : world.getEntities()) {
				if (entity instanceof Item) {
					entity.remove();
				}
			}
		}
	}
}