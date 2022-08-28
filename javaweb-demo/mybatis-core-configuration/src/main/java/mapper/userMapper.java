package mapper;

import pojo.User;

import java.util.List;

public interface userMapper {
    List<User> selectall();
    User selectid(int user_id);
}
