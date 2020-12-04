package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.services.IHabitacionService;

@Controller
@RequestMapping
public class HabitacionController {
    @Autowired
    IHabitacionService roomService;

    @GetMapping("/agregarHabitacion")
    public String agragarHabitacion(Model model){
        model.addAttribute("habitacion", new Habitacion());
        return "registroHabitacion";
    }

    @PostMapping("/guardarHabitacion")
    public String gusrdarRoom(@ModelAttribute Habitacion room, Model model){
            roomService.guardarRoom(room);
            return "redirect:/agregarHabitacion";
    }

    @GetMapping("/habitacion")
    public String mostrarHabitacion(Model model){
        model.addAttribute("habitaciones", roomService.buscarAllRooms());
        return "habitacion";
    }

    @GetMapping("/agregarHabitacion/volver")
    public String anularHabitacion(ModelMap model){
        return "redirect:/agregarReservaHabitacion";
    }
}
