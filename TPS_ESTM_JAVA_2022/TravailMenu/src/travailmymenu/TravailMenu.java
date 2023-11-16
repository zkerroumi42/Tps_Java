
package travailmymenu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;
public class TravailMenu {

        
        public static void menu() {
            BD bd=new BD("texte.byte");
       Scanner scanner = new Scanner(System.in);
       Utilisateur.nombre = bd.uniciteCode();
         
         int choix;
		do{

        System.out.println("\n*************************    Hello   *****************************\n");
        System.out.println("\n-------** welcom to TravailMenuM.Kerroumi:enjoy your time with java poo **----------\n\n");
        System.out.println("\t1-ajouter un utilisateur  :");
        System.out.println("\t2-supprimer un utilisateur   :");
        System.out.println("\t3-check un utilisateur est-ce-qu'il exist  :");
        System.out.println("\t4-afficher la listes des utilisateur   :");
        System.out.println("\t5-afficher la liste des utilisateur tries   :");
        System.out.println("\t6-d'ecrire la liste dans le fichier par les flux d'octes   :");
        System.out.println("\t7-Lire  la liste a partire des  flux d'octes   :");
        System.out.println("\t0-Quitter le menu   :\n");
        System.out.println("Veuillez saisir votre choix(entre 1 et 7)\t:");
        System.out.println("-------------------------------------------------------------------------------------");
        
       
        
        choix =scanner.nextInt();
                            Scanner sc = new Scanner(System.in);

        switch(choix){
		case 1:{
		System.out.println("Entrer le nom de l'utilisateur que vous vouler ajouter");
		String nom = sc.nextLine();
		System.out.println("Entrer le prenom de cet Utilisatur :");
		String prenom = sc.nextLine();
		Utilisateur u = new Utilisateur(nom, prenom);
//		System.out.println("Entrer le password");
//		String pass = sc.next();
//		u.setPassword(pass);
                bd.ajouterUtilisateur(u);

                    break;
                }
		case 2:{
                    System.out.println("Entrer le code de l'utilisateur");
				int code = scanner.nextInt();
				bd.supprimerUtiliateur(code);
                                break;
                }
                case 3:
                      {
				System.out.println("Entrer le username");
				String username = sc.next();
				System.out.println("Entrer le password");
				String password = sc.next();
				if (bd.valider(username, password))
					System.out.println("Bienvenue"+username);
				else
					System.out.println("verifier vos informatinos !!!");
				break;
			}
		case 4:{
                    bd.afficherListeU();
                    break;
                }
                case  5:
                   bd.Serealiser();
                System.out.println("LA LISTE A ETE SERIALISER BRAVO KERROUMI!");
                         break;
		 case  6:
                  bd.deserealiser();
                     System.out.println("LA LISTE A ETE DESERIALISER BRAVO KERROUMI!");
                         break;	
	
			
			default:
				break;
        }
        } while(choix!=0);
		}
			


	
		public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			int cle_menu ;
			int temp=2003;
			
		do {
	    System.out.println("*--------------courage-------------------courage---------------------courage-------\n");
	    System.out.println("*                                                                                 *");
	    System.out.println("*                                                                                 *");
	    System.out.println("*                                                                                 *");
            System.out.println("\t veullier saisir la  clé  du    Menu        :"); 
           // cle_menu = scanner.nextInt();
            System.out.println("*                                                                                 *");
	    System.out.println("*                                                                                 *");
            System.out.println("*                                                                                 *");
            System.out.println("* ---------------Be the one---------Be the one-----------------Be the one---------*                                                          *");


		            cle_menu = scanner.nextInt();
		
	 System.out.println("--------------Enjoy your time-------------------Enjoy your time-----------------\n\n");

				
		if ( cle_menu==temp) {
				
			menu();
		}
		System.out.println("\n\n This Kle was wrong :essaie une autre foix :   \n ");
	        }while( cle_menu!=temp);
		
		}
		}
   
    

