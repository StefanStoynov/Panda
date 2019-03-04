package panda.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "users")
public class User extends BaseEntity {

    private String username;
    private String password;
    private String email;
    private String role;

    public User() {
    }

    @Column(name = "username", nullable = false, unique = true, updatable = false)
    public String getUsername() {
        return this.username;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return this.password;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return this.email;
    }

    @Column(name = "role", nullable = false)
    public String getRole() {
        return this.role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
