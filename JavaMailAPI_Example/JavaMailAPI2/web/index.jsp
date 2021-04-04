<%-- 
    Document   : index
    Created on : 2 Apr, 2021, 9:56:02 AM
    Author     : swati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Mail API</title>
    </head>
    <body>
    <center>
        <h1>SEND E-MAIL VIA JAVA MAIL API</h1>
        <form id="myform" action ="sendemail">
            <table>
                <tr>
                    <td>
                        <label for="email">Receiver Email</label>
                    </td>
                     <td>
                         <input type="text" name="email">
                    </td>
                </tr>
                <tr>
                     <td>
                         <label for="subject">Subject</label>
                    </td>
                     <td>
                         <input type="text" name="subject">
                    </td>
                </tr>
                <tr>
                     <td colspan="2">
                         <label for="emailbody">Body</label>
                    </td>
                    
                </tr>
                 <tr>
                     <td colspan="2">
                         <textarea name="emailbody" form="myform" rows="6" cols="50">
                            
                         </textarea>

                    </td>
                    
                </tr>
                <tr>
                     <td colspan="2">
                        <input type="submit" form="myform" value="Send Mail" />
                    </td>
                    
                </tr>
            </table>
          </form>
            </center>
    </body>
</html>
