package utils;

import java.sql.*;

public class MySQLConnection {

    private static final String URL = System.getenv("jdbc:mysql://localhost:3306/product_management_system");
    private static final String USER = System.getenv("root");
    private static final String PASSWORD = System.getenv("");

    public MySQLConnection() {}

    // Lấy kết nối tới cơ sở dữ liệu
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Thực thi truy vấn SELECT (có trả về kết quả)
    public void executeQuery(String sql, QueryCallback callback, Object... params) throws SQLException {
        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            setParameters(ps, params);
            try (ResultSet rs = ps.executeQuery()) {
                callback.process(rs);
            }
        }
    }

    // Thực thi truy vấn UPDATE, INSERT, DELETE (không trả về kết quả)
    public int executeUpdate(String sql, Object... params) throws SQLException {
        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            setParameters(ps, params);
            return ps.executeUpdate();
        }
    }

    // Gán giá trị cho các tham số trong PreparedStatement
    private void setParameters(PreparedStatement ps, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }
    }

    // Giao diện callback để xử lý kết quả ResultSet
    public interface QueryCallback {
        void process(ResultSet rs) throws SQLException;
    }
}
