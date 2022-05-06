import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int exam_score = sc.nextInt();
        sc.close();


        if(exam_score  >= 90) System.out.println("A");
        else if(exam_score>=80) System.out.println("B");
        else if(exam_score>=70) System.out.println("C");
        else if(exam_score>=60) System.out.println("D");
        else System.out.println("F");


    }
    
}
