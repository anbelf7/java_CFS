package com.company;

import java.util.Random;

public class Simbolo {

    private int simbolo;
    public static final int SASSO = 0;
    public static final int CARTA = 1;
    public static final int FORBICI = 2;


    public static String[] simboli = {
            "sasso",
            "carta",
            "forbici"
    };

    public int lancioComputer() {
        Random random = new Random();
        simbolo = random.nextInt(3);
        System.out.println("Il computer sceglie " + simboli[simbolo]);
        return simbolo;
    }
}
