package eci.ieti.data;

import eci.ieti.data.model.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface TodoRepository extends CrudRepository<Todo, String> {

    Page<Todo> findByDescriptionContaining(String description, Pageable pageable);

    Page<Todo> findByResponsible(String responsible, Pageable pageable);

    Page<Todo> findByDueDateBetween(Date startDate, Date finishDate, Pageable pageable);

    Page<Todo> findByResponsibleAndPriorityGreaterThan(String responsible, String priority, Pageable pageable);
}
