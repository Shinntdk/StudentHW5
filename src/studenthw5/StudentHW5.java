/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthw5;

import java.sql.SQLException;
import utilities.DatabaseDriver;
import utilities.DatabaseHandler;

/**
 *
 * @author USER
 */
public class StudentHW5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/student";
        String user = "app";
        String passwd = "app";
        /*String driver = "com.mysql.cj.jdbc.Driver";
        //String url="jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
        String user = "root";
        String passwd = "root";*/
        DatabaseDriver dbDriver = new DatabaseDriver(driver, url, user, passwd);
        DatabaseHandler dbHandler = new DatabaseHandler(dbDriver);
        Student stu1 = new Student(57942, "John", 3.33);
        Student stu2 = new Student(48365, "Marry", 2.54);
        StudentTable.insertStudent(dbHandler, stu1);
        StudentTable.insertStudent(dbHandler, stu2);
        //Student stu = StudentTable.findStudentById(dbHandler, 1);
        //stu.setName("Jack");
        //stu.setGPA(1.86);
        //StudentTable.updateStudent(dbHandler, stu);
        //StudentTable.removeStudent(dbHandler, stu);
       
        dbHandler.closeConnection();
    }
    
}
