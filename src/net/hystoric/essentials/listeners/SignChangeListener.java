package net.hystoric.essentials.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignChangeListener implements Listener {
	
	@EventHandler
	public void change(SignChangeEvent event) {
		String linha = event.getLine(0).replace("&", "§");
		String linhaa = event.getLine(1).replace("&", "§");
		String linhaaa = event.getLine(2).replace("&", "§");
		String linhaaaa = event.getLine(3).replace("&", "§");
		
		event.setLine(0, linha);
		event.setLine(0, linhaa);
		event.setLine(0, linhaaa);
		event.setLine(0, linhaaaa);
	}
}