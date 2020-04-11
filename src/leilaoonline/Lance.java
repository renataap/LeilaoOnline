/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilaoonline;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Renata
 */
public class Lance {
    private  int codigoLance;
    private  String descricaoLance;
    private  double valorLance;
    private  Date dataLance;
    private Comprador comprador;
    private Produtos produto;

    public Lance(int codigoLance, String descricaoLance, double valorLance, Date dataLance, Comprador comprador, Produtos produto) {
        this.codigoLance = codigoLance;
        this.descricaoLance = descricaoLance;
        this.valorLance = valorLance;
        this.dataLance = dataLance;
        this.comprador = comprador;
        this.produto = produto;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lance other = (Lance) obj;
        if (this.codigoLance != other.codigoLance) {
            return false;
        }
        if (!Objects.equals(this.descricaoLance, other.descricaoLance)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorLance) != Double.doubleToLongBits(other.valorLance)) {
            return false;
        }
        if (!Objects.equals(this.dataLance, other.dataLance)) {
            return false;
        }
        if (!Objects.equals(this.comprador, other.comprador)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codigoLance;
        hash = 67 * hash + Objects.hashCode(this.descricaoLance);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valorLance) ^ (Double.doubleToLongBits(this.valorLance) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.dataLance);
        hash = 67 * hash + Objects.hashCode(this.comprador);
        hash = 67 * hash + Objects.hashCode(this.produto);
        return hash;
    }
    
    public int getCodigoLance() {
        return codigoLance;
    }

    public String getDescricaoLance() {
        return descricaoLance;
    }

    public double getValorLance() {
        return valorLance;
    }

    public Date getDataLance() {
        return dataLance;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setCodigoLance(int codigoLance) {
        this.codigoLance = codigoLance;
    }

    public void setDescricaoLance(String descricaoLance) {
        this.descricaoLance = descricaoLance;
    }

    public void setValorLance(double valorLance) {
        this.valorLance = valorLance;
    }

    public void setDataLance(Date dataLance) {
        this.dataLance = dataLance;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
    
    public boolean validarLance() {
        return (this.dataLance.before(this.produto.getDataExpiracao()));
    }
}
