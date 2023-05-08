<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!--Links CSS-->
    <link rel="stylesheet" href="css/Index.css" />
    <link rel="stylesheet" href="css/Contacto.css">
    <link rel="stylesheet" href="css/Foter.css">
    
    <!--Links letras-->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"
      rel="stylesheet"
    /><link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <title>Contacto</title>
  </head>
  <body class="hideScroll">
    <div>
      <header>
        <nav class="wrapper">
         <div class="imagenlogo"><img src="img/LogoAurorium1-removebg-preview.png" alt=""></div>
          <div class="links" id="links">
            <div class="wrapper-links">
              <a href="Index.jsp" class="link"><i class="fa fa-home"></i></q> Home</a>
              <a href="Activides.jsp" class="link "><i class="fa fa-globe"></i></q> Actividades</a>
              <a href="Habitaciones.jsp" class="link"><i class="fa fa-bed"></i></q> Habitaciones</a>
              <a href="Reservas.jsp" class="link"> <i class="fa fa-book"></i></q> Reservar</a>
              <a href="Contacto.jsp" class="link active"><i class="fa fa-phone"></i></q> Contacto</a>
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
    <section class = "contact-section">
        <div class = "contact-bg">
          <h3>Contacta Con Nosotros</h3>
          <h2>CONTACTA</h2>
          <div class = "line">
            <div></div>
            <div></div>
            <div></div>
          </div>
          <div class="textoh2"><p class = "text">¡Nos encantaría saber de ti! En Aurorium estamos comprometidos en brindar el mejor servicio a nuestros clientes y resolver todas tus inquietudes. Si tienes preguntas acerca de nuestros productos y servicios, o si necesitas ayuda en cualquier aspecto, no dudes en contactarnos. Puedes llenar el formulario a continuación, o si prefieres, puedes encontrarnos en nuestras redes sociales. ¡Estamos ansiosos por escucharte y ayudarte en todo lo que podamos!</p>
        </div></div>
  
  
        <div class = "contact-body">
          <div class = "contact-info">
            <div>
              <span><i class = "fas fa-mobile-alt"></i></span>
              <span>Telefono</span>
              <span class = "text">9426515168</span>
            </div>
            <div>
              <span><i class = ""></i></span>
              <span>@E-mail</span>
              <span class = "text">Aurorium@gmail.com</span>
            </div>
            <div>
              <span><i class = "fas fa-map-marker-alt"></i></span>
              <span>Direccion</span>
              <span class = "text">The Residence Maldives at Dhigurah</span>
            </div>
            <div>
              <span><i class = "fas fa-clock"></i></span>
              <span>Abierto</span>
              <span class = "text">Lunes - Domingo (9:30 de la mañana a 4:00 de la mañana)</span>
            </div>
          </div>
  
          <div class = "contact-form">
            <form method="post" action="Contacto">
              <div>
                <input type = "text" class = "form-control" placeholder="Dni" name="Dni">
                <input type = "text" class = "form-control" placeholder="Nombre-apellido" name="Nombreapellido">
              </div>
              <div>
                <input type = "email" class = "form-control" placeholder="E-mail" name="Email">
                <input type = "text" class = "form-control" placeholder="Telefono" name="Telefono">
              </div>
              <textarea rows = "5" placeholder="Mensaje" class = "form-control" name ="mensaje"></textarea>
              <!--Botn de enviar-->
              <button class="learn-more">
                <span class="circle" aria-hidden="true">
                <span class="icon arrow"></span>
                </span>
                <span type="submit" class="button-text">Enviar</span>
              </button>
            </form>
  
           
          </div>
        </div>
  
        <div class = "map" style="display: in-lineblock;">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d126987.59580611574!2d80.79346570792633!3d5.944697707798066!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3ae14b46e8ec579d%3A0x718cdbc5130964ba!2sVilla%20Lyvie%20-%20hotel%20and%20Spa%2Fwellness!5e0!3m2!1ses!2ses!4v1681906700810!5m2!1ses!2ses" width="700" height="450" style="border:0; margin-left: 54%; margin-top: -400px; margin-bottom: 3%;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div>

      


<!--Fotter-->
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
              <svg viewBox="0 0 24 24" height="24" width="24" xmlns="http://www.w3.org/2000/svg"><path d="M12 0c-6.626 0-12 5.373-12 12 0 5.302 3.438 9.8 8.207 11.387.599.111.793-.261.793-.577v-2.234c-3.338.726-4.033-1.416-4.033-1.416-.546-1.387-1.333-1.756-1.333-1.756-1.089-.745.083-.729.083-.729 1.205.084 1.839 1.237 1.839 1.237 1.07 1.834 2.807 1.304 3.492.997.107-.775.418-1.305.762-1.604-2.665-.305-5.467-1.334-5.467-5.931 0-1.311.469-2.381 1.236-3.221-.124-.303-.535-1.524.117-3.176 0 0 1.008-.322 3.301 1.23.957-.266 1.983-.399 3.003-.404 1.02.005 2.047.138 3.006.404 2.291-1.552 3.297-1.23 3.297-1.23.653 1.653.242 2.874.118 3.176.77.84 1.235 1.911 1.235 3.221 0 4.609-2.807 5.624-5.479 5.921.43.372.823 1.102.823 2.222v3.293c0 .319.192.694.801.576 4.765-1.589 8.199-6.086 8.199-11.386 0-6.627-5.373-12-12-12z"></path></svg><span>@Davidmh193</span>
          </div>
        </div>
      </div>
      
  <div class="row">
        <ul>
           	<li><a href="#">Contacta con nosotros</a></li>
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
  </body>
</html>