/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectDB;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84826
 */
public class CDB {
        public static void main(String[] args) throws SQLException {
        String sqlServer = "localhost";
        String port = "1433";
        String user = "tricute";
        String passWord = "tricute";
        String database = "PS26961_TranNgocTri_ASM_Java3";
        String url = "jdbc:sqlserver://" + sqlServer + ":" + port + ";databaseName=" + database + ";encrypt=false";
        // 2. Open connection
        try (Connection con = DriverManager.getConnection(url, user, passWord)) {
            // 3. Create Statement
            Statement st = con.createStatement();
            // 4. Execute query
            String sqlInsert = "SELECT * FROM Students;";
            ResultSet rs = st.executeQuery(sqlInsert);
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                System.out.format("%s %s \n", id, name);
            }
            rs.close();
            st.close();
            // 5. Close connection
            con.close();
        } catch (SQLServerException e) {
            System.out.println(e);
        }
    }
}
