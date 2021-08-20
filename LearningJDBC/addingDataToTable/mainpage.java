/*
 * Main Code of Java to fetch data from form and add it to database.
 * In order to use this code, make sure you enter correct username and password in line 41
 * Also, you have to change the URL, table schema, name and see it matches with yours
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author swati
 */
@WebServlet(urlPatterns = {"/mainpage"})
public class mainpage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String id = request.getParameter("Id");
        try (PrintWriter out = response.getWriter()) {
             //loading drivers for mysql
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            String URL="jdbc:derby://localhost:1527/student";

            //creating connection with the database
             Connection conn = DriverManager.getConnection(URL,"username","password");   
           
            PreparedStatement ps = conn.prepareStatement("insert into SWATI.LOGINDATA VALUES (?,?,?)");
            ps.setString(1, id);
            ps.setString(2, user);
            ps.setString(3, pass);
            int i = ps.executeUpdate();
            
            if(i>0) out.println("Registeration done");
        }
        catch(Exception e){ e.printStackTrace();}
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
