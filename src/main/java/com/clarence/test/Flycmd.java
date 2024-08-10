package com.clarence.test;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Flycmd implements CommandExecutor {
    ///fly set <player> <amount>
    ///fly off <player>
    private final Testplugin testplugin;
    public Flycmd(Testplugin testplugin) { this.testplugin = testplugin; }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Util.getPluginPrefix() + " " + Errors.getNoConsoleUsage());
            return true;
        }
        Player player = (Player) sender;

        if (!(player.hasPermission(Permission.FLY_USE.getName()))) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() + Errors.getNoPermission()));
            return true;
        }

        if (args.length == 0) {
            handlePlayerMessage(player, Util.Color(Errors.getCommandUsage()));
            return true;
        }
        switch (args[0].toLowerCase()) {
            case "set":
                handleSetCommand(player, args);
                break;
            case "off":
                handleOffCommand(player, args);
               break;
           // case "config":
               // handleConfigCommand(player, args);
               // break;
            default:
                handlePlayerMessage(player, Util.Color(Errors.getErrorColor() +  Errors.getCommandUsage()));
                break;
        }
        return true;
    }

    private void handleOffCommand(Player player, String[] args) {
        if (args.length < 2) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() +  Errors.getCommandUsage()));
            return;
        }

        if (!player.hasPermission(Permission.TURN_FLY_OFF.getName())) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() + Errors.getNoPermission()));
            return;
        }

        Player target = Bukkit.getPlayerExact(args[1]);

        boolean checks = target == null || !target.isOnline();

        if (checks) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() + Errors.getNoTargetFound()));
            return;
        }
        if (!target.isFlying()) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() + Errors.getPlayerNotFlying()));
            return;
        }

        target.setAllowFlight(false);

        handlePlayerMessage(player, Util.Color("&6 You have set " + target.getDisplayName() + " flight disabled."));
        target.sendMessage(Util.Color("&6 Your flight has been disabled."));
    }

    private void handleSetCommand(Player player, String[] args) {
        if (args.length < 3) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() +  Errors.getCommandUsage()));
            return;
        }

        if (!player.hasPermission(Permission.SET_OTHER_FLY.getName())) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() + Errors.getNoPermission()));
            return;
        }

        Player target = Bukkit.getPlayerExact(args[1]);

        boolean checks = target == null || !target.isOnline();

        if (checks) {
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() + Errors.getNoTargetFound()));
            return;
        }

        try {
            float flySpeed = Float.parseFloat(args[2]);
            target.setFlySpeed(flySpeed);
            target.setAllowFlight(true);

            handlePlayerMessage(player, Util.Color("&6 You have set " + target.getDisplayName() + "'s flying speed to " + flySpeed + "."));
            target.sendMessage(Util.Color("&6 Your flying speed has been modified."));

        } catch (IllegalArgumentException exception) {
            exception.getStackTrace();
            handlePlayerMessage(player, Util.Color(Errors.getErrorColor() + Errors.getInvalidNumber()));
        }
    }

    private void handlePlayerMessage(Player player, String message) { player.sendMessage(message); }
}
