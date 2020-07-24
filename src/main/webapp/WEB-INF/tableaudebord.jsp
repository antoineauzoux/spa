<%@ page import="java.util.ArrayList" %>
<%@ page import="com.cda.bean.Chien" %><%--
  Created by IntelliJ IDEA.
  User: antoi
  Date: 23/07/2020
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Home - Dog Dog</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/bootstrap/css/monCSS.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kaushan+Script">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <script>
        /* Cette fonction permet d'afficher une vignette pour chaque image sélectionnée */
        function readFilesAndDisplayPreview(files) {
            let imageList = document.querySelector('#list');
            imageList.innerHTML = "";

            for (let file of files) {
                let reader = new FileReader();

                reader.addEventListener("load", function (event) {
                    let span = document.createElement('span');
                    span.innerHTML = '<img height="60" src="' + event.target.result + '" />';
                    imageList.appendChild(span);
                });

                reader.readAsDataURL(file);
            }
        }
    </script>
</head>
<body>
${ sessionScope.nom }
${ sessionScope.prenom }


<body id="page-top">
<nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark" id="mainNav">
    <div class="container"><a class="navbar-brand" href="#page-top">Dog&amp;Dog</a>
        <button data-toggle="collapse" data-target="#navbarResponsive" class="navbar-toggler navbar-toggler-right"
                type="button" data-toogle="collapse" aria-controls="navbarResponsive" aria-expanded="false"
                aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="nav navbar-nav ml-auto text-uppercase">
                <li class="nav-item" role="presentation"></li>
                <li class="nav-item" role="presentation"></li>
                <li class="nav-item" role="presentation"><a class="nav-link js-scroll-trigger" href="#team">log out</a>
                </li>
                <li class="nav-item" role="presentation"><a class="nav-link js-scroll-trigger"
                                                            href="#contact">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>


<!-- Team -->
<section id="team-carte" class="pb-5">
    <div class="container">
        <h5 class="section-title h1">OUR TEAM</h5>
        <div class="row justify-content-center">
            <!-- Team member -->
            <%
                ArrayList<Chien> listeChiens = (ArrayList<Chien>) request.getAttribute("listeChiens");
                for (Chien monChien : listeChiens) {
            %>
            <div class="col-xs-12 col-sm-8 col-md-6">
                <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                    <div class="mainflip">
                        <div class="frontside">
                            <div class="card">
                                <div class="card-body text-center">
                                    <p><img class=" img-fluid"
                                            src="https://sunlimetech.com/portfolio/boot4menu/assets/imgs/team/img_01.png"
                                            alt="card image"></p>
                                    <h4 class="card-title"><%= monChien.getNom() %>
                                    </h4>
                                    <p class="card-text">Informations détaillées au dos de la carte.</p>
                                </div>
                            </div>
                        </div>
                        <div class="backside">
                            <div class="card">
                                <div class="card-body mt-4">
                                    <h4 class="card-title text-center "><%= monChien.getNom() %>.
                                    </h4>
                                    <p class="card-text">N° <%= monChien.getPuceChien() %>.
                                    </p>
                                    <p class="card-text"><%= monChien.getCouleur() %>.
                                    </p>
                                    <p class="card-text"><%= monChien.getAge() %> ans.
                                    </p>
                                    <ul class="list-inline">
                                        <li class="list-inline-item">
                                            <button type="button" class="btn btn-primary btn-circle"><i
                                                    class="fa fa-list" data-toggle="modal"
                                                    data-target="#modalCreerChien"></i>
                                            </button>
                                        </li>
                                        <li class="list-inline-item">
                                            <button type="button" class="btn btn-warning btn-circle"><i
                                                    class="fa fa-times"></i>
                                            </button>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%} %>
            <!-- ./Team member -->
        </div>
    </div>
</section>
<div class="masthead"
     style="background-image: url(assets/img/dashboard.jpg);width: 1920;height: 1080;opacity: 0.4;">
    <div class="container" style="height: 800px;">
    </div>
</div>

