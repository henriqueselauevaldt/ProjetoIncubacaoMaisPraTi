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
import model.Pessoa;
import repository.Repository;

/**
 *
 * @author Prefeitura Mampituba
 */
public class PessoaService {
    
    
    Repository <Pessoa> repository = new Repository<>();
    GetDate getDate = new GetDate();
    
    
    Scanner sc;
              
    //SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy"); 
    DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
 public PessoaService (Scanner sc) throws ParseException    

   {
        
        this.sc = sc;
               
        //String data = "2020/12/12";
        //Date data1 = formato.parse(data);
        
        //String data2 = "2020/12/12";
        //Date data3 = formato.parse(data2);
        
        //String data4 = "2020/12/12";
        //Date data5 = formato.parse(data4);
        
        //this.repository.salvar(new Pessoa("joao", data1, data3, data5,2500.00));
        //this.repository.salvar(new Pessoa("maria", data1, data3, data5,2500.00));
        //this.repository.salvar(new Pessoa("jose", data1, data3, data5,2500.00));
    }

       
    
    public void cadastrarPessoa() throws ParseException
    {
        
        Double notaFinalCurso = null;
        System.out.println("Digite seu nome:");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Digite seu telefone:");
        String telefone = sc.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dataN = sc.nextLine();
        Date dataNascimento = formato.parse(dataN);
        
        //System.out.println("Digite a data de Cadastro:");
        //String dataC = sc.nextLine();
        String dataC = getDate.getDate();
        Date dataCadastro = formato.parse(dataC);
        
        //System.out.println("Digite a data de ultima alteracao");
        //String dataA = sc.nextLine();
        //Date dataAlteracao = formato.parse(dataA);
        
        String dataA = getDate.getDate();
        Date dataAlteracao = formato.parse(dataA);
        
        System.out.println("Deseja cadastrar uma nota final");
        System.out.println("1: SIM");
        System.out.println("2: NAO");
        int controle = sc.nextInt();
        
        if(controle ==1)
        {
            System.out.println("CADASTRA ALUNO:");
            System.out.println("Digite a nota final do curso:");
            notaFinalCurso = sc.nextDouble();
        }
        else if(controle ==2)
        {
            Pessoa pessoa = new Pessoa(nome, telefone, dataNascimento, dataCadastro, dataAlteracao, notaFinalCurso );
            this.repository.salvar(pessoa);
            System.out.println("PESSOA CADASTRADA COM SUCESSO !");
        }
        else
        {
            System.out.println("OPCAO INVÁLIDA");
        }
        
                
    }
    
    public void buscarTodasPessoas()
    {
        List<Pessoa> todasPessoas = repository.buscarTodos();
        todasPessoas.stream().forEach(v -> System.out.println(v));
             
   }
    
    public void atualizarPessoa() throws ParseException
    {
        
        System.out.println("Digite o Id da Pessoa que deseja alterar");
        Integer id = sc.nextInt();
        
        Pessoa pessoaTeste = this.repository.buscarPorId(id);
         
        if (pessoaTeste == null)
        {
            System.out.println("PESSOA NAO ENCONTRADA");
            //throw new SistemaException ("Ciente nao encontrado");
        }
        else
        {       
        System.out.println("DIGITE SEI NOVO NOME: ");
        sc.nextLine();
        String nome = sc.nextLine();
        
        System.out.println("DIGITE SEU NOVO TELEFONE: ");
        String telefone = sc.nextLine();
        
        System.out.println("DIGITE SUA NOVA DATA DE NASCIMENTO: ");
        String dataN = sc.nextLine();
        Date dataNascimento = formato.parse(dataN);
        
        //System.out.println("DIGITE SUA NOVA DATA DE CADASTRO: ");
        //String dataC = sc.nextLine();
       // Date dataCadastro = formato.parse(dataC);
        
       Date dataC = pessoaTeste.getDataDeCadastro();
        
        String dataA = getDate.getDate();
        Date dataAlteracao = formato.parse(dataA);
        
        Pessoa pessoa = new Pessoa(id, nome, telefone, dataNascimento, dataC, dataAlteracao);
        //Pessoa pessoa = new Pessoa(id, nome, telefone, dataNascimento, dataCadastro, dataAlteracao);
        this.repository.alterarPorId(id, pessoa);
        }
    }
    
    public void removerVeiculo() 
    {
        System.out.println("DIGITE O ID DO REGISTRO QUE VOCE DESEJA EXCLUIR");
        Integer id = sc.nextInt();
        Pessoa pessoaTeste = this.repository.buscarPorId(id);
        
        if (pessoaTeste == null)
        {
            System.out.println("REGISTRO NAO ENCONTRADO");
            //throw new SistemaException ("Ciente nao encontrado");
        }
        else
        {
            this.repository.removerPorId(id);
            System.out.println("REGISTRO EXCLUIDO COM SUCESSO !");
        }
    }   
}
