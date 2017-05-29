package Lezione19;

public @interface ArrayConsistency { // annotation type
    String condition(); // ammessi solo metodi senza parametri!
}

/*
le annotazioni possono essere a livello di codice sorgente,
o a livello di compilazione o anche a runtime
annotation e' un tipo, somigliano molto alle interfaccie
do una forma generale alle annotazioni, ogni annotazione di tipo ArrayConsistency
avra' nel suo corpo una stringa.

Possibili usi:
Usate dagli ide con la reflection, (es. manca un  try and catch)
oppure utile per creare un debugger
 */