package org.hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Save ss = new Save();
		ss.i = 5;
		
		File ff = new File("obj.txt");
		FileOutputStream fos = new FileOutputStream(ff);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ss);
		
		FileInputStream fis = new FileInputStream(ff);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save s2 = (Save) ois.readObject();
		
		Save s1 = new Save();
		s1 = ss;
		
		System.out.println(s1.i);
		System.out.println(s2.i);
	}

}

class Save implements Serializable {
	int i;
}