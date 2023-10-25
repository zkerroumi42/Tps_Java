package TP_3.Ex2;

import java.io.*;

public class TestFichier {
    private File fichier;

    public TestFichier() {
        this.fichier = new File("D:\\");
    }

    public TestFichier(File file) {
        this.fichier = new File("D:\\" + file);
    }

    public void modifier(String txt) {
        try {
            FileOutputStream out = new FileOutputStream(fichier);
            out.write(txt.getBytes());
            System.out.println("All right");
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void afficher() {
        BufferedReader bf = null;

        try {
            bf = new BufferedReader(new FileReader(fichier));
            String ligne = bf.readLine();
            while (ligne != null) {
                System.out.println(ligne);
                ligne = bf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void copierColler(String adresse) {
        try {
            FileInputStream in = new FileInputStream(fichier);
            FileOutputStream out = new FileOutputStream(adresse);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        TestFichier tf = new TestFichier(new File("salma.txt"));
        tf.modifier("Bonjour les développeurs !");
        tf.afficher();
        tf.copierColler("D:\\anas.txt");
    }
}