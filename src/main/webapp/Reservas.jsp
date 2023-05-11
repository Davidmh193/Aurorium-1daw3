<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Links css -->
<link rel="stylesheet" href="css/Index.css" />
<link rel="stylesheet" href="css/Foter.css">
<link rel="stylesheet" href="css/Reservas.css">

<!--Links letras-->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"
	rel="stylesheet" />
<!-- Booststrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>
<title>Aurorium Resort</title>
</head>

<body class="hideScroll">
	<div>
		<header>
			<nav class="wrapper">
				<div class="imagenlogo">
					<img src="img/LogoAurorium1-removebg-preview.png" alt="">
				</div>
				<div class="links" id="links">
					<div class="wrapper-links">
						<a href="Index.jsp" class="link"><i class="fa fa-home"></i></q>
							Home</a> <a href="Actividades.jsp" class="link "><i
							class="fa fa-globe"></i></q> Actividades</a> <a href="Habitaciones.jsp"
							class="link"><i class="fa fa-bed"></i></q> Habitaciones</a> <a
							href="Reservas.jsp" class="link active"><i class="fa fa-book"></i></q>
							Reservar</a> <a href="Contacto.jsp" class="link"><i
							class="fa fa-phone"></i></q> Contacto</a>
					</div>
				</div>
				<div class="icon-links" id="button-menu">
					<div></div>
					<div></div>
					<div></div>
				</div>
			</nav>
		</header>
	</div>

	<main>
		<div class="pelicula-principal">
			<div class="contenedor" style="margin-left: 2%;">
				<h3 class="titulo">Reservas</h3>
				<p class="descripcion">Descubre nuestras suites increibles y
					comodas para un gran descanso durante tus vacaciones.</p>
				<div class="botoncitos"></div>
				
				<form method="post" action="Reservas">
					<input type="date" class="my-date-picker"
						style="margin-bottom: 2%;" name="FechaEntrada"> <input
						type="date" class="my-date-picker" style="margin-bottom: 2%;"
						name="FechaSalida"> <input type="text"
						class="my-text-input" placeholder="DNI" name="Dni"
						style="margin-bottom: 2%;">
					<div class="dropdown"
						style="display: inline-block; margin-bottom: 2%;">
						<select name="Desplegable">
							<option value="Deluxe Room">Deluxe Room</option>
							<option value="Suite Royale">Suite Royale</option>
							<option value="Dual Lovers">Dual Lovers</option>
							<option value="Suite Premium">Suite Premium</option>
						</select>
					</div>


					<button class="my-date-picker" type="submit"
						style="margin-bottom: 0.3%;">RESERVAR</button>
				</form>
				
			</div>
		</div>

	</main>

</body>
<div class="CuadroBlanco1">
	<div>
		<h2>¡Bienvenidos a Aurorium, su próximo destino vacacional!</h2>
		<p style="margin-bottom: 5.5%;">
			<br> En Aurorium, ofrecemos una experiencia de hospedaje única e
			inolvidable. Nuestras habitaciones están diseñadas para brindarle la
			máxima comodidad y relajación durante su estadía. No importa si está
			buscando un lugar para relajarse o un destino para explorar y
			descubrir nuevos lugares, Aurorium es la elección perfecta para su
			próxima aventura vacacional. ¡Reserve ahora y descubra todo lo que
			Aurorium tiene para ofrecer!
		</p>

		<a href="Habitaciones.jsp">
			<button class="botonesReservas1">
				<span class="circle1" aria-hidden="true"> <span
					class="icon1 arrow1"></span>
				</span> <span class="button-text1">Habitaciones</span>
			</button>
		</a>
		<div class="dash"></div>

		<form>
			<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
				class="fa fa-star"></i> <i class="fa fa-star"></i> <i
				class="fa fa-star-o"></i>
			<p style="margin-top: 10px;">Valoracion media 4/5</p>
		</form>
	</div>
</div>

