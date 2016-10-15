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
@Table(name = "usuario", catalog = "financeirobasepc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsuarioId", query = "SELECT u FROM Usuario u WHERE u.usuarioId = :usuarioId"),
    @NamedQuery(name = "Usuario.findByUsuarioNome", query = "SELECT u FROM Usuario u WHERE u.usuarioNome = :usuarioNome"),
    @NamedQuery(name = "Usuario.findByUsuarioLogin", query = "SELECT u FROM Usuario u WHERE u.usuarioLogin = :usuarioLogin"),
    @NamedQuery(name = "Usuario.findByUsuarioSenha", query = "SELECT u FROM Usuario u WHERE u.usuarioSenha = :usuarioSenha"),
    @NamedQuery(name = "Usuario.findByUsuarioAtivo", query = "SELECT u FROM Usuario u WHERE u.usuarioAtivo = :usuarioAtivo")})
public class Usuario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USUARIO_ID")
    private Integer usuarioId;
    @Basic(optional = false)
    @Column(name = "USUARIO_NOME")
    private String usuarioNome;
    @Basic(optional = false)
    @Column(name = "USUARIO_LOGIN")
    private String usuarioLogin;
    @Basic(optional = false)
    @Column(name = "USUARIO_SENHA")
    private String usuarioSenha;
    @Basic(optional = false)
    @Column(name = "USUARIO_ATIVO")
    private Character usuarioAtivo;

    public Usuario() {
    }

    public Usuario(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(Integer usuarioId, String usuarioNome, String usuarioLogin, String usuarioSenha, Character usuarioAtivo) {
        this.usuarioId = usuarioId;
        this.usuarioNome = usuarioNome;
        this.usuarioLogin = usuarioLogin;
        this.usuarioSenha = usuarioSenha;
        this.usuarioAtivo = usuarioAtivo;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        Integer oldUsuarioId = this.usuarioId;
        this.usuarioId = usuarioId;
        changeSupport.firePropertyChange("usuarioId", oldUsuarioId, usuarioId);
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        String oldUsuarioNome = this.usuarioNome;
        this.usuarioNome = usuarioNome;
        changeSupport.firePropertyChange("usuarioNome", oldUsuarioNome, usuarioNome);
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        String oldUsuarioLogin = this.usuarioLogin;
        this.usuarioLogin = usuarioLogin;
        changeSupport.firePropertyChange("usuarioLogin", oldUsuarioLogin, usuarioLogin);
    }

    public String getUsuarioSenha() {
        return usuarioSenha;
    }

    public void setUsuarioSenha(String usuarioSenha) {
        String oldUsuarioSenha = this.usuarioSenha;
        this.usuarioSenha = usuarioSenha;
        changeSupport.firePropertyChange("usuarioSenha", oldUsuarioSenha, usuarioSenha);
    }

    public Character getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(Character usuarioAtivo) {
        Character oldUsuarioAtivo = this.usuarioAtivo;
        this.usuarioAtivo = usuarioAtivo;
        changeSupport.firePropertyChange("usuarioAtivo", oldUsuarioAtivo, usuarioAtivo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.financeiroPessoal1.view.Usuario[ usuarioId=" + usuarioId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
