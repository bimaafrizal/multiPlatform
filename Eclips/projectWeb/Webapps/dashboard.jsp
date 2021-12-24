<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="icon" href="images/Logo.png">
</head>
	<%@ page import="id.ac.uns.vokasi.multiplat.konekdatabase.*" %>
	<%@ page import="java.sql.Connection" %>
	<%@ page import="java.sql.Statement" %>
	<%@ page import="java.util.ArrayList" %>
<body>
<table border="1" width="30%" cellpadding="3">
   <tr>
   		<th>Nomor</th>
  		<th>Nama Siswa</th>
    	<th>Nis</th>
    	<th>Alamat</th>
     	<th>Nilai</th>
     	<th>Status</th>
     	<th>Aksi</th>
  </tr>
  <tr>
	<% 
      ppdbModel ppdb = new ppdbModel(); 
      int jmlh = ppdb.getData().size();
      for(int i = 0; i< jmlh;i++) {
	%>
	<td><% out.print(ppdb.getData().get(i).getId_ppdb()); %></td>
    <td><% out.print(ppdb.getData().get(i).getNama()); %></td>
    	<td><% out.print(ppdb.getData().get(i).getNis()); %></td>
	<td><% out.print(ppdb.getData().get(i).getAlamat()); %></td>
    <td><% out.print(ppdb.getData().get(i).getNilai()); %></td>
    	<% if(ppdb.getData().get(i).getStatus().equals("0")){ %>
   	<td>Tidak Lolos</td>
		<% } else { %>
	<td>Lolos</td>
       	<%} %>
	
		<td> 
	
	<% if(ppdb.getData().get(i).getStatus().equals("0")){ %>
		<a class="btn btn-primary" href="terima.jsp?id_ppdb=<%out.print(ppdb.getData().get(i).getId_ppdb());%>">Ubah Terima</a>
	<% } else { %>
	<a class="btn btn-primary" href="tdkterima.jsp?id_ppdb=<%out.print(ppdb.getData().get(i).getId_ppdb());%>">Ubah Tidak Terima</a>
		<%} %>
	<a class="btn btn-primary" href="hapus.jsp?id_ppdb=<%out.print(ppdb.getData().get(i).getId_ppdb());%>">Hapus peserta</a>	
	<%} %>

		</td>
	</tr>
	
</table>
	<a href="Home.jsp">Logout</a>
</body>
</html>

