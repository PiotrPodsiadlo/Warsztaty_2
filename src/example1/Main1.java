package example1;

import example1.dao.UserDao;

public class Main1 {

    public static void main(String[] args) {

//        User user = new User();

//        user.setEmail("dupa1@wp.pl");
//        user.setPassword("dupa1234");
//        user.setUserName("tomek1");

        UserDao userDao = new UserDao();

//        userDao.create(user);
        User user = userDao.read(1);
        user.hashPassword(user.getPassword());
        userDao.update(user);


    }
}
