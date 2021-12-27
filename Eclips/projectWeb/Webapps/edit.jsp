<%@page import="id.ac.uns.vokasi.multiplat.konekdatabase.PPDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="id.ac.uns.vokasi.multiplat.konekdatabase.ppdbModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Data</title>
<link rel="icon" href="images/Logo.png">
</head>
<%@ page import="id.ac.uns.vokasi.multiplat.konekdatabase.*" %>

<body>
	<%
		String id_ppdb = request.getParameter("id_ppdb");
	
		ppdbModel modelPPDB = new ppdbModel();
		ArrayList<PPDB> ppdb  = new ArrayList<PPDB>();
		ppdb = modelPPDB.getDataByid(id_ppdb);

		for (int i = 0; i < ppdb.size(); i++) {
		%>
	<form action="" method="post">
	<input type="hidden" id="id_ppdb" name="id_ppdb" value="<% out.print(id_ppdb);%>">
    	<div class="form-detail">
    		<label for="nama">Nama:</label><br>
			<input type="text" id="nama" name="nama" required="required" value="<%out.print(ppdb.get(i).getNama());%>"><br>
	    </div>
    	<div class="form-detail">
    		<label for="nis">NIS:</label><br>
  			<input type="text" id="nis" name="nis" required="required" value="<% out.print(ppdb.get(i).getNis());%>" ><br>
  		</div>
    	<div class="form-detail">
	    	<label for="alamat">Alamat:</label><br>
	  		<input type="text" id="alamat" name="alamat" required="required" value="<% out.print(ppdb.get(i).getAlamat());%>"><br>
	    </div>
	    <div class="form-detail">
			<label for="nilai">Nilai:</label><br>
	  		<input type="number" id="nilai" name="nilai" value="<% out.print(ppdb.get(i).getNilai());%>"><br>
	    </div>
	    <% } %>
	    <div class="form-detail">
	    	<input type="submit" name="submit" value="Submit">
	    </div>
    </form>
</body>
</html>

<% 
String submit = request.getParameter("submit");
if(submit != null) {
	PPDB ppdb2 = new PPDB();
	ppdb2.setId_ppdb(id_ppdb);
	ppdb2.setNama(request.getParameter("nama"));
	ppdb2.setNis(request.getParameter("nis"));
	ppdb2.setAlamat(request.getParameter("alamat"));
	ppdb2.setNilai(request.getParameter("nilai"));
	ppdbModel edit = new ppdbModel();
	edit.edit(ppdb2);

%>  
	<script>
		alert('Data berhasil diedit');
	    document.location.href = 'dashboard.jsp'
	</script>
                        
<% } %>