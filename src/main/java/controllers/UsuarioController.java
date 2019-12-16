package controllers;

import ejbs.UsuarioFacadeLocal;
import entities.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "usuarioController")
@ViewScoped
public class UsuarioController implements Serializable{

    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    private Usuario usuario;
    private String mensaje;

    public UsuarioController() {
    }
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String iniciarSesion(){
        // Aqui iran los llamados Ejb para el login
        return "modulos?faces-redirect=true";
    }
    
}
