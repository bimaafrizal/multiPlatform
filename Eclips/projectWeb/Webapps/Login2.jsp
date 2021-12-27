<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Admin</title>
<link rel="icon" href="images/Logo.png">
</head>
<%@ page import="java.sql.*" %>
<%@ page import="id.ac.uns.vokasi.multiplat.konekdatabase.*" %>
<body>
        <form method="post" action=""> 
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="username" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
    
</body>
</html>
<%
    String submit = request.getParameter("submit");
    
    if(submit != null) {
    	String username = request.getParameter("username");
    	String passwword = request.getParameter("password");
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/multiplat_backup?user=root&password=");
        Statement st = con.createStatement();
        ResultSet rs;
        rs = st.executeQuery("SELECT * FROM admin where username= '"+ username + "' && password='"+ passwword+"'");
        if (rs.next()) {
            //response.sendRedirect("dashboard.jsp");
        %>
        <script>
	         alert('Login Berhasil');
	         document.location.href = 'dashboard.jsp'
	        </script> 
        <% 
        } else { %>
	        <script>
	         alert('Login Gagal');
	         document.location.href = 'Login2.jsp'
	        </script>  
    <%} 
    
    }
    
   
    %>
    
    