<section id="contact" style="background-image:url(assets/img/map-image.png);">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="text-uppercase section-heading">Nous contacter</h2>
                <h3 class="section-subheading text-muted">Si vous désirez plus d'informations, vous pouvez
                    utiliser le
                    formulaire ci-dessous.</h3>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <form id="contactForm" name="contactForm" novalidate="novalidate">
                    <div class="form-row">
                        <div class="col col-md-6">
                            <div class="form-group"><input class="form-control" type="text" id="name"
                                                           placeholder="Votre Nom *" required=""
                                                           style="font-size: 16px;"><small
                                    class="form-text text-danger flex-grow-1 help-block lead"></small></div>
                            <div class="form-group"><input class="form-control" type="email" id="email"
                                                           placeholder="Votre Email *" required=""><small
                                    class="form-text text-danger help-block lead"></small></div>
                            <div class="form-group"><input class="form-control" type="tel"
                                                           placeholder="Votre Téléphone *"
                                                           required=""><small
                                    class="form-text text-danger help-block lead"></small></div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group"><textarea class="form-control" id="message"
                                                              placeholder="Votre Message *"
                                                              required=""></textarea><small
                                    class="form-text text-danger help-block lead"></small></div>
                        </div>
                        <div class="col">
                            <div class="clearfix"></div>
                        </div>
                        <div class="col-lg-12 text-center">
                            <div id="success"></div>
                            <button class="btn btn-primary btn-xl text-uppercase" id="sendMessageButton"
                                    type="submit">
                                Envoyer
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-4"><span class="copyright">Copyright&nbsp;© Dog & Dog 2020</span></div>
            <div class="col-md-4">
                <ul class="list-inline social-buttons">
                    <li class="list-inline-item"><a href="https://twitter.com/dogdog67499013"><i
                            class="fa fa-twitter"></i></a></li>
                    <li class="list-inline-item"><a
                            href="https://www.facebook.com/DogDog-110593860738671"><i
                            class="fa fa-facebook"></i></a></li>
                    <li class="list-inline-item"><a href="https://www.linkedin.com/in/dog-dog-a416b61b3"><i
                            class="fa fa-linkedin"></i></a></li>
                </ul>
            </div>
            <div class="col-md-4">
                <ul class="list-inline quicklinks">
                    <li class="list-inline-item"></li>
                    <li class="list-inline-item"></li>
                </ul>
            </div>
        </div>
    </div>
</footer>
<form method="post" action="AjoutChienServlet" enctype="multipart/form-data">
    <div class="modal fade" id="modalCreerChien" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog modal-notify modal-warning" role="document">
            <!--Content-->
            <div class="modal-content">
                <!--Header-->
                <div class="modal-header text-center">
                    <h4 class="modal-title white-text w-100 font-weight-bold py-2">Ajouter un chien</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true" class="white-text">&times;</span>
                    </button>
                </div>

                <!--Body-->
                <div class="modal-body">
                    <div class="md-form">
                        <input type="text" id="nomChien" name="nomChien" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="nomChien">Nom du chien</label>
                    </div>

                    <div class="md-form">
                        <input type="number" id="numeroPuce" name="numeroPuce" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="numeroPuce">Numéro de puce</label>
                    </div>

                    <div class="md-form">
                        <input type="text" id="couleurChien" name="couleurChien" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="couleurChien">Couleur du chien</label>
                    </div>

                    <div class="md-form">
                        <input type="numbre" id="ageChien" name="ageChien" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="ageChien">Âge du chien</label>
                    </div>

                    <div class="md-form">
                        <input type="file" id="imgChien" name="imgChien" class="form-control validate" accept="image/*" multiple
                               onchange="readFilesAndDisplayPreview(this.files);">
                    </div>
                </div>
                <!--Footer-->
                <div class="modal-footer justify-content-center">
                    <button type="submit" class="btn btn-outline-warning waves-effect">Envoyer</button>
                </div>
            </div>
            <!--/.Content-->
        </div>
    </div>
</form>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
<script src="assets/js/script.min.js"></script>
</body>
</html>