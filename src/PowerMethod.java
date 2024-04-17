import java.util.Scanner;

public class PowerMethod {
    public static void main(String[] args) {

        System.out.println("Eded daxil edin:");
        int number=new Scanner(System.in).nextInt();
        System.out.println("Quvvet daxil edin:");
        int power=new Scanner(System.in).nextInt();

        System.out.println(powerofnumber(number,power));

    }

    public static int powerofnumber(int eded, int quvvet) {

        int sum = 1;
        for (int i = 0; i < quvvet; i++) {
            sum = sum * eded;
        }
        return sum;
    }



}
