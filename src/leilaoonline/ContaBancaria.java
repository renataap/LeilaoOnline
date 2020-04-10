/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilaoonline;
    
import java.util.Objects;

/**
 *
 * @author Rafaela
 */
public class ContaBancaria {
    private String banco;
    private int agencia;
    private int conta;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.banco);
        hash = 53 * hash + this.agencia;
        hash = 53 * hash + this.conta;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContaBancaria other = (ContaBancaria) obj;
        if (!Objects.equals(this.banco, other.banco)) {
            return false;
        }
        if (this.agencia != other.agencia) {
            return false;
        }
        if (this.conta != other.conta) {
            return false;
        }
        return true;
    }

      @Override
    public String toString() {
        return "Conta Bancária {" + "banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + '}';
    }
    
    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the conta
     */
    public int getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(int conta) {
        this.conta = conta;
    }
}
