package Task2;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void createTable(Statement statement){

    }
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String tableName = "Persons";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","12345");
            statement = connection.createStatement();


            // create table
            statement.executeUpdate("drop table Employee");
            String createTableQuery = "CREATE TABLE Employee ("
                    + "ID INT PRIMARY KEY AUTO_INCREMENT,"
                    + "F_Name VARCHAR(50),"
                    + "L_Name VARCHAR(50),"
                    + "Sex VARCHAR(10),"
                    + "Age INT,"
                    + "Address VARCHAR(100),"
                    + "Phone_Number VARCHAR(20),"
                    + "Vacation_Balance INT DEFAULT 30"
                    + ")";

            statement.executeUpdate(createTableQuery);



            // insert data
            String insertQuery = "INSERT INTO Employee (ID, F_Name, L_Name, Sex, Age, Address, Phone_Number) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Mariam");
            preparedStatement.setString(3, "Mohammed");
            preparedStatement.setString(4, "Female");
            preparedStatement.setInt(5, 48);
            preparedStatement.setString(6, "123 Mariam st");
            preparedStatement.setString(7, "123-456-7890");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Salma");
            preparedStatement.setString(3, "Mohammed");
            preparedStatement.setString(4, "Female");
            preparedStatement.setInt(5, 30);
            preparedStatement.setString(6, "123 Salma st");
            preparedStatement.setString(7, "158-746-7890");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Ahmed");
            preparedStatement.setString(3, "Ramy");
            preparedStatement.setString(4, "Male");
            preparedStatement.setInt(5, 60);
            preparedStatement.setString(6, "103 Ahmed st");
            preparedStatement.setString(7, "123-256-7750");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "Hoda");
            preparedStatement.setString(3, "Samer");
            preparedStatement.setString(4, "Female");
            preparedStatement.setInt(5, 35);
            preparedStatement.setString(6, "123 Hoda st");
            preparedStatement.setString(7, "873-446-7440");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "Samer");
            preparedStatement.setString(3, "Ahmed");
            preparedStatement.setString(4, "Male");
            preparedStatement.setInt(5, 20);
            preparedStatement.setString(6, "423 Samer st");
            preparedStatement.setString(7, "323-346-7690");
            preparedStatement.addBatch();

            preparedStatement.executeBatch();


            // modify Vacation_Balance
            String updateQuery = "UPDATE Employee SET Vacation_Balance = 45 WHERE Age > 45";
            statement.executeUpdate(updateQuery);


            //
//
            String updateFemale = "UPDATE Employee SET F_Name = CONCAT('Ms ', F_Name) WHERE Age > 45 and Sex LIKE 'F%'";
            statement.executeUpdate(updateFemale);
            String updateMale = "UPDATE Employee SET F_Name = CONCAT('Mr ', F_Name) WHERE Age > 45 and Sex LIKE 'M%'";
            statement.executeUpdate(updateMale);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}