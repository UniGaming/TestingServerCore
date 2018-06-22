package me.loganispg.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.loganispg.main.Main;

public class Feed implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
			if(sender instanceof Player) {
				
				Player player = (Player) sender;
				player.setFoodLevel(20);
				player.sendMessage(Main.prefix + ChatColor.GRAY + "Player fed.");
				
			}
			
			else {
				
				System.out.println("This command is not accessible in the command prompt.");
				
			}
		return false;
	}	
}