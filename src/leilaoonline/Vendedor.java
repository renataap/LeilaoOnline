package leilaoonline;

import java.util.Objects;


/**
 *
 * @author Daniel Alves
 */

public class Vendedor {
    private int codigo;
    private String nome;
    private String login;
    private String endereco;
    private double cpfcnpj;
    private String senha;
    private Produtos produto;
    private ContaBancaria contaBancaria;
    private ContaBancaria Contabancaria;
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.cpfcnpj) ^ (Double.doubleToLongBits(this.cpfcnpj) >>> 32));
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
        final Vendedor other = (Vendedor) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.login, other.login);
    }

        @Override
    public String toString() {
        return "Vendedor {" + "codigo=" + codigo + ", nome=" + nome + ", cpfcnpj=" + cpfcnpj + '}';
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEndereco() {
        return endereco;
    }

     public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(double cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
               
    }
    public Produtos getProduto() {
        return produto;
    }
    
    public ContaBancaria setContaBancaria(){
        this.Contabancaria = contaBancaria;
        return Contabancaria;
    }
    
    public String verificaSenha (String senha){
        if (senha ==null){
            return "preencha o campo abaixo: ";
        }
        if (senha.length() < 6) {
            return "Senha inválida";
        }
        if (!senha.equals(senha)) {
            return "Senha não é compatível com a anterior";
        }
        return null;
        
    }
    
    public void Salvar (){
        System.out.println("Vendedor salvo com sucesso");
    }
    
}
