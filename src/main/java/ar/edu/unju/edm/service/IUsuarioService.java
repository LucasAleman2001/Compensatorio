package ar.edu.unju.edm.service;

import java.util.List;

import ar.edu.unju.edm.modelo.Usuario;

public interface IUsuarioService {
	
	public void guardarUsuario(Usuario usuario);
	public List<Usuario> obtenerUsuarios();
	public void eliminarUsuario(Long idUsuario);
	public Usuario buscarUsuarioPorNombre(String nombre);
	
}