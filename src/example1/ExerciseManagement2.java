package example1;

import example1.dao.ExerciseDao;
import example1.model.Exercise;
import example1.serviceClasses.InputInt;
import example1.serviceClasses.InputText;

public class ExerciseManagement2 {
    public static void main(String[] args) {

        ExerciseDao exerciseDao = new ExerciseDao();
        String prompt = "Wybierz jedną z opcji:\n" +
                "\n" +
                "    add – dodanie zadania,\n" +
                "    edit – edycja zadania,\n" +
                "    delete – edycja zadania,\n" +
                "    quit – zakończenie programu";

        while(true) {
            String userChoice = InputText.textFromconsole(prompt);
            switch (userChoice) {
                case "add":
                    String title = InputText.textFromconsole("podaj tytuł cwiczenia");
                    String description = InputText.textFromconsole("podaj opis  użytkownika");
                    Exercise exercise = new Exercise(title, description);
                    exerciseDao.create(exercise);
                    System.out.println(exercise);
                    System.out.println("utworzono ćwiczenie");
                    break;

                case "edit":
                    Exercise exerciseToEdit = exerciseDao.read(InputInt.intFromConsole("podaj id uzytkownika do edycji"));
                    System.out.println(exerciseToEdit);
                    exerciseToEdit.setTitle(InputText.textFromconsole("podaj nową tytuł cwiczenia"));
                    exerciseToEdit.setDescription(InputText.textFromconsole("podaj nowy opis cwiczenia"));
                    exerciseDao.update(exerciseToEdit);
                    System.out.println(exerciseToEdit);
                    System.out.println("zaktualizowano uzytkownika");
                    break;

                case "delete":
                    exerciseDao.delete(InputInt.intFromConsole("podaj id ćwiczenia do usunięcia"));
                    System.out.println("usunięto cwiczenie o podanym id");
                    break;

                case "quit":
                    System.out.println("do widzenia");
                    break;

                default: {
                    System.out.println("nie mozna rozpoznac polecenia, wybierz jeszcze raz");
                }
            }
            if(userChoice.equals("quit")){
                break;
            }
        }












    }
}
