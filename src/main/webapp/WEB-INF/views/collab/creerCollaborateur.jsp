<%@page import="java.util.List"%>
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

		<form class="needs-validation mt-4" onsubmit="storeData()" action="creer" method="post" novalidate>

			<div class="form-row justify-content-center">
				<div class="col-10 col-sm-8 col-md-6 col-lg-4 mb-3">
					<label for="nomInput">Nom</label> <input type="text"
						class="form-control" id="nomInput" name="nomInput" placeholder="Nom" required>
					<div class="invalid-feedback">Veuillez saisir un nom correct.
					</div>
				</div>
			</div>

			<div class="form-row justify-content-center">
				<div class="col-10 col-sm-8 col-md-6 col-lg-4 mb-3">
					<label for="prenomInput">Prénom</label> <input type="text"
						class="form-control" id="prenomInput" name="prenomInput" placeholder="Prénom"
						value="Emmanuel" required>
					<div class="invalid-feedback">Veuillez saisir un prénom
						correct.</div>
				</div>
			</div>


			<div class="form-row justify-content-center">
				<div class="col-10 col-sm-8 col-md-6 col-lg-4 mb-3">
					<label for="dateInput">Date de naissance</label> <input type="date"
						class="form-control" id="dateDeNaissanceInput" name="dateDeNaissanceInput" placeholder="dd/mm/yyyy"
						value="25/01/1995" required>
					<div class="invalid-feedback">Veuillez saisir une date de
						naissance correct.</div>
				</div>
			</div>

			<div class="form-row justify-content-center">
				<div class="col-10 col-sm-8 col-md-6 col-lg-4 mb-3">
					<label for="adresseInput">Adresse</label> <input type="text"
						class="form-control" id="adresseInput" name="adresseInput" placeholder="Adresse"
						value="Une adresse" required>
					<div class="invalid-feedback">Veuillez saisir une adresse
						correct.</div>
				</div>
			</div>

			<div class="form-row justify-content-center">
				<div class="col-10 col-sm-8 col-md-6 col-lg-4 mb-3">
					<label for="numSecuInput">Numéro de sécurité sociale</label> <input
						type="text" class="form-control" id="numeroSecuriteSocialeInput" name="numeroSecuriteSocialeInput"
						placeholder="Numéro de sécurité sociale" value="016830598248"
						required>
					<div class="invalid-feedback">Veuillez saisir un numéro de
						sécurité sociale correct.</div>
				</div>
			</div>
			<div class="form-row justify-content-end">
				<div class="col-10 col-sm-8 col-md-6 col-lg-4 mb-3">
					<button id="actionmodal" class="btn btn-primary" type="button"
						onclick="openModal()">Créer</button>
				</div>
			</div>

			<!-- Modal -->
			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
				<div class="modal-dialog modal-dialog-centered" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLongTitle">Création
								d'un Collaborateur</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<p>Vous êtes sur le point de créer un nouveau collaborateur</p>
							<p id="nom"></p>
							<p id="prenom"></p>
							<p id="date"></p>
							<p id="adresse"></p>
							<p id="numSecurite"></p>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Annuler</button>
							<button type="submit" class="btn btn-primary">Confirmer</button>
						</div>
					</div>
				</div>
			</div>

		</form>



	</div>

</body>
</html>