<%@page import="dev.sgp.service.DepartementService"%>
<%@page import="dev.sgp.service.CollaborateurService"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@page import="java.util.List, dev.sgp.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<script
	src="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/js/monJs.js"></script>

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Log</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">

				<li class="nav-item"><a class="nav-link" href="index.html">Collaborateurs</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="statistique.html">Statistiques</a></li>
				<li class="nav-item"><a class="nav-link" href="activite.html">Activités</a>
				</li>

			</ul>

		</div>
	</nav>

	<div class="container-fluid">

		<div class="row justify-content-end mt-2 mr-2">

			<div class=".col-auto">
				<a href='creer'>
					<button type="button" class="btn btn-outline-dark">Ajouter
						un nouveau collaborateur</button>
				</a>

			</div>

		</div>

		<div class="row">

			<div class="col ml-4">
				<h1>Les collaborateurs</h1>
			</div>

		</div>
		<form class="needs-validation mt-4" action="lister" method="post"
			novalidate>
			<div class="row mt-4">

				<div class="col-12 col-sm-6 col-md-6 col-lg-4 text-md-right">
					Rechercher un nom ou un prénom qui commence par :</div>

				<div class="input-group col-12 col-sm-6 col-md-6 col-lg-4">
					<input type="text" class="form-control"
						aria-describedby="basic-addon2">
					<div class="input-group-append">
						<button class="btn btn-outline-secondary" type="submit">Rechercher</button>
					</div>
				</div>

				<div
					class="form-check col-12 col-sm-12 col-md-12 col-lg-4 text-right text-lg-center">
					<input class="form-check-input" type="checkbox" value=""
						id="defaultCheck1"> <label class="form-check-label"
						for="defaultCheck1"> Voir les collaborateurs désactivés </label>
				</div>

			</div>

			<div class="row mt-4">

				<div class="col-12 col-sm-6 col-lg-4 text-sm-right">Filtrer
					par département :</div>

				<div class="input-group col-12 col-sm-6 col-lg-4">
					<select class="custom-select" id="departementInput"
						name="departementInput">

						<option selected value=0>Tous</option>

						<%
							List<Departement> departements = new DepartementService().listerDepartements();

							for (Departement d : departements) {
						%>

						<option value=<%=d.getId()%>><%=d.getNom()%></option>

						<%
							}
						%>
					</select>
				</div>

			</div>

		</form>

		<div class="row mt-4 ml-2 mr-2">

			<%
				List<Collaborateur> collaborateurs = CollaborateurService.listerCollaborateurs();

				int filter = 0;

				if ((String) request.getAttribute("filter") != null) {
					filter = Integer.parseInt((String) request.getAttribute("filter"));
				}

				for (Collaborateur c : collaborateurs) {

					if (filter == c.getDepartement().getId()) {
			%>

			<div class="card col-12 col-md-6 col-lg-6 col-xl-4 mb-2"
				style="width: 18rem;">

				<div class="card-header">
					<%=c.getNom()%>
					<%=c.getPrenom()%>
				</div>

				<div class="card-body">

					<div class="row">

						<div class="col-12 col-sm-auto mt-2">
							<div class="centerBlock">
								<img class="rounded float-left" src="images/cent_cent.png"
									alt="Card image cap">
							</div>
						</div>

						<div class="col mt-2">
							<div class="row">

								<div class="col-6">Fonction :</div>
								<div class="col-6">Une fonction</div>

							</div>

							<div class="row">

								<div class="col-6">Département :</div>
								<div class="col-6">Un département</div>

							</div>

							<div class="row">

								<div class="col-6">Email :</div>
								<div class="col-6"><%=c.getEmailPro()%></div>

							</div>

							<div class="row">

								<div class="col-6">Téléphone :</div>
								<div class="col-6">06 43 52 10 52</div>

							</div>

							<div class="row justify-content-end mt-2">

								<div class="col-8"></div>

								<div class="col-4">
									<a href="editer-collab.html" class="btn btn-outline-dark">Editer</a>
								</div>

							</div>
						</div>

					</div>

				</div>
			</div>

			<%
				}
				}
			%>
		</div>



	</div>

</body>
</html>