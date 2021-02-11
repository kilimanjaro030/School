package Opdracht2;

//Opdracht 2:
// Manier 1:
//public class Main{
//    public static void main(String[] args){
//        int count = 1;
//        while (count <= 10) {
//            System.out.println("Count is: " + count);
//            count++;
//        }
//    }
//}

// Manier 2:
public class Main {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 10);
    }
}