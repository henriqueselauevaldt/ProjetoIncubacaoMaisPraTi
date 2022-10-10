/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.Aluno;
import model.Pessoa;
import repository.Repository;

/**
 *
 * @author Prefeitura Mampituba
 */
public class AlunoService {
    
    Repository <Aluno> repository = new Repository<>();
    Scanner sc;
    
    public AlunoService (Scanner sc) throws ParseException    

   {
        this.sc = sc;
   }
    
    public AlunoService(String nome, String telefone, Date dataNascimento, Date dataCadastro, Date dataAlteracao, Double notaFinalCurso)
    {
        //repository.salvar(aluno);
    }

    public void cadastrarAluno(Aluno aluno)
    {
        
        repository.salvar(aluno);
    }
    
    public void buscarTodasAlunos()
    {
       List<Aluno> todasPessoas = repository.buscarTodos();
       todasPessoas.stream().forEach(v -> System.out.println(v));
        
    }

}
