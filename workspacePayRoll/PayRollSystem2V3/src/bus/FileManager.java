package bus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManager {
	
	private static String filePath = "src//data//list.ser";
	
	//function to serialize (write binary) the information
	public static void serialize(ArrayList<IPayable> listFromConsole) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(listFromConsole);
		objectOutputStream.close();
		
	}
	
	//function to de-serialize (read binary) the information
	
	public static ArrayList<IPayable> deserialize() throws IOException, ClassNotFoundException {
		
		ArrayList<IPayable> listFromFile = new ArrayList<IPayable>();
		
		FileInputStream fileInputStream = new FileInputStream(filePath);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		listFromFile = (ArrayList<IPayable>) objectInputStream.readObject();
		
		objectInputStream.close();
		
		return listFromFile;
		
	}

	
}
