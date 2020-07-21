package net.hystoric.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PermissaoCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (label.equals("permissao")) {
			if (!sender.hasPermission("essentials.permissao")) {
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("§cComando incorreto, utilize '/permissao <permissao>' para dar uma permissão para todos os grupos.");
				return true;
			}
			if (args.length == 1) {
				String permissao = args[0];
				
				Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group master add " + permissao);
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group gerente add " + permissao);
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group admin add " + permissao);
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group moderador add " + permissao);
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group ajudante add " + permissao);
		        
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group hystoric add " + permissao);
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group hyper add " + permissao);
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group campeao add " + permissao);
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group classic add " + permissao);
		        
		        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group membro add " + permissao);
		        sender.sendMessage("§aPermissão '" + permissao + "' adicionada com sucesso.");
		        return false;
			}
			if (label.equals("remover")) {
				if (!sender.hasPermission("essentials.remover")) {
					return true;
				}
				if (args.length == 0) {
					sender.sendMessage("§cComando incorreto, utilize '/remover <permissao>' para remover uma permissão de todos os grupos.");
					return true;
				}
				if (args.length == 1) {
					String permissao = args[0];
					
					Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group master remove " + permissao);
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group gerente remove " + permissao);
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group admin remove " + permissao);
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group moderador remove " + permissao);
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group ajudante remove " + permissao);
			        
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group hystoric remove " + permissao);
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group hyper remove " + permissao);
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group campeao remove " + permissao);
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group classic remove " + permissao);
			        
			        Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "pex group membro remove " + permissao);
			        sender.sendMessage("§aPermissão '" + permissao + "' removida com sucesso.");
			        return false;
				}
			}
		}
		return false;
	}
}