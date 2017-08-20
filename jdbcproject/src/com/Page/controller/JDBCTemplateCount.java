package com.Page.controller;

import com.Page.controller.domain.Product;
import com.refactor.test.JdbcUtil.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCTemplateCount {


    //DQL操作模板   Count(*)
    public static long query(String sql, Object... params) {
        List<Product> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            for(int i = 0;i<params.length;i++){
                ps.setObject(i + 1, params[i]);

            }
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,rs);
        }
        return 0L;
    }

}
