package me.amanthemoneyman.Slaves.SlavesClasses;

import me.amanthemoneyman.Slaves.SlavesClasses.Abilities.Strengths;

import java.util.UUID;

/**
 * Created by alexm on 7/4/2017.
 */
public class Slave {
    /**
     * Mining > Higher the level the more they can mine within a half-hour the higher tier materials (coal, iron, gold, diamond), Higher the level the less chance of coming back with little to no minerals
     * Stealing > Higher the level the more that can be stolen and the less chance of comming back with nothing
     * Farming > Higher the level the more they can farm within a 30 minute period
     */
    private UUID owner;
    private String name;
    private UUID uuid;
    private int pricePaid;
    private boolean forAuction;
    private Strengths strengths;



    public Slave(UUID PlayerOwner, String SlaveName, UUID SlaveUuid, int PricePaid, boolean ForAuction, Strengths Strgths)

    {
        owner = PlayerOwner;
        name = SlaveName;
        uuid = SlaveUuid;
        pricePaid = PricePaid;
        forAuction = ForAuction;
        strengths = Strgths;


    }

    //public Slave(UUID PlayerOwner, String SlaveName, UUID SlaveUuid, )

}
