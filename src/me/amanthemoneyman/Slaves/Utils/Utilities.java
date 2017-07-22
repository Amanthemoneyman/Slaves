package me.amanthemoneyman.Slaves.Utils;

import me.amanthemoneyman.Slaves.Slaves;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Administrator on 7/14/2017.
 */
public class Utilities {
    /**
     *
     * @param bottom - The lowest the integer gets
     * @param top - The highest the integer gets
     * @return - The random integer
     */
    public static Integer getRandomInteger(int bottom, int top)
    {
        return ThreadLocalRandom.current().nextInt(bottom, top ) + 1;


    }

    public static void error(String str)
    {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Slaves.prefix + "&4ERROR : " + str));


    }

    public static void debug(String str)
    {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', Slaves.prefix  + "&4DEBUG : " + str));
    }

    public static boolean isMultipleOf(int multiple, int check)
    {
        if(multiple/check == 0)
        {
            return true;
        }
        return false;


    }


}
