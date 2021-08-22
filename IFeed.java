import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class IFeed extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
 
String p=request.getParameter("fname");
String q=request.getParameter("lname");
String a=request.getParameter("pnum");
String b=request.getParameter("email");
String c=request.getParameter("star");
String d=request.getParameter("friendliness");
String e=request.getParameter("standard");
String f=request.getParameter("variety");
String g=request.getParameter("beverages");
String h=request.getParameter("order");  

          
try{  
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ffeedback","root","");
  
PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?)");  
  
ps.setString(1,p); 
ps.setString(2,q);
ps.setString(3,a);
ps.setString(4,b);
ps.setString(5,c);
ps.setString(6,d);
ps.setString(7,e);
ps.setString(8,f);
ps.setString(9,g);
ps.setString(10,h); 
 

int i=ps.executeUpdate();  
if(i>0)  
             out.println("<html>");
             out.println("<body>");
             out.println("<br><br><br><h1>&emsp;&emsp;&emsp;Hi "+p+" , "+"</h1>");
             out.println("<h2>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Thank you... for your response..</h2>");
             out.println("<h2>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;You feedback is successfully received...</h2>");
             out.println("<h2>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;We will consider your suggestions and comments and will surely make changes...</h2>");
             out.println("</body>");
             out.println("</html>");
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  