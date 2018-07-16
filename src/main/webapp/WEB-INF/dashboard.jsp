
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/dashboard.css">
</head>
<body>
	<div class="wrapper">
		<h3 class="error">${error}</h3>
		<div class="main">
			<h1>What is the code?</h1>
			<form action="/code">
			<input type="text" name="secretcode">
			<input type="submit" value="Try Code">
			</form>
		</div>
	</div>

</body>
</html>