package Lezione8.Pac3;

import Lezione3.FullStackException;
import Lezione4.EmptyStackException;

/**
 * Created by nikyw on 02/04/2017.
 */
public interface Stack {

	 /* Nelle implementazioni, i metodi devono essere dichiarato
	  * public anche se qui non compare il modificatore d'accesso:
	  * in una interfaccia tutti i metodi sono implicitamente public!
	  * Anche le interfacce possono avere attributi, che sono implicitamente static */

    boolean is_empty ();
    void push (int v) throws FullStackException;
    int pop () throws EmptyStackException;
}