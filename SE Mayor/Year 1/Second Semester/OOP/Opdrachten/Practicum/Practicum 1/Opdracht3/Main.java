package Opdracht3;

//Opdracht 3:
// Manier 1:
import java.text.DecimalFormat;
public class Main{
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(df2.format(Math.random()));
        }
    }
}
