package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

        System.out.print("Digite o Valor do Produto: ");
        double valorProduto = entrada.nextDouble();

        BigDecimal bg = new BigDecimal(valorProduto);
        bg = bg.multiply(new BigDecimal(0.10));
        System.out.println(formatador.format(bg));



    }
}
