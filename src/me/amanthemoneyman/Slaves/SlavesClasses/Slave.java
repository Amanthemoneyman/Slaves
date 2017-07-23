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
    private int pricePaid; private int sellPrice;
    private boolean forAuction;
    private Strengths strengths;


    /**
     *
     * @param PlayerOwner - The slave owner
     * @param SlaveName - The name of the slave
     * @param SlaveUuid - The slave's UUID
     * @param PricePaid - The price paid by the owner of the slave
     * @param SellPrice - The price that the slave is up for in auction
     * @param ForAuction - If the slave is in auction or not
     * @param Strgths - The strengths class that holds the values for the different levels of strengths that the slave holds
     */
    public Slave(UUID PlayerOwner, String SlaveName, UUID SlaveUuid, int PricePaid, int SellPrice, boolean ForAuction, Strengths Strgths)

    {
        owner = PlayerOwner;
        name = SlaveName;
        uuid = SlaveUuid;
        pricePaid = PricePaid;
        forAuction = ForAuction;
        strengths = Strgths;
        sellPrice = SellPrice;


    }

    public Slave(UUID PlayerOwner, String SlaveName, UUID SlaveUuid, int PricePaid, int SellPrice, boolean ForAuction)
    {



    }

    public void setOwner(UUID owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setPricePaid(int pricePaid) {
        this.pricePaid = pricePaid;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setForAuction(boolean forAuction) {
        this.forAuction = forAuction;
    }

    public void setStrengths(Strengths strengths) {
        this.strengths = strengths;
    }

    public UUID getOwner() {

        return owner;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getPricePaid() {
        return pricePaid;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public boolean isForAuction() {
        return forAuction;
    }

    public Strengths getStrengths() {
        return strengths;
    }
}
