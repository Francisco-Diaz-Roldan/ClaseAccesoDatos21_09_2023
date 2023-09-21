package org.example;

import lombok.Builder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public record Intervalo (Integer ini, Integer fin) {
        Integer  tamano(){
            return fin-ini;
        }
    }

    public static Intervalo expandir(Intervalo i){
        return new Intervalo(i.ini-1, i.fin+1);
    }

    public static void main(String[] args) {

        var p1 = new Persona("Samuel", "Leiva", 26);
        var p2 = new Persona("Francesco", "Romero",56);

        p2.setApellido("Guillen");

        System.out.println(p1);

        var p3 = Persona.builder().edad(45).nombre("JOaquin").build();
        System.out.println(p3);

        /*
        Intervalo i1 = new Intervalo(1,10);
        System.out.println(i1);
        System.out.println(i1.fin);
        System.out.println(i1.ini);
        Intervalo i2 = expandir(i1);
        System.out.println(i2);

        i1 = new Intervalo(30,40);*/
    }
}