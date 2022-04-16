package com.violethayes.blockjs.blockjs.jslogic;

import org.bukkit.Bukkit;

public class Chat {
    public void sendMessage(String message) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "say [CONSOLE]: " + message);
    }
}
