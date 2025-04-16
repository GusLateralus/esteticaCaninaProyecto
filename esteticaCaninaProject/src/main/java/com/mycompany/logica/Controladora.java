
package com.mycompany.logica;

import com.mycompany.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    // Se crea una controladora de persistencia que manda a llamar a la capa de persistencia
    // Y esa controladora puede delegar a cualquiera de los JPAControllers de cada una de las clases
    // según corresponda.
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String observaciones, String alergico, String atencionEsp, 
            String nombreDuenio, String celDuenio) {
        
        // Creamos al dueño y le asignamos los valores obtenidos desde la GUI:
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celDuenio);
        
        // Ahora, creamos a la mascota y asignamos sus valores:
        Mascota masco = new Mascota();
        masco.setNombre_perro(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencionEsp);
        masco.setUnDuenio(duenio);
        
        
        
        controladoraPersis.guardar(duenio, masco);
        
        
    }

    public List<Mascota> traerMascotas() {
        return controladoraPersis.traerMascotas();
                
                
                
    }

    public void borrarMascota(int num_cliente) {
        controladoraPersis.borrarMascota(num_cliente);
    }

    public void editarMascota(int num_cliente) {
        
    }
    
}
