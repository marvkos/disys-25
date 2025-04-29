package at.technikum.universityapp.repository;

import at.technikum.universityapp.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LectureRepository
        extends JpaRepository<Lecture, Integer>
{
    // @Query("SELECT ...")
    List<Lecture> findAllBefore(LocalDateTime localDateTime);
}
