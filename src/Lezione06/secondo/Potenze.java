package Lezione06.secondo;

/**
 * Created by nikyw on 10/03/2017.
 */
public class Potenze {
    // uso dei modificatori di accesso su alcune potenze di due

    public int allanona = 512;
    private int alladecima= 1024;
    protected int allundicesima = 2048;
}

//un campo private è accessibile sono al interno della classe in cui lo dichiaro
//invece un protect è accessibile anche dalle sottoclassi della classe in cui la dichiaro
//costruttore non puo essere ricorsivo
//this e super possono avere due tipi di usi riferirsi all'oggetto o invocare costruttori
//this(a) invoca un costruttore
//super(a, b) invoca il costruttore della super classe
//this è dinamico non importa dove sta la classe ma dove sta l'oggetto corrente
//super è statico

//ESERCIZI
//vedere metodi della classe object
//se non dichiaro ne public ne private ne protect che fa?

