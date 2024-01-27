package org.fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double graus = 21.0;
        final int AJUSTE = 32;
        final double FATOR = graus * 9/5;
        final double FATORKELVIN = 273.15;

        final double fahrenheit = FATOR + AJUSTE;
        final double kelvin = graus + FATORKELVIN;

        System.out.println(graus + "°C Graus Celsius é " + fahrenheit + "°F Fahrenheit.");
        System.out.println(graus + "°C Graus Celsius é " + kelvin + "°K Kelvin.");
    }
}
