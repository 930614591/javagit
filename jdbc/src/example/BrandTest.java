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

    @Test
    /*添加
    * 需要参数，除了id之外的所有参数
    * 结果是布尔类型
    *
    * */
    public void TestSelectADD() throws Exception {

        /*接受页面传递过来的参数*/
        String brandName="香飘飘";
        String companyName="香飘飘";
        int ordered=1;
        String description="绕地球一圈";
        int status=1;
        //1.获取数据库连接connection
        //3、加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        //5.获取对象的数据库链接
        Connection connection = dataSource.getConnection();

        //2.定义sql语句
        String sql="INSERT INTO `test`.`tb_brand` (`brand_name`, `company_name`, `ordered`, `description`, `status`) VALUES (?, ?, ?, ?, ?);";

        //3.获取pstmt对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //4.设置参数
        preparedStatement.setString(1,brandName);
        preparedStatement.setString(2,companyName);
        preparedStatement.setInt(3,ordered);
        preparedStatement.setString(4,description);
        preparedStatement.setInt(5,status);
        //5.执行sql
        int i = preparedStatement.executeUpdate();//影响行数
        //6.处理结果
        if (i>0){
            System.out.println("插入陈工");
        }else {
            System.out.println("插入失败");
        }
        //7.释放资源

        preparedStatement.close();
        connection.close();

    }

    @Test
    /*修改
     * 需要参数，特定的参数必须要id
     * 结果是布尔类型
     *
     * */
    public void TestSelectupdate() throws Exception {

        /*接受页面传递过来的参数*/
        String brandName="香飘飘";
        String companyName="香飘飘";
        int ordered=1;
        String description="绕地球一圈";
        int status=1;
        //1.获取数据库连接connection
        //3、加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        //5.获取对象的数据库链接
        Connection connection = dataSource.getConnection();

        //2.定义sql语句
        String sql="update tb_brand set brand_name=?,company_name=?,ordered=?,description=?,status=? where id=?;";

        //3.获取pstmt对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //4.设置参数
        preparedStatement.setString(1,brandName);
        preparedStatement.setString(2,companyName);
        preparedStatement.setInt(3,ordered);
        preparedStatement.setString(4,description);
        preparedStatement.setInt(5,status);
        preparedStatement.setInt(6,2);
        //5.执行sql
        int i = preparedStatement.executeUpdate();//影响行数
        //6.处理结果
        if (i>0){
            System.out.println("插入陈工");
        }else {
            System.out.println("插入失败");
        }
        //7.释放资源

        preparedStatement.close();
        connection.close();

    }
}
