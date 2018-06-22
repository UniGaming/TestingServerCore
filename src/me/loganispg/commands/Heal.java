package me.loganispg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Heal implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
			if(sender instanceof Player) {
				
				Player player = (Player) sender;
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "[TestingServerCore] " + ChatColor.GRAY + "Player healed.");
				
			}
			
			else {
				
				System.out.println("This command is not accessible in the command prompt.");
				
			}
			return false;
	}
}
