<!DOCTYPE html>
<html lang="en">
<head>
    <title>ITC Hotel</title>
    <link rel="stylesheet" href="OurFirstStyle.css">
    <script>
    function validateform(){
    	var password=document.myform.password.value;
    	
    	if(password.length<6)
    		{
    		alert("Password must be at least 6 characters long.\nRe - Enter the password!!");
    		return false;
    		}
    }
    </script>
</head>
<body>
    <div class="main">
        <div class="navbar">
            <div class="menu">
                <ul>
                    <li><a href="Home">HOME</a></li>
                    <li><a href="About">ABOUT</a></li>
                    <li><a href="Services">SERVICES</a></li>
                    <li><a href="Contact">CONTACT</a></li>
                    <li><a href="Review">REVIEW</a></li>
                    <li><a href="Photos">PHOTOS</a></li>
                </ul>
            </div>

        </div> 
        <div class="content">
            <h1><b><span>ITC HOTEL<br>HAPPY</span> AND<br><span>COMFORTABLE </span>PLACE<br>TO <span>STAY</span> </b></h1>
                <div class="form">
                   <form method = "post" name="myform" onsubmit="return validateform()" action="Login">
                    <h2>Login Here</h2>
                    <input type="email" name="email" placeholder="Enter Email Here">
                    <input type = "text" name = "username" placeholder = "Enter Username Here">
                    <input type="password" name="password" placeholder="Enter Password Here">
                    <button class="btnn" >Login</button>
					
					 </form>
                    <p class="link">Don't have an account<br>
                    <button class="but" onclick = "window.location.href = 'SignUp';">Sign up</button> Here</p>        
                </div>
                    </div>
                </div>
</body>
</html>
