package me.amanthemoneyman.Slaves.AuctionHouse;

import me.amanthemoneyman.Slaves.Slaves;
import me.amanthemoneyman.Slaves.SlavesClasses.Slave;
import me.amanthemoneyman.Slaves.Utils.InventoryAPI.MenuButton;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by alexm on 7/22/2017.
 */
public abstract class SlaveButton extends MenuButton{

    private Slaves plugin;
    private Slave slave;


    public SlaveButton(Slaves plugin, Slave slave)
    {
        super(slave.getName());
        this.plugin = plugin;
        this.slave = slave;


    }

    public abstract void onClick(InventoryClickEvent e);

    public Slave getSlave() {
        return slave;
    }

    public void setSlave(Slave slave) {
        this.slave = slave;
    }

    public Integer getPrice()
    {
        return slave.getSellPrice();
    }
}
