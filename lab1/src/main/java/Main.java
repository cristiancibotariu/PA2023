public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String languages[] = new String[] {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        int bin = 0b10101;
        n = n + bin;
        int hex = 0xFF;
        n = n + hex;
        n = n * 6;

        int sumDigits = 0;

        while(n!=0){
            sumDigits = sumDigits + n % 10;
            n = n / 10;
        };

        int finalResult = 0;

        while(sumDigits!=0){
            finalResult = finalResult + sumDigits % 10;
            sumDigits = sumDigits / 10;
        };

        System.out.println("Willy-nilly, this semester I will learn " + languages[finalResult]);
    }

    /*
    void homework(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int x = keyboard.nextInt();
        int[][] latinSquare;
        int[] vizitat;
        //vector de vizitare de la 1 la x si sa testam cu un al 3-lea for ce numar nu a fost pus pe rand/coloana
        for(int i=0;i<x;i++)
            for(int j=0;j<x;j++){

            }

    }

     */
}
