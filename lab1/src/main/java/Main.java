import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        int bin = Integer.parseInt("10101",2);
        n = n + bin;
        int hex = Integer.parseInt("FF",16);
        n = n + hex;
        n = n * 6;
        while(n > 9){
            int sumaCifre = 0;
            sumaCifre = sumaCifre + n % 10;
            n = n / 10;
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);

        /*
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int x = keyboard.nextInt();
        int[][] latinSquare;
        int[] vizitat;
        //vector de vizitare de la 1 la x si sa testam cu un al 3-lea for ce numar nu a fost pus pe rand/coloana
        for(int i=0;i<x;i++)
            for(int j=0;j<x;j++){

            }

         */
    }

}
