package porcel.financieraFamiliar.DTOs.login;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequestDTO {
    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String nickname;
    @NotBlank(message = "La contraseña es obligatoria")
    private String password;

}
