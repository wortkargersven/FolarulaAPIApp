package com.steveProjects.ForaluraAPIApp.domain.usuario;

public record DatosAutenticacionUser(
        String email,
        String clave
) {
    public DatosAutenticacionUser(Usuario usuario){
        this(usuario.getEmail(), usuario.getClave());
    }
}
