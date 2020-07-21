package net.hystoric.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GrupoCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("grupo")) {
			if (!sender.hasPermission("essentials.grupo")) {
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("");
				sender.sendMessage("§fGrupo: ");
				return true;
			}
			if (args.length == 1) {
			}
			if (args.length == 2) {
			}
			if (args.length == 3) {
			}
		}
		return false;
	}
}