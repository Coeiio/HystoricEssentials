package net.hystoric.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NoiteCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("noite")) {
			if (!sender.hasPermission("essentials.noite")) {
				return true;
			}
			if (args.length == 0) {
				for (World world : Bukkit.getWorlds()) {
					world.setTime(16000);
					world.setTime(16000);
				}
			}
		}
		return false;
	}
}