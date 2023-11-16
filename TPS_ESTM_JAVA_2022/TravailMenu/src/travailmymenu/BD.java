package travailmymenu;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Vector;

public class BD implements Serializable {

	private static final long serialVersionUID = 1L;
	private String url;
	private Vector<Utilisateur> users;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;

	public BD(String url) {
		this.url = url;
		users = new Vector<>();
	}

	public BD(String url, Vector<Utilisateur> users) {
		this.url = url;
		this.users = users;
	}


	// methode qui permet d'ajouter un utilisateur dans la liste puis du fichier
	public void ajouterUtilisateur(Utilisateur u) {
		if (valider(u.genererUsername(), u.genererPassword()))
			System.out.println(" Cet user exist deja ");
		else {
			users = deserealiser();
			users.add(u);
			Serealiser();
			System.out.println("L'utilisateur à été ajouter Bravo! ");
		}
	}

	public void supprimerUtiliateur(int code) {
		users = deserealiser();
		if (users.isEmpty())
			System.out.println("la liste est vide");
		else {
			for (Utilisateur u : users) {
				if (u.getCode() == code) {
					users.remove(u);
					break;
				}
			}
		}
		Serealiser();
	}

	public Boolean valider(String username, String password) {
		users = deserealiser();
		for (Utilisateur u : users) {
			if (username.equals(u.genererUsername()) && password.equals(u.genererPassword())) {
				System.out.println(" Cet user exist deja ");
				return true;
			} else
				System.out.println(" ");
		}
		return false;
	}

	public void afficherListeU() {
		users = deserealiser();
		if (users.isEmpty())
			System.out.println("la liste est vide");
		else {
			for (Utilisateur uss: users)
				System.out.println(uss);
		}
	}
        public void afficherListeUtriee() {
      
        }

	// methode permet d'ecrire la liste dans le fichier
	public void Serealiser() {

		try {
			File fichier = new File(url);
			oos = new ObjectOutputStream(new FileOutputStream(fichier));
			oos.writeObject(users);
			oos.close();
		} catch (FileNotFoundException e) {
                    e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public Vector<Utilisateur> deserealiser() {
		Vector<Utilisateur> us = new Vector<Utilisateur>();
		File fichier = new File(url);
		try {
                    FileInputStream fis = new FileInputStream(fichier);
			ois = new ObjectInputStream(fis);
			us =  (Vector<Utilisateur>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
                 e.printStackTrace();		
                } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
                    e.printStackTrace();
		}
		return us;
	}
	
	public int uniciteCode() {
		users = deserealiser();
		if (users.size() == 0)
			return 0;
		return users.get(users.size()-1).getCode();
	}

}
