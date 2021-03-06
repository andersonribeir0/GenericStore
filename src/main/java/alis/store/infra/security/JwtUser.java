package alis.store.infra.security;

import alis.store.domain.enums.EType;
import alis.store.domain.valueObjects.Document;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class JwtUser implements UserDetails{

    private static final long serialVersionUID = 2L;

    private final String id;
    private final String document;
    private final String password;
    private final Collection<? extends GrantedAuthority> authorities;

    public JwtUser(String id, String document, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.document = document;
        this.authorities = authorities;
        this.password = password;
    }

    @JsonIgnore
    public String getId() {
        return id;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @JsonIgnore
    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.document;
    }

    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
