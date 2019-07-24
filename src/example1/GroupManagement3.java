package example1;

import example1.dao.GroupDao;
import example1.model.Group;
import example1.serviceClasses.InputInt;
import example1.serviceClasses.InputText;

public class GroupManagement3 {
    public static void main(String[] args) {

        GroupDao groupDao = new GroupDao();
        String prompt = "Wybierz jedną z opcji:\n" +
                "\n" +
                "    add – dodanie grupy,\n" +
                "    edit – edycja grupy,\n" +
                "    delete – edycja grupy,\n" +
                "    quit – zakończenie programu.";

        while(true) {
            String userChoice = InputText.textFromconsole(prompt);
            switch (userChoice) {
                case "add":
                    String name = InputText.textFromconsole("podaj nazwe grupy");
                    Group group = new Group(name);
                    groupDao.create(group);
                    System.out.println(group);
                    System.out.println("utworzono grupę");
                    break;

                case "edit":
                    Group groupToEdit = groupDao.read(InputInt.intFromConsole("podaj id grupy do edycji"));
                    System.out.println(groupToEdit);
                    groupToEdit.setName(InputText.textFromconsole("podaj nową nazwe grupy"));
                    groupDao.update(groupToEdit);
                    System.out.println(groupToEdit);
                    System.out.println("zaktualizowano grupę");
                    break;

                case "delete":
                    groupDao.delete(InputInt.intFromConsole("podaj id grupy do usunięcia"));
                    System.out.println("usunięto grupę o podanym id");
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
