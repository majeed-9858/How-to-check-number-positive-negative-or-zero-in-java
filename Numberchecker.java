import java.util.Scanner;
public class Numberchecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.print("The number is positive: ");
        } 
        else if (num < 0)
            System.out.print("The number is negative: ");

        else{
            System.out.print("The number is 0");

            sc.close();
        }
        }
    }
