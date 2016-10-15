/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financeiroPessoal1.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "banco", catalog = "financeirobasepc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findByBancoId", query = "SELECT b FROM Banco b WHERE b.bancoId = :bancoId"),
    @NamedQuery(name = "Banco.findByUsuarioId", query = "SELECT b FROM Banco b WHERE b.usuarioId = :usuarioId"),
    @NamedQuery(name = "Banco.findByBancoNome", query = "SELECT b FROM Banco b WHERE b.bancoNome = :bancoNome"),
    @NamedQuery(name = "Banco.findByBancoSigla", query = "SELECT b FROM Banco b WHERE b.bancoSigla = :bancoSigla"),
    @NamedQuery(name = "Banco.findByBancoCodigo", query = "SELECT b FROM Banco b WHERE b.bancoCodigo = :bancoCodigo"),
    @NamedQuery(name = "Banco.findByBancoAtivo", query = "SELECT b FROM Banco b WHERE b.bancoAtivo = :bancoAtivo")})
public class Banco implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BANCO_ID")
    private Integer bancoId;
    @Basic(optional = false)
    @Column(name = "USUARIO_ID")
    private int usuarioId;
    @Basic(optional = false)
    @Column(name = "BANCO_NOME")
    private String bancoNome;
    @Column(name = "BANCO_SIGLA")
    private String bancoSigla;
    @Column(name = "BANCO_CODIGO")
    private String bancoCodigo;
    @Basic(optional = false)
    @Column(name = "BANCO_ATIVO")
    private Character bancoAtivo;

    public Banco() {
    }

    public Banco(Integer bancoId) {
        this.bancoId = bancoId;
    }

    public Banco(Integer bancoId, int usuarioId, String bancoNome, Character bancoAtivo) {
        this.bancoId = bancoId;
        this.usuarioId = usuarioId;
        this.bancoNome = bancoNome;
        this.bancoAtivo = bancoAtivo;
    }

    public Integer getBancoId() {
        return bancoId;
    }

    public void setBancoId(Integer bancoId) {
        Integer oldBancoId = this.bancoId;
        this.bancoId = bancoId;
        changeSupport.firePropertyChange("bancoId", oldBancoId, bancoId);
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        int oldUsuarioId = this.usuarioId;
        this.usuarioId = usuarioId;
        changeSupport.firePropertyChange("usuarioId", oldUsuarioId, usuarioId);
    }

    public String getBancoNome() {
        return bancoNome;
    }

    public void setBancoNome(String bancoNome) {
        String oldBancoNome = this.bancoNome;
        this.bancoNome = bancoNome;
        changeSupport.firePropertyChange("bancoNome", oldBancoNome, bancoNome);
    }

    public String getBancoSigla() {
        return bancoSigla;
    }

    public void setBancoSigla(String bancoSigla) {
        String oldBancoSigla = this.bancoSigla;
        this.bancoSigla = bancoSigla;
        changeSupport.firePropertyChange("bancoSigla", oldBancoSigla, bancoSigla);
    }

    public String getBancoCodigo() {
        return bancoCodigo;
    }

    public void setBancoCodigo(String bancoCodigo) {
        String oldBancoCodigo = this.bancoCodigo;
        this.bancoCodigo = bancoCodigo;
        changeSupport.firePropertyChange("bancoCodigo", oldBancoCodigo, bancoCodigo);
    }

    public Character getBancoAtivo() {
        return bancoAtivo;
    }

    public void setBancoAtivo(Character bancoAtivo) {
        Character oldBancoAtivo = this.bancoAtivo;
        this.bancoAtivo = bancoAtivo;
        changeSupport.firePropertyChange("bancoAtivo", oldBancoAtivo, bancoAtivo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bancoId != null ? bancoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.bancoId == null && other.bancoId != null) || (this.bancoId != null && !this.bancoId.equals(other.bancoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.financeiroPessoal1.view.Banco[ bancoId=" + bancoId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
