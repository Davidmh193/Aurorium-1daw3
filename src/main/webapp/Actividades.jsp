<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/Index.css" />
  <link rel="stylesheet" href="css/Foter.css">
  <link rel="stylesheet" href="css/Actividades.css">

  <!--Links letras-->
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

  <title>Aurorium Resort</title>
</head>

<body class="hideScroll">
  <div>
    <header>
      <nav class="wrapper">
        <div class="imagenlogo"><img src="img/LogoAurorium1-removebg-preview.png" alt=""></div>
        <div class="links" id="links">
          <div class="wrapper-links">
              <a href="Index.jsp" class="link "><i class="fa fa-home"></i></q> Home</a>
              <a href="Activides.jsp" class="link active"> <i class="fa fa-globe"></i></q> Actividades</a>
              <a href="Habitaciones.jsp" class="link"><i class="fa fa-bed"></i></q> Habitaciones</a>
              <a href="Reservas.jsp" class="link"> <i class="fa fa-book"></i></q> Reservar</a>
              <a href="Contacto.jsp" class="link"><i class="fa fa-phone"></i></q> Contacto</a>
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
      <div class="contenedor">
        <h3 class="titulo">Actividades</h3>
        <p class="descripcion"> Explora los diferentes servicios complementarios que ofrecemos para una estancia más
          agradable.
        </p>
        <div class="botoncitos"></div>

        <input type="date" class="my-date-picker" style="margin-bottom: 2%;">

        
        <input type="text" class="my-text-input" placeholder="DNI" style="margin-bottom: 2%;">
        <div class="dropdown" style="display:inline-block; margin-bottom: 2%;">
          <select>
            <option value="option1">Pista de Tenis</option>
            <option value="option2">Pista de Padel</option>
            <option value="option3">Pista de golf</option>
            <option value="option4">Spa</option>
            <option value="option5">Salon de juegos</option>
            <option value="option6">Piscina interior</option>
            <option value="option7">Piscina exterior</option>
            <option value="option8">Tratamiento de belleza</option>
            <option value="option4">Gimnasio</option>

          </select>
        </div>

        <button class="my-date-picker" style="margin-bottom: 0.2%;">Inscribirse</button>


      </div>
    </div>

  </main>

</body>
<div class="CuadroBlanco1">
  <div class="primerCuadradito1">
    
    <div class="bienvenida">
      <h2>¡Bienvenidos a Aurorium, su próximo destino vacacional!</h2>
      <p style="margin-bottom: 5.5%;">
        <br>
        En nuestro hotel, ofrecemos una amplia variedad de actividades y servicios para que nuestros huéspedes disfruten de una estancia única. Tanto si eres un amante del deporte o prefieres relajarte y disfrutar de un momento de desconexión y bienestar en nuestras instalaciones tenemos todo lo que necesitas para hacer de tu estancia una experiencia inolvidable.
      </p>
    </div>

    <div class="dash"></div>
