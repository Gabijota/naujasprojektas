package lt.baltic.talents;

import java.io.*;
import java.util.*;

public class vidurkis_iv_is {

    public static void main(String args[]) throws IOException {

        String writeFileName = "skaiciu_vidurkis.txt";


        // Assume default encoding.
        FileWriter fileWriter =
                new FileWriter(writeFileName);

        // Always wrap FileWriter in BufferedWriter.
        BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);


        Scanner sf = new Scanner(new File("skaiciai_vidurkiui.txt"));
        int maxIndx = -1;
        String text[] = new String[1000];
        while(sf.hasNext())
        {
            maxIndx++;
            text[maxIndx]=sf.nextLine();
        }
        sf.close();
        String answer="";
        int sum=0;
        double average=0;
        int n=0;
        String a="";
        for(int j=0;j<=maxIndx; j++)
        {
            Scanner sc=new Scanner(text[j]);
            sum=0;
            String s="";
            n=0;
            while(sc.hasNext())
            {
                int i=sc.nextInt();
                sum=sum+i;
                n=n+1;
            }
            average=sum/n;
            bufferedWriter.write(Double.toString(average));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();



    }

}