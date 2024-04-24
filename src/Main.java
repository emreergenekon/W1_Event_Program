import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creating integer
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Girin: ");
        heat = input.nextInt();

        //creating all heat options
        if (heat < 5) {
            System.out.println("Kayak Yapabilirsin. ");
        } else if (heat <= 40) {

            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsin. ");
            }
            if (heat >= 16 && heat <= 25) {
                System.out.println("Pikniğe Gidebilirsin. ");
            }
            if (heat >= 26 && heat <= 40) {
                System.out.println("Yüzmeye Gidebilirsin. ");
            }
            //if heat is more than 41 than system warns you gently.
        } else {
            System.out.println("Tehlikeli sıcaklık, UV ışınlarına dikkat et ve fazla güneşe maruz kalmamaya çalış.");
    }
}
}