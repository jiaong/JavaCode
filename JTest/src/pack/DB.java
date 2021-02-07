package pack;

import java.sql.*;

public class DB {
    static final String url = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC";
    static final String name = "com.mysql.cj.jdbc.Driver";
    static final String user = "root";
    static final String pwd = "123456";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            // 注册JDBC驱动
            Class.forName(name);
            conn = DriverManager.getConnection(url, user, pwd);
            st = conn.createStatement();
            String sql;
            sql = "SELECT goods_id,goods_name FROM goods ";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int goods_id = rs.getInt("goods_id");
                String goods_name = rs.getString("goods_name");
                System.out.print(goods_id);
                System.out.println(" " + goods_name);

            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException se2) {
            } catch (Exception se) {
                se.printStackTrace();
            }
        }
    }
}
