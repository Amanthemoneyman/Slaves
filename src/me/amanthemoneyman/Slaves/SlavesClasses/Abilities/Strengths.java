package me.amanthemoneyman.Slaves.SlavesClasses.Abilities;

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

                } else
                {

                }
            }
        }


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
