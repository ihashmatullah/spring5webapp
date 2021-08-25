package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 10:55 PM on Aug 24, 2021
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
