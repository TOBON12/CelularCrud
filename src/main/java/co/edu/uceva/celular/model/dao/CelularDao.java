package co.edu.uceva.celular.model.dao;

import co.edu.uceva.celular.model.entities.Celular;
import co.edu.uceva.celular.model.service.CelularServiceImpl;
import org.springframework.data.repository.CrudRepository;

public interface CelularDao extends CrudRepository<Celular , Long> {
}
