package Batch;

import com.preparestatement.test.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchDemo {
    @Test
    public void testByPreparedStatement() throws Exception {
        String sql = "INSERT INTO t_student5 (name,age)VALUES('tom',?)";
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps = conn.prepareStatement(sql);
        long begin = System.currentTimeMillis();
        for(int i = 0;i<1000;i++){
            ps.setInt(1,i);
            ps.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
        JdbcUtil.close(conn,ps,null);

    }

    @Test
public void testByBatch() throws Exception {
        String sql = "INSERT INTO t_student5 (name,age)VALUES('tom',?)";
        Connection conn = JdbcUtil.getconn();
        PreparedStatement ps = conn.prepareStatement(sql);
        long begin = System.currentTimeMillis();
        for(int i = 0;i<1000;i++){
            ps.setInt(1,i);

            //添加到批量处理中
            ps.addBatch();
            ps.executeBatch();
            ps.clearBatch();
            ps.clearParameters();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        JdbcUtil.close(conn,ps,null);

    }

}
