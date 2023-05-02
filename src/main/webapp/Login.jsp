<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Login.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
  
    <title>Empelados Aurorium</title>
</head>
<body>
    <div class="wrapper">
        <div class="container main">
            <div class="row">
                <div class="col-md-6 side-image">
                    <!-------Image-------->
                    <img src="img/LogoAurorium1-removebg-preview.png" alt="">
                    <div class="text">
                        <p>Reserva hoy, viaja mañana.<i>- Aurorium</i></p>
                    </div>
                </div>
                <div class="col-md-6 right">
                     <div class="input-box">
                        <header>LOG-IN Empelados</header>
                        
                        <form method="post" action="LoginEmpleados">
                        <div class="input-field">
                            <input type="text" class="input" id="email" required autocomplete="off" name="Dni">
                            <label for="text">DNI</label>
                        </div>
                        <div class="input-field">
                            <input type="password" class="input" id="password" required name="Password">
                            <label for="password">Password</label>
                        </div>
                        <div class="input-field">
                            <input type="submit" class="submit" value="Log-in">
                        </div> 
                       </form>
                           <div class="signin">
                            <span>Te has equivocado?   <a href="#">Salir</a></span>
                     </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>