package sn.sonatel.formation.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstClassTest {


    @Test
    public void shoudReturn20(){
        int valeurDeRetour = 40/5;
        assertEquals(8, valeurDeRetour);

    }

    public void bonjour(){
        System.out.println(" Hello tonux");
    }


}
