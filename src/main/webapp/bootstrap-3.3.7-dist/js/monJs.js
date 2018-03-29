var url = location.search;
if (url === '?errors') {
    var errors = document.querySelectorAll('input, textarea');
    errors.forEach(param => { param.classList.add('is-invalid') });
}

function openModal() {

    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function (form) {
        if (form.checkValidity() === false) {

            event.preventDefault();
            event.stopPropagation();

        } else {

            remplirModal(document.getElementById("nomInput").value,
                document.getElementById("prenomInput").value,
                document.getElementById("adresseInput").value,
                document.getElementById("dateDeNaissanceInput").value,
                document.getElementById("numeroSecuriteSocialeInput").value);

            $("#exampleModal").modal();
        }

        form.classList.add('was-validated');

    });

}

function storeData() {

    var nom = document.getElementById("nomInput").value;
    var prenom = document.getElementById("prenomInput").value;
    var adresse = document.getElementById("adresseInput").value;
    var date = document.getElementById("dateDeNaissanceInput").value;
    var numSecu = document.getElementById("numeroSecuriteSocialeInput").value;

    var value = JSON.stringify({nom : nom, prenom : prenom, adresse : adresse, date : date, numSecu : numSecu});

    localStorage.setItem(numSecu, value);

}

function remplirModal(nom, prenom, adresse, date, numSecu) {

    document.getElementById("nom").innerHTML = "Nom : " + nom;
    document.getElementById("prenom").innerHTML = "Prénom : " + prenom;
    document.getElementById("adresse").innerHTML = "Adresse : " + adresse;
    document.getElementById("date").innerHTML = "Date de naissance : " + date;
    document.getElementById("numSecurite").innerHTML = "Numéro de sécurité sociale : " + numSecu;

}