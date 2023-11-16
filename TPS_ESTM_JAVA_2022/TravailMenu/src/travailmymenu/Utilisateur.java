
package travailmymenu;


import java.io.Serializable;


public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	private int code;
	public static int nombre=1;
	private String nom ;
	private String prenom;
	private String username;
	private String password;
	public Utilisateur(String nom2, String prenom2) {
	nom=nom2;
	prenom=prenom2;
	username = genererUsername();
	code = ++nombre;
        password=genererPassword();
	}
        //methode pour donner le format unique de username 
        // on peut aussi generer  à partire de toString()
        public String genererUsername(){
        String a=(nom.charAt(0)+"."+prenom).toLowerCase();
         return a;
        }
         public String genererPassword(){
            String b=(prenom.charAt(0)+""+prenom.length()+""+nom+""+nom.length()).toUpperCase();
         return b;
        }
        // @return the code
	
	public int getCode() {
		return code;
	}
	
	 // @param code the code to set
	 
	public void setCode(int code) {
		this.code = code;
	}
	
	 //@return the nom
	 
	public String getNom() {
		return nom;
	}

	// @param nom the nom to set
	 
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	 // @return the prenom
	
	public String getPrenom() {
		return prenom;
	}
	
	 // @param prenom the prenom to set
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	 // @return the username
	
	public  String getUsername() {
		return username;
	}
	 // @param username the username to set

	public void setUsername(String username) {
		this.username = username;
	}
	
	 // @return the password
	 
	public   String getPassword() {
		return password;
	}
	
	 // @param password the password to set
	
	public void setPassword(String password) {
		this.password = password;
	}// on peut+nom.charAt(0)+"."+prenom+
        
        
        
	@Override
	public String toString() {
            // on peut aussi remplacer methodegenererUsername par  +nom.charAt(0)+"."+prenom+ derictement
		return "Utilisateur [code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", username=" +genererUsername()+"Password :"+genererPassword()+"]";
	}
	

}
