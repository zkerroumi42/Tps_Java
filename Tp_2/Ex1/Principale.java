package Tp_2.Ex1;

import java.util.ArrayList;

public class Principale {
    public static void main(String args[]) {
        // forme forme1 = new Forme(); on ne peut pas instancier un class abstarait
        forme forme1;
        Cercle cercle1 = new Cercle(5, 4, 3.5F);
        cercle1.setRayon(10);
        System.out.println(cercle1.toString());
        Rectangle rectangle1 = new Rectangle(5, 4, 7, 8);
        rectangle1.setLargeur(8);
        rectangle1.setLongueur(9);
        rectangle1.deplacer(rectangle1,2.5F, 3.5F);
        System.out.println(rectangle1.toString());
        // cercle1 = rectangle1; on ne peut pas convertir de rectangle vers cercle
        // rectangle1 = cercle1; on ne peut pas convertir de cercle vers rectangle
        // rectangle1 = forme1; on ne peut pas convertir de Forme vers rectangle
        // cercle1 = forme1; on ne peut pas convertir de Forme vers cercle
        ArrayList<forme> listformes = new ArrayList<>();
        listformes.add(new Rectangle(1, 2, 3, 4));
        listformes.add(new Rectangle(5, 6, 7, 8));
        listformes.add(new Cercle(9,10,11));
        listformes.add(new Cercle(12, 13, 14));
        for (forme forme : listformes) {
            System.out.println(forme.surface());
        }
    }
}

