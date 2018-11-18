package lt.baltic.talents;

import java.io.*;

public class duomenuIvedimas {
    public static void main(String[] args) throws IOException {
        System.out.println(" Iveskite eilute ir paspauskite Enter du kartus\n"+
                " Ivedimas uzbaigiamas tuscia eilute");

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = in.readLine()).length() != 0)
            System.out.println(s);
        // Tuščia eilutė nutraukia įvedimą
    }
}


//ivedimui naudojami srautai- streams
// Java apibrezia 3 standartinius srautus: ivedimo- system.in,
// isvedimo- system.out, ir klaidoms- system.err