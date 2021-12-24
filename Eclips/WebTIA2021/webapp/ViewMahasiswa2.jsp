<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="konekdatabase.*"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.util.ArrayList"%>
	<table>
		<tr> 
			<td>nim</td>
			<td>nama</td>
			<td>jenis kelamin</td>
			<td> tempat lahir </td>
			<td>tanggal lahir</td>
			<td>alamat</td>
		</tr>
		<%
		
		ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		
		mahasiswa = mahasiswaModel.getData();
		for(int i = 0; i<mahasiswa.size(); i++) {
			
			%>
		<tr>
			<td><% out.print(mahasiswa.get(i).getNim()); %></td>
			<td><% out.print(mahasiswa.get(i).getNama()); %></td>
			<td><% out.print(mahasiswa.get(i).getJk()); %></td>
			<td><% out.print(mahasiswa.get(i).getTmpLahir()); %></td>
			<td><% out.print(mahasiswa.get(i).getTglLahir()); %></td>
			<td> <% out.print(mahasiswa.get(i).getAlamat()); %> </td>
		</tr>
		<% } %>
	</table>
</body>
</html>