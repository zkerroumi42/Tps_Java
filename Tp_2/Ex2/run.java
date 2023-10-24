package Tp_2.Ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class run {
    public static void main(String args[]) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date_naiss = LocalDate.parse("2003/02/04", format);
        Etudiant e1 = new Etudiant(1, "zakaria", "kerroumi", date_naiss);
        date_naiss = LocalDate.parse("2010/01/30", format);
        Etudiant e2 = new Etudiant(2, "Siham", "kerroumi", date_naiss);
        System.out.println(e1.calculerAge());
        System.out.println(e1.estFrereDe(e2));
    }
}
