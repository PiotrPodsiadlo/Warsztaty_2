package example1;

import example1.dao.UserDao;
import example1.model.User;

public class Main1 {

    public static void main(String[] args) {

//        User user = new User();
//        user.setEmail("janek@wp.pl");
//        user.setPassword("dupa1234");
//        user.hashPassword(user.getPassword());
//        user.setUserName("janek1");

        UserDao userDao = new UserDao();

//        userDao.create(user);
//        System.out.println(user.getId());
//        User user = userDao.read(1);
//        user.hashPassword(user.getPassword());
//        userDao.update(user);

//        userDao.delete(3);
        User[] users = userDao.findAll();
        for (User u: users
             ) {
            System.out.println(u.toString());
        }


    }
}
