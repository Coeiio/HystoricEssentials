package net.hystoric.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoarCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		Player player = (Player)sender;
		
		if (label.equals("voar")) {
			if (!sender.hasPermission("essentials.voar")) {
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("");
				sender.sendMessage("§cUtilize '/voar <ativar | desativar>' para ativar ou desativar o modo voar.");
				return true;
			}
			if (args.length == 1) {
				if (args[0].equals("ativar")) {
					player.setAllowFlight(true);
					
					player.sendMessage("");
					player.sendMessage("§aModo voar ativado.");
				}
				if (args[0].equals("desativar")) {
					player.setAllowFlight(false);
					
					player.sendMessage("");
					player.sendMessage("§cModo voar desativado.");
				}
			}
		}
		return false;
	}
}