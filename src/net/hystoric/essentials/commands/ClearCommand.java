package net.hystoric.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		Player player = (Player)sender;
		
		if (label.equals("clear")) {
			if (!sender.hasPermission("essentials.clear")) {
				return true;
			}
			if (args.length == 0) {
				player.getInventory().clear();
				player.getInventory().clear();
				
				sender.sendMessage("");
				sender.sendMessage("");
				sender.sendMessage("§aInventário esvaziado.");
				return true;
			}
			if (args.length == 1) {
			}
		}
		return false;
	}
}