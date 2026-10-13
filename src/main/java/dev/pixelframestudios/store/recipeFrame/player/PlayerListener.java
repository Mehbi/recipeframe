package dev.pixelframestudios.store.recipeFrame.player;

import dev.pixelframestudios.store.recipeFrame.inventories.CraftingInventory;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getClickedBlock() == null) {
            return;
        }
        Block block = event.getClickedBlock();

        if (!block.getType().equals(Material.CRAFTING_TABLE)) {
            return;
        }

        Player player = event.getPlayer();

        event.setCancelled(true);
        CraftingInventory.open(player);
    }
}
