package csd.uoc.gr.A14;

import static csd.uoc.gr.A13.MagicSquareChecker.checkIsMagic;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.Scanner;


public class MagicSquareCheckerFile {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        Scanner N=new Scanner(System.in);
        Scanner inputS;
   
        JFileChooser FChooser=new JFileChooser();
        FChooser.setDialogTitle("Select a file");
        
        int userSelection=FChooser.showSaveDialog(null);
        
        File file=FChooser.getSelectedFile();
        String filepath=file.getAbsolutePath();
        System.out.println("The path of the selected file is: "+filepath);
        
        inputS=new Scanner(new FileInputStream(file));
    
        System.out.println("Give the size of your array\n");
        int n=N.nextInt();
        int[][] MagicA=new int[n][n];
        
         for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                
                MagicA[i][j]=inputS.nextInt();
                System.out.println(MagicA[i][j]);
           }
        }
         
        checkIsMagic(MagicA);
    }
}