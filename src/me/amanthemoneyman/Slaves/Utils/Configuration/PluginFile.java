package me.amanthemoneyman.Slaves.Utils.Configuration;

import me.amanthemoneyman.Slaves.Slaves;
import org.apache.logging.log4j.core.config.plugins.PluginConfiguration;
import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;

import javax.annotation.processing.FilerException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 7/14/2017.
 */
public class PluginFile {

    private File file;
    private FileConfiguration config;
    private FileType type;
    private String name;
    private Slaves plugin;
    private boolean loaded = false;
    public PluginFile(String fileName, FileType ftype, File pluginFile, Slaves plugin)
    {
        this.plugin = plugin;
        if(!pluginFile.exists()) {
            try {
                this.plugin.getConfig().save(file);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }


    }
}
