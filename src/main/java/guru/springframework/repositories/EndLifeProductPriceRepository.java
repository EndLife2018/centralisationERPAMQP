package guru.springframework.repositories;
import guru.springframework.entities.EndlifeProductEntity;
import guru.springframework.entities.EndlifeProductPriceEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
public interface EndLifeProductPriceRepository extends CrudRepository<EndlifeProductPriceEntity, Long> {
}
