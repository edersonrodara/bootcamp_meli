package modulo6.pratica2.tutorial.service;

import modulo6.pratica2.tutorial.entity.Tutorial;
import modulo6.pratica2.tutorial.repository.TutorialRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TutorialService {

    private final TutorialRepository tutorialRepository;

    public TutorialService(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    @Transactional
    public void save(Tutorial tutorial) {
        tutorialRepository.save(tutorial);
    }

    public void edit(Long id, Tutorial editTutorial) {
        Tutorial tutorial = findById(id);

        if (editTutorial.getTitulo() != null && !editTutorial.getTitulo().isEmpty()) {
            tutorial.setTitulo(editTutorial.getTitulo());
        }
        if (editTutorial.getDescricao() != null && !editTutorial.getDescricao().isEmpty()) {
            tutorial.setDescricao(editTutorial.getDescricao());
        }
        if (editTutorial.getSituacao() != null && !editTutorial.getSituacao().isEmpty()) {
            tutorial.setSituacao(editTutorial.getSituacao());
        }

        tutorialRepository.save(tutorial);
    }

    @Transactional(readOnly = true) // quando for fazer apenas leitura, colocar readOnly true
    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Tutorial findById(Long id) {
        return tutorialRepository.findById(id).orElse(null);
    }

    @Transactional
    public void delete(Long id) {
        tutorialRepository.deleteById(id);
    }

    @Transactional
    public String deleteAll() {
        tutorialRepository.deleteAll();
        return "Todos os tutoriais deletado!";
    }

    @Transactional(readOnly = true) // quando for fazer apenas leitura, colocar readOnly true
    public List<Tutorial> findBySituacao (String situacao) {
        return tutorialRepository.findBySituacao(situacao);
    }

    @Transactional(readOnly = true)
    public List<Tutorial> findByWordInTitulo (String titulo) {
            List<Tutorial> byTituloContaining = tutorialRepository.findByWordInTitulo(titulo);
            return byTituloContaining;
    }

}
