package es.joseluisgs;

import controllers.PersonaController;
import models.Persona;
import repositories.PersonaRepository;

public class Main {
    public static void main(String[] args) {
        PersonaController personaController = new PersonaController(new PersonaRepository());
        Persona[] lista = personaController.findAll();

        for (Persona persona : lista) {
            if (persona.isSingle()) {
                System.out.println(persona + " está soltero/a");
            }
            System.out.println(persona);
        }
    }
}