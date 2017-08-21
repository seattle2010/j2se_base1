package Transaction;

import com.preparestatement.test.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDemo {
    @Test
    public void testAccoutn() throws Exception {
    //1 检查账户里的余额是否大于1000
        String sql = "SELECT * FROM t_student WHERE name = ? AND age >= ?";
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"jack");
        ps.setInt(2,1000);
        ResultSet rs = ps.executeQuery();
        if (!rs.next()) {
            throw new RuntimeException("账户余额不足");
        } else {
            System.out.println("账户余额足够转账");
        }
        //2  从jack的账户里减少1000
        sql = "UPDATE t_student SET age = age - ? WHERE name = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1,1000);
        ps.setString(2, "jack");
        ps.executeUpdate();
//int a = 1/0; //模拟停电
//        System.out.println(1/0);

        //3 再在rose的账户里增加1000
        sql = "UPDATE t_student SET age = age + ? WHERE  name = ?";
        ps =  conn.prepareStatement(sql);
        ps.setInt(1,1000);
        ps.setString(2,"rose");
        ps.executeUpdate();
        JdbcUtil.close(conn,ps,rs);

    }

    //事物的使用
    @Test
    public void test(){
    Connection conn =null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try{
        conn = JdbcUtil.getconn();
        String sql = "SELECT * FROM t_student WHERE name = ? AND age >= ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1,"jack");
        ps.setInt(2,1000);
        rs = ps.executeQuery();
        if (!rs.next()) {
            throw new RuntimeException("账户余额不足");
        } else {
            System.out.println("你真有钱,余额够了");
        }
        //设置取消事物的自动提交
        conn.setAutoCommit(false);
        //2 从账户上扣除1000
        sql = "UPDATE t_student SET age = age - ? WHERE name = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1,1000);
        ps.setString(2,"jack");
        ps.executeUpdate();

        //模拟停电
        System.out.println(1/0);

        //3 在rose的账户里增加1000
        sql = "UPDATE t_student SET age = age + ? WHERE name = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1,1000);
        ps.setString(2, "rose");
        ps.executeUpdate();
System.out.println("转账成功");
        //提交事物
        conn.commit();
    }catch(Exception e){
        e.printStackTrace();
        try {
            System.out.println("银行停电");
            conn.rollback();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }finally {
        JdbcUtil.close(conn,ps,rs);
    }
    }
}
