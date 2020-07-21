package net.hystoric.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MemoryCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("memory")) {
			if (!sender.hasPermission("essentials.memory")) {
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("");
				sender.sendMessage("§aInformações disponíveis:");
				sender.sendMessage("");
				sender.sendMessage("§fStatus: §aOnline");
				sender.sendMessage("§fJogadores atuais: §a" + Bukkit.getServer().getOnlinePlayers().size() + "/" + Bukkit.getServer().getMaxPlayers());
				sender.sendMessage("");
				return true;
			}
		}
		return false;
	}
}