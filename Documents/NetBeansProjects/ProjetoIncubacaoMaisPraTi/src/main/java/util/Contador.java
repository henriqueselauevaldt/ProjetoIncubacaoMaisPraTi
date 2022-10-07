/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Prefeitura Mampituba
 */
public class Contador {
    
    private static Integer cont=0;
    //private Integer id;
    
    public static Integer proximoId()
    {
        cont++;
        return cont;
    }
    
}
