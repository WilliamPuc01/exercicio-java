package Exercicio16;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class DataHora {
    public static void main(String[] args){


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2026-09-05");
        LocalDateTime d05 = LocalDateTime.parse("2026-09-05T14:17:10");
        Instant d06 = Instant.parse("2026-09-05T14:17:10Z");
        LocalDate d07 = LocalDate.parse("05/09/2026", fmt1);
        LocalDateTime d08 = LocalDateTime.parse("05/09/2026 14:22", fmt2);


        System.out.println("d01= " + d01);
        System.out.println("d02= " + d02);
        System.out.println("d03= " + fmt3.format(d03)); //converte o horario de londres para o horario de sistema do usuario
        System.out.println("d04= " + d04);
        System.out.println("d05= " + d05);
        System.out.println("d06= " + d06);
        System.out.println("d07= " + d07);
        System.out.println("d08= " + d08);


    }
}
