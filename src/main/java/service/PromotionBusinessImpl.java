package service;

import impl.PromotionBusiness;
import model.Produit;
import utils.PromoCalculatorService;

public class PromotionBusinessImpl implements PromotionBusiness {


    public PromotionBusinessImpl(){

    }
    //ecrire la fonction qui prend nom et prix produit

    public Double AppliquerRemise(String nomProduit, Double prix){
        Produit produit = new Produit(nomProduit, prix);

        PromoCalculatorService calculPromo = new PromoCalculatorService();

        Double getRemise= (calculPromo.checkRemise(produit) * produit.getPrix())/100;

        return getRemise;

    }


}
