package programmes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFileApproach2 {
public static void main(String[] args) throws FileNotFoundException {
	File file = new File("D:\\files\\filereader.txt");
	Scanner sc=new Scanner(file);
	
	while(sc.hasNextLine())
	{
		System.out.println(sc.nextLine());
	}
}

}
