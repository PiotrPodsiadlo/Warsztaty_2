package example1;

import example1.dao.GroupDao;
import example1.model.Group;
import example1.serviceClasses.InputInt;
import example1.serviceClasses.InputText;

public class TaskAttribution4 {

    public static void main(String[] args) {

        GroupDao groupDao = new GroupDao();
        String prompt = "Wybierz jedną z opcji:\n" +
                "\n" +
                "    add – przypisywanie zadań do użytkowników,\n" +
                "    view – przeglądanie rozwiązań danego użytkownika,\n" +
                "    quit – zakończenie programu.";

        while(true) {
            String userChoice = InputText.textFromconsole(prompt);
            switch (userChoice) {
                case "add":

                    break;

                case "view":

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
