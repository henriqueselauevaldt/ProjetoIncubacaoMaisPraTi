/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import static java.lang.System.in;
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
import menu.Menu;

/**
 *
 * @author Prefeitura Mampituba
 */
public class PessoaService {
    
    Repository <Pessoa> repository = new Repository<>();
    GetDate getDate = new GetDate();
    Scanner sc;
    DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    AlunoService alunoService;
    AlunoService alunoService1 = new AlunoService(sc);
 public PessoaService (Scanner sc) throws ParseException    

   {
        this.sc = sc;
   }

 public void cadastrarPessoa() throws ParseException
 {
        boolean testeDataNascimento=true;
        boolean testeNotaFinalCurso = true;
        Date dataNascimento = null;
        Double notaFinalCurso = null;
        System.out.println("DIGITE SEU NOME:");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("DIGITE SEU TELEFONE:");
        String telefone = sc.nextLine();
        do{
        System.out.println("DIGITE SUA DATA DE NASCIMENTO");
        String dataN = sc.nextLine();
        testeDataNascimento = getDate.validaData(dataN);
        if(testeDataNascimento == true)
        {
            dataNascimento = formato.parse(dataN);
        }
         else
        {
            System.out.println("DATA INVALIDA");
            System.out.println("DIGITE UMA DATA VALIDA");
            testeDataNascimento=false;
        }
        }while(testeDataNascimento==false);
        String dataC = getDate.getDate();
        Date dataCadastro = formato.parse(dataC);
        String dataA = getDate.getDate();
        Date dataAlteracao = formato.parse(dataA);
        do
        {
            Menu.menu3();
            int opcao = sc.nextInt();
            switch(opcao)
            {
                case 1:
                System.out.println("DIGITE A NOTA FINAL DO CURSO:");
                notaFinalCurso = sc.nextDouble();
                Aluno aluno = new Aluno(nome, telefone, dataNascimento, dataCadastro, dataAlteracao, notaFinalCurso);
                this.repository.salvar(aluno);
                System.out.println("ALUNO CADASTRADO COM SUCESSO!");
                testeNotaFinalCurso=true;
                break;
                
                case 2:
                Pessoa pessoa = new Pessoa(nome, telefone, dataNascimento, dataCadastro, dataAlteracao, notaFinalCurso );
                this.repository.salvar(pessoa);
                System.out.println("PESSOA CADASTRADA COM SUCESSO!");
                testeNotaFinalCurso=true;
                break;
                default:
                System.out.println("OPCAO INVALIDA!");
                System.out.println("DIGITE A OPCAO CORRESPONDENTE");
                testeNotaFinalCurso=false;
                break;
            }
        }while(testeNotaFinalCurso==false);
    }
    
    public void buscarTodosRegistros()
    {
        List<Pessoa> todasPessoas = repository.buscarTodos();
        
        if(todasPessoas.isEmpty())
        {
            System.out.println("NAO EXISTEM REGISTROS A SEREM EXIBIDOS");
        }
        else
        {
            todasPessoas.stream().forEach(v -> System.out.println(v));
        }
        
    }
    
    public void atualizarPessoa() throws ParseException
    {
        System.out.println("Digite o Id deseja alterar");
        Integer id = sc.nextInt();
        Pessoa pessoaTeste = this.repository.buscarPorId(id);
        
        if (pessoaTeste == null)
        {
            System.out.println("REGISTRO NAO ENCONTRADO");
        }
        else if(pessoaTeste.getNotaFinalCurso()==null)
        {       
            System.out.println("DIGITE SEU NOVO NOME: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("DIGITE SEU NOVO TELEFONE: ");
            String telefone = sc.nextLine();
            System.out.println("DIGITE SUA NOVA DATA DE NASCIMENTO: ");
            String dataN = sc.nextLine();
            Date dataNascimento = formato.parse(dataN);
            Date dataC = pessoaTeste.getDataDeCadastro();
            String dataA = getDate.getDate();
            Date dataAlteracao = formato.parse(dataA);
            Pessoa pessoa = new Pessoa(id, nome, telefone, dataNascimento, dataC, dataAlteracao);
            this.repository.alterarPorId(id, pessoa);
        }
        else if(pessoaTeste.getNotaFinalCurso() != null)
        {
            //Date DataCadastroAluno = pessoaTeste.dataDeCadastro;
            //alunoService1.atualizarAluno(id, DataCadastroAluno);
            System.out.println("DIGITE SEU NOVO NOME: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("DIGITE SEU NOVO TELEFONE: ");
            String telefone = sc.nextLine();
            System.out.println("DIGITE SUA NOVA DATA DE NASCIMENTO: ");
            String dataN = sc.nextLine();
            Date dataNascimento = formato.parse(dataN);
            Date dataC = pessoaTeste.dataDeCadastro;
            String dataA = getDate.getDate();
            Date dataAlteracao = formato.parse(dataA);
            System.out.println("DIGITE SUA NOVA NOTA FINAL:");
            Double notaFinal = sc.nextDouble();
            Aluno aluno = new Aluno(id, nome, telefone, dataNascimento, dataC, dataAlteracao, notaFinal);
            this.repository.alterarPorId(id, aluno);
        }
    }
    
    public void removerRegistro() 
    {
        boolean testaRemover = true;
        do
        {
            System.out.println("DIGITE O ID DO REGISTRO QUE VOCE DESEJA EXCLUIR");
            Integer id = sc.nextInt();
            Pessoa pessoaTeste = this.repository.buscarPorId(id);
            if (pessoaTeste == null)
            {
                System.out.println("REGISTRO NAO ENCONTRADO");
                testaRemover = false;
            }
            else
            {
                this.repository.removerPorId(id);
                System.out.println("REGISTRO EXCLUIDO COM SUCESSO !");
                testaRemover=true;
            }
        }while(testaRemover==false);
    }
    
    public void buscarTodasPessoas()
    {
        List<Pessoa> todasPessoas = repository.buscarTodos();
        todasPessoas.stream().filter(v -> (v.notaFinalCurso == null))
        .forEach(v -> System.out.println(v));
        
        //if(todasPessoas.isEmpty())
        //{
          //  System.out.println("NAO EXISTEM REGISTROS A SEREM EXIBIDOS");
        //}
       // else
      //  {
            //todasPessoas.stream().forEach(v -> System.out.println(v));
      //  }
      
    }
    
    public void buscarTodosAlunos()
    {
        List<Pessoa> todosAlunos = repository.buscarTodos();
        todosAlunos.stream().filter(v -> (v.notaFinalCurso != null))
        .forEach(v -> System.out.println(v));
      
    }
}
