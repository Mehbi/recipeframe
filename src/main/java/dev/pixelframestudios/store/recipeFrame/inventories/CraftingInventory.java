package dev.pixelframestudios.store.recipeFrame.inventories;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class CraftingInventory {
    public static final int[] CRAFT_POSITIONS = new int[]{
            0, 1, 2,
            9, 10, 11,
            18, 19, 20
    };

    public static final int INCREMENT_ONE_SLOT = 4;
    public static final int DELETE_ONE_SLOT = 5;
    public static final int INCREMENT_HALF = 13;
    public static final int DELETE_HALF_SLOT = 14;
    public static final int INCREMENT_STACK_SLOT = 22;
    public static final int DELETE_STACK_SLOT = 23;

    public static final int[] DECORATED_SLOTS = new int[]{
            3, 6, 7, 8,
            12, 15, 17,
            21, 24, 25, 26,
            27, 28, 29, 30, 31, 32, 33, 34, 35
    };
    private static final GuiItem DECORATED_ITEM = ItemBuilder.from(Material.GRAY_STAINED_GLASS_PANE).asGuiItem();
    public static void open(Player player) {
        Gui gui = Gui.gui()
                .disableAllInteractions()
                .rows(4)
                .title(Component.text("Crafting Inventory"))
                .create();

        GuiItem deleteOne = ItemBuilder.from(Material.RED_STAINED_GLASS_PANE).asGuiItem();
        GuiItem incrementOne = ItemBuilder.from(Material.GREEN_STAINED_GLASS_PANE).asGuiItem();
        GuiItem deleteHalf = ItemBuilder.from(Material.RED_STAINED_GLASS_PANE).asGuiItem();
        GuiItem incrementHalf = ItemBuilder.from(Material.GREEN_STAINED_GLASS_PANE).asGuiItem();
        GuiItem deleteStack = ItemBuilder.from(Material.RED_STAINED_GLASS_PANE).asGuiItem();
        GuiItem incrementStack = ItemBuilder.from(Material.GREEN_STAINED_GLASS_PANE).asGuiItem();

        for (int decoratedSlot : DECORATED_SLOTS) gui.setItem(decoratedSlot, DECORATED_ITEM);

        gui.setItem(INCREMENT_ONE_SLOT, incrementOne);
        gui.setItem(DELETE_ONE_SLOT, deleteOne);
        gui.setItem(DELETE_HALF_SLOT, deleteHalf);
        gui.setItem(INCREMENT_HALF, incrementHalf);
        gui.setItem(DELETE_STACK_SLOT, deleteStack);
        gui.setItem(INCREMENT_STACK_SLOT, incrementStack);

        gui.open(player);
    }
}
