package example1;

import example1.dao.UserDao;
import example1.model.User;
import example1.serviceClasses.InputInt;
import example1.serviceClasses.InputText;

import java.util.Scanner;

public class UserManagement1 {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        User[] users = userDao.findAll();
        for (User u : users
             ) {
            System.out.println(u);

        }
        String prompt = "\"Wybierz jedną z opcji:\n" +
                "\n" +
                "    add – dodanie użytkownika,\n" +
                "    edit – edycja użytkownika,\n" +
                "    delete – usunięcie użytkownika,\n" +
                "    quit – zakończenie programu.\"\n";

        while(true) {
            String userChoice = InputText.textFromconsole(prompt);
            switch (userChoice) {
                case "add":
                    String name = InputText.textFromconsole("podaj nazwę użytkownika");
                    String email = InputText.textFromconsole("podaj email użytkownika");
                    String password = InputText.textFromconsole("podaj hasło użytkownika");
                    User user = new User(name, email, password);
                    user.hashPassword(password);
                    userDao.create(user);
                    System.out.println("utworzono użytkownika");
                    break;

                case "edit":
                    User userToEdit = userDao.read(InputInt.intFromConsole("podaj id uzytkownika do edycji"));
                    System.out.println(userToEdit);
                    userToEdit.setUserName(InputText.textFromconsole("podaj nową nazwę użytkownika"));
                    userToEdit.setEmail(InputText.textFromconsole("podaj nowy email użytkownika"));
                    userToEdit.setPassword(InputText.textFromconsole("podaj hasło użytkownika"));
                    userToEdit.hashPassword(userToEdit.getPassword());
                    userDao.update(userToEdit);
                    System.out.println("zaktualizowano uzytkownika");
                    break;

                case "delete":
                    userDao.delete(InputInt.intFromConsole("podaj id użytkownika do usunięcia"));
                    System.out.println("usunięto uzytkownika o podanym id");
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
