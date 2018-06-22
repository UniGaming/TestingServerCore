package me.loganispg.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
			if(sender instanceof Player) {
				
				Player player = (Player) sender;
				player.setInvulnerable(true);
				player.sendMessage(ChatColor.GREEN + "[TestingServerCore] " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " has enabled " + ChatColor.YELLOW + "GOD " + ChatColor.GRAY + "mode.");
				
			}
		return false;
	}
}