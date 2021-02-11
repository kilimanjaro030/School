package Opdracht1;

//Opdracht 1:
//
// Manier 1 :
//public class Main {
//    public static void main(String[] args){
//        for(int i=1; i<=10; i++){
//            System.out.println("Count is: " + i);
//        }
//    }
//}

// Manier 2:
public class Main {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i : numbers) {
        System.out.println("Count is: " + i);
        }
    }
}