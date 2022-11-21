package ie.atu.week8;

import java.io.*;
import java.util.Scanner;

public class CreateFile
{
    public static void main(String[] args)
    {
        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
        String content = "Details to write";
        try
        {
            PrintWriter myWriter = new PrintWriter(
                    new FileWriter(myFile,true) );
            myWriter.println("gg's");
            myWriter.println("Wp");
            myWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        Scanner inputfile = null;
        try
        {
            inputfile = new Scanner(new File("myFile2.txt"));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        while (inputfile.hasNext())
        {
            String str = inputfile.nextLine();
            System.out.println(str);
        }

    }
}
