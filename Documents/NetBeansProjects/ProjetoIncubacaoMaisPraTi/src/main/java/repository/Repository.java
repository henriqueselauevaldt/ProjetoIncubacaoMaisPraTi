/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import model.Banco;

/**
 *
 * @author Prefeitura Mampituba
 * @param <T>
 */
public class Repository <T extends Banco>{
    
    Map<Integer, T> bancoDeDados;
    
    public Repository()
    {
        this.bancoDeDados = new TreeMap<>();
        
    }
    
    public void salvar( T t)
    {
        this.bancoDeDados.put(t.getId(), t);
    }
    
    public List<T> buscarTodos( )
    {
        return this.bancoDeDados.values().stream().collect(Collectors.toList());
    }
    
      
    public T buscarPorId(Integer Id)
    {
        return this.bancoDeDados.get(Id);
    }
        
    public void removerPorId(Integer Id)
    {
        this.bancoDeDados.remove(Id);
    }
    
    public void alterarPorId(Integer Id, T t)
    {
        this.bancoDeDados.replace(Id, t);
    }
}
