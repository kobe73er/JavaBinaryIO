import java.io.*;

public class TestObjectOutputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Create an output stream for file object.dat
		ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream("object.dat"));

		// Write a string, double value, and object to the file
		output.writeUTF("John");
		output.writeDouble(85.5);
		output.writeObject(new java.util.Date());

		// Close output stream
		output.close();
		
		//读取和写入顺序必须一致
		ObjectInputStream input=new ObjectInputStream(new FileInputStream("object.dat"));
		System.out.println(input.readUTF());
		System.out.println(input.readDouble());
		System.out.println(input.readObject());
		
		input.close();
	}
}