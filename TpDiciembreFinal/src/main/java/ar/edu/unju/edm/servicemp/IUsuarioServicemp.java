package ar.edu.unju.edm.servicemp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IUsuarioRepository;
import ar.edu.unju.edm.services.IUsuarioService;

@Service
public class IUsuarioServicemp implements IUsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    @Override
    public void guardarUsuario(Usuario usuario) {
        //---------------- CORREGIR ERRORES-------
        // String pass = usuario.getPassword();
        // BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        // usuario.setPassword(bCryptPasswordEncoder.encode(pass));
        // IUsuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> buscarTodosUsuarios() {
        return iUsuarioRepository.obtenerUsuario();
    }

    @Override
    public Usuario cambiarUsuario(Usuario usuario) throws Exception {
        Usuario uGuardar = buscarUsuario(usuario.getIdUser());
        bUsuario(usuario,uGuardar);
        return iUsuarioRepository.save(uGuardar);
    }

    @Override
    public void eliminarUsuario(long id) {
        iUsuarioRepository.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(long id) throws Exception {
        return iUsuarioRepository.findById(id).orElseThrow(()-> new Exception("El usuario no existe"));
    }

    public void bUsuario(Usuario desde, Usuario hasta){
        hasta.setTrueName(desde.getTrueName());
        hasta.setTrueSurname(desde.getTrueSurname());
        hasta.setNameUser(desde.getNameUser());
        hasta.setTipeUser(desde.getTipeUser());
    }

}