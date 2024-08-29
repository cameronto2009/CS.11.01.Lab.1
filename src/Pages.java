import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age please: ");
        int age = -1;
        while(age < 0) {
            try {
                age = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a correct numbre!, weeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeelo");
            }
        }
        System.out.println(age + " years old should read at least " + (100-age) + " before playing video games!.");

    }
}