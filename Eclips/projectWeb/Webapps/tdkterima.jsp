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
String status = "0";
PPDB ppdb2 = new PPDB();

ppdb2.setStatus(status);
ppdb2.setId_ppdb(id_ppdb);

ppdbModel tdkterimaSiswa = new ppdbModel();
tdkterimaSiswa.update(ppdb2);

%>
<script type="text/javascript">
alert('Data berhasil diubah');
document.location.href = 'dashboard.jsp';
</script>
</body>
</html>