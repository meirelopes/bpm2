package org.example;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
/* =============================================================================
============================================================================== */
// Desafio 2
// Conversão de Tempo

    /*
    Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
    dia/mês/ano horas:minutos:segundos.

    - Entrada

    O arquivo de entrada contém um valor inteiro N.

    - Saída

    Imprima o tempo lido no arquivo de entrada (segundos), convertido para
    horas:minutos:segundos, conforme exemplo fornecido.

    - Obs

    Utilize UTC (GMT-0)

    - Exemplo:
        Entrada: 1693225566
        Saída: 28/Aug/2023 12:26:06
    */
    public static void main(String[] args) {

        long valorInteiro = getNumeroInteiro();

        Instant instant = Instant.ofEpochSecond(valorInteiro);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Etc/UTC"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss", Locale.ENGLISH);
        String dataFormatada = formatter.format(zonedDateTime);

        System.out.println("Entrada: " + valorInteiro);
        System.out.println("Saída: " + dataFormatada);
    }

    public static Long getNumeroInteiro() {

        Scanner scanner = new Scanner(System.in);
        Boolean eValido = false;

        Long escolha;

        do {
            try {
                System.out.println("Informe um número inteiro:");
                escolha = scanner.nextLong();
                eValido = true;

            } catch (InputMismatchException e) {
                System.out.println("Formato inválido.");
                scanner.nextLine();
                escolha = 0L;
            }
        } while (eValido == false);

        return escolha;
    }

}
