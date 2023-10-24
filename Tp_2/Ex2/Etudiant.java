package Tp_2.Ex2;

import java.time.LocalDate;

class Etudiant implements Personne{
    private int numSom;
    private String nom;
    private String prenom;
    private LocalDate dat_naiss;

    Etudiant() {
        numSom = 0;
        nom = new String("");
        prenom = new String("");
        dat_naiss = LocalDate.of(2000, 1, 1);
    }

    Etudiant(int numSom, String nom, String prenom, LocalDate dat_naiss) {
        this.numSom = numSom;
        this.nom = nom;
        this.prenom = prenom;
        this.dat_naiss = dat_naiss;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDat_naiss(LocalDate dat_naiss) {
        this.dat_naiss = dat_naiss;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumSom(int numSom) {
        this.numSom = numSom;
    }

    public LocalDate getDat_naiss() {
        return dat_naiss;
    }

    public String getNom() {
        return nom;
    }

    public int getNumSom() {
        return numSom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int calculerAge() {
        LocalDate dateNow = LocalDate.now();
        int age = dateNow.getYear() - dat_naiss.getYear();
        if (dateNow.getMonthValue() < dat_naiss.getMonthValue() || (dateNow.getMonthValue() == dat_naiss.getMonthValue()
                && dateNow.getDayOfMonth() < dat_naiss.getDayOfMonth())) {
            age--;
        }
        return age;
    }
    public boolean estFrereDe(Etudiant p2) {
        if (this.getNom() == p2.getNom()) {
            return true;
        } else {
            return false;
        }
    }
}

