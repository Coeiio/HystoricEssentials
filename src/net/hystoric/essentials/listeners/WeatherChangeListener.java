package net.hystoric.essentials.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherChangeListener implements Listener {
	
	@EventHandler
	public void weather(WeatherChangeEvent event) {
		if (event.toWeatherState() == true) {
			event.setCancelled(true);
		}
	}
}