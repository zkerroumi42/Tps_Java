
package travailmymenu;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main1 {
	

        public static void main(String[] args)  {
            
                    
	Utilisateur u1 =new Utilisateur("RAJI","kamal");                
        System.out.println("Serialisation ");
	System.out.println(u1);
	File fichier =new File("Text1.txt");
	try {
	//serialiser
	ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(fichier));
	oos.writeObject(u1);
	oos.writeObject(new Utilisateur("kadi","nadia"));
        oos.close();
    //Désérialisation
   System.out.println("serialisation");
    ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fichier) );
    Utilisateur u;
    while (true) {
    	u=(Utilisateur) ois.readObject();
    	System.out.println(u);
       }
	
	} catch (EOFException e) {
		// TODO: handle exception
System.out.println(" END OF  FILE");
	
	} catch (IOException e) {
		// TODO: handle exception
e.printStackTrace();
}
	
 catch (ClassNotFoundException e) {
	// TODO: handle exception
	e.printStackTrace();
}
 }
        

}
