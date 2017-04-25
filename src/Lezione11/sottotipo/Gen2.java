package Lezione11.sottotipo;

/**
 * Created by nikyw on 06/04/2017.
 */
public class Gen2 <E> extends Gen1 <E> {

    public static void main(String[] args) {
        // test sottotipi generici

        Gen1<Object> x = new Gen1<Object>();
        x = new Gen2<Object>(); // Gen2<Object> e' Lezione11.sottotipo di Gen1<Object>
        // x = new Gen1<String>(); // Gen1<String> non e' Lezione11.sottotipo di Gen1<Object>

    }
}
