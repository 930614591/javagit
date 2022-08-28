import mapper.leibieMapper;
import mapper.sjjMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.leibie;
import pojo.sjj;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mybatistest {
@Test
    public void testsjj() throws IOException {
    //1.加载核心配置，获取SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //2.获取sqlsiooin
    SqlSession sqlSession=sqlSessionFactory.openSession();

    //3.执行sql
//        List<User> users = sqlSession.selectList("test.selectall");

    //3.1 获取代理接口对象
    sjjMapper sjjMapper =sqlSession.getMapper(sjjMapper.class);

    //执行对应接口方法
    List<sjj> selectall = sjjMapper.selectall();
    pojo.sjj selectid = sjjMapper.selectid(11);
    //列出结果
    System.out.println(selectid.toString());
    System.out.println(selectall);
    //4.关闭资源
    sqlSession.close();
}

    @Test
    public void testduozhichaxun() throws IOException {
    int id=5;
    String 名称="其他";
        //1.加载核心配置，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsiooin
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //3.执行sql
//        List<User> users = sqlSession.selectList("test.selectall");

        //3.1 获取代理接口对象
        //执行对应接口方法
        //列出结果
        leibieMapper leibiemapper = sqlSession.getMapper(leibieMapper.class);
        leibie selectid = leibiemapper.selectid(id, 名称);
        System.out.println(selectid.toString());

        //4.关闭资源
        sqlSession.close();
    }

    @Test
    public void testduiciangcanshu1() throws IOException {
        int id=5;
        String 名称="其他";
        //1.加载核心配置，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsiooin
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //3.执行sql
//        List<User> users = sqlSession.selectList("test.selectall");

        //3.1 获取代理接口对象
        //执行对应接口方法
        //列出结果
        leibieMapper leibiemapper = sqlSession.getMapper(leibieMapper.class);
        leibie leibie=new leibie();
        leibie.setId(id);
        leibie.set名称(名称);
        List<leibie> selectid = leibiemapper.selectAllByIdLeibie(leibie);
        System.out.println(selectid.toString());

        //4.关闭资源
        sqlSession.close();
    }

    @Test
    public void testMap() throws IOException {
        int id=5;
        String 名称="其他";

        //1.加载核心配置，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsiooin
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //3.执行sql
//        List<User> users = sqlSession.selectList("test.selectall");

        //3.1 获取代理接口对象
        //执行对应接口方法
        //列出结果
        leibieMapper leibiemapper = sqlSession.getMapper(leibieMapper.class);
        Map map=new HashMap();
        map.put("id",5);
        map.put("名称",名称);
        leibie selectid = leibiemapper.selectAllByIdMap(map);
        System.out.println(selectid.toString());

        //4.关闭资源
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        int id=6;
        String 名称="克苏鲁";
        leibie leibie = new leibie();
        leibie.set名称(名称);
        leibie.setId(id);
        //1.加载核心配置，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsiooin
        SqlSession sqlSession=sqlSessionFactory.openSession();
//        SqlSession sqlSession=sqlSessionFactory.openSession(true);//自动提交事务

        //3.执行sql
//        List<User> users = sqlSession.selectList("test.selectall");

        //3.1 获取代理接口对象
        //执行对应接口方法
        leibieMapper mapper = sqlSession.getMapper(leibieMapper.class);
        mapper.add(leibie);

        //提交事务，默认不提交，需要手动提交
        sqlSession.commit();
        //4.关闭资源
        sqlSession.close();
    }

    @Test
    public void testAdd2() throws IOException {

        String 名称="克苏鲁";
        leibie leibie = new leibie();
        leibie.set名称(名称);

        //1.加载核心配置，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsiooin
        SqlSession sqlSession=sqlSessionFactory.openSession();
//        SqlSession sqlSession=sqlSessionFactory.openSession(true);//自动提交事务

        //3.执行sql
//        List<User> users = sqlSession.selectList("test.selectall");

        //3.1 获取代理接口对象
        //执行对应接口方法
        leibieMapper mapper = sqlSession.getMapper(leibieMapper.class);
        mapper.add(leibie);

        //提交事务，默认不提交，需要手动提交
        sqlSession.commit();
        mapper.selectAllByIdLeibie(leibie);
        System.out.println(leibie.getId());
        //4.关闭资源
        sqlSession.close();
    }
}
