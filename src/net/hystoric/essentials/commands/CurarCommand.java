package net.hystoric.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CurarCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		Player player = (Player)sender;
		
		if (label.equals("curar")) {
			if (!sender.hasPermission("essentials.curar")) {
				return true;
			}
			if (args.length == 0) {
				player.setHealth(20);
				player.setFoodLevel(20);
				player.setFireTicks(0);
				
				player.sendMessage("");
				player.sendMessage("§aVocê foi curado com sucesso.");
			}
		}
		return false;
	}
}