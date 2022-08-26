/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova33;

/**
 *
 * @author Prefeitura Mampituba
 */
public class Prova33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   /*int [] a = new int [5];
   a[0]=0;
   a[1]=0;
   a[2]=0;
   a[3]=5;
   a[4]=5;
   
   int i = 0;
    
    for( ; i < 5; i++) 
    {
        if (i == 2) 
    {
            i++;
            break;
    }
        if (i == 3) 
            break;
        if (i == 4) 
            break;
    }
        System.out.println( a[i] + a[i+1] );
    */   
    
   int x=0; 
   int [] a = new int [5];
   
    a[0]=1;
    a[1]=2;
    a[2]=3;
    a[3]=4;
    a[4]=5;
    
    for(int e:a) 
    {
        x+=((e%2)==0)?e:1;
    }
    System.out.println(x);
   
   
    }
    
}
