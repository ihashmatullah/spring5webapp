package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 11:23 AM on Aug 26, 2021
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
