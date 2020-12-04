package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.services.IUsuarioService;

@Controller
@RequestMapping
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;
    @Autowired
    private Usuario unUsuario;
    @GetMapping("/agregarUsuario")
    public String agregarUsuario(Model model){
        model.addAttribute("usuarioU", unUsuario);
        return "registroUsuario";
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario, Model model){
        usuarioService.guardarUsuario(usuario);;
        model.addAttribute("usuarioU", unUsuario);
        return "redirect:/usuario";
    }

    @GetMapping("/usuario")
    public String mostrarUsario(Model model){
        model.addAttribute("usuarios", usuarioService.buscarTodosUsuarios());
        return "usuario";
    }

    @GetMapping("/cambiarUsuario/{id}")
    public String conseguirUsuario(Model model, @PathVariable(name="id") long id) throws Exception{
        Usuario uEncontrado = usuarioService.buscarUsuario(id);
        model.addAttribute("usuarioU", uEncontrado);
        model.addAttribute("editMode", "true");
        return "registrado";
    }

    @PostMapping("/cambiarUsuario")
    public String postCambiarUsuario(@ModelAttribute("usuarioU") Usuario usuario, BindingResult result, ModelMap model){
        if(result.hasErrors()){
            model.addAttribute("usuarioU", usuario);
            model.addAttribute("editMode", "true");
        }
        else{
            try{
                System.out.println(unUsuario.getIdUser());
                usuarioService.cambiarUsuario(usuario);
                model.addAttribute("usuarioU", unUsuario);
                model.addAttribute("editMode", "true");
            }catch(Exception e){
                model.addAttribute("formUsuarioErrorMassage",e.getMessage());
                model.addAttribute("userForm", usuario);
                model.addAttribute("editMode", "true");
            }
        }
        model.addAttribute("usuarios", usuarioService.buscarTodosUsuarios());
        return "redirect:/usuario";
    }

    @GetMapping("/borrarUsuario/{id}")
    public String eliminarUsuario(Model model, @PathVariable(name="id") long id){
        try{
            usuarioService.eliminarUsuario(id);
        }
        catch(Exception e){
            model.addAttribute("listErrorMessage", e.getMessage());
        }
        return "redirect:/usuario";
    }

    @GetMapping("/cancelar")
    public String noCambiarUsuario(ModelMap model){
        return "redirect:/usuario";
    }
    
}
