package PBO10_24060124120050;
import java.sql.*;

/**
 * File: MySQLPersonDAO.java
 * Deskripsi: implementasi PersonDAO untuk MySQL
 */
public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo?useSSL=false&serverTimezone=UTC", "root", "");
            //kerjakan mysql query
            String query = "INSERT INTO person(name) VALUES('"+name+"')";
            System.out.println(query);
            Statement s = con.createStatement();
            s.executeUpdate(query);
            //tutup koneksi database
            con.close();
    }
}