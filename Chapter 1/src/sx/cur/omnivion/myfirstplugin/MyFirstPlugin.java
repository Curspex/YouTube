package sx.cur.omnivion.myfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MyFirstPlugin extends JavaPlugin {

	@Override
	public void onEnable()
	{
		this.getLogger().info("ENABLED!");
	}

}