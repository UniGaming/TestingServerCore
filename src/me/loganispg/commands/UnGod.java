package me.loganispg.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnGod implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			player.setInvulnerable(false);
			player.sendMessage(ChatColor.GREEN + "[TestingServerCore] " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " has disabled " + ChatColor.YELLOW + "GOD " + ChatColor.GRAY + "mode.");
			
		}
		
		return false;
	}
}
