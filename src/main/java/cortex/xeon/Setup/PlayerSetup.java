package cortex.xeon.Setup;

import cortex.mangoloco.Files.Players.SetupPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;

public class PlayerSetup implements SetupPlayer, Listener {
    @EventHandler
    public int LocalPlayerFileSetup(PlayerJoinEvent onPlayerJoin) throws IOException {
        Player player = onPlayerJoin.getPlayer();
        NewPlayerSetup(player);
        return 0;
    }
}
