package spaceshuttle.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spaceshuttle.demo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
