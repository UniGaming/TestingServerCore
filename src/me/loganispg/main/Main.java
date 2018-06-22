package me.loganispg.main;

import org.bukkit.plugin.java.JavaPlugin;

import me.loganispg.commands.Feed;
import me.loganispg.commands.GamemodeChange;
import me.loganispg.commands.God;
import me.loganispg.commands.Heal;
import me.loganispg.commands.UnGod;

public class Main extends JavaPlugin {

	public String prefix = "[TestingServerCore] ";
	
	@Override
	public void onEnable() {
		
		System.out.println("[TestingServerCore] Loaded successfully.");
		getCommand("feed").setExecutor(new Feed());
		getCommand("heal").setExecutor(new Heal());
		getCommand("gm").setExecutor(new GamemodeChange());
		getCommand("god").setExecutor(new God());
		getCommand("ungod").setExecutor(new UnGod());
		
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("[TestingServerCore] Unloaded successfully.");
		
	}
	
}
