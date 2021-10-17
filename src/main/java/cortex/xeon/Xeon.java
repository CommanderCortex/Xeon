package cortex.xeon;

import cortex.mangoloco.Files.SetupFiles;
import cortex.xeon.Setup.PlayerSetup;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Xeon extends JavaPlugin {

    //MangoLoco Instances:
    SetupFiles localSetup = new SetupFiles();

    //Event Instances:
    private void EventHandler(){
        Bukkit.getPluginManager().registerEvents(new PlayerSetup(), this);
    }

    @Override
    public void onEnable() {
        System.out.print("Xeon is now setting itself up");
        localSetup.LocalSetup(true);
        EventHandler();
        System.out.print("Xeon Internal Setup Complete");
    }
}
