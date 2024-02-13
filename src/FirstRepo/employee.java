package FirstRepo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class employee implements Serializable {
	private static final long serialVersionUID = 1L; // Serial Version UID
	int id;
	String name;

	public employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static class serializationConcept {
		public static void main(String[] args) {

			try {

				employee e1 = new employee(1, "Dhruva");
				employee e2 = new employee(2, "Sagar");

				FileOutputStream fileopt = new FileOutputStream("output.txt");
				ObjectOutputStream objopt = new ObjectOutputStream(fileopt);
				objopt.writeObject(e1);
				objopt.writeObject(e2);
				objopt.flush();
				objopt.close();
				System.out.println("Serialization is finally executed");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
