package q1.repository;


import org.springframework.data.repository.CrudRepository;

import q1.model.emploee;

public interface repo extends CrudRepository<emploee, Long> {

}
