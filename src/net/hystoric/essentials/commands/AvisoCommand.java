package net.hystoric.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AvisoCommand implements CommandExecutor {
	
	public static String getMensagem(String[] args) {
		StringBuilder string = new StringBuilder();
		for(int i = 0; i < args.length; i++) {
			string.append(" ");
			string.append(args[i]);
		}
		return string.toString();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("aviso")) {
			if (!sender.hasPermission("essentials.aviso")) {
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("§cComando incorreto, utilize '/aviso <mensagem>' para fazer um aviso.");
				return true;
			}
			if (args.length > 0) {
				String mensagem = getMensagem(args);
				
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("§eAviso: §f" + mensagem);
				Bukkit.broadcastMessage("");
			}
		}
		return false;
	}
}