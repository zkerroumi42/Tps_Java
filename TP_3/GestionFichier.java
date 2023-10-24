package TP_3;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class GestionFichier {
    private String adress;
    public GestionFichier(){
        adress="D:\\";
    };
    public GestionFichier(String adress){
     this.adress=adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void creeFichier(String nomfichier){
        File adr=new File(adress);
        if (adr.exists()){
            if (adr.isDirectory()){
                File fich=new File(adress+"\\"+nomfichier);

                try {
                    fich.createNewFile();
                    System.out.println("fichier crée ");
                } catch (IOException e) {
                   // throw new RuntimeException(e);
                    e.printStackTrace();
                }

            }else{
                System.out.println(adress+":n'est pas un dossier");
            }

        }else{
            System.out.println(adress+":n'exist pas !");
        }

    }
    public void creeDossier(String nomdossier){
        File adr=new File(adress);
        if (adr.exists()){
            if (adr.isDirectory()){
                File doss=new File(adress+"\\"+nomdossier);

                doss.mkdir();
                System.out.println("dossier crée ");

            }else{
                System.out.println(adress+":n'est pas un dossier");
            }

        }else{
            System.out.println(adress+":n'exist pas !");
        }
    }
    public void supprimer(String nomfile){
        File file=new File(adress+nomfile);
        if (file.exists()){
            file.delete();

        }else {
            System.out.println("n'exist pas !");
        }
    }
    public void Lst(){
        int i;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm:ss");
        File adrr=new File(adress);
        if (adrr.exists()){
            if (adrr.isDirectory()){
                File[] fs =adrr.listFiles();
                for ( i=0;i<fs.length;i++) {
                    if(fs[i].isDirectory()){
                        System.out.print(fs[i].getName()+"\t");
                        System.out.print("<DOSS> \t");
                    }
                    if(fs[i].isFile()){
                        System.out.print(fs[i].getName()+"\t");
                        System.out.println("<FICH> \t");
                    }

                    System.out.print(sdf.format(fs[i].lastModified())+"\t");
                   if(fs[i].length()<1024){
                       System.out.print(fs[i].length()+"(o)");
                   } else if (fs[i].length()<1024*1024) {
                       System.out.print((fs[i].length())/1024+"(Ko)");
                   }else if (fs[i].length()<1024*1024*1024) {
                       System.out.print((fs[i].length())/1024*1024+"(Mo)");
                   }
                   else if (fs[i].length()<1024*1024*1024*1024) {
                       System.out.print((fs[i].length())/1024*1024*1024*1024+"(GO)");
                   }
                    System.out.println("\n");

                }
            }else {
                System.out.print("n'est pas un dossier");
            }
        }

    }

    // .lastModified().format().simpledateformat("")
    public static void main(String[] args) {
        GestionFichier GF=new GestionFichier("D:\\");
        GF.creeFichier("zakaria.txt");
        GF.creeDossier("zakaria");
        GF.supprimer("zakaria.txt");
        System.out.println("all right");
        GF.Lst();


    }

}
