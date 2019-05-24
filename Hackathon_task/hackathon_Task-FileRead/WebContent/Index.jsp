<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hackathon Task</title>
</head>
<body bgcolor="Blue">



<form method="POST" action="uploadFile" enctype="multipart/form-data">
		
		Name: <input type="text" name="name"><br /> <br /> 
		File to upload: <input type="file" name="uploadfile"><br /> 
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>	

</body>
</html>