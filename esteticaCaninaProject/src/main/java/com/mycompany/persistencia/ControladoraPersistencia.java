package com.mycompany.persistencia;

import com.mycompany.logica.Duenio;
import com.mycompany.logica.Mascota;

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
    
}
