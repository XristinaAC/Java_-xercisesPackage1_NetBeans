package csd.uoc.gr.A11;

import javax.swing.JOptionPane;

class DrawZwin2 {
     public static void main(String args[]){
       String Z="";
       int Lines=Integer.parseInt(JOptionPane.showInputDialog("Give the Lines number",4));
       
       if(Lines<4 || Lines>30){
       JOptionPane.showMessageDialog(null,"I only work for 4 to 30","Error", JOptionPane.ERROR_MESSAGE);
       }
       
       while(Lines>=4 && Lines<=30){
       for(int i=1;i<=Lines;i++){
          if((i==1)){
              for(int j=1;j<=Lines;j++){
                Z=Z+i;
              }Z=Z+"\n";
         }else if(i==Lines){
              for(int j=1;j<=Lines;j++){
                  Z=Z+i;
               }Z=Z+"\n";
       }else{
              for(int j=i;j<=Lines-1;j++){
                  Z=Z+" ";
              }
                  Z=Z+i;
                  Z=Z+"\n";
       }
    }
    JOptionPane.showMessageDialog(null,Z,"Result Window",JOptionPane.INFORMATION_MESSAGE);  
   Lines=Integer.parseInt(JOptionPane.showInputDialog("Give the Lines number",4)); 
   if(Lines<4 || Lines>30){
       JOptionPane.showMessageDialog(null,"I only work for 4 to 30","Error", JOptionPane.ERROR_MESSAGE);
       }
}

}
}
