package com.estudo.projetoweb.entities;

import java.io.Serializable;

public class User implements Serializable {

private static final long serialVersionUID = 1L;
private Long Id;
private String Name;
private String email;
private String phone;
private String password;

public User() {
}

public User(Long id, String name, String email, String phone, String password) {
    this.Id = id;
    this.Name = name;
    this.email = email;
    this.phone = phone;
    this.password = password;
}

public Long getId() {
    return Id;

}

public String getName() {
    return Name;
}

public String getEmail() {
    return email;
}

public String getPhone() {
    return phone;
}

public String getPassword() {
    return password;
}

public void setId(Long id) {
    Id = id;
}

public void setName(String name) {
    Name = name;
}

public void setEmail(String email) {
    this.email = email;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public void setPassword(String password) {
    this.password = password;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Id == null) ? 0 : Id.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    User other = (User) obj;
    if (Id == null) {
        if (other.Id != null)
            return false;
    } else if (!Id.equals(other.Id))
        return false;
    return true;
}

}