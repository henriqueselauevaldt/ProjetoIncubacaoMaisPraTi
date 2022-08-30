/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedido;

import java.util.Arrays;

/**
 *
 * @author Prefeitura Mampituba
 */
public class ClsPedido {
    
    
    private ClsItem[] itens = new ClsItem [10];
    private StatusPedido status;
    private double valorTotal;
    
    public ClsPedido()
    {
        this.status = StatusPedido.AGUARDADNDO;
    }

    public ClsItem[] getItens() {
        return itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setItens(ClsItem[] itens) {
        this.itens = itens;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void adicionarItem( ClsItem item)
    {
        this.setStatus(StatusPedido.AGUARDADNDO);
        for(int i=0; i<this.itens.length; i++)
        {
            if(this.itens[i]==null)
            {
                this.itens[i] = item;
                this.valorTotal +=item.getValor();
                break;
            }
        }
    }
    
    public String RetornaItens()
    {
        String itens = "";
        for(int i=0; i<this.itens.length; i++)
        {
            if(this.itens[i]!= null)
            {
                itens += this.itens[i] + ". ";
            }
        }
        return itens;
    }
    public void RemoveItens(ClsItem item)
    {
        for(int i=0; i<this.itens.length; i++)
        {
            if((null!= this.itens[i]) && (this.itens[i].equals(item)))
                    
            {
                this.valorTotal = valorTotal - itens[i].getValor();
                this.itens[i] = null;
                break;
                
            }
        }
        
    }
    @Override
    public String toString() {
        //return "ClsPedido{" + "itens=" + Arrays.toString(itens) + ", status=" + status + ", valorTotal=" + valorTotal + '}';
        return "ClsPedido{" + this.RetornaItens() + ", status=" + status + ", valorTotal=" + valorTotal + '}';
    }
    
    
    
}
