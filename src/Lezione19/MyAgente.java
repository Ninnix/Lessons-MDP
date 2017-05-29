package Lezione19;

public class MyAgente implements Agente {

    private String nome;

    public MyAgente(String nome){
        this.nome = nome;
    }

    public void azione () {
        System.out.println("Agente " + nome + " in azione!");
    }
}
