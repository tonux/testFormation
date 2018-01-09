package model;


import java.util.Random;
import java.util.UUID;

public class Lampe {

    private String id;

    private String emplacement;

    private Etat etat;

    public Lampe(String emplacement, Etat etat){
        this.id = UUID.randomUUID().toString();
        this.emplacement = emplacement;
        this.etat = etat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public boolean isAllumer(){

        return this.etat == Etat.ON;
    }
}
