/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg4_sw.pkg2;
 import java.util.Scanner;
/**
 *
 * @author Eslam ismail
 */
public class Team4_SW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        while (true) {            
            
   
        System.out.println("1_SummationSeries\n2-MultiplicationSeries\n3_CircleCircumference\n4_SphereVoluum\n5_Fibonacci\n6_CircleArea\n7_SphereCircumference\n8_LucasSeries\n9_CircleVolum\n10_SphereArea\n11_2PowerN");
       System.out.println("Please, Enter  number of your choise : ");
       Scanner i = new Scanner(System.in);
       int in = i.nextInt();
       if(in == 1)
       {//code of SummationSeries
               }
               
       
       if(in == 2)
       {//code of MultiplicationSeries 
       }
       if(in == 3)
       {//code of CircleCircumference
       }
       if(in == 4)
       {//code of SphereVoluum
       }
       if(in == 5)
       {//code of Fibonacci
           
       }
      if (in == 6)
       {
        
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
       }
       if(in == 7)
       {//code of SphereCircumference
       }
       if(in == 8)
       {//code of LucasSeries
       }
       if(in == 9)
       {//code of CircleVolum
           
       }
       if(in == 10)
       {//code of SphereArea
       }
       if(in == 11)
       {//code of 2PowerN
       }
    }            
}
}
    
    

