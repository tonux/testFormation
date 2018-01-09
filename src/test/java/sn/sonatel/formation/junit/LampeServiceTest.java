package sn.sonatel.formation.junit;

import model.Etat;
import model.Lampe;
import org.junit.BeforeClass;
import org.junit.Test;
import repository.LampeRepository;
import service.LampeService;
import exception.ExceptionLampeDejaEteinteException;

import java.util.ArrayList;

public class LampeServiceTest {

    static LampeService lampeService;

    @BeforeClass
    public static void setUp(){
        LampeRepository lampeRepository = new LampeRepository(new ArrayList<Lampe>());
        lampeService = new LampeService(lampeRepository);
        Lampe lampe = new Lampe("salon", Etat.ON);
        Lampe lampe2 = new Lampe("chambre1", Etat.ON);
        Lampe lampe3 = new Lampe("chambre2", Etat.ON);
        lampeService.getLampeRepository().creerLampe(lampe);
        lampeService.getLampeRepository().creerLampe(lampe2);
    }






}
