package ar.edu.unju.edm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;

@Service
public interface IUsuarioService {
    
    public void guardarUsuario(Usuario usuario);
    public List<Usuario> buscarTodosUsuarios();
    public Usuario cambiarUsuario(Usuario usuario) throws Exception;
    public void eliminarUsuario(long id);
    public Usuario buscarUsuario(long id) throws Exception;
}
