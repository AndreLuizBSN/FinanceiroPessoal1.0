/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financeiroPessoal1.view;

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
@Table(name = "receitadespesa", catalog = "financeirobasepc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Receitadespesa.findAll", query = "SELECT r FROM Receitadespesa r"),
    @NamedQuery(name = "Receitadespesa.findByRdId", query = "SELECT r FROM Receitadespesa r WHERE r.rdId = :rdId"),
    @NamedQuery(name = "Receitadespesa.findByRdCodico", query = "SELECT r FROM Receitadespesa r WHERE r.rdCodico = :rdCodico"),
    @NamedQuery(name = "Receitadespesa.findByUsuarioId", query = "SELECT r FROM Receitadespesa r WHERE r.usuarioId = :usuarioId"),
    @NamedQuery(name = "Receitadespesa.findByRdNome", query = "SELECT r FROM Receitadespesa r WHERE r.rdNome = :rdNome"),
    @NamedQuery(name = "Receitadespesa.findByRdReceitaDespesa", query = "SELECT r FROM Receitadespesa r WHERE r.rdReceitaDespesa = :rdReceitaDespesa"),
    @NamedQuery(name = "Receitadespesa.findByRdPai", query = "SELECT r FROM Receitadespesa r WHERE r.rdPai = :rdPai"),
    @NamedQuery(name = "Receitadespesa.findByRdGrupo", query = "SELECT r FROM Receitadespesa r WHERE r.rdGrupo = :rdGrupo"),
    @NamedQuery(name = "Receitadespesa.findByRdAtivo", query = "SELECT r FROM Receitadespesa r WHERE r.rdAtivo = :rdAtivo")})
public class Receitadespesa implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RD_ID")
    private Integer rdId;
    @Basic(optional = false)
    @Column(name = "RD_CODICO")
    private String rdCodico;
    @Basic(optional = false)
    @Column(name = "USUARIO_ID")
    private int usuarioId;
    @Basic(optional = false)
    @Column(name = "RD_NOME")
    private String rdNome;
    @Basic(optional = false)
    @Column(name = "RD_RECEITA_DESPESA")
    private Character rdReceitaDespesa;
    @Column(name = "RD_PAI")
    private Integer rdPai;
    @Basic(optional = false)
    @Column(name = "RD_GRUPO")
    private Character rdGrupo;
    @Basic(optional = false)
    @Column(name = "RD_ATIVO")
    private Character rdAtivo;

    public Receitadespesa() {
    }

    public Receitadespesa(Integer rdId) {
        this.rdId = rdId;
    }

    public Receitadespesa(Integer rdId, String rdCodico, int usuarioId, String rdNome, Character rdReceitaDespesa, Character rdGrupo, Character rdAtivo) {
        this.rdId = rdId;
        this.rdCodico = rdCodico;
        this.usuarioId = usuarioId;
        this.rdNome = rdNome;
        this.rdReceitaDespesa = rdReceitaDespesa;
        this.rdGrupo = rdGrupo;
        this.rdAtivo = rdAtivo;
    }

    public Integer getRdId() {
        return rdId;
    }

    public void setRdId(Integer rdId) {
        Integer oldRdId = this.rdId;
        this.rdId = rdId;
        changeSupport.firePropertyChange("rdId", oldRdId, rdId);
    }

    public String getRdCodico() {
        return rdCodico;
    }

    public void setRdCodico(String rdCodico) {
        String oldRdCodico = this.rdCodico;
        this.rdCodico = rdCodico;
        changeSupport.firePropertyChange("rdCodico", oldRdCodico, rdCodico);
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        int oldUsuarioId = this.usuarioId;
        this.usuarioId = usuarioId;
        changeSupport.firePropertyChange("usuarioId", oldUsuarioId, usuarioId);
    }

    public String getRdNome() {
        return rdNome;
    }

    public void setRdNome(String rdNome) {
        String oldRdNome = this.rdNome;
        this.rdNome = rdNome;
        changeSupport.firePropertyChange("rdNome", oldRdNome, rdNome);
    }

    public Character getRdReceitaDespesa() {
        return rdReceitaDespesa;
    }

    public void setRdReceitaDespesa(Character rdReceitaDespesa) {
        Character oldRdReceitaDespesa = this.rdReceitaDespesa;
        this.rdReceitaDespesa = rdReceitaDespesa;
        changeSupport.firePropertyChange("rdReceitaDespesa", oldRdReceitaDespesa, rdReceitaDespesa);
    }

    public Integer getRdPai() {
        return rdPai;
    }

    public void setRdPai(Integer rdPai) {
        Integer oldRdPai = this.rdPai;
        this.rdPai = rdPai;
        changeSupport.firePropertyChange("rdPai", oldRdPai, rdPai);
    }

    public Character getRdGrupo() {
        return rdGrupo;
    }

    public void setRdGrupo(Character rdGrupo) {
        Character oldRdGrupo = this.rdGrupo;
        this.rdGrupo = rdGrupo;
        changeSupport.firePropertyChange("rdGrupo", oldRdGrupo, rdGrupo);
    }

    public Character getRdAtivo() {
        return rdAtivo;
    }

    public void setRdAtivo(Character rdAtivo) {
        Character oldRdAtivo = this.rdAtivo;
        this.rdAtivo = rdAtivo;
        changeSupport.firePropertyChange("rdAtivo", oldRdAtivo, rdAtivo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rdId != null ? rdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receitadespesa)) {
            return false;
        }
        Receitadespesa other = (Receitadespesa) object;
        if ((this.rdId == null && other.rdId != null) || (this.rdId != null && !this.rdId.equals(other.rdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.financeiroPessoal1.view.Receitadespesa[ rdId=" + rdId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
