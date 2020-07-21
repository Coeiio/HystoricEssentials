package net.hystoric.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChunkCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		Player player = (Player)sender;
		
		if (label.equals("chunk")) {
			if (!sender.hasPermission("essentials.chunk")) {
				return true;
			}
			if (args.length == 0) {
				player.teleport(player);
				player.teleport(player);
				return true;
			}
		}
		return false;
	}
}