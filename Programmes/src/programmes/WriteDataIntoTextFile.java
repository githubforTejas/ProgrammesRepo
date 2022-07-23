package programmes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
public static void main(String[] args) throws IOException {
	FileWriter writer=new FileWriter("D:\\files\\writing.txt");
	BufferedWriter bw=new BufferedWriter(writer);
	
	bw.write("hello Test Yantra ");
	bw.write("Gopalan coworks");
	
	System.out.println("Finished!!!!!");
	
	bw.close();
}
}
