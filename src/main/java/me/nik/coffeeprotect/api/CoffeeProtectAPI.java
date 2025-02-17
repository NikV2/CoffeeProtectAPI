package me.nik.coffeeprotect.api;

import org.bukkit.entity.Player;

public interface CoffeeProtectAPI {

    /**
     * Add violations to a player
     *
     * @param player      The player
     * @param check       The check
     * @param description The check's description
     * @param information The information
     */
    void flag(Player player, String check, String description, String information);

    /**
     * Disconnect a player from the server
     *
     * @param player The player
     */
    void disconnect(Player player);
}