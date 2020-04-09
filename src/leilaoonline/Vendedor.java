package leilaoonline;

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
    
    public void atualizaEndereco(String Endereco){
        this.setEndereco(Endereco);
    }
}
