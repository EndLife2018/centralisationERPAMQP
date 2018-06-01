package guru.springframework.repositories;

import guru.springframework.entities.EndlifeCategorieProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface EndLifeProductCategoryRepository extends CrudRepository<EndlifeCategorieProductEntity, Long> {
}
