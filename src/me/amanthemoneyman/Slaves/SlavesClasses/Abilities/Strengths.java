package me.amanthemoneyman.Slaves.SlavesClasses.Abilities;

import me.amanthemoneyman.Slaves.Utils.Utilities;

/**
 * Created by alexm on 7/11/2017.
 */
public class Strengths {

    int mining;
    int farming;
    int stealing;

    public Strengths(int Mining, int Farming, int Stealing)
    {
        if(isValid(Mining))
        {
            if(isValid(Farming))
            {
                if(isValid(Stealing))
                {
                    mining = Mining;
                    farming = Farming;
                    stealing = Stealing;
                } else
                {
                    Utilities.debug("The value of " + Stealing + " is not a valid strength level");
                }
            } else
            {
                Utilities.debug("The value of " + Farming + " is not a valid farming level");
            }
        } else
        {
            Utilities.debug("The value of " + Mining + " is not a valid mining level");
        }


    }

    public int getMining() {
        return mining;
    }

    public int getFarming() {
        return farming;
    }

    public int getStealing() {
        return stealing;
    }

    public void setMining(int mining) {
        this.mining = mining;
    }

    public void setFarming(int farming) {
        this.farming = farming;
    }

    public void setStealing(int stealing) {
        this.stealing = stealing;
    }

    private boolean isValid(int MiningFarmingStealing)
    {
        if(MiningFarmingStealing > 1)
        {
            if(MiningFarmingStealing <= 100)
            {
                return true;
            }
             return false;
        }

        return false;

    }
}
