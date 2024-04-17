import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\u001B[0mChoose an operation:");
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
            System.out.print("Enter choice[1-4]:");
            int choice = sc.nextInt();
            if (choice < 1 || choice > 4) {
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
            if(string.equals("no")){
                System.out.println("Goodbye!");
               break;
            }
          


        }
    }
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
    public static double divideTheFirstnumbertoTheSecondnumber(double fnumber,int snumber){
        return fnumber / snumber;
        // System.out.println("Result:" + fnumber + "/" + snumber + "=" + (fnumber / snumber));
    }
}
