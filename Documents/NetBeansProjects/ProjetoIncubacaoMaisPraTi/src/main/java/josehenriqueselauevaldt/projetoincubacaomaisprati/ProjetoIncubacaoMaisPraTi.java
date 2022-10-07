/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package josehenriqueselauevaldt.projetoincubacaomaisprati;

import java.text.ParseException;
import java.util.Scanner;
import menu.Menu;
import model.Pessoa;
import service.GetDate;
import service.PessoaService;

/**
 *
 * @author Prefeitura Mampituba
 */
public class ProjetoIncubacaoMaisPraTi {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner (System.in);
        
        PessoaService pessoaService = new PessoaService(sc);
        GetDate getDate = new GetDate();
        
        getDate.getDate();
          
        boolean continua = true;
       
        do{
           Menu.menu1();
           int opcao1 = sc.nextInt();
           
           switch(opcao1)
           {
               case 1:
                    System.out.println("CADASTRAR UMA NOVA PESSOA");
                    pessoaService.cadastrarPessoa();
                    break;
                                 
                case 2:    
                   System.out.println("MOSTRAR TODAS AS PESSOAS");
                   pessoaService.buscarTodasPessoas();
                   break;
                
                case 3:
                   System.out.println("ATUALIZAR UMA PESSOA");
                   pessoaService.atualizarPessoa();
                   break;
                    
                case 4:
                   System.out.println("EXCLUIR UMA PESSOA");
                   pessoaService.removerVeiculo();
                   break;
               
               case 0:    
               continua = false;
               break;
               
               default:
                  System.out.println("OPÇÃO INVÁLIDA TENTE NOVAMENTE!");
                  break;
           
            }
       
       
       
    }while(continua);
       
    }
}
