package co.edu.uceva.celular.model.service;
import co.edu.uceva.celular.model.dao.CelularDao;
import co.edu.uceva.celular.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CelularServiceImpl implements ICelularService {
    @Autowired
    CelularDao celularDao;

    /**
     * Este metodo se encarga de listar los celulares
     * @return retorna una lista de celulares
     */
    @Override
    public List<Celular> listar() {
        return (List<Celular>) celularDao.findAll();
    }

    /**
     * Este metodo se encarga de eliminar un celular
     * @param celular celular a eliminar
     */
    @Override
    public void delete(Celular celular) {
        celularDao.delete(celular);
    }

    /**
     * Este metodo se encarga de guardar un celular
     * @param celular celular a guardar
     * @return retorna el objeto celular guardado incluyendo el id
     */
    @Override
    public Celular save(Celular celular) {
        return celularDao.save(celular);
    }

    /**
     * Este metodo se encarga de buscar un celular por su id
     * @param id id del celular a buscar
     * @return retorna un celular por su id
     */
    @Override
    public Celular findById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    /**
     * Este metodo se encarga de actualizar un celular
     * @param celular celular a actualizar
     * @return retorna el objeto celular actualizado
     */
    @Override
    public Celular update(Celular celular) {
        return celularDao.save(celular);
    }
}
