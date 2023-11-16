

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
               
		File fichier = new File("test.txt");
		try {
			BufferedReader bw =new BufferedReader(new FileReader(fichier));
			String line;
			while((line=bw.readLine()) != null ){
				System.out.println(line);
			}
		
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

        }}

