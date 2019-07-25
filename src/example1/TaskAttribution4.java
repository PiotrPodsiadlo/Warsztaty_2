package example1;

import example1.dao.ExerciseDao;
import example1.dao.GroupDao;
import example1.dao.SolutionDao;
import example1.dao.UserDao;
import example1.model.Exercise;
import example1.model.Group;
import example1.model.Solution;
import example1.model.User;
import example1.serviceClasses.InputInt;
import example1.serviceClasses.InputText;

public class TaskAttribution4 {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        ExerciseDao exerciseDao = new ExerciseDao();
        SolutionDao solutionDao = new SolutionDao();
        String prompt = "Wybierz jedną z opcji:\n" +
                "\n" +
                "    add – przypisywanie zadań do użytkowników,\n" +
                "    view – przeglądanie rozwiązań danego użytkownika,\n" +
                "    quit – zakończenie programu.";

        while(true) {
            String userChoice = InputText.textFromconsole(prompt);
            switch (userChoice) {
                case "add":
                    for (User u: userDao.findAll()) {
                        System.out.println(u);
                    }
                    int userId = InputInt.intFromConsole("podaj id uzytkownika");
                    for (Exercise e: exerciseDao.findAll()) {
                        System.out.println(e);
                    }
                    int exerciseId = InputInt.intFromConsole("podaj id zadania");
                    Solution solution = new Solution();
                    solution.setUsersId(userId);
                    solution.setExerciseId(exerciseId);
                    solutionDao.create(solution);
                    System.out.println("przypisano zadanie uzytkownikowi");
                    break;

                case "view":

                    for (Solution s: solutionDao.findAllbyUserId(InputInt.intFromConsole("podaj id uzytkownika, którego rozwiązania chcesz zobaczyć"))
                         ) {
                        System.out.println(s);
                    }
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
