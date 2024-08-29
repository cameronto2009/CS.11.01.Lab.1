import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age please!: ");
        int age = -1;
        while(age < 0) {
            try {
                age = Integer.parseInt(scan.nextLine());
                if(age < 0){
                    System.out.println("Hi please enter a correct number!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a correct number");
            }
        }
        System.out.println(age + " years old should be dating somebody who is at least " + (age/5+9) + " years old.");


    }
}