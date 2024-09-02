package co.edu.uceva.celular.controller;

import co.edu.uceva.celular.model.entities.Celular;
import co.edu.uceva.celular.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase es el controlador de la entidad Pais y se mapea con la url /api/v1/country-service
 * y se encarga de exponer los servicios rest de la entidad Pais para realizar las operaciones CRUD
 * de la entidad Pais. Se encarga de recibir las peticiones http y retornar las respuestas http.
 */
@RestController
@RequestMapping("/api/v1/celular")

public class CelularRestController {
    @Autowired
    private CelularServiceImpl celularService; // Inyecto el servicio de la entidad Celular para realizar las operaciones CRUD

    /**
     * Este metodo se encarga de retornar una lista de todos los celulares
     * @return retorna una lista de todos los celulares
     */
    @GetMapping("/celulares")
    public List<Celular> listar() {
        return this.celularService.listar();
    }

    /**
     * Este metodo se encarga de retornar un pais por su id y se mapea con la url /api/pais-service/celulares/{id}
     * @param id es el id del celular a buscar
     * @return retorna un celular por su id
     */
    @GetMapping("/celulares/{id}")
    public Celular buscarCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    /**
     * Este metodo guarda un pais y me retorna el objeto de tipo Celular ya guardado con su id asignado
     * @param celular es el objeto de tipo Celular a guardar (sin el id)
     * @return retorna el objeto de tipo Celular guardado con su id asignado
     */
    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este metodo actualiza un celular y me retorna el objeto de tipo Celular ya actualizado
     * @param celular es el objeto de tipo Celular a actualizar (con el id)
     * @return retorna el objeto de tipo Celular actualizado
     */
    @PutMapping("/celular")
    public Celular actualizarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este metodo elimina un celular por su id
     * @param id es el id del celular a eliminar
     */
    @DeleteMapping("/celulares/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id); // Encuentro un celular por su id
        this.celularService.delete(celular);
    }
}
