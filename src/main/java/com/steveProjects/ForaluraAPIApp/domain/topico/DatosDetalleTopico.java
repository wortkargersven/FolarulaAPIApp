package com.steveProjects.ForaluraAPIApp.domain.topico;

import com.steveProjects.ForaluraAPIApp.domain.curso.DatosRespuestaCurso;
import com.steveProjects.ForaluraAPIApp.domain.respuesta.DatosRegistroRespuesta;
import com.steveProjects.ForaluraAPIApp.domain.usuario.DatosRespuestaUsuario;

import java.time.LocalDateTime;
import java.util.List;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        DatosRespuestaCurso curso,
        Estado status,
        LocalDateTime fecha,
        DatosRespuestaUsuario autor,
        String mensaje,
        List<DatosRegistroRespuesta> respuestas

) {
}
