package ar.edu.unju.edm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.edm.modelo.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{
	
	@Query("from Usuario e order by e.nombreUsuario")
	public List<Usuario> obtenerUsuarios();
	Usuario findByNombreUsuario(String nombre);
	
}