package FirstRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializationHandson {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.txt"));
            employee e1=(employee)in.readObject();
            employee e2=(employee)in.readObject();
            System.out.println(e1.id+" "+e1.name);
            System.out.println(e2.id+" "+e2.name);
            in.close();
	}

	}


