/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Prefeitura Mampituba
 */
public class Aluno extends Pessoa implements Banco{
    
        public Aluno(String nome, String telefone, Date dataDeNascimento, Date dataDeCadastro, Date dataUltimaAlteracao, Double notaFinalCurso) 
        {
            super(nome, telefone, dataDeNascimento, dataDeCadastro, dataUltimaAlteracao, notaFinalCurso);
        }
        public Aluno(Integer id, String nome, String telefone, Date dataDeNascimento, Date dataDeCadastro, Date dataUltimaAlteracao, Double notaFinalCurso) 
        {
            super(nome, telefone, dataDeNascimento, dataDeCadastro, dataUltimaAlteracao, notaFinalCurso);
            this.id = id;
        }

        @Override
    public Integer getId() {
        return id;
    }
        

    
}
