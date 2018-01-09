package service;

import model.Etat;
import model.Lampe;
import repository.LampeRepository;

import java.util.List;

public class LampeService {

    private LampeRepository lampeRepository;

    public LampeService(LampeRepository lampeRepository){
        this.lampeRepository = lampeRepository;
    }

    public void allumerToutesLesLampes() {
        //call LampeRepository

        List<Lampe> lampes = getLampeRepository().getLampesEteintes();

        for (Lampe lampe : lampes){
            if(lampe.isAllumer()){
                lampe.setEtat(Etat.OFF);
                getLampeRepository().modifierLampe(lampe);
            }
        }

    }

    public void eteindreToutesLesLampes() {
        List<Lampe> lampes = getLampeRepository().getLampesAllumees();

        for (Lampe lampe : lampes){
            if(lampe.isAllumer()){
                lampe.setEtat(Etat.ON);
                getLampeRepository().modifierLampe(lampe);
            }
        }
    }




    public LampeRepository getLampeRepository() {
        return lampeRepository;
    }

    public void setLampeRepository(LampeRepository lampeRepository) {
        this.lampeRepository = lampeRepository;
    }
}
