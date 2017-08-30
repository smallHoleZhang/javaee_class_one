import org.db.DBcom;
import org.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by hasee on 2017/8/30.
 */
public class LoginDao {
    public  Connection connection;

    public login checkLogin(String name, String password) {
       /* System.out.println(name + "name");
        System.out.println(password + "name");*/
        try {
            connection = DBcom.getconn();
            System.out.println(connection+"2323");
            PreparedStatement pstm = connection.prepareStatement(
                    "SELECT * FROM user WHERE username=?"+"and password=?"
            );

            pstm.setString(1,name);
            pstm.setString(2,password);
            ResultSet rs = pstm.executeQuery();

            if(rs.next())
            {
                login login = new login();
                login.setId(rs.getString(3));
                login.setName(rs.getString(1));
                login.setPassword(rs.getString(2));
                return login;
            }
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
          /*  DBcom.close();*/
        }
    }


}
