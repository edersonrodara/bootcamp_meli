package modulo6.pratica2.tutorial.controller;

import modulo6.pratica2.tutorial.entity.Tutorial;
import modulo6.pratica2.tutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class TutorialController {

    @Autowired
    private TutorialService tutorialService;

    @PostMapping("/tutorials")
    public String create(@RequestBody Tutorial tutorial) {
        tutorialService.save(tutorial);
        return "Criado com sucesso.";
    }

    @PutMapping("/tutorials/{id}")
    public Tutorial edit(@PathVariable Long id,
                         @RequestBody Tutorial editTutorial) {

        tutorialService.edit(id, editTutorial);

        return tutorialService.findById(id);
    }

    @GetMapping("/tutorials/{id}")
    public Tutorial findById(@PathVariable Long id) {
        return tutorialService.findById(id);
    }

    @GetMapping("/tutorials/search")
    public List<Tutorial> findByWordInTitle(@RequestParam String titulo) {
        return tutorialService.findByWordInTitulo(titulo);
    }

    @GetMapping("/tutorials/published")
    public List<Tutorial> findBySituacao () {
        return tutorialService.findBySituacao("published");
    }

    @GetMapping("/tutorials")
    public List<Tutorial> getAll() {
        List<Tutorial> allTutorial = tutorialService.findAll();
        return allTutorial;
    }

    @DeleteMapping("/tutorials/{id}")
    public String deleteById (@PathVariable Long id) {
        tutorialService.delete(id);

        return "Deletado com sucesso.";
    }

    @DeleteMapping("/tutorials")
    public String deleteAll () {
        tutorialService.deleteAll();
        return "Banco esvaziado";
    }

}
