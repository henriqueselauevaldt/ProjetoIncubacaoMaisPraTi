/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pedido;

/**
 *
 * @author Prefeitura Mampituba
 */
public class Pedido {

    public static void main(String[] args) {
        
    ClsItem item1 = new ClsItem("XIS SALADA", 20.0);
    ClsItem item2 = new ClsItem("XIS BACON", 22.0); 
    ClsItem item3 = new ClsItem("XIS STROGONOFF", 23.0); 
    ClsItem item4 = new ClsItem("XIS CORACAO", 24.0); 
    ClsItem item5 = new ClsItem("XIS TUDO", 30.0); 
    
    ClsPedido pedido = new ClsPedido();
    pedido.adicionarItem(item1);
    pedido.adicionarItem(item2);
    
   // String retorno = pedido.RetornaItens();
   //System.out.println(retorno);
    System.out.println(pedido);
    pedido.RemoveItens(item1);
    System.out.println(pedido);      
        
        
}

}