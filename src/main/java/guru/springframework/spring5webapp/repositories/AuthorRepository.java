package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 10:50 PM on Aug 24, 2021
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
