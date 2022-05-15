package csd.uoc.gr.A13;

import java.util.Scanner;

public class MagicSquareChecker {
    
//sumOfRow
    public static int sumOfRow(int [][] s,int k){
        int sum=0;
        for(int i=0;i<s.length;++i){
            sum=sum + s[i][k];
        }
        return sum;
    }
    
//sumOfColumn
     public static int sumOfColumn(int [][] s,int k){
        int sum=0;
        for(int i=0;i<s.length;++i){
            sum=sum + s[k][i];
        }
        return sum;
    }
     
//sumOfDiagonal1
    public static int sumOfDiagonal1(int [][] s){
        int sum=0;
        for(int y=0;y<s.length;++y){
                    sum=sum + s[y][y];
        }
        return sum;
    }
       
//sumOfDiagonal2
       public static int sumOfDiagonal2(int [][] s){
        int sum=0;
        for(int a=0;a<s.length;++a){
            sum=sum + s[a][s.length-a-1];
        }
        return sum;
    }
    
//checkIsMagic
    public static boolean checkIsMagic(int [] [] s){
        int [] SR=new int[s.length];
        int [] SC=new int[s.length];
        int SD1;
        int SD2;
       
        for(int i=0;i<s.length;++i){
                SR[i]=sumOfRow(s,i);
                SC[i]=sumOfColumn(s,i);
        }
        
        SD1=sumOfDiagonal1(s);
        SD2=sumOfDiagonal1(s);
        
        for(int x=0;x<SR.length;++x){
             if(SR[x] != SC[x]){
                System.out.println("The MagicA is not a magic square\n");
                return false;
            }else if(SR[x] == SC[x]){
                 if(SD1 != SD2 ){
                    System.out.println("The MagicA is not a magic square\n");
                    return false;
                 }else if(SD1 == SD2){
                    System.out.println("The array is a Magic square with "+SD1+" as the magic key\n");
                    return true;
                 }
             }
        }
        return false;
    }
    
//main
    public static void main(String args[]){
        Scanner N=new Scanner(System.in);
        Scanner E=new Scanner(System.in);
        System.out.println("Give the number of elements\n");
        int n=N.nextInt();
        
        try{//Elegxw an to mege8os tou xrhsth einai mesa sta swsta oria
        if( (n<2) || (n>10) ){
            throw new Exception("Out of limits");
        }
        
        int [] [] MagicA=new int[n][n];
       
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.println("Give the element");
                MagicA[i][j]=E.nextInt();
           }
        }
        
        checkIsMagic(MagicA);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}