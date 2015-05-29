package sx.cur.omnivion.myfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

import sx.cur.omnivion.myfirstplugin.command.CommandHelloworld;

public class MyFirstPlugin extends JavaPlugin {

	@Override
	public void onEnable()
	{
		this.getCommand("helloworld").setExecutor(new CommandHelloworld());
	}

}