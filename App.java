import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       
        // Weight Conversion Program
        Scanner input = new Scanner(System.in);


        // Declare Vriables

        double weight;
        double newWeight;
        int choise;

        // Welcome meassage

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs: ");
        System.out.println("2: Convert kgs to lbs: ");


        // prompet for user choise
        System.out.print("Choose an option: ");
        choise = input.nextInt();
        
       
        // option 1 convert lbs to kgs
        if(choise == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f" , newWeight);
        }
         else if(choise == 2){
            System.out.println("Enter the weight in kgs: ");
            weight = input.nextDouble();
            newWeight = weight *  2.20462;
            System.out.printf("The new weight in lbs is: %.2f" ,newWeight );
        }
        else{
            System.out.println("Not a vaild choise");
        }
        input.close();


        // option 2 conver kgs to lbs

        // else print not a valid choise





    }
}
