package proyecto.demo.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyecto.demo.entities.Customer;

@Controller
public class RCustomersController {

@GetMapping("/customers")
public String ObtenerVistaRegistro(@RequestParam(value="error", required = false) String error, Model model, Principal principal) {
	if (error != null) 
		model.addAttribute("error","Escribio algun dato incorrecto");
		model.addAttribute("Cliente", new Customer());
		
	return "views/registroClientes";
	}
	


@PostMapping("/Rclientes")
public String RegistroUsuario(@RequestParam(value="error", required = false) String error, Model model, Principal principal) {
	if (error != null) 
		model.addAttribute("error","Escribio algun dato incorrecto");
		
	return "views/index";
	}
	
	
}
