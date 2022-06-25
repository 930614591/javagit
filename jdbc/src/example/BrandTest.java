package example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;
import pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*
* 品牌数据的增删改查操作
* */
public class BrandTest {
    /*
    * 1.查询所有
    * 2.参数不需要
    * 3.结果存到List<Brand>
    * */
    @Test
    public void TestSelectAll() throws Exception {
        //1.获取数据库连接connection
        //3、加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        //5.获取对象的数据库链接
        Connection connection = dataSource.getConnection();

        //2.定义sql语句
        String sql="Select * from tb_brand;";

        //3.获取pstmt对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //4.设置参数

        //5.执行sql
        ResultSet resultSet = preparedStatement.executeQuery();

        //6.处理结果存到list
        List<Brand> brandlist=new ArrayList<Brand>();
        Brand brand = new Brand();
        while (resultSet.next()){
            //获取数据
            int id= resultSet.getInt("id");
            String brand_name = resultSet.getString("brand_name");
            String company_name = resultSet.getString("company_name");
            int ordered = resultSet.getInt("ordered");
            String description = resultSet.getString("description");
            int status = resultSet.getInt("status");
            //封装Brand对象

            brand.setBrandName(brand_name);
            brand.setCompanyName(company_name);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStstus(status);
            //装载集合
            brandlist.add(brand);
        }
        System.out.println(brandlist);
        //7.释放资源
        resultSet.close();
        preparedStatement.close();

    }
}
