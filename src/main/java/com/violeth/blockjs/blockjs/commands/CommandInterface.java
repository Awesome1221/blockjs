package com.violeth.blockjs.blockjs.commands;

import com.violeth.blockjs.blockjs.jsinterface.JSRunner;
import org.bukkit.command.CommandExecutor;
import org.jetbrains.annotations.NotNull;

public class CommandInterface implements CommandExecutor {
    @Override
    public boolean onCommand(org.bukkit.command.@NotNull CommandSender sender,
                             org.bukkit.command.@NotNull Command command,
                             @NotNull String label, String[] args) {

        switch (args[0]) {
            case "test":
                sender.sendMessage("test");
                test();
                return true;
            default:
                return false;
        }
    }

    private void test() {
        JSRunner runner = new JSRunner("blockjs/scripts");

        runner.getAndRunJS();
    }
}