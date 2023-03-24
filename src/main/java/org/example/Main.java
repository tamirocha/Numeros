package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 1300.59;

        System.out.println(valorProduto); // 1300.59
        System.out.println(formatador.format(valorProduto)); // R$ 1.300,59


        // transformando uma entrada String em um número double

        String entrada = "R$ 50,34";
        try {
            double numero = formatador.parse(entrada).doubleValue();
            System.out.println("Numero: " + numero);
        } catch (ParseException e) {
            System.out.println("Entrada inválida");
        }

        // classe BigDecimal: não tem algumas limitações que os tipos primitivos tem, seu tamanho é maior que o double, pode colocar um numero bem grande

        BigDecimal bg = new BigDecimal(5000255451545614d);
        bg = bg.divide(BigDecimal.TEN);
        System.out.println(bg);
    }
}