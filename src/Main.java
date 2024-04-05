import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    TASK 1:
        System.out.println("Eded daxil edin:");
        int number=new Scanner(System.in).nextInt();
        System.out.println("Quvvet daxil edin:");
        int power=new Scanner(System.in).nextInt();

        System.out.println(powerofnumber(number,power));
     */

        //TASK 2:Simple Calculator
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\u001B[0mChoose an operation:");
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
            System.out.print("Enter choice[1-4]:");
            int choice = sc.nextInt();
            if (choice < 1 || choice > 5) {
                System.out.println("\u001B[31mError: Enter a number between 1 and 5!");
                continue;
            }
            System.out.print("Enter the first number:");
            int fnumber = sc.nextInt();
            System.out.print("Enter the second number:");
            int snumber = sc.nextInt();

            switch (choice) {
                case 1:
                // addFirstnumbertoSecondnumber(fnumber,snumber);
                    System.out.println("Result:" + fnumber + "+" + snumber + "=" + addFirstnumbertoSecondnumber(fnumber,snumber));
                    break;
                case 2:
                   // subtractTheSecondnumberfromTheFirstnumber(fnumber,snumber);
                    System.out.println("Result:" + fnumber + "-" + snumber + "=" +subtractTheSecondnumberfromTheFirstnumber(fnumber,snumber) );
                    break;
                case 3:
                   // multiplytTheSecondnumbertoTheFirstnumber(fnumber,snumber);
                    System.out.println("Result:" + fnumber + "*" + snumber + "=" + multiplytTheSecondnumbertoTheFirstnumber(fnumber,snumber));
                    break;
                case 4:
                    //divideTheFirstnumbertoTheSecondnumber(fnumber,snumber);
                    if(snumber==0){
                        System.out.println("\u001B[31mno divide zero!");
                    }
                    else
                    System.out.println("Result:" + fnumber + "/" + snumber + "=" +divideTheFirstnumbertoTheSecondnumber(fnumber,snumber));
                    break;
            }
            System.out.println("\u001B[0mDo another calculation? (yes/no):");
            String string=sc.next();
            if(string.equals("yes")){
                continue;
            }
            else{
                System.out.println("Goodbye!");
                break;
            }


        }


    }
//TASK 2:Simple Calculator
    public static int addFirstnumbertoSecondnumber(int fnumber,int snumber){
        return  fnumber+snumber;
       // System.out.println("Result:" + fnumber + "+" + snumber + "=" + (fnumber + snumber));
    }

    public static int subtractTheSecondnumberfromTheFirstnumber(int fnumber,int snumber){
        return fnumber-snumber;
        //System.out.println("Result:" + fnumber + "-" + snumber + "=" + (fnumber - snumber));
    }
    public static int multiplytTheSecondnumbertoTheFirstnumber(int fnumber,int snumber){
        return fnumber * snumber;
       // System.out.println("Result:" + fnumber + "*" + snumber + "=" + (fnumber * snumber));
    }
    public static int divideTheFirstnumbertoTheSecondnumber(int fnumber,int snumber){
        return fnumber / snumber;
       // System.out.println("Result:" + fnumber + "/" + snumber + "=" + (fnumber / snumber));
    }

     /*
        TASK 1:Power metodu
    public static int powerofnumber(int eded, int quvvet) {

        int sum = 1;
        for (int i = 0; i < quvvet; i++) {
            sum = sum * eded;
        }
        return sum;
    }
         */


}
