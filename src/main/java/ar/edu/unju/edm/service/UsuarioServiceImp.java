package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.repository.IUsuarioDAO;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	IUsuarioDAO usuarioDAOimp;
	
	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioDAOimp.save(usuario);
	}

	@Override
	public List<Usuario> obtenerUsuarios() {
		System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjj"+usuarioDAOimp.obtenerUsuarios().get(0).getApellido());
		return usuarioDAOimp.obtenerUsuarios();
	}

	@Override
	public void eliminarUsuario(Long idUsuario) {
		usuarioDAOimp.deleteById(idUsuario);
	}

	@Override
	public Usuario buscarUsuarioPorNombre(String nombre) {
		return usuarioDAOimp.findByNombreUsuario(nombre);
	}

}
