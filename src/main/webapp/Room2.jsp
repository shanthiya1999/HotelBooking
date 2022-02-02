<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Double Room</title>
<link rel="stylesheet" href="OurFirstStyle.css">
<script>

function login()
{
	var d1 = document.getElementById("d1").value;
    var d2 = document.getElementById("d2").value;
    const d3 = new Date(d1);
    const d4 = new Date(d2);
    const time = Math.abs(d4-d3);
    const days = Math.ceil(time/(3600000*24));
	var user = document.getElementById("rooms").value;
	var user1 = user * days * 1000;
	alert("Your booking has successfully completed.\nThe total amount is Rs." +user1+ ". \nThank you for choosing our hotel!!! ");
	}
</script>
</head>
<body>

<div class = "book">
            <form class = "book-form">
                <div class = "form-item">
                   <h1><label for = "checkin-date">Check In Date </label></h1>
                    <input type = "date"  id = "d1">
                </div>
                <div class = "form-item">
                   <h1> <label for = "checkout-date">Check Out Date </label></h1>
                    <input type = "date" id = "d2">
                </div>
                <div class = "form-item">
                   <h1> <label for = "adult">Adults </label></h1>
                    <input type = "number" max = "2" value = "1" id = "adult">
                </div>
                <div class = "form-item">
                    <h1><label for = "children">Children </label></h1>
                    <input type = "number" max = "1" value = "1" id = "children">
                </div>
                <div class = "form-item">
                    <h1><label for = "rooms">Rooms </label></h1>
                    <input type = "number" min = "1" value = "1" id = "rooms">
                </div>
                <div class = "form-item">
                <button class="btn" onclick = "login()">Book now</button>
                    
                </div>
            </form>
        </div>

</body>
</html>