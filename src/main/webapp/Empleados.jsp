<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!--Links CSS-->
<link rel="stylesheet" href="css/Index.css" />
<link rel="stylesheet" href="css/Foter.css">
<link rel="stylesheet" href="css/Administracion.css">


<!--Links letras-->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!-- Letra -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,600">
<!-- Iconos -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<!-- Js -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>Aurorium Resort Administracion</title>
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

						<a href="Administracion" class="link "><i
							class="fa fa-archive"></i></q> Administracion</a> <a
							href="ContactoEmpleados" class="link "><i
							class="fa fa-address-book-o"></i></q> Contacto</a> <a
							href="ReservasAdministracionSer" class="link"><i
							class="fa fa-calendar-check-o"></i></q> Reservas</a> <a href="Empleados"
							class="link active"><i class="fa fa-users"></i></q> Empleados</a> <a
							href="Logout" class="link"><i class="fa fa-user-circle"></i></q>
							Log-out</a>
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

	<!--Tablas De administrador-->
	<section id="tabs" class="project-tab"
		style="margin-top: 30px; margin-bottom: 30%;">

		<div class="container">

			<div class="row">

				<div class="col-md-12">

					<nav>

						<div class="nav nav-tabs nav-fill" id="nav-tab" role="tablist">

							<a class="nav-item nav-link active" id="nav-home-tab"
								data-toggle="tab" href="#nav-home" role="tab"
								aria-controls="nav-home" aria-selected="true">Gestionar

								Empleados</a>
						</div>

					</nav>

					<div class="tab-content" id="nav-tabContent">

						<div class="tab-pane fade show active" id="nav-home"
							role="tabpanel" aria-labelledby="nav-home-tab">

							<table
								class="table table-striped table-bordered table-sm table-list-search">

								<thead>

									<tr>

										<!-- Gestionar Clientes -->

										<th>DNI</th>

										<th>Nombre</th>

										<th>Apellidos</th>

										<th>Telefono</th>

										<th>Direccion</th>

										<th>Localidad</th>

										<th>Rol</th>

										<th>Password</th>

										<th>Modificar</th>

										<th>Eliminar</th>

									</tr>

								</thead>

								<tbody>

									<c:forEach items="${empleados}" var="empleado">

										<tr>

											<td>${empleado.dni}</td>

											<td>${empleado.nombre}</td>

											<td>${empleado.apellido}</td>

											<td>${empleado.telfeono}</td>

											<td>${empleado.direccion}</td>

											<td>${empleado.localidad}</td>

											<td>${empleado.rol}</td>

											<td>${empleado.password}</td>


											<!-- actualizar y eliminar -->

													<td>
											<div class="dropdown">
  										<button class="continue-application" id="dropdownMenuButton" data-toggle="dropdown">
										    <div>
										        <div class="pencil"></div>
										        <div class="folder">
										            <div class="top">
										                <svg viewBox="0 0 24 27">
										                    <path d="M1,0 L23,0 C23.5522847,-1.01453063e-16 24,0.44771525 24,1 L24,8.17157288 C24,8.70200585 23.7892863,9.21071368 23.4142136,9.58578644 L20.5857864,12.4142136 C20.2107137,12.7892863 20,13.2979941 20,13.8284271 L20,26 C20,26.5522847 19.5522847,27 19,27 L1,27 C0.44771525,27 6.76353751e-17,26.5522847 0,26 L0,1 C-6.76353751e-17,0.44771525 0.44771525,1.01453063e-16 1,0 Z"></path>
										                </svg>
										            </div>
										            <div class="paper"></div>
										        </div>
										    </div>
										Modificar
										</button>
  											<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
   											
   											<form method="POST" action="ModificarEmpleados" class="form">
    											<label for="idhabitacion" class="label">Dni</label>
    											<input type="text" id="dnicliente" name="dniempleados" required="" class="input">
    											
											    <label for="precio" class="label">Nombre</label>
											  	<input type="text" id="nombrecliente" name="nombreempleados" required="" class="input">
											  	
											    <label for="password" class="label">Apellido</label>
											    <input type="descripcion" id="apellidocliente" name="apellidoempleados" required="" class="input">
											    
											     <label for="tipohabitacion" class="label">Telefono</label>
											    <input type="text" id="telefonocliente" name="telefonoempleados" required="" class="input">
											    
											      <label for="tipohabitacion" class="label">Direccion</label>
											    <input type="text" id="Direccioncliente" name="Direccionempleados" required="" class="input">
											    
											      <label for="tipohabitacion" class="label">Localidad</label>
											    <input type="text" id="Localidadcliente" name="Localidadempleados" required="" class="input">
											    
											    	      <label for="tipohabitacion" class="label">Rol</label>
											    <input type="text" id="Localidadcliente" name="Rol" required="" class="input">
											    
											    	      <label for="tipohabitacion" class="label">Password</label>
											    <input type="text" id="Localidadcliente" name="Password" required="" class="input">
											    
											    <button type="submit" class="submit">Modificar</button>
  												</form >
  												</div>
												</div>
											
											
											</td>

											<td><a
												href="/Aurorium/Empleadosmodificaciones?id=${empleado.dni}&tipo=empleados"><i
													class="fa-solid fa-trash-can fa-lg"></i></a></td>
											
										</tr>

									</c:forEach>

									<td colspan="11" class="text-center"><a
										href="/MiaKhademia/Insertar?q=profesor"><i
											class="fa-solid fa-plus fa-lg"></i></a></td>

									</tr>
								</tbody>

							</table>

						</div>

					</div>
				</div>

			</div>

		</div>
		<footer>
			<div class="footer"
				style="bottom: 0; width: 100%;">
				<div class="row" style="display: flex; justify-content: center;">
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

				<div class="row" style="display: flex; justify-content: center;">
					Aurorium Copyright © 2023 Aurorium - All rights reserved ||
					Designed By: Davidmh_7</div>
			</div>
		</footer>
		<script src="js/js.js"></script>
	</section>