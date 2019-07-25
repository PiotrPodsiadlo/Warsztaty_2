package example1;

import example1.dao.ExerciseDao;
import example1.dao.GroupDao;
import example1.dao.SolutionDao;
import example1.dao.UserDao;
import example1.model.Group;
import example1.model.Solution;
import example1.serviceClasses.InputInt;
import example1.serviceClasses.InputText;

import static java.time.LocalDate.now;

public class AddingSolutions5 {
    public static void main(String[] args) {

        for (String s:
             args) {
            System.out.println("przekazano argument: " + s );
        }
        int userId = Integer.parseInt(args[0]);


        GroupDao groupDao = new GroupDao();
        SolutionDao solutionDao = new SolutionDao();
        ExerciseDao exerciseDao = new ExerciseDao();
        UserDao userDao = new UserDao();
        String prompt = "Wybierz jedną z opcji:\n" +
                "\n" +
                "    add – dodawanie rozwiązania,\n" +
                "    view – przeglądanie swoich rozwiązań.";

        while(true) {
            String userChoice = InputText.textFromconsole(prompt);
            switch (userChoice) {
                case "add":
                    for (Solution s : solutionDao.findAllbyUserId(userId)
                         ) {
                        if(s.getDescription() == null) {
                            System.out.println(s);
                        }
                    }
                    Solution solution = new Solution(now().toString(), InputInt.intFromConsole("podaj id zadania do ktorego chcesz dodać rozwiązanie"), InputText.textFromconsole("wpisz rozwiazanie"),  userId);
                    solutionDao.create(solution);
                    System.out.println("utworzono rozwiązanie do podanego ćwiczenia");
                    break;

                case "view":
                    for (Solution s : solutionDao.findAllbyUserId(userId)
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
