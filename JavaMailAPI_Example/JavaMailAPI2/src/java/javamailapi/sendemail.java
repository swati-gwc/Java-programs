package javamailapi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;
import javax.mail.Session;
import javax.mail.Authenticator;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author swati
 */
public class sendemail extends HttpServlet {
    
    static String receiverEmail,subject,body;
    
    public static boolean sendMail(String recepient) throws Exception
    {
        boolean success = false;
        try{
        System.out.println("Preparing to send email");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        //sender email id
//write the sender's email and its password here below::
        //currently the fields are given  blank

        String myAccountEmail = "Write sender's email here";
        String password = "Write sender's password here";

        Session session = Session.getInstance(properties, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(myAccountEmail,password);
            }

        });

        Message message = prepareMessage(session, myAccountEmail, recepient);

        Transport.send(message);
        System.out.println("Message sent successfully");
        success = true;
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        return success;
    }

    private static Message prepareMessage(Session session, String session1, String session2) throws MessagingException, MessagingException {
        try {
            
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(session1));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(session2));
        message.setSubject(subject);
        //String htmlcode = "<h1 style='color: #663300'> WELCOME DIVYA!</h1>";
        message.setContent(body,"text/html");
        return message;
        }

        catch (AddressException ex) {
            java.util.logging.Logger.getLogger(sendemail.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            receiverEmail = request.getParameter("email");
            subject = request.getParameter("subject");
            body = request.getParameter("emailbody");
            boolean result = sendMail(receiverEmail);
            
            if(result){
                getServletContext().getRequestDispatcher("/emailsent.jsp").forward(request, response);
            }else{
                getServletContext().getRequestDispatcher("/emailNotSent.jsp").forward(request, response);
            }
            
            //getServletContext().getRequestDispatcher("/emailsent").forward(request, response);
           
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(sendemail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(sendemail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
