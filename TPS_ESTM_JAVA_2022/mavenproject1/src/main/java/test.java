import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class test {
    
    	public static void main(String[] args) {
            
            
               // File f =new File("zak.txt");
               File f1 = new File("‪zakar.txt");
               try {
                BufferedReader br = new BufferedReader(new FileReader(f1));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    
                }
               }catch (FileNotFoundException e) {
                        e.printStackTrace();
}
                              catch (IOException e) {
                        e.printStackTrace();
}
     
                           
                           
               
                   
                    
        }
}
