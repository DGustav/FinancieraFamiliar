package porcel.financieraFamiliar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import porcel.financieraFamiliar.entities.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
