import java.util.Scanner;
import java.io.*;
public class IncomeTaxCalculator {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("D:\\Study Materials\\Kaplan\\Term 3\\Introduction to Computer Science\\IncomeTaxCalculator\\IncomeTax.txt"));
        String employeeID,employeeName, msg;
        double income,taxableIncome,incomeTax;
        while(input.hasNext()){
            incomeTax = 0;
            msg = "";
            employeeID = input.next();
            employeeName = input.next();
            income = input.nextDouble(); 
            if(income < 0) {
                msg ="Invalid income";   
            }
            
            else if(income >0 && income <=20000){
                incomeTax = 0;
            }
            
            else if(income >20000 && income <=40000){
                taxableIncome = income - 20000;
                incomeTax = (taxableIncome*0.02);
            }
            
            else if(income >40000 && income <=70000){
                taxableIncome = income - 40000;
                incomeTax = 400 + (taxableIncome*0.035);
            }
            
            else if(income >70000 && income <=110000){
                taxableIncome = income - 70000;
                incomeTax = 400 + 1050 +(taxableIncome*0.07);
            }
            
            else{
                taxableIncome = income - 110000;
                incomeTax = 400 + 1050 + 2800 + taxableIncome * 0.115;
            }
            
            System.out.printf("%-2s \t %.2f\t%s\n", 
                    employeeName, incomeTax, msg);
        } 
    }  
}


