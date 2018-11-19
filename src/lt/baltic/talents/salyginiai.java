package lt.baltic.talents;

import java.util.Scanner;


public class salyginiai {

    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        // write your code here


        int n;
        System.out.println("Pasirinkite ka norite skaiciuoti: Trikampis = 1; Staciakampis = 2; Skritulys = 3");
        n=reader.nextInt();
        System.out.println(n);
        int a,b,c,akv,bkv,Skv,r;
        double P,S;
        if (n==1) {
            System.out.println("Iveskite krastine a:");
            a = reader.nextInt();
            System.out.println("Iveskite krastine b:");
            b = reader.nextInt();
            System.out.println("Iveskite krastine c:");
            c = reader.nextInt();
            P = a + b + c;
            P = P / 2;
            S = Math.sqrt(P * (P - a) * (P - b) * (P - c));

            System.out.println("trikapio plotas " + S);
        }
        else if (n==2) {
            System.out.println("iveskite pirma krastine:");
            akv = reader.nextInt();
            System.out.println("Iveskite antrakrastine:");
            bkv = reader.nextInt();

            Skv = akv * bkv;

            System.out.println("Staciakampio plotas: " + Skv);
        }
        else if (n==3){

            System.out.println("Iveskite spinduli :");
            r = reader.nextInt();
            double Sap = Math.PI * (r * r);
            System.out.println("Skritulio plotas: " + Sap);
        }

        else  {
            System.out.println("bloga ivestis");

        }


        double d,e,f;
        String   dString, eString, fString;


        System.out.println ("Galiu isspresti kvadratine lygti: ax^2 + bx +c = 0");
        System.out.print ("Parasykite koeficienta a: ");
        dString = reader.nextLine();
        d = Double.parseDouble(dString);

        System.out.print ("Parasykite koeficienta b: ");
        eString = reader.nextLine();
        e = Double.parseDouble(eString);

        System.out.print ("Parasykite koeficienta c: ");
        fString = reader.nextLine();
        f = Double.parseDouble(fString);

        System.out.println ("Kvadratines lygties: "+d+"x^2 + "+e+"x +"+f+" = 0");
        System.out.println ("sprendiniai yra:");
        System.out.println ("x1="+((-e+Math.sqrt(e*e-4*d*f))/(2*d)));
        System.out.println ("x2="+((-e-Math.sqrt(e*e-4*d*f))/(2*d)));



        // System.out.println("x1 yra " + ((-e+Math.sqrt(e*e-4*d*f))/(2*d)) % 2 != 0);

    }
}


