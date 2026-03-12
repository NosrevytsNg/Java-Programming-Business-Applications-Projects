import java.util.Scanner;
import java.io.*;
public class SalaryMultiplierCalculator {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("D:\\Study Materials\\Kaplan\\Term 3\\Introduction to Computer Science\\SalaryMultiplierCalculator\\SalaryMultiplierData.txt")); 
        Scanner scanner = new Scanner(System.in);
        String employeeID, employeeName, msg;
        double personalSalaryMultipler;
        double companySalaryMultipler;
        int originalSalary;
        int employeeBonus;
        int performanceRating;
        int companyPerformance;
        
        System.out.print("Please provide the company performance in %: ");
        companyPerformance = scanner.nextInt();
     
        while(input.hasNext()){
            msg = "";
            personalSalaryMultipler = 0;
            companySalaryMultipler = 0;
            employeeID = input.next();
            employeeName = input.next();
            originalSalary = input.nextInt();
            performanceRating = input.nextInt();
               
            
        if (performanceRating == 1){
            personalSalaryMultipler = 0.8;
        }
        else if (performanceRating == 2){
            personalSalaryMultipler = 1;
        }
        else if (performanceRating == 3){
            personalSalaryMultipler = 1.5;
        }
        else if (performanceRating == 4){
            personalSalaryMultipler = 2;
        }
        else {
            msg = "Invalid Performance Rating";
        }
        
        if (companyPerformance < 100){
            companySalaryMultipler = 0.8; 
        }
        else if (companyPerformance >= 100 && companyPerformance <= 105 ){
            companySalaryMultipler = 1;
        }
        else if (companyPerformance > 105){
            companySalaryMultipler = 1.5;
        }
        else{
            msg = "Invalid Company Performance Rating";
        }
        
        employeeBonus = (int) (originalSalary * personalSalaryMultipler * companySalaryMultipler); 
        System.out.printf("%s \t%s \t%d \t%s \n", employeeID, employeeName, employeeBonus, msg);
        }     
        
    }   
}
