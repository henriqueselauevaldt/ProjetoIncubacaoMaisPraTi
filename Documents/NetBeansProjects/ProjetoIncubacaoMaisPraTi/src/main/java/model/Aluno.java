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
public class Aluno extends Pessoa{
    
        public Aluno(String nome, String telefone, Date dataDeNascimento, Date dataDeCadastro, Date dataUltimaAlteracao, Double notaFinalCurso) {
        super(nome, telefone, dataDeNascimento, dataDeCadastro, dataUltimaAlteracao, notaFinalCurso);
        
    }
}
