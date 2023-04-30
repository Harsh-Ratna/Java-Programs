package CountryDemo.CountryDemo;

import CountryDemo.services.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountryDemo {
    public static class CountryServices {
        public static void main(String[] args)
        {
            String sql = "select country_name from countries";
            try(Connection connection = DBUtil.getConnection();
                Statement statement = connection.createStatement()){
                ResultSet resultSet = statement.executeQuery(sql); // In case of select executeQuery is used
                int count = 0;
                while(resultSet.next())
                {
                    count++;
                    System.out.println(resultSet.getString("country_name"));
                }
                System.out.println(count+ " countries found");
                resultSet.close();
            }catch (SQLException ex)
            {
                System.out.println("Problem:" + ex.getMessage());
            }
        }
    }
}
