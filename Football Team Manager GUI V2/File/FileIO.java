package File;
import java.io.*;

public class FileIO{
	public static void saveInFile(String data){
		try{
			File file = new File("File/data.txt");
			FileWriter writer = new FileWriter(file,false);
			writer.write(data+"\n");
			//writer.flush();
			writer.close();
		}
		catch(IOException e){
			System.out.println("Cannot Write File");
		}
	}
}