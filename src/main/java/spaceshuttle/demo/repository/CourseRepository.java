package spaceshuttle.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import spaceshuttle.demo.model.Course;

import java.util.Collection;


public interface CourseRepository extends JpaRepository<Course, Long> {

    Collection<Course> findByName(@Param("name") String name);
}
