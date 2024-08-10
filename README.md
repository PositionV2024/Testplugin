# Testplugin
This plugin allows you to set others flying and controls how fast they can fly. It is important to note that each command will take in a difference permission node. Keep on scrolling to find out more about permission levels.

Free to download
https://builtbybit.com/resources/enable-fly.49528/
## Command usage:

    /fly set <player_name> <amount> -- Controls others flying speed and enable others flying
    /fly off <player_name> -- Allows you to disable others flying.
## Configuration file

     List of color codes you can use: https://htmlcolorcodes.com/minecraft-color-codes/
     Permission nodes:
     - "fly.use";
     - "fly.use.off";
     - "fly.use.set";
      
     PLUGIN_PREFIX_COLOR: "&9" ## Set the prefix color
     SET_ERROR_COLOR: "&7" ## Dont modified this if you want to color the rest
     
     NO_PERMISSION_ERROR_MESSAGE: "You do not have permission to use this."
     NO_TARGET_FOUND: "The targeted player does not exist or is offline."
     INVALID_NUMBER: "You can only set the targeted player's flying speed from 0 - 1."
     PLAYER_NOT_FLYING: "The targeted player is not flying." 
 
### Permission

    fly.use -- Allows you to do /fly. This is the most important permission if you want the user to get access to it.
    fly.use.off -- Allows you to do /fly off <player_name>
    fly.use.set -- Allows you to do /fly set <player_name> <amount>

### Developed by Clarence
