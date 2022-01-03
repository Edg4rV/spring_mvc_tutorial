package hibernate.jdbc

import java.sql.Connection
import java.sql.DriverManager

class TestJdbc {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC"

        String user = "hbstudent"
        String pass = "hbstudent"

        try {
            println "Connecting to database: ${jdbcUrl}"

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass)

            println "Connection successful!!!"

        } catch (Exception exc) {
            exc.printStackTrace()
        }

    }
}
