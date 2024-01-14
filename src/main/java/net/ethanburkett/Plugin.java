package net.ethanburkett;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * versabuy java plugin
 */
public class Plugin extends JavaPlugin {
  private static final Logger LOGGER = Logger.getLogger("versabuy");

  public void onEnable() {
    LOGGER.info("versabuy enabled");

  }

  public void onDisable() {
    LOGGER.info("versabuy disabled");
  }
}
