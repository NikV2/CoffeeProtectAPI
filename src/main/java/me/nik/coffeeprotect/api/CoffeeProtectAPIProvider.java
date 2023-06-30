package me.nik.coffeeprotect.api;

public class CoffeeProtectAPIProvider {

    private static CoffeeProtectAPI API = null;

    public CoffeeProtectAPIProvider() {
    }

    public static CoffeeProtectAPI getAPI() {
        return API;
    }

    /**
     * Internal use by CoffeeProtect only!
     *
     * @param api CoffeeProtectAPI
     */
    @Deprecated
    public static void register(CoffeeProtectAPI api) {
        API = api;
    }
}