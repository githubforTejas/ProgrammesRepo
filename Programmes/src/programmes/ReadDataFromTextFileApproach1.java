package programmes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFileApproach1 {
public static void main(String[] args) throws IOException {
	
	FileReader reader=new FileReader("D:\\files\\filereader.txt");
	BufferedReader br=new BufferedReader(reader);
	String str;
	while((str=br.readLine()) != null)
	{
		System.out.println(str);
	}
	br.close();
}
}
