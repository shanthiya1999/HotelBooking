<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
<script>
function matchpass()
{
	var firstpassword=document.myform1.password.value;
	var secondpassword=document.myform1.password2.value;
	if(firstpassword!=secondpassword)
		{
		alert("password must be same!");
		return false;
		}
	else
		{
		//window.location.replace("First");
		window.open("First");
		return true;
		}
}
</script>
<link rel="stylesheet" href="OurFirstStyle.css">
</head>
<body>
<div class="signup">

<div class="form1">

<form method="post"  name="myform1" onsubmit="return matchpass()" action="Sign in">
                    <h2>Sign Up Here</h2>
                    <input type="email" name="email" placeholder="Enter Email Here">
                    <input type="password" name="password" placeholder="Enter Password Here">
                    <input type="password" name="password2" placeholder="ReEnter Password Here">
                    <p class="link"><br>
                   
                    <button class="but">Sign in</button></p>
                     
                    </form>
                    </div>                      
</div>
</body>
</html>