package programmes;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) throws IOException {
	File file=new File("D:\\happyDay\\goodMorning.txt");
if(file.createNewFile())
{
	System.out.println("file is created");
}
else
{
	System.out.println("File is not created");
}
}
}
