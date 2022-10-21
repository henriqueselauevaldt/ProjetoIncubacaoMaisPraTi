/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package josehenriqueselauevaldt.projetoincubacaomaisprati;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import menu.Menu;
import model.Pessoa;
import service.AlunoService;
import util.GetDate;
import service.PessoaService;

/**
 *
 * @author Prefeitura Mampituba
 */
public class ProjetoIncubacaoMaisPraTi {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner (System.in);
        Pessoa pessoa = new Pessoa();
        PessoaService pessoaService = new PessoaService(sc);
        AlunoService alunoService = new AlunoService(sc);
        GetDate getDate = new GetDate();
        getDate.getDate();
        boolean continua = true;
        do
        {
           Menu.menu1();
           int opcao1 = sc.nextInt();
           switch(opcao1)
           {
                case 1:
                    pessoaService.cadastrarPessoa();    
                    break;
                case 2:    
                   Menu.menu2();
                   int opcao2 = sc.nextInt();
                   if(opcao2==1)
                   {
                       //pessoaService.buscarTodosRegistros();
                       pessoaService.buscarTodasPessoas();
                       break;
                   }
                   else if(opcao2==2)
                   {
                       //alunoService.buscarTodasAlunos();
                       //alunoService.buscarTodosAlunosCadastrados();
                       pessoaService.buscarTodosAlunos();
                       break;
                   }
                   else if(opcao2 ==3)
                   {
                       pessoaService.buscarTodosRegistros();
                       alunoService.buscarTodasAlunos();
                       //pessoaService.buscarTodasPessoas();
                       //alunoService.buscarTodosAlunosCadastrados();
                       break;
                   }
                   else
                       System.out.println("OPCAO INVALIDA");
                       break;
                case 3:
                   pessoaService.atualizarPessoa();
                   break;
                case 4:
                   pessoaService.removerRegistro();
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
