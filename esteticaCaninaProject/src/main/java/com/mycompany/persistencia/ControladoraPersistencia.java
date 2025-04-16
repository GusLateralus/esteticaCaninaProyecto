package com.mycompany.persistencia;

import com.mycompany.logica.Duenio;
import com.mycompany.logica.Mascota;
import com.mycompany.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    // Instanciamos las controladoras de persistencia de cada clase para posteriormente
    // hacer el CRUD
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        // Crear en la DB el dueño
        duenioJpa.create(duenio);
        
        // Crear en la DB la mascota
        mascotaJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        
        return mascotaJpa.findMascotaEntities(); // Busca todos los registros.
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
