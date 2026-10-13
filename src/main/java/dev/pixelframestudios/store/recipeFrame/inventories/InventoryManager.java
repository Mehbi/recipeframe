package dev.pixelframestudios.store.recipeFrame.inventories;

import dev.triumphteam.gui.guis.Gui;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InventoryManager {
    private final Map<UUID, Gui> guis = new HashMap<>();

    public void register(Player player, Gui gui) {
        guis.put(player.getUniqueId(), gui);
    }
    public void unregister(Player player) {
        guis.remove(player.getUniqueId());
    }
    public Gui get(Player player) {
        return guis.get(player.getUniqueId());
    }
}
