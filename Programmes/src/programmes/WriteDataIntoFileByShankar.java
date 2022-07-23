package programmes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFileByShankar {
public static void main(String[] args) throws IOException {
	File file=new File("D:\\happyDay\\goodMorning.txt");
	FileReader reader=new FileReader(file);
	//FileWriter fw=new FileWriter(file);
	//BufferedWriter br=new BufferedWriter(fw);
	BufferedReader bw=new BufferedReader(reader);
//	br.write("Hii Tejas");
//	br.newLine();
//	br.write(" Hello Naveen");
//	System.out.println("written");
//	br.close();
	String s1 = bw.readLine();
	if(s1!=null)
	{
	System.out.println(s1);
	s1 = bw.readLine();
	System.out.println(s1);
	s1 = bw.readLine();
	System.out.println(s1);
	}
}
}
