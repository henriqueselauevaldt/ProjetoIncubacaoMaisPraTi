/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import util.Contador;

/**
 *
 * @author Prefeitura Mampituba
 */
public class Pessoa implements Banco{
    
    public Integer id;
    public String nome;
    public String telefone;
    public Date dataDeNascimento;
    public Date dataDeCadastro;
    public Date dataUltimaAlteracao;
    public Double notaFinalCurso;

public Pessoa(String nome, String telefone, Date dataDeNascimento, Date dataDeCadastro, Date dataUltimaAlteracao, Double notaFinalCurso)
{
    this.id = Contador.proximoId();
    this.nome = nome;
    this.telefone = telefone;
    this.dataDeNascimento = dataDeNascimento;
    this.dataDeCadastro = dataDeCadastro;
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    this.notaFinalCurso = notaFinalCurso;
}
public Pessoa(Integer id, String nome, String telefone, Date dataDeNascimento, Date dataUltimaAlteracao, Double notaFinalCurso)
{
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    this.dataDeNascimento = dataDeNascimento;
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    this.notaFinalCurso = notaFinalCurso;
}
    public Pessoa() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Pessoa(Integer id, String nome, String telefone, Date dataDeNascimento, Date DataDeCadastro, Date dataUltimaAlteracao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeCadastro = DataDeCadastro;
        this.dataUltimaAlteracao = dataUltimaAlteracao;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() 
    {
        return " ID: " + id + "\n NOME: " + nome + "\n TELEFONE: " + telefone + "\n DATA DE NASCIMENTO: " + dataDeNascimento + "\n DATA DE CADASTRO: " + dataDeCadastro + "\n DATA DA ULTIMA ALTERACAO: " + dataUltimaAlteracao + "\n NOTA FINAL DO CURSO: " + notaFinalCurso;
       
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public Date getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public Double getNotaFinalCurso() {
        return notaFinalCurso;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public void setDataUltimaAlteracao(Date dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    public void setNotaFinalCurso(Double notaFinalCurso) {
        this.notaFinalCurso = notaFinalCurso;
    } 
    
}
