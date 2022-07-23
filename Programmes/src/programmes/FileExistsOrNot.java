package programmes;

import java.io.File;

public class FileExistsOrNot {
public static void main(String[] args) {
	File f=new File("D:\\new Workspace");
	if(f.exists())
	{
		System.out.println("File exist");
	}
	else
	{
		System.out.println("File not exit");
	}
}
}