<!-- Foter -->
<footer>
	<div class="footer">
		<div class="row">
			<div class="social-links">
				<div id="twitter" class="social-btn flex-center">
					<svg viewBox="0 0 24 24" height="24" width="24"
						xmlns="http://www.w3.org/2000/svg">
						<path
							d="M24 4.557c-.883.392-1.832.656-2.828.775 1.017-.609 1.798-1.574 2.165-2.724-.951.564-2.005.974-3.127 1.195-.897-.957-2.178-1.555-3.594-1.555-3.179 0-5.515 2.966-4.797 6.045-4.091-.205-7.719-2.165-10.148-5.144-1.29 2.213-.669 5.108 1.523 6.574-.806-.026-1.566-.247-2.229-.616-.054 2.281 1.581 4.415 3.949 4.89-.693.188-1.452.232-2.224.084.626 1.956 2.444 3.379 4.6 3.419-2.07 1.623-4.678 2.348-7.29 2.04 2.179 1.397 4.768 2.212 7.548 2.212 9.142 0 14.307-7.721 13.995-14.646.962-.695 1.797-1.562 2.457-2.549z"></path></svg>
					<span>@Aurorium</span>
				</div>

				<div id="linkedin" class="social-btn flex-center">
					<svg viewBox="0 0 24 24" height="24" width="24"
						xmlns="http://www.w3.org/2000/svg">
						<path
							d="M4.98 3.5c0 1.381-1.11 2.5-2.48 2.5s-2.48-1.119-2.48-2.5c0-1.38 1.11-2.5 2.48-2.5s2.48 1.12 2.48 2.5zm.02 4.5h-5v16h5v-16zm7.982 0h-4.968v16h4.969v-8.399c0-4.67 6.029-5.052 6.029 0v8.399h4.988v-10.131c0-7.88-8.922-7.593-11.018-3.714v-2.155z"></path></svg>
					<span>@Davidmh_7</span>
				</div>

				<div id="github" class="social-btn flex-center">
					<svg viewBox="0 0 24 24" height="24" width="24"
						xmlns="http://www.w3.org/2000/svg">
						<path
							d="M12 0c-6.626 0-12 5.373-12 12 0 5.302 3.438 9.8 8.207 11.387.599.111.793-.261.793-.577v-2.234c-3.338.726-4.033-1.416-4.033-1.416-.546-1.387-1.333-1.756-1.333-1.756-1.089-.745.083-.729.083-.729 1.205.084 1.839 1.237 1.839 1.237 1.07 1.834 2.807 1.304 3.492.997.107-.775.418-1.305.762-1.604-2.665-.305-5.467-1.334-5.467-5.931 0-1.311.469-2.381 1.236-3.221-.124-.303-.535-1.524.117-3.176 0 0 1.008-.322 3.301 1.23.957-.266 1.983-.399 3.003-.404 1.02.005 2.047.138 3.006.404 2.291-1.552 3.297-1.23 3.297-1.23.653 1.653.242 2.874.118 3.176.77.84 1.235 1.911 1.235 3.221 0 4.609-2.807 5.624-5.479 5.921.43.372.823 1.102.823 2.222v3.293c0 .319.192.694.801.576 4.765-1.589 8.199-6.086 8.199-11.386 0-6.627-5.373-12-12-12z"></path></svg>
					<span>@Davidmh193</span>
				</div>
			</div>
		</div>

		<div class="row">
			<ul>
				<li>Contacta con nosotros: auroriumresort@gmail.com</li>
				<li><a href="Habitaciones.jsp">Nuestras habitaciones</a></li>
				<li><a href="img/Privacy Policy.pdf">Politicas de
						privacidad</a></li>
				<li><a href="Contacto.jsp">Contacto</a></li>
				<li><a href="Login.jsp"><i class="fa fa-user-o"> </i>Login-empleados</a></li>
			</ul>
		</div>

		<div class="row">
			<div clas="DesignedBy">Aurorium Copyright © 2023 Aurorium - All
				rights reserved || Designed By: Davidmh_7</div>
		</div>
	</div>
</footer>
<script src="js/js.js"></script>
</html>