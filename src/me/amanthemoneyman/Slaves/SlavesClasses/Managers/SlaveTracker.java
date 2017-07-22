package me.amanthemoneyman.Slaves.SlavesClasses.Managers;

import me.amanthemoneyman.Slaves.Slaves;
import me.amanthemoneyman.Slaves.SlavesClasses.Slave;

import java.util.ArrayList;

/**
 * Created by alexm on 7/4/2017.
 */
public class SlaveTracker {

    private Slaves plugin;
     private ArrayList<Slave> slaves;
    public SlaveTracker(Slaves slaves)
    {
        plugin = slaves;
    }

    public boolean loadSlaves()
    {

        return false;
    }

    public boolean saveSlaves()
    {

        return false;
    }
}
