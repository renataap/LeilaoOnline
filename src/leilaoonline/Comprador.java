/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilaoonline;

import java.util.Objects;

/**
 *
 * @author W10INfomaX
 */
public class Comprador {
     private int codigo;
     private String nome;
     private String login;
     private String endereco;
     private double cpfcnpj;
     private String senha;

          @Override
    public String toString() {
        return "Comprador{" + "codigo=" + codigo + ", nome=" + nome + ", cpfcnpj=" + cpfcnpj + '}';
    }
  
     
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cpfcnpj
     */
    public double getCpfcnpj() {
        return cpfcnpj;
    }

    /**
     * @param cpfcnpj the cpfcnpj to set
     */
    public void setCpfcnpj(double cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
     
     
    
}
