package Lesson8;

import java.sql.*;

public class WeatherForecastRepository {
    private Statement statement;
    private PreparedStatement preparedStatement;

    public WeatherForecastRepository() throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
    }

    public void save(String city, String localDate, String weatherText, Double temperature) throws SQLException{
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")){
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS weather_forecast "+
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT,city String,localData String," +
                    "weatherText String, temperature Real);");

            preparedStatement = connection.prepareStatement("INSERT INTO weather_forecast"+
                    "(city, localData, weatherText, temperature) VALUES(?,?,?,?)");
            preparedStatement.setString(1, city);
            preparedStatement.setString(2, localDate);
            preparedStatement.setString(3, weatherText);
            preparedStatement.setDouble(4, temperature);
            preparedStatement.execute();
        }
    }

    public void read() throws SQLException{
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")){
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM weather_forecast");
            while (resultSet.next()){
                WeatherForecast forecast = new WeatherForecast(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDouble(5));

                System.out.println(forecast);
            }
        }
    }
}
