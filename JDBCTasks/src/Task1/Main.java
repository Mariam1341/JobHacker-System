package Task1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String tableName = "Persons";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","12345");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * from " + tableName);

            int num = 1;
            while (resultSet.next()) {

                int ID = resultSet.getInt("ID");
                String LastName = resultSet.getString("LastName");
                String FirstName = resultSet.getString("FirstName");
                int Age = resultSet.getInt("Age");

                System.out.println("Person no." + num++);
                System.out.println("ID: " + ID);
                System.out.println("FirstName: " + FirstName);
                System.out.println("LastName: " + LastName);
                System.out.println("Age: " + Age);
                System.out.println("----------------------");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
