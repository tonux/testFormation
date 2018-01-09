package utils;

import model.Produit;

public class PromoCalculatorService {


    //ecrire la fonction qui applique la remise
    public int checkRemise(Produit produit){
        int remise =0;
        try{
            if (produit.getPrix() == 0){
                return 0;
            }

            if(produit.getPrix()> 500){
                remise +=2;
            }

            if(produit.getNomProduit().startsWith("A")){
                remise +=15;
            }

            if(produit.getNomProduit().startsWith("B")){
                remise +=5;
            }
        }catch (IllegalArgumentException e){

            e.printStackTrace();

        }

        return remise;
    }

}
