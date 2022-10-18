package myWebApp.service;


import myWebApp.dao.UserDaoImpl;
import myWebApp.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(int id){
        return userDao.show(id);
    }

    @Override
    public void save(User user){
        userDao.save(user);
    }

    @Override
    public void update(int id, User updatedUser){
        userDao.update(id, updatedUser);
    }

    @Override
    public void delete(int id){
        userDao.delete(id);
    }

}
