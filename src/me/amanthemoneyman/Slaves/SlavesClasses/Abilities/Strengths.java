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
        if(Mining <= 100)
        {
            mining = Mining;
            if(Farming <= 100)
            {
                farming = Farming;
                if(Stealing <= 100)
                {
                    stealing = Stealing;
                } else
                {



                }

            }


        }


    }
}
