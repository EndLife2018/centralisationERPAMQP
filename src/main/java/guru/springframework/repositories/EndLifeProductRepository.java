package guru.springframework.repositories;
import guru.springframework.entities.EndlifeProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
public interface EndLifeProductRepository extends CrudRepository<EndlifeProductEntity, Long> {
    List<EndlifeProductEntity> findAllByTmsAfter(Date lastSync);

    EndlifeProductEntity findDistinctByRefEquals(String ref);
}
