package porcel.financieraFamiliar.entities.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import porcel.financieraFamiliar.entities.Persistente;

import java.util.Enumeration;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario extends Persistente {

    @Column(name = "nickname", nullable = false, unique = true, columnDefinition = "VARCHAR(50)")
    private String nickname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo;

    @Column(name="activo", nullable = false)
    private boolean activo;
}
