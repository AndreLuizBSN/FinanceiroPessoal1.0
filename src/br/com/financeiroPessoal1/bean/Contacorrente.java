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
@Table(name = "contacorrente", catalog = "financeirobasepc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Contacorrente.findAll", query = "SELECT c FROM Contacorrente c"),
    @NamedQuery(name = "Contacorrente.findByCcId", query = "SELECT c FROM Contacorrente c WHERE c.ccId = :ccId"),
    @NamedQuery(name = "Contacorrente.findByUsuarioId", query = "SELECT c FROM Contacorrente c WHERE c.usuarioId = :usuarioId"),
    @NamedQuery(name = "Contacorrente.findByBancoId", query = "SELECT c FROM Contacorrente c WHERE c.bancoId = :bancoId"),
    @NamedQuery(name = "Contacorrente.findByCcAgencia", query = "SELECT c FROM Contacorrente c WHERE c.ccAgencia = :ccAgencia"),
    @NamedQuery(name = "Contacorrente.findByCcConta", query = "SELECT c FROM Contacorrente c WHERE c.ccConta = :ccConta"),
    @NamedQuery(name = "Contacorrente.findByCcTitular", query = "SELECT c FROM Contacorrente c WHERE c.ccTitular = :ccTitular"),
    @NamedQuery(name = "Contacorrente.findByCcAtivo", query = "SELECT c FROM Contacorrente c WHERE c.ccAtivo = :ccAtivo")})
public class Contacorrente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CC_ID")
    private Integer ccId;
    @Basic(optional = false)
    @Column(name = "USUARIO_ID")
    private int usuarioId;
    @Basic(optional = false)
    @Column(name = "BANCO_ID")
    private int bancoId;
    @Column(name = "CC_AGENCIA")
    private Integer ccAgencia;
    @Column(name = "CC_CONTA")
    private Integer ccConta;
    @Column(name = "CC_TITULAR")
    private String ccTitular;
    @Basic(optional = false)
    @Column(name = "CC_ATIVO")
    private Character ccAtivo;

    public Contacorrente() {
    }

    public Contacorrente(Integer ccId) {
        this.ccId = ccId;
    }

    public Contacorrente(Integer ccId, int usuarioId, int bancoId, Character ccAtivo) {
        this.ccId = ccId;
        this.usuarioId = usuarioId;
        this.bancoId = bancoId;
        this.ccAtivo = ccAtivo;
    }

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        Integer oldCcId = this.ccId;
        this.ccId = ccId;
        changeSupport.firePropertyChange("ccId", oldCcId, ccId);
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        int oldUsuarioId = this.usuarioId;
        this.usuarioId = usuarioId;
        changeSupport.firePropertyChange("usuarioId", oldUsuarioId, usuarioId);
    }

    public int getBancoId() {
        return bancoId;
    }

    public void setBancoId(int bancoId) {
        int oldBancoId = this.bancoId;
        this.bancoId = bancoId;
        changeSupport.firePropertyChange("bancoId", oldBancoId, bancoId);
    }

    public Integer getCcAgencia() {
        return ccAgencia;
    }

    public void setCcAgencia(Integer ccAgencia) {
        Integer oldCcAgencia = this.ccAgencia;
        this.ccAgencia = ccAgencia;
        changeSupport.firePropertyChange("ccAgencia", oldCcAgencia, ccAgencia);
    }

    public Integer getCcConta() {
        return ccConta;
    }

    public void setCcConta(Integer ccConta) {
        Integer oldCcConta = this.ccConta;
        this.ccConta = ccConta;
        changeSupport.firePropertyChange("ccConta", oldCcConta, ccConta);
    }

    public String getCcTitular() {
        return ccTitular;
    }

    public void setCcTitular(String ccTitular) {
        String oldCcTitular = this.ccTitular;
        this.ccTitular = ccTitular;
        changeSupport.firePropertyChange("ccTitular", oldCcTitular, ccTitular);
    }

    public Character getCcAtivo() {
        return ccAtivo;
    }

    public void setCcAtivo(Character ccAtivo) {
        Character oldCcAtivo = this.ccAtivo;
        this.ccAtivo = ccAtivo;
        changeSupport.firePropertyChange("ccAtivo", oldCcAtivo, ccAtivo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ccId != null ? ccId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacorrente)) {
            return false;
        }
        Contacorrente other = (Contacorrente) object;
        if ((this.ccId == null && other.ccId != null) || (this.ccId != null && !this.ccId.equals(other.ccId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.financeiroPessoal1.view.Contacorrente[ ccId=" + ccId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
