package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

//Author my entity, Long is my ID from author
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
