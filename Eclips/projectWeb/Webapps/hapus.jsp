<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="id.ac.uns.vokasi.multiplat.konekdatabase.*" %>
	<%@ page import="java.sql.Connection" %>
	<%@ page import="java.sql.Statement" %>
	<%@ page import="java.util.ArrayList" %>
<body>
<% 
String id_ppdb = request.getParameter("id_ppdb");

PPDB ppdb2 = new PPDB();
ppdb2.setId_ppdb(id_ppdb);

ppdbModel hapus = new ppdbModel();
hapus.delete(ppdb2);

%>
<script type="text/javascript">
alert('Data berhasil dihapus');
document.location.href = 'dashboard.jsp';
</script>
</body>
</html>