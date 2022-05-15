package csd.uoc.gr.A11;

import java.io.*;
import java.util.Scanner;

class DrawZHtml {
     public static void main(String args[]) throws FileNotFoundException, IOException{
        
       Scanner in=new Scanner(System.in);
       System.out.print("Give the number of lines");
       int Lines=in.nextInt();
       
       while((Lines>=4)&&(Lines<=30)){
       try (PrintWriter HTML = new PrintWriter("Z.html")) {
             HTML.write("<!DOCTYPE html>\n"
                     + "<html>\n"
                     + "<head>\n"
                     + "<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n"
                     + "</head\n"
                     + "<body>\n"
                     + "\n"
                     + "<font size=\"" + Lines + "\">Z</font>\n"
                     + "\n"
                     + "</body>\n"
                     + "</html>");
                 HTML.close();
         }
      System.out.print("Give the number of lines");//After the first while the program continues asking 
      Lines=in.nextInt();
    }
}
}

