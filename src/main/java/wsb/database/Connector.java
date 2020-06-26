package wsb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Properties;

public class Connector {
  static final String DB_URL = "jdbc:postgresql://localhost:5432/oop";
  static final String USER = "postgres";
  static final String PASS = "postgres";

  private static  Connection connection;

  public static void connect() throws SQLException {
    Properties props = new Properties();
    props.setProperty("user", USER);
    props.setProperty("password", PASS);
    connection = DriverManager.getConnection(DB_URL, props);
    System.out.println("connected");

  }

  public static Statement getStatement() throws SQLException{

    return connection.createStatement();

  }
  public static void executeSQL(String sql) throws Exception{
    connection.createStatement().execute(sql);
  }
}
