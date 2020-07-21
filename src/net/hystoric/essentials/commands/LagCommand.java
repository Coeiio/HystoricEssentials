package net.hystoric.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.hystoric.essentials.sistemas.*;

public class LagCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("lag")) {
			if (!sender.hasPermission("essentials.lag")) {
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("");
				sender.sendMessage("§cUtilize '/lag <chão | entidades>' para limpar o servidor.");
				return true;
			}
			if (args.length == 1) {
				if (args[0].equals("entidades")) {
					Lag.clear();
					
					Bukkit.broadcastMessage("");
					Bukkit.broadcastMessage("§aTodas as entidades foram limpas.");
				}
				if (args[0].equals("chão")) {
					Lag.limpar();
					
					Bukkit.broadcastMessage("");
					Bukkit.broadcastMessage("§aTodas os itens foram limpos.");
				}
			}
		}
		return false;
	}
}