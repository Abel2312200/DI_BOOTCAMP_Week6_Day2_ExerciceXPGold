import java.util.Scanner;

public class BasicSalary {

    public static void main(String[] args) {
        // declaration global variables
        Scanner se = new Scanner(System.in);
        double HRA, DA, basicSalary, grossSalary = 0;

        // retrieve basic salary
        System.out.print("Enter the Basic Salary : ");
        basicSalary = se.nextInt();

        // compute gross salary
        if (basicSalary > 0){
            // compute HRA and DA according the basic salary
            if(basicSalary <= 10000){
                HRA = 0.20;
                DA = 0.80;
            }else if(basicSalary <= 20000){
                HRA = 0.25;
                DA = 0.90;
            }else {
                HRA = 0.30;
                DA = 0.95;
            }

            // determine gross salary
            grossSalary = basicSalary*(HRA+DA+1);

        }
        System.out.print("Gross Salary : "+grossSalary);
    }

}
