<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@ include file="all_js_css.jsp"%>
</head>

<body>
	<div class="container-fluid">
		<%@ include file="navbar.jsp"%>
	</div>
	
	<h3> please fill your note details</h3>


	<!-- this is  add form -->

	<form action="SaveNoteServlet"  method="post">
		<div class="mb-3">
			<label for="title" class="form-label">Note title</label> 
			<input name="title"
			       type="text" 
			       required
			       class="form-control"
				   id="title"  
				   aria-describedby="emailHelp"
				   placeholder="Enter here">
			<div id="emailHelp" class="form-text">We'll never share your
				email with anyone else.</div>
		</div>
		<div class="mb-3">
			<label class="form-group">Note Content</label>
			<textarea name="content"
			          id="content"
			           required
                      placeholder="Enter your Content here"
				      class="form-control"
				      style="height:300px"       >
				
			</textarea>
		</div>
		<div class="mb-3 form-check">
			<input type="checkbox" class="form-check-input" id="exampleCheck1">
			<label class="form-check-label" for="exampleCheck1">Check me
				out</label>
		</div>
		<div  class="container text-center " >
		        <button type="submit" class="btn btn-primary">Submit</button>
		</div>
		
	</form>

</body>
</html>