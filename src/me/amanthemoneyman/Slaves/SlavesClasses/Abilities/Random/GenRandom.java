package me.amanthemoneyman.Slaves.SlavesClasses.Abilities.Random;

import me.amanthemoneyman.Slaves.SlavesClasses.Abilities.Strengths;
import me.amanthemoneyman.Slaves.Utils.Utilities;

/**
 * Created by alexm on 7/11/2017.
 */

/**
 * 3 different tiers?
 *
 */
public class GenRandom {

    public static Strengths genRandStrengths() {

        Strengths strgths = new Strengths(Utilities.getRandomInteger(0, 100), Utilities.getRandomInteger(0, 100), Utilities.getRandomInteger(0, 100));


        return strgths;
    }

    public static Strengths genRandStrengths(RandomTier rt)
    {
        int top = 0;
        switch(rt)
        {
            case ONE : {
                top = 25;
            }
            case TWO : {
                top = 50;
            }
            case THREE : {
                top = 75;
            }
            case FOUR : {
                top = 100;
            }

        }
        if(top == 0) { top = 100; }
        Strengths strgths = new Strengths(Utilities.getRandomInteger(0, top), Utilities.getRandomInteger(0, top), Utilities.getRandomInteger(0, top));

        return strgths;


    }
}

