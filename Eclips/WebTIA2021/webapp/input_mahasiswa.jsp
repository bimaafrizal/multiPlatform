<%@page import="konekdatabase.Mahasiswa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="post" action>
		nim<input type="text" name="nim"> <br>
		nama <input type="text" name="nama"><br>
		jenis kelamin<input type="radio" name="jk" value="L">Laki-laki<br>
		<input type="radio" name="jk" value="P">Perempuan <br>
		tempat lahir<input type="text" name="tmp_lahir"><br>
		tanggal lahir<input type="text" name="tgl_lahir"><br>
		alamat<textarea rows="" cols="" name="alamat"></textarea>
		<input type="submit" name="submit" value="simpan">
	</form>
	<%
		String submit = request.getParameter("submit");
	if(submit != null ) {
		Mahasiswa mhs = new Mahasiswa();
		mhs.setNim(request.getParameter("nim"));
		mhs.setNama(request.getParameter("nama"))
		mhs.setJk(getInitParameter("jk"));
		mhs.setTmpLahir(request.getParameter(""))
	}
	%>
	
	
	
	</body>
</html>