</div>
</div>
    <div class="card">
      <img src="img/PistaTenis.jpg">
      <h4>Deportes</h4>
      <h2>Pista de tenis</h2>
      <p>Nuestras pistas de tenis están diseñadas para satisfacer a los jugadores mas exigentes. Con una superficie de
        alta calidad, las pistas ofrecen una excelente traccion y un bote de pelota uniforme para un juego fluido. <br>
        Ademas, nuestras pistas estan iluminadas para que puedas seguir jugando incluso despues de la puesta de sol.</p>
      <button style="background-color: #25263a;">Inscribirse</button>

      <div class="precio">Precio: 25€ / Por persona </div>
      </div>
    </div>

    <div class="card">
      <img src="img/PistaGolf.jpg" alt="Imagen de ejemplo">
      <h4>Deportes</h4>
      <h2>Pista de golf</h2>
      <p>Nuestro campo de golf está diseñado para ofrecer un desafío emocionante a golfistas de todos los niveles. Con
        hermosos paisajes y obstáculos estratégicamente colocados, cada hoyo ofrece una experiencia única. <br> Además,
        nuestro campo cuenta con un equipo de profesionales disponibles para dar clases y mejorar tu juego.</p>
      <button style="background-color: #25263a; ">Inscribirse</button>
      <div class="precio">Precio: 40€ / Por persona </div>

    </div>

    <div class="card">
      <img src="img/PistaPadel.jpg">
      <h4>Deportes</h4>
      <h2>Pista de padel</h2>
      <p>.En nuestras pistas de padel, podrás disfrutar de un emocionante juego en equipo o individual. Con una superficie de alta calidad, las pistas ofrecen un bote de pelota uniforme para un juego fluido. Además, al igual que las pistas de tenis, se dispone de iluminación en los momentos más nocturnos.</p>
      <button style="background-color: #25263a;">Inscribirse</button>
      <div class="precio">Precio: 30€ / Por persona </div>

    </div>

    <div class="card">
      <img src="img/Gimnasio.jpg">
      <h4>Fitness</h4>
      <h2>Gimnasio</h2>
      <p>Nuestro gimnasio cuenta con una amplia variedad de equipos de alta calidad para satisfacer todas tus
        necesidades de entrenamiento. <br> Desde máquinas de cardio hasta pesas libres y equipo de entrenamiento funcional, br nuestro gimnasio tiene todo lo que necesitas para mantenerte fitness</p>
      <button style="background-color: #25263a;">Inscribirse</button>
      <div class="precio">Precio: 32€ / mes </div>

    </div>

    <div class="card">
      <img src="img/SalonJuegos.jpg" alt="Imagen de ejemplo">
      <h4>Ocio</h4>
      <h2>Salón de juegos</h2>
      <p>Nuestro salón de juegos y arcade es perfecto para aquellos que quieran disfrutar de una tarde divertida.
        Ofrecemos una variedad de juegos clásicos y modernos para todas las edades, además de todas las consolas de última generación.</p>
      <button style="background-color: #25263a;">Inscribirse</button>
      <div class="precio">Precio: 59€ / Por persona </div>

    </div>

    <div class="card">
      <img src="img/PiscinaExterior.jpg" alt="Imagen de ejemplo">
      <h4>Piscinas</h4>
      <h2>Piscina exterior</h2>
      <p>Nuestra piscina exterior es el lugar perfecto para disfrutar de un día de sol y diversión. Con una amplia zona
        de baño y duchas exteriores, tumbonas y sombrillas, podrás relajarte y disfrutar de un ambiente relajante al aire libre con tus seres queridos.</p>
      <button style="background-color: #25263a;">Inscribirse</button>
      <div class="precio">Precio: 35€ / Por persona </div>

    </div>

    <div class="card">
      <img src="img/PiscinaInterior.jpg" alt="Imagen de ejemplo">
      <h4>Piscinas</h4>
      <h2>Piscina interior</h2>
      <p>Nuestra piscina de interior es perfecta para nadar y hacer ejercicio en cualquier clima. Con agua cálida y una
        iluminación suave, podrás relajarte y disfrutar de un ambiente tranquilo y relajante.</p>
      <button style="background-color: #25263a;">Inscribirse</button>
      <div class="precio">Precio: 45€ / Por persona </div>

    </div>

    <div class="card">
      <img src="img/Belleza.jpg">
      <h4>Relajación</h4>
      <h2>Tratamiento de belleza</h2>
      <p>Nuestro tratamiento completo de belleza te ayudará a lucir y sentirte lo mejor posible. Desde cuidado de la
        piel hasta servicios de peluquería y manicura, nuestro equipo de profesionales te ayudará a encontrar el look
        perfecto para ti.</p>
      <button style="background-color: #25263a;">Inscribirse</button>
      <div class="precio">Precio: 75€ / Por persona </div>

    </div>

    <div class="card">
      <img src="img/Spa.jpg" alt="Imagen de ejemplo">
      <h4> Spas </h4>
      <h2>Spa Aurorium</h2>
      <p>Nuestro spa ofrece una experiencia de relajación incomparable. Con una amplia gama de tratamientos de spa,
        desde masajes hasta tratamientos de belleza y bienestar, nuestro equipo de profesionales te ayudará a
        rejuvenecer y revitalizar tu cuerpo y mente.</p>
      <button style="background-color: #25263a;">Inscribirse</button>
      <div class="precio">Precio: 85€ / Por persona </div>

    </div>

 <footer>
    <div class="footer">
      <div class="row">
        <div class="social-links">
          <div id="twitter" class="social-btn flex-center">
              <svg viewBox="0 0 24 24" height="24" width="24" xmlns="http://www.w3.org/2000/svg"><path d="M24 4.557c-.883.392-1.832.656-2.828.775 1.017-.609 1.798-1.574 2.165-2.724-.951.564-2.005.974-3.127 1.195-.897-.957-2.178-1.555-3.594-1.555-3.179 0-5.515 2.966-4.797 6.045-4.091-.205-7.719-2.165-10.148-5.144-1.29 2.213-.669 5.108 1.523 6.574-.806-.026-1.566-.247-2.229-.616-.054 2.281 1.581 4.415 3.949 4.89-.693.188-1.452.232-2.224.084.626 1.956 2.444 3.379 4.6 3.419-2.07 1.623-4.678 2.348-7.29 2.04 2.179 1.397 4.768 2.212 7.548 2.212 9.142 0 14.307-7.721 13.995-14.646.962-.695 1.797-1.562 2.457-2.549z"></path></svg><span>@Aurorium</span>
          </div>
      
          <div id="linkedin" class="social-btn flex-center">
              <svg viewBox="0 0 24 24" height="24" width="24" xmlns="http://www.w3.org/2000/svg"><path d="M4.98 3.5c0 1.381-1.11 2.5-2.48 2.5s-2.48-1.119-2.48-2.5c0-1.38 1.11-2.5 2.48-2.5s2.48 1.12 2.48 2.5zm.02 4.5h-5v16h5v-16zm7.982 0h-4.968v16h4.969v-8.399c0-4.67 6.029-5.052 6.029 0v8.399h4.988v-10.131c0-7.88-8.922-7.593-11.018-3.714v-2.155z"></path></svg><span>@Davidmh_7</span>
          </div>
      
          <div id="github" class="social-btn flex-center">
              <svg viewBox="0 0 24 24" height="24" width="24" xmlns="http://www.w3.org/2000/svg"><path d="M12 0c-6.626 0-12 5.373-12 12 0 5.302 3.438 9.8 8.207 11.387.599.111.793-.261.793-.577v-2.234c-3.338.726-4.033-1.416-4.033-1.416-.546-1.387-1.333-1.756-1.333-1.756-1.089-.745.083-.729.083-.729 1.205.084 1.839 1.237 1.839 1.237 1.07 1.834 2.807 1.304 3.492.997.107-.775.418-1.305.762-1.604-2.665-.305-5.467-1.334-5.467-5.931 0-1.311.469-2.381 1.236-3.221-.124-.303-.535-1.524.117-3.176 0 0 1.008-.322 3.301 1.23.957-.266 1.983-.399 3.003-.404 1.02.005 2.047.138 3.006.404 2.291-1.552 3.297-1.23 3.297-1.23.653 1.653.242 2.874.118 3.176.77.84 1.235 1.911 1.235 3.221 0 4.609-2.807 5.624-5.479 5.921.43.372.823 1.102.823 2.222v3.293c0 .319.192.694.801.576 4.765-1.589 8.199-6.086 8.199-11.386 0-6.627-5.373-12-12-12z"></path></svg><a href="https://github.com/Davidmh193/Aurorium-1daw3"></a><span>@Davidmh193</span>
          </div>
        </div>
      </div>
      
      <div class="row">
        <ul>
           	<li><a href="">Contacta con nosotros</a></li>
  			<li><a href="#">Nuestras habitaciones</a></li>
 		 	<li><a href="#">Politicas de privacidad</a></li>
  			<li><a href="#">Contacto</a></li>
 			<li><a href="Login.jsp"><i class="fa fa-user-o"> </i>Login-empleados</a></li>
        </ul>
      </div>
      
      	<div class="row">
      	Aurorium Copyright © 2023 Aurorium - All rights reserved || Designed By: Davidmh_7 
      	</div>
    	</div>
    </footer>

<script src="js/js.js"></script>
</html>