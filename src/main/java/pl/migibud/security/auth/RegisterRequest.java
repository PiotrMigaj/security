package pl.migibud.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
