/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilaoonline;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author pdmay
 */
public class Produtos {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
        hash = 83 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    private int codigo;
    private String nome;
    private double valorInicial;
    private Date dataExpiracao;
    public List<Lance> lances;
    
    @Override
    public String toString() {
        return "Produtos{" + "codigo=" + codigo + ", nome=" + nome + ", valorInicial=" + valorInicial + '}';
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
     * @return the valorInicial
     */
    public double getValorInicial() {
        return valorInicial;
    }

    /**
     * @param valorInicial the valorInicial to set
     */
    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
    
    public void adicionaLance(Date data, String descricao, double valor, Comprador comprador) {
        Lance lance = new Lance(codigo, descricao, valor, data, comprador, this);
        if(lance.validarLance()) {
            this.lances.add(lance);
        }
    }
    
    public Lance maiorLance() {
        Lance maiorLance = null;
        for (Lance lance : this.lances) {
            if(maiorLance == null || lance.getValorLance() > maiorLance.getValorLance()) {
                maiorLance = lance;
            }
        }
        return maiorLance;
    }

}