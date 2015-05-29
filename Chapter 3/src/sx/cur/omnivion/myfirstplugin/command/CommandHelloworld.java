package sx.cur.omnivion.myfirstplugin.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHelloworld implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "HELLO WORLD!");
		return true;
	}

}