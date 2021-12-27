<%@page import="com.sun.tools.javac.Main"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="styleResponsive.css">
    <link rel="icon" href="images/Logo.png">
</head>
<body>
	<%@ page import="id.ac.uns.vokasi.multiplat.konekdatabase.*" %>
	<%@ page import="java.sql.Connection" %>
	<%@ page import="java.sql.Statement" %>
	<%@ page import="java.util.ArrayList" %>
	<header>
	<div class="container">
		<div class="row">
			<div class="col">
		         <div class="header-left">
		              <img class="logo" src="images/Logo.png" alt="">
		         </div>
		       	<span class="fa fa-bars menu-icon"></span>
		        <div class="header-right">
		            <a href="#top-wrapper">Home</a>
		            <a href="#heading">Pendaftaran</a>
		            <a href="#pengumuman">Pengumuman</a>
		            <a class="login" href="Login2.jsp">Login Admin</a>
		        </div>
		      </div>
		</div>
	</div>
	</header>
	<div class="top-wrapper" id="top-wrapper">
        <div class="container">
            <h1>SELAMAT DATANG</h1>
            <h2>CALON PESERTA DIDIK BARU</h2>
            <h2>SMP Negeri 2 Wadaslintang</h2>
        </div>
    </div>
    <div class="content">
    	<div class="heading" id="heading">
            <h2>Form Pendaftaran</h2>
        </div>
    	<div class="container">
    		<div class="forms" id="forms">
    		<form action="" method="post">
	    		<div class="form-detail">
	    			<label for="nama">Nama:</label><br>
	  				<input type="text" id="nama" name="nama" required="required"><br>
	    		</div>
    			<div class="form-detail">
    				<label for="nis">NIS:</label><br>
  				<input type="text" id="nis" name="nis" required="required"><br>
    			</div>
	    		<div class="form-detail">
	    			<label for="alamat">Alamat:</label><br>
	  				<input type="text" id="alamat" name="alamat" required="required"><br>
	    		</div>
	    		<div class="form-detail">
	    			<label for="nilai">Nilai:</label><br>
	  				<input type="number" id="nilai" name="nilai"><br>
	  				<input type="hidden" id="status" name="status" value="0">
	    		</div>
	    		<div class="form-detail">
	    			<input type="submit" name="submit" value="Submit">
	    		</div>
    		</form>
    		<% 
    		
    			String submit = request.getParameter("submit");
    			if(submit != null) {
    				PPDB ppdb = new PPDB();
    				ppdb.setNama(request.getParameter("nama"));
    				ppdb.setNis(request.getParameter("nis"));
    				ppdb.setAlamat(request.getParameter("alamat"));
    				ppdb.setNilai(request.getParameter("nilai"));
    				ppdb.setStatus(request.getParameter("status"));
    				ppdbModel registrasi = new ppdbModel();
    				//out.print(ppdb);
    				registrasi.insertData(ppdb);
    				%>
    				<script>
                            alert('Data berhasil tambahkan');
                            document.location.href = 'Home.jsp'
                        </script>
    		<%} %>	
    		
    		</div>
    	</div>
    	<div class="heading" id="pengumuman">
            <h2>Pengumuman</h2>
        </div>
        <div class="container">
        	<table border="1" width="100%" cellpadding="3">
        	<thead>
        	<tr>
        		<th>Nama Siswa</th>
       			<th>Nis</th>
        		<th>Alamat</th>
        		<th>Nilai</th>
        		<th>Status</th>
        	</tr>
        	</thead>
        	<tbody>
        	<% 
        		ppdbModel ppdb = new ppdbModel(); 
        		int jmlh = ppdb.getData().size();
        		for(int i = 0; i< jmlh;i++) {
        		%>
        		<tr>
        			<td><% out.print(ppdb.getData().get(i).getNama()); %></td>
        			<td><% out.print(ppdb.getData().get(i).getNis()); %></td>
        			<td><% out.print(ppdb.getData().get(i).getAlamat()); %></td>
        			<td><% out.print(ppdb.getData().get(i).getNilai()); %></td>
        			<% if(ppdb.getData().get(i).getStatus().equals("0")){ %>
        			<td>Tidak Lolos</td>
        			<% } else { %>
        			<td>Lolos</td>
        			<%} %>
        		<%} %>
        		</tr>
        	</tbody>
        		
        	</table>
        </div>
    </div>
</body>
</html>