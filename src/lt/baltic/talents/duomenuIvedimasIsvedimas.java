package lt.baltic.talents;

import java.io.*;

public class duomenuIvedimasIsvedimas {
    public static void main(String [] args) {


        // The name of the file to open and write to.
        String readfileName = "skaitau_is_cia.txt";
        String writeFileName = "cia_irasau.txt";

        try {
            File file = new File(readfileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;


            // Assume default encoding.
            FileWriter fileWriter =
                    new FileWriter(writeFileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);


            while ((st = br.readLine()) != null)
                bufferedWriter.write(st);
                bufferedWriter.newLine();


            br.close();
            bufferedWriter.close();
        }


        catch(IOException ex) {
            System.out.println("Erroriukas");
        }
    }
}
