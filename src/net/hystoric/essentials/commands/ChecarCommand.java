package net.hystoric.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChecarCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("checar")) {
			if (!sender.hasPermission("essentials.checar")) {
				return true;
			}
			if (args.length == 0 || args.length > 1) {
				sender.sendMessage("§cComando incorreto, utilize '/checar <jogador>' para mostrar as informações dele.");
				return true;
			}
			Player target = Bukkit.getPlayer(args[0]);
			
			if (target == null) {
				sender.sendMessage("§cEste usuário não está on-line.");
                return true;
			}
			sender.sendMessage("");
			sender.sendMessage("§aInformações do jogador:");
			sender.sendMessage("");
			sender.sendMessage("§fNome: §a");
			sender.sendMessage("§fModo: §a");
			sender.sendMessage("§fVida: §a");
			sender.sendMessage("§fKills: §a");
			sender.sendMessage("§fMortes: §a");
			sender.sendMessage("");
		}
		return false;
	}
}