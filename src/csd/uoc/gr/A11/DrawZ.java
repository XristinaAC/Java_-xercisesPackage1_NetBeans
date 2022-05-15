
package csd.uoc.gr.A11;

import java.util.Scanner;

public class DrawZ {
    public static void main(String args[]){
        
       Scanner in=new Scanner(System.in);
       System.out.print("Give the number of lines");
       int Lines=in.nextInt();
       
       while((Lines>=4)&&(Lines<=30)){//Cheking the value of the variable Lines that the user has given
       for(int i=1;i<=Lines;i++){
          if((i==1)){
              for(int j=1;j<=Lines;j++){
                  System.out.print("*");//For the first value of j and the last "Lines"x* must be printed
              }System.out.println("\t");//After the stars are types the next star will be printed to a new line
              
         }else if(i==Lines){
               for(int j=1;j<=Lines;j++){
                  System.out.print("*");
               }System.out.println("\t");
       }else{
           for(int j=i;j<=Lines-1;j++){  
           System.out.print(" ");}//The empty space is printed so we can achive the format of the "Z" letter
           System.out.println("*\t");//as it is given from the exercise
       }
    }
      System.out.print("Give the number of lines");//After the first while the program continues asking 
      Lines=in.nextInt();//"Lines" values for the new Z that will be typed        
}
}
}
