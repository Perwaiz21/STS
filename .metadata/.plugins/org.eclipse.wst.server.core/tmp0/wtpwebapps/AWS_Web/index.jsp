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

		</select> <br><br> 
		
		
		<br> <br> <label
					for="Customer Type">Customer Type :</label> <select
					name="Customer_Type" id="Customer_Type">
			<option value="ISV">Customer-1</option>
			<option value="Enterprise level">Enterprise level</option>

		</select> <!-- <br> <br> <label for="Customer Industry">Customer
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
		</select>
		 -->
		<br><br>
		<label for="Customer Industry">Customer Industry:</label> <input list="Customer Industrys" name="Customer Industry" id="Customer Industry">
		<datalist id="Customer Industrys">
			<option value="Finance">
			<option value="Banking">
			<option value="Finance and Banking">
			<option value="Insurance">
			<option value="Oil and Gas">
			<option value="Pharma">
			<option value="Health Care">
			<option value="Telecom">
			<option value="Mortgage">
			<option value="Supply Chain">
			<option value="Lease Management">
			<option value="Advisory">
			<option value="Audit">
		</datalist>
		<!-- <input type="submit"> -->
		
		
		 <br> <br>
		 <label for="Project Mode">Project Mode :</label>
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
			:</label>
			<input list="ImplementTier" name="ImplementTier" id="ImplementTier">
			<datalist id="ImplementTier">
			<option value="ImplementTier-1 ">
			
					<option value="ImplementTier-2">
			
					<option value="ImplementTier-3">
			
					<option value="ImplementTier-4">
			
					<option value="ImplementTier-5">
			
					<option value="ImplementTier-6">
			
					<option value="ImplementTier-7">
			
				</datalist>
			<input type="submit">
			<br><br>
	 <label for="browser">Choose your browser from the list:</label> <input
					list="browsers" name="browser" id="browser">
		<datalist id="browsers">
			<option value="Edge">
			
					<option value="Firefox">
			
					<option value="Chrome">
			
					<option value="Opera">
			
					<option value="Safari">
		
				</datalist>
		<input type="submit">
		<br><br>
		<label for="browser">Choose your browser from the list:</label> <input
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
</html>