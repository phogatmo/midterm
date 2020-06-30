/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 30/20
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        System.out.println("enter operation");
        int op = in.nextInt();
        double result=0;
        switch(op)
        {
            case 1: r.calculate(n,m, ArithmeticBase.OperationType.PLUS);
            break;
            case 2: r.calculate(n,m, ArithmeticBase.OperationType.MINUS);
            break;
            case 3: r.calculate(n,m, ArithmeticBase.OperationType.TIMES);
            break;
            case 4: r.calculate(n,m, ArithmeticBase.OperationType.DIVIDE);
            break;
            default: System.out.println("wrong input");
            
        }
        System.out.println("result :" +result); 
    
    }
}