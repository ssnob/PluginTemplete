package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ssno.templete.Main;

public class TestCommand implements CommandExecutor {
		
		@SuppressWarnings("unused")
		private Main plugin;
	
	public TestCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("test").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	if (!(sender instanceof Player)) {
		sender.sendMessage("Only Players can use this command!");
		return true;
	}
	Player player = (Player) sender;
	if(player.hasPermission("test.use")) {
		player.sendMessage("Hello!");
	}
 else {
	player.sendMessage("You don't have permission!");
}
	return false;
   }
}

