package com.yujibolt90.torturecommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Bee;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TortureCommands extends JavaPlugin{
	 @Override
	    public void onEnable() {
	        getLogger().info("TortureCommands has been enabled!");
	    }
	    
	    @Override
	    public void onDisable() {
	    	getLogger().info("TortureCommands has been disabled!");
	    }
	    
	    @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		    	if (cmd.getName().equalsIgnoreCase("Swarm")) { 
		    		
		    		Player target = sender.getServer().getPlayer(args[0]);
		    		if (target == null) {
		                sender.sendMessage(args[0] + " is not currently online.");
		                return true;
		            }
		    		
		    		target.sendMessage( "DEEZ NUTS" );
		    		
		    		for (int i=0; i<20; i++) {
		    			Bee bee =(Bee)target.getWorld().spawnEntity(target.getLocation(),EntityType.BEE);
		    			bee.setCustomName("Angry Bee");
		    			bee.setCustomNameVisible(true);
		    			bee.setTarget(target);
		    			bee.setAnger(1000);
		    			target.sendMessage( "GOOOOTTTEEEEEEEEM" );
		    		}
		    	}	return false; 
	    }
}
