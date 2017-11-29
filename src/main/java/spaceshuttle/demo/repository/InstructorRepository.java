package spaceshuttle.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spaceshuttle.demo.model.Instructor;

interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
