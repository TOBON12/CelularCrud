package co.edu.uceva.celular.model.entities;

import jdk.jfr.DataAmount;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy = GeerationType.IDENTY)
    private long id;
    private String marca;
    private int almacenamiento;
}
