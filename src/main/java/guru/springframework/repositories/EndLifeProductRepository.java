package guru.springframework.repositories;
import guru.springframework.entities.EndlifeProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 1/10/17.
 */
public interface EndLifeProductRepository extends CrudRepository<EndlifeProductEntity, Long> {
}
