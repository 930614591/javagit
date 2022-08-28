
import mapper.userMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*mapper代理开发*/

public class demo2 {
    public static void main(String[] args) throws IOException {
        //1.加载核心配置，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsiooin
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //3.执行sql
//        List<User> users = sqlSession.selectList("test.selectall");

        //3.1 获取代理接口对象
        userMapper usermapper =sqlSession.getMapper(userMapper.class);
        List<User> users = usermapper.selectall();
        User selectid = usermapper.selectid(3);
        System.out.println(selectid.toString());
        System.out.println(users);
        //4.关闭资源
        sqlSession.close();


    }
}
