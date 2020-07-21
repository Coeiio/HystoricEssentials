package net.hystoric.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FecharCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("fechar")) {
			if (!sender.hasPermission("essentials.fechar")) {
				return true;
			}
			if (args.length == 0) {
				for (Player todos : Bukkit.getOnlinePlayers()) {
					todos.kickPlayer("§cServidor fechado!");
				}
				Bukkit.shutdown();
			}
		}
		return false;
	}
}