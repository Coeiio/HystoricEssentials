package net.hystoric.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TemplateCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("comando")) {
			if (!sender.hasPermission("permissao.comando")) {
				return true;
			}
			if (args.length == 0) {
				return true;
			}
		}
		return false;
	}
}