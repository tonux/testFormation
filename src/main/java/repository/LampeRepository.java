package repository;

import model.Lampe;

import java.util.*;

public class LampeRepository {

    private List<Lampe> lampes;

    public LampeRepository(List<Lampe> lampes){
         this.lampes = lampes;
    }

    public List<Lampe> getLampes() {
        return lampes;
    }

    public void setLampes(List<Lampe> lampes) {
        this.lampes = lampes;
    }


    public List<Lampe> listerLampes(){

        for (Lampe lampe: lampes){
            System.out.println(lampe);
        }
        return getLampes();
    }

    public Lampe creerLampe(Lampe lampe){

        getLampes().add(lampe);

        return lampe;
    }


    public Lampe modifierLampe(Lampe lampe){
        //test if lampe existe
        Lampe updateLampe = rechercherLampe(lampe);
        updateLampe.setEmplacement(lampe.getEmplacement());
        updateLampe.setEtat(lampe.getEtat());
        return lampe;

    }

    public List<Lampe> getLampesAllumees(){

        List<Lampe> lampesAllumees = new ArrayList<Lampe>();

        for(Lampe lampe: getLampes()){
            if(lampe.isAllumer()){
                lampesAllumees.add(lampe);
            }
        }

        return lampesAllumees;
    }

    public List<Lampe> getLampesEteintes(){

        List<Lampe> lampesEteintes = new ArrayList<Lampe>();

        for(Lampe lampe: getLampes()){
            if(lampe.isAllumer()){
                lampesEteintes.add(lampe);
            }
        }

        return lampesEteintes;
    }

    public Lampe rechercherLampe(Lampe lampe){

        for (Lampe lampeItem: getLampes()){
            if(lampeItem.getId().equals(lampe.getId())){
                lampe = lampeItem;
                break;
            };
        }
        return lampe;
    }



}
