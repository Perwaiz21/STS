<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/action_page.php" method="get">
		This is Testing for <br> <b>Delivery head</b> <br> <br>
		<br> <br> <label for="Competency"> Competency :</label> <select
			name="cars" id="Competency">
			<option value="AWS">AWS</option>
			<option value="Azure">Azure</option>
			<option value="GCP">GCP</option>
			<option value="Java Full Stack">Java Full Stack</option>
			<option value="Front end">Front end</option>
			<option value=".NET Full Stack">.NET Full Stack</option>

		</select> <br> <br> <label for="Customer Type">Customer Type
			:</label> <select name="Customer_Type" id="Customer_Type">
			<option value="ISV">Customer-1</option>
			<option value="Enterprise level">Enterprise level</option>

		</select> <br> <br> <label for="Customer Industry">Customer
			Industry :</label> <select name="Customer_Industry" id="Customer_Industry"
			multiple>
			<option value="Finance">Finance</option>
			<option value="Banking">Banking</option>
			<option value="Finance and Banking">Finance and Banking</option>
			<option value="Insurance">Insurance</option>
			<option value="Oil and Gas">Oil and Gas</option>
			<option value="Pharma">Pharma</option>
			<option value="Health Care">Health Care</option>
			<option value="Telecom">Telecom</option>
			<option value="Mortgage">Mortgage</option>
			<option value="Supply Chain">Supply Chain</option>
			<option value="Lease Management">Lease Management</option>
			<option value="Advisory">Advisory</option>
			<option value="Audit">Audit</option>
		</select> <br> <br> <label for="Project Mode">Project Mode :</label>
		<select name="Project-Mode" id="Project-Mode" multiple>
			<option value="Development">Development</option>
			<option value="Testing">Testing</option>
			<option value="Support">Support</option>
			<option value="DevOps">DevOps</option>
			<option value="Consulting">Consulting</option>
			<option value="Management">Management</option>
			<option value="DB Administration">DB Administration</option>
		</select> 
		<br> <br> 
		<label for="ImplementTier ">ImplementTier
			:</label><!--  <select name="ImplementTier" id="ImplementTier" multiple> -->
			<input
			list="ImplementTier" name="ImplementTier" id="ImplementTier">
			<datalist id="ImplementTier">
			<option value="ImplementTier-1 ">ImplementTier-1</option>
			<option value="ImplementTier-2">ImplementTier-2</option>
			<option value="ImplementTier-3">ImplementTier-3</option>
			<option value="ImplementTier-4">ImplementTier-4</option>
			<option value="ImplementTier-5">ImplementTier-5</option>
			<option value="ImplementTier-6">ImplementTier-6</option>
			<option value="ImplementTier-7">ImplementTier-7</option>
			</datalist>
			
		</select> <label for="browser">Choose your browser from the list:</label> <input
			list="browsers" name="browser" id="browser">
		<datalist id="browsers">
			<option value="Edge">
			<option value="Firefox">
			<option value="Chrome">
			<option value="Opera">
			<option value="Safari">
		</datalist>
		<input type="submit">
	</form>


</body>
