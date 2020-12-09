package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	Usuario usuario;
	
	@GetMapping("/guardarUsuario")
	public String guardarUsuario(@ModelAttribute Usuario usuario, Model model) {
		usuario.setApellido(usuario.getApellido());
		usuario.setNombre(usuario.getNombre());
		usuario.setUser(usuario.getUser());
		usuario.setPassword(usuario.getPassword());
		usuario.setDni(usuario.getDni());
		usuario.setGenero(usuario.getGenero());
		usuarioService.guardarUsuario(usuario);
		return "redirect:/usuario";
	}
	
	@GetMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(Model model, @PathVariable(name="id") Long idUsuario) throws Exception {
		try {
			usuarioService.eliminarUsuario(idUsuario);
		}catch (Exception e) {
			model.addAttribute("listErrorMessage", e.getMessage());
		}
		return "redirect:/usuario";
	}

}
