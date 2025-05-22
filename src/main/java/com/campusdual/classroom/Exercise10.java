package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int count = 0;
        String ballColor;
        do {
            ballColor = getBall();
            System.out.println("La bola es de color: " + ballColor);
            if (ballColor.equals("azul")) {
                count++;
            }
        } while (count <2);


    }

    // TODO ↓
    // Un metodo que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el metodo randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        int ball = randomWithRange(1, 4);
        String color = "";
        switch (ball) {
            case 1:
                color = "rojo";
                break;
            case 2:
                color = "azul";
                break;
            case 3:
                color = "verde";
                break;
        }
        return color;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}