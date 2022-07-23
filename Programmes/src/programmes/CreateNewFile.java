package programmes;

import java.io.File;

public class CreateNewFile {
public static void main(String[] args) {
	File file=new File("D:\\happyDay2");
	if(file.mkdirs())
	{
		System.out.println("folder is created");
	}
	else
	{
		System.out.println("folder is not created");
	}
	if(file.exists())
	{
		System.out.println("Folder exists");
	}
	else
	{
		System.out.println("folder not exits");
	}
	if(file.delete())
	{
		System.out.println("folder is deleted");
	}
	else
	{
		System.out.println("Folder is not deleted");
	}
	if(file.exists())
	{
		System.out.println("Folder exists");
	}
	else
	{
		System.out.println("folder not exits");
	}
}
}
