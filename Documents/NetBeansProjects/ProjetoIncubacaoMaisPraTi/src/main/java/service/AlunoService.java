/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
   GetDate getDate = new GetDate();
   DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
   public AlunoService (Scanner sc) throws ParseException    
   {
        this.sc = sc;
   }
    
    public AlunoService(String nome, String telefone, Date dataNascimento, Date dataCadastro, Date dataAlteracao, Double notaFinalCurso)
    {
        
    }

    public void buscarTodasAlunos()
    {
       List<Aluno> todosAlunos = repository.buscarTodos();
       todosAlunos.stream().forEach(v -> System.out.println(v));
    }
    
    public void atualizarAluno(Integer id, Date dataCadastroAluno) throws ParseException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("DIGITE SEU NOVO NOME: ");
        String nome = scan.nextLine();
        System.out.println("DIGITE SEU NOVO TELEFONE: ");
        String telefone = scan.nextLine();
        System.out.println("DIGITE SUA NOVA DATA DE NASCIMENTO: ");
        String dataN = scan.nextLine();
        Date dataNascimento = formato.parse(dataN);
        Date dataC = dataCadastroAluno;
        String dataA = getDate.getDate();
        Date dataAlteracao = formato.parse(dataA);
        System.out.println("DIGITE SUA NOVA NOTA FINAL:");
        Double notaFinal = scan.nextDouble();
        Aluno aluno = new Aluno(id, nome, telefone, dataNascimento, dataC, dataAlteracao, notaFinal);
        this.repository.alterarPorId(id, aluno);
    }
    public void buscarTodosAlunosCadastrados()
    {
        List<Aluno> todosAlunos = repository.buscarTodos();
        todosAlunos.stream().filter(v -> (v.notaFinalCurso != null))
        .forEach(v -> System.out.println(v));
      
    }
  }
