package modulo6.pratica2.tutorial.service;

import modulo6.pratica2.tutorial.entity.Tutorial;

public interface ITutorialService {
    public String create(Tutorial tutorial);

    public void findAll();

    public void findById(Tutorial tutorial);

    public Tutorial edit(Tutorial tutorial);

    public void delete(Tutorial tutorial);
}
