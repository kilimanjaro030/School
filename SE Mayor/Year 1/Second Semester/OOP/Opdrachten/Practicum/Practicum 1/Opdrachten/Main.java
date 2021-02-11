//package Practicum1.Opdrachten;
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
//
// Manier 2:
//public class Main {
//    public static void main(String[] args){
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for (int i : numbers) {
//        System.out.println("Count is: " + i);
//        }
//    }
//}

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
//public class Main {
//    public static void main(String[] args) {
//        int count = 1;
//        do {
//            System.out.println("Count is: " + count);
//            count++;
//        } while (count <= 10);
//    }
//}

//Opdracht 3:
// Manier 1:
//import java.text.DecimalFormat;
//public class Main{
//    private static DecimalFormat df2 = new DecimalFormat("#.##");
//    public static void main(String[] args) {
//        for(int i = 1; i <= 10; i++){
//            System.out.println(df2.format(Math.random()));
//        }
//    }
//}

//Opdracht 4:
// Manier1:
//public class Main
//{
//    public static void main(String[] args)
//    {
//        int sum = 0;
//        for (int i = 0; i <= 39; i++)
//        {
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);
//    }
//}

//Opdracht 5
//Manier 1
//public class Main
//{
//    public static void main(String[] args)
//    {
//        for (int i = 0; i <= 3; i++)
//        {
//            if (i == 1 || i == 3) {
//                System.out.println("ss");
//            }
//            else {
//                System.out.println("s");
//            }
//        }
//    }
//}

//Manier 2
//public class Main
//{
//    public static void main(String[] args)
//    {
//        for (int i = 0; i <= 3; i++)
//        {
//            if (i % 2 == 0) {
//                System.out.println("s");
//            }
//            else {
//                System.out.println("ss");
//            }
//        }
//    }
//}