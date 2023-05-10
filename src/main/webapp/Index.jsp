<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!--Links CSS-->
<link rel="stylesheet" href="css/Index.css" />
<link rel="stylesheet" href="css/Foter.css">

<!--Links letras-->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

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
						<a href="Index.jsp" class="link active"><i class="fa fa-home"></i></q>
							Home</a> <a href="Activides.html" class="link "> <i
							class="fa fa-globe"></i></q> Actividades
						</a> <a href="Habitaciones.jsp" class="link"><i class="fa fa-bed"></i></q>
							Habitaciones</a> <a href="Reservas.jsp" class="link"> <i
							class="fa fa-book"></i></q> Reservar
						</a> <a href="Contacto.jsp" class="link"><i class="fa fa-phone"></i></q>
							Contacto</a>
					</div>
				</div>
				<div class="icon-links" id="button-menu">
					<div></div>
					<div></div>
					<div></div>
				</div>
			</nav>
		</header>

		<video class="lazy" id="heroVideo" muted="" autoplay="" preload="auto"
			playsinline="" loop="" poster="dist/images/hero-poster.jpg">
			<source src="img/Agua.mp4" type="video/mp4">
		</video>


	</div>
	<main class="main-page">
		<div class="hero-container">
			<h1 class="title">Descubre el mundo, relájate en Aurorium. Tu
				hogar lejos del hogar</h1>
			<p class="description">Encuentra la escapada perfecta para un
				viaje de ensueño</p>
			<div class="button-container">
				<a href="Reservas.jsp" class="button">EXPLORE NOW</a>
			</div>
		</div>
	</main>


	<div class="texto">
		<p>Nuestra historia</p>

		<div class="textoinicio">
			En el año 2012, dos amigos de la universidad, David y Marius,
			decidieron tomarse unas vacaciones juntos. Mientras buscaban
			alojamiento, se dieron cuenta de lo difícil que era encontrar la
			combinación perfecta de precio y calidad. Frustrados con las
			plataformas de reserva de hoteles existentes, decidieron crear su
			propia plataforma: "Aurorium Resort" <br></br> David y Marius
			comenzaron a trabajar en la plataforma en su tiempo libre mientras
			aún mantenían sus trabajos de tiempo completo. Finalmente, en 2022,
			lanzaron Aurorium al público. A diferencia de otras plataformas,
			Aurorium se centró en la transparencia de precios y la experiencia
			del usuario, ofreciendo a los viajeros una forma fácil de reservar
			habitaciones a precios asequibles. A pesar de la competencia feroz en
			el mercado de las reservas de hoteles en línea, Aurorium logró ganar
			una base de clientes leales y creció rápidamente. Tom y Sarah
			atribuyen su éxito a su enfoque centrado en el usuario y su capacidad
			para adaptarse rápidamente a las necesidades del mercado. <br></br>
			Hoy en día, Aurorium es una plataforma de reserva de hoteles líder en
			el mercado y sigue siendo administrada por sus fundadores, quienes
			han creado una cultura empresarial única que valora la transparencia,
			la honestidad y la colaboración.
		</div>
	</div>
	<div class="imagenestexto"></div>
	<div class="dash"></div>

	<div class="card"
		style="background-image: url(img/TROPICAL\ HOME\ DECOR_\ 9\ QUICK\ AND\ EASY\ DECORATING\ IDEAS.jpg)">
		<div class="card-top">
			<p class="card__title">Marcos Martinez</p>
			<div class="rating">
				<svg width="17" height="17" viewBox="0 0 17 17" fill="none">
              <path
						d="M8.51948 1.625C9.1214 1.625 10.0427 4.16625 10.4636 5.43013C10.6014 5.8437 10.9837 6.13054 11.4192 6.14904C12.7373 6.20505 15.375 6.39722 15.375 7.0384C15.375 7.66696 13.5161 9.17543 12.5322 9.92976C12.1816 10.1986 12.0365 10.6604 12.1687 11.082C12.5631 12.34 13.2755 14.8755 12.7573 15.3009C12.2506 15.717 10.2147 14.2326 9.15246 13.4009C8.77021 13.1016 8.22949 13.1012 7.84719 13.4004C6.78473 14.2321 4.75246 15.717 4.28166 15.3009C3.79912 14.8745 4.47615 12.3275 4.84741 11.0727C4.97086 10.6555 4.82425 10.2029 4.47885 9.93826C3.49798 9.18681 1.625 7.66933 1.625 7.0384C1.625 6.3962 4.2711 6.20444 5.5871 6.14878C6.0197 6.13048 6.3998 5.84769 6.53973 5.43793C6.97041 4.17673 7.91633 1.625 8.51948 1.625Z"
						fill="#00B9AE" stroke="#00B9AE" stroke-width="2"
						stroke-linecap="round" stroke-linejoin="round"></path>
          </svg>
			</div>
		</div>
		<div class="card__info">
			<p class="episode__num">Puntuacion</p>
			<p class="episode__type">Fabuloso</p>
		</div>
		<a href="Reservas.jsp" style="text-decoration: none;">
			<div class="card__btns">
				<button class="add-btn">+</button>
				<button class="watch-btn">Ver</button>
			</div>
	</div>
	</a>
	<div class="card"
		style="margin-left: 105px; background-image: url(img/Habitacion3.jpg);">
		<div class="card-top">
			<p class="card__title">Arnold Bermell</p>
			<div class="rating">
				<svg width="17" height="17" viewBox="0 0 17 17" fill="none">
              <path
						d="M8.51948 1.625C9.1214 1.625 10.0427 4.16625 10.4636 5.43013C10.6014 5.8437 10.9837 6.13054 11.4192 6.14904C12.7373 6.20505 15.375 6.39722 15.375 7.0384C15.375 7.66696 13.5161 9.17543 12.5322 9.92976C12.1816 10.1986 12.0365 10.6604 12.1687 11.082C12.5631 12.34 13.2755 14.8755 12.7573 15.3009C12.2506 15.717 10.2147 14.2326 9.15246 13.4009C8.77021 13.1016 8.22949 13.1012 7.84719 13.4004C6.78473 14.2321 4.75246 15.717 4.28166 15.3009C3.79912 14.8745 4.47615 12.3275 4.84741 11.0727C4.97086 10.6555 4.82425 10.2029 4.47885 9.93826C3.49798 9.18681 1.625 7.66933 1.625 7.0384C1.625 6.3962 4.2711 6.20444 5.5871 6.14878C6.0197 6.13048 6.3998 5.84769 6.53973 5.43793C6.97041 4.17673 7.91633 1.625 8.51948 1.625Z"
						fill="#00B9AE" stroke="#00B9AE" stroke-width="2"
						stroke-linecap="round" stroke-linejoin="round"></path>
          </svg>
			</div>
		</div>
		<div class="card__info">
			<p class="episode__num">Puntuacion</p>
			<p class="episode__type">Increible</p>
		</div>
		<a href="Reservas.jsp" style="text-decoration: none;">
			<div class="card__btns">
				<button class="add-btn">+</button>
				<button class="watch-btn">Ver</button>
			</div>
	</div>
	</a>


	<div class="card"
		style="margin-left: 105px; background-image: url(img/21\ Overwater\ Bungalows\ That\ Are\ Truly\ Like\ Heaven\ on\ Earth.jpg);">
		<div class="card-top">
			<p class="card__title">David Mangas</p>
			<div class="rating">
				<svg width="17" height="17" viewBox="0 0 17 17" fill="none">
              <path
						d="M8.51948 1.625C9.1214 1.625 10.0427 4.16625 10.4636 5.43013C10.6014 5.8437 10.9837 6.13054 11.4192 6.14904C12.7373 6.20505 15.375 6.39722 15.375 7.0384C15.375 7.66696 13.5161 9.17543 12.5322 9.92976C12.1816 10.1986 12.0365 10.6604 12.1687 11.082C12.5631 12.34 13.2755 14.8755 12.7573 15.3009C12.2506 15.717 10.2147 14.2326 9.15246 13.4009C8.77021 13.1016 8.22949 13.1012 7.84719 13.4004C6.78473 14.2321 4.75246 15.717 4.28166 15.3009C3.79912 14.8745 4.47615 12.3275 4.84741 11.0727C4.97086 10.6555 4.82425 10.2029 4.47885 9.93826C3.49798 9.18681 1.625 7.66933 1.625 7.0384C1.625 6.3962 4.2711 6.20444 5.5871 6.14878C6.0197 6.13048 6.3998 5.84769 6.53973 5.43793C6.97041 4.17673 7.91633 1.625 8.51948 1.625Z"
						fill="#00B9AE" stroke="#00B9AE" stroke-width="2"
						stroke-linecap="round" stroke-linejoin="round"></path>
          </svg>
			</div>
		</div>
		<div class="card__info">
			<p class="episode__num">Puntuacion</p>
			<p class="episode__type">Perfecto</p>
		</div>
		<a href="Reservas.jsp" style="text-decoration: none;">
			<div class="card__btns">
				<button class="add-btn">+</button>
				<button class="watch-btn">Ver</button>
			</div>
	</div>
	</a>

	<!--Fotter-->
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
						<a href="https://github.com/Davidmh193/Aurorium-1daw3"></a><span>@Davidmh193</span>
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

			<div class="row">Aurorium Copyright © 2023 Aurorium - All
				rights reserved || Designed By: Davidmh_7</div>
		</div>
	</footer>
	<script src="js/js.js"></script>
</body>
</html>