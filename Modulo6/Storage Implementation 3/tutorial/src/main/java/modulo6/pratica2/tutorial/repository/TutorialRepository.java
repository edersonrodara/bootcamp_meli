package modulo6.pratica2.tutorial.repository;

import modulo6.pratica2.tutorial.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findBySituacao(String situacao);

    @Query("select t from Tutorial t where t.titulo like %:titulo%")
    List<Tutorial> findByWordInTitulo(String titulo);

}
