package net.hystoric.essentials;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.*;

import net.hystoric.essentials.commands.AvisoCommand;
import net.hystoric.essentials.commands.ChatCommand;
import net.hystoric.essentials.commands.ChecarCommand;
import net.hystoric.essentials.commands.ChunkCommand;
import net.hystoric.essentials.commands.ClearCommand;
import net.hystoric.essentials.commands.CurarCommand;
import net.hystoric.essentials.commands.DiaCommand;
import net.hystoric.essentials.commands.FecharCommand;
import net.hystoric.essentials.commands.GrupoCommand;
import net.hystoric.essentials.commands.LagCommand;
import net.hystoric.essentials.commands.MemoryCommand;
import net.hystoric.essentials.commands.NoiteCommand;
import net.hystoric.essentials.commands.PermissaoCommand;
import net.hystoric.essentials.commands.VoarCommand;

import net.hystoric.essentials.listeners.PlayerChatListener;
import net.hystoric.essentials.listeners.PlayerDeathListener;
import net.hystoric.essentials.listeners.PlayerJoinListener;
import net.hystoric.essentials.listeners.PlayerQuitListener;
import net.hystoric.essentials.listeners.SignChangeListener;
import net.hystoric.essentials.listeners.WeatherChangeListener;
import net.hystoric.essentials.listeners.WorldChangeListener;
import net.hystoric.essentials.sistemas.Chat;
import net.hystoric.essentials.sistemas.Lag;

public class Main extends JavaPlugin {
	
	public void onLoad() {
		Chat.clear();
	}
	
	public void onEnable() {
		Lag.clear();
		Lag.limpar();
		Chat.clear();
		
		Commands();
		Events();
	}
	
	private void Events() {
		Bukkit.getPluginManager().registerEvents(new PlayerChatListener(), this);
		Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
		Bukkit.getPluginManager().registerEvents(new PlayerQuitListener(), this);
		Bukkit.getPluginManager().registerEvents(new PlayerDeathListener(), this);
		Bukkit.getPluginManager().registerEvents(new WeatherChangeListener(), this);
		Bukkit.getPluginManager().registerEvents(new WorldChangeListener(), this);
		Bukkit.getPluginManager().registerEvents(new SignChangeListener(), this);
	}

	private void Commands() {
		getCommand("lag").setExecutor(new LagCommand());
		getCommand("curar").setExecutor(new CurarCommand());
		getCommand("voar").setExecutor(new VoarCommand());
		getCommand("chat").setExecutor(new ChatCommand());
		getCommand("grupo").setExecutor(new GrupoCommand());
		getCommand("clear").setExecutor(new ClearCommand());
		getCommand("checar").setExecutor(new ChecarCommand());
		getCommand("fechar").setExecutor(new FecharCommand());
		getCommand("aviso").setExecutor(new AvisoCommand());
		getCommand("permissao").setExecutor(new PermissaoCommand());
		getCommand("remover").setExecutor(new PermissaoCommand());
		getCommand("memory").setExecutor(new MemoryCommand());
		getCommand("dia").setExecutor(new DiaCommand());
		getCommand("noite").setExecutor(new NoiteCommand());
		getCommand("chunk").setExecutor(new ChunkCommand());
	}

	public void onDisable() {
		
	}
	
	public static Main getPlugin() {
		return getPlugin(Main.class);
	}
}