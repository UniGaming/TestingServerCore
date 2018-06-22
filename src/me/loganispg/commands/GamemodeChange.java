package me.loganispg.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeChange implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(args[0].equalsIgnoreCase("0")) {
			
			Player player = (Player) sender;
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage(ChatColor.GREEN + "[TestingServerCore] " + ChatColor.GRAY + "Player's gamemode set to " + ChatColor.YELLOW + "SURVIVAL.");
			
		}

		else if(args[0].equalsIgnoreCase("1")) {
			
			Player player = (Player) sender;
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage(ChatColor.GREEN + "[TestingServerCore] " + ChatColor.GRAY + "Player's gamemode set to " + ChatColor.YELLOW + "CREATIVE.");
			
		}
		
		else if(args[0].equalsIgnoreCase("2")) {
			
			Player player = (Player) sender;
			player.setGameMode(GameMode.ADVENTURE);
			player.sendMessage(ChatColor.GREEN + "[TestingServerCore] " + ChatColor.GRAY + "Player's gamemode set to " + ChatColor.YELLOW + "ADVENTURE.");
			
		}

		else if(args[0].equalsIgnoreCase("3")) {
			
			Player player = (Player) sender;
			player.setGameMode(GameMode.SPECTATOR);
			player.sendMessage(ChatColor.GREEN + "[TestingServerCore] " + ChatColor.GRAY + "Player's gamemode set to " + ChatColor.YELLOW + "SPECTATOR.");
			
		} 
		return false;
		
		}	
	}