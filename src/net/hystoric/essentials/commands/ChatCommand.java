package net.hystoric.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.hystoric.essentials.sistemas.*;

public class ChatCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("chat")) {
			if (!sender.hasPermission("essentials.chat")) {
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("");
				sender.sendMessage("§cUtilize '/chat <limpar>' para limpar o chat.");
				return true;
			}
			if (args.length == 1) {
				if (args[0].equals("limpar")) {
					Chat.clear();
				}
			}
		}
		return false;
	}
}