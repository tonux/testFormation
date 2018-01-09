package model;

public class Produit {

    private String nomProduit;
    private Double prix;

    public Produit(String nom, Double prix){
        this.nomProduit = nom;
        this.prix = prix;
    }

    public String getNomProduit(){
        return this.nomProduit;
    }

    public void setNomProduit(String nom){
        this.nomProduit = nom;
    }


    public Double getPrix(){
        return this.prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
