package Lezione19;

/**
 * Created by nicolo on 15/05/17.
 */

//Argomenti: Reflection (parte prima). Class, Member, Constructor, Method.
public class HuskyDog {
    //Una classe di Husky. Sanno mangiare polli e scappare.

    public String name;

    public HuskyDog () {
        this.name = "Lokino";
    }

    public HuskyDog (String name) {
        this.name = name;
    }

    public void  mangiaPollo () {
        System.out.println(name + ": pollo ti mangio!");
    }
    public void scappa () {
        System.out.println(name + ": corre come il vento!");
    }
}

