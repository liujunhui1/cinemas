package cn.junhui.cinemas.daoimpl;

import cn.junhui.cinemas.bean.User;
import cn.junhui.cinemas.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 军辉
 * 2018-12-15 17:05
 */
public class UserDaoImpl implements IUserDao {
    @Autowired
    private IUserDao userDao;

    @Override
    public Integer insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public Integer deleteUser(String email) {
        return null;
    }

    @Override
    public User selectUserByEmail(String email) {
        return null;
    }

    @Override
    public Integer updateUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }
}
