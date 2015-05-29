package sx.cur.omnivion.myfirstplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MyFirstPlugin extends JavaPlugin implements CommandExecutor {

	@Override
	public void onEnable()
	{
		this.getCommand("helloworld").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		//sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "HELLO WORLD!");
		return false;
	}

}