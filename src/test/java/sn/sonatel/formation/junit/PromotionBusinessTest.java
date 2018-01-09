package sn.sonatel.formation.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import service.PromotionBusinessImpl;

import static org.junit.Assert.*;

public class PromotionBusinessTest {

    static PromotionBusinessImpl promoBusiness;

    @BeforeClass
    public static void setUp(){

        promoBusiness = new PromotionBusinessImpl();
    }

    @Test
    public void ifBeginWithA(){

        assertTrue(promoBusiness.AppliquerRemise("AProduit", 100.0) == 15 );
    }

    @Test
    public void ifBeginWithB(){

        assertTrue(promoBusiness.AppliquerRemise("BProduit", 1000.0) == 50);
    }

    @Test
    public void ifGetTwoRemise(){

        assertTrue(promoBusiness.AppliquerRemise("AProduit", 1000.0) == 170);
    }

    @Test
    public void ifRemiseMore100(){

        assertTrue(promoBusiness.AppliquerRemise("AProduit", 1000.0) == 170);
    }
    @Test
    public void ifPriceEgalZero(){

        assertTrue(promoBusiness.AppliquerRemise("AProduit", 1000.0) == 0);
    }

    @Test (expected = NullPointerException.class)
    public void throwsExceptionWhenNegativePrice(){

        assertTrue(promoBusiness.AppliquerRemise("AProduit", -1000.0) == 0 );
    }

    @Test (expected = NullPointerException.class)
    public void throwsExceptionWhenProduitNull(){

        assertTrue(promoBusiness.AppliquerRemise(null, -1000.0) == 0 );
    }

    @Test
    public void ifPriceMoreThan500(){

        assertTrue(promoBusiness.AppliquerRemise(null, 1000.0) == 200 );
    }

    @Test
    public void mustReturnMaxPrix(){
        Double valeurRetour =(500.0 * 15) / 100;

        assertTrue(promoBusiness.AppliquerRemise("AProduit", 1000.0) >= valeurRetour );
    }


}
