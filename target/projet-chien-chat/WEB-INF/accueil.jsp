<%--
  Created by IntelliJ IDEA.
  User: antoi
  Date: 23/07/2020
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
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
</head>
<body id="page-top">
<nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark" id="mainNav">
    <div class="container"><a class="navbar-brand" href="#page-top">Dog&amp;Dog</a>
        <button data-toggle="collapse" data-target="#navbarResponsive" class="navbar-toggler navbar-toggler-right"
                type="button" data-toogle="collapse" aria-controls="navbarResponsive" aria-expanded="false"
                aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="nav navbar-nav ml-auto text-uppercase">
                <li class="nav-item" role="presentation"></li>
                <li class="nav-item" role="presentation"><a class="nav-link js-scroll-trigger" data-toggle="modal"
                                                            data-target="#modalInscription">sign in</a>
                </li>
                <li class="nav-item" role="presentation"><a class="nav-link js-scroll-trigger" data-toggle="modal"
                                                            data-target="#orangeModalSubscription">log in</a></li>
                <li class="nav-item" role="presentation"><a class="nav-link js-scroll-trigger"
                                                            href="#contact">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>
<header class="masthead" style="background-image: url(assets/img/accueil.jpg);width: 1920;height: 1080;">
    <div class="container">
        <div class="intro-text">
            <div class="intro-lead-in"><span>Bienvenue sur Dog&amp;Dog</span></div>
        </div>
    </div>
</header>
<section id="services">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="text-uppercase section-heading">Services</h2>
                <h3 class="text-muted section-subheading">Sur notre application vous pourrez allez adorer avoir des
                    chiens !!</h3>
            </div>
        </div>
        <div class="row text-center">
            <div class="col-md-4"><span class="fa-stack fa-4x"><i class="fa fa-circle fa-stack-2x text-primary"></i><i
                    class="fa fa-book fa-stack-1x fa-inverse"></i></span>
                <h4 class="section-heading">Lister vos chiens</h4>
                <p class="text-muted">Sur notre applications, oubliez vos stylos,<br>vous pouvez lister vos chiens en
                    ligne.</p>
            </div>
            <div class="col-md-4"><span class="fa-stack fa-4x"><i class="fa fa-circle fa-stack-2x text-primary"></i><i
                    class="fa fa-gear fa-stack-1x fa-inverse"></i></span>
                <h4 class="section-heading">Customiser vos chiens</h4>
                <p class="text-muted">Une crête rouge, des pattes à paillettes, et un<br>brushing tendance? Vous pouvez
                    tout faire.</p>
            </div>
            <div class="col-md-4"><span class="fa-stack fa-4x"><i class="fa fa-circle fa-stack-2x text-primary"></i><i
                    class="fa fa-trash-o fa-stack-1x fa-inverse"></i></span>
                <h4 class="section-heading">Supprimer vos chiens</h4>
                <p class="text-muted">Si par malheur un de vos charmants compagnons trépassait, vous avez la possibilité
                    de le supprimer en un simple clic !<br>Whatelse ? :D</p>
            </div>
        </div>
    </div>
</section>
<section id="portfolio" class="bg-light"></section>
<section id="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="text-uppercase">à propos de nous</h2>
                <h3 class="text-muted section-subheading">Notre histoire...</h3>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <ul class="list-group timeline">
                    <li class="list-group-item">
                        <div class="timeline-image"><img class="rounded-circle img-fluid" src="assets/img/aventure.jpg">
                        </div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4>&nbsp;Juillet 2020</h4>
                                <h4 class="subheading">Projet CDA-chiens</h4>
                            </div>
                            <div class="timeline-body">
                                <p class="text-muted">L'aventure commence !!</p>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item timeline-inverted">
                        <div class="timeline-image"><img class="rounded-circle img-fluid"
                                                         src="assets/img/demarrage.jpg"></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4>Juin 1995</h4>
                                <h4 class="subheading">Les débuts</h4>
                            </div>
                            <div class="timeline-body">
                                <p class="text-muted">C'est là que tout a commencé..</p>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item timeline-inverted">
                        <div class="timeline-image">
                            <h4>Faîtes<br>parti de&nbsp;<br>notre histoire</h4>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</section>
<section id="team" class="bg-light">
    <div class="container">
        <div class="row">
            <div class="col-sm-4">
                <div class="team-member"><img class="rounded-circle mx-auto" src="assets/img/team/1.jpg">
                    <h4>Antoine Auzoux</h4>
                    <p class="text-muted">Developper en Formation</p>
                    <ul class="list-inline social-buttons">
                        <li class="list-inline-item"><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-4" style="width: 50px;"></div>
            <div class="col-sm-4">
                <div class="team-member"><img class="rounded-circle mx-auto" src="assets/img/team/3.jpg">
                    <h4>Fethi Benseddik</h4>
                    <p class="text-muted">Developper en Formation</p>
                    <ul class="list-inline social-buttons">
                        <li class="list-inline-item"><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-md-3"><a href="#"></a></div>
            <div class="col-sm-6 col-md-3"><a href="#"></a></div>
            <div class="col-sm-6 col-md-3"><a href="#"></a></div>
            <div class="col-sm-6 col-md-3"><a href="#"></a></div>
        </div>
    </div>
</section>
<section id="contact" style="background-image:url(assets/img/map-image.png);">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="text-uppercase section-heading">Nous contacter</h2>
                <h3 class="section-subheading text-muted">Si vous désirez plus d'informations, vous pouvez utiliser le
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
                                                           placeholder="Votre Téléphone *" required=""><small
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
                            <button class="btn btn-primary btn-xl text-uppercase" id="sendMessageButton" type="submit">
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
            <div class="col-md-4"><span class="copyright">Copyright&nbsp;© Dog Dog 2020</span></div>
            <div class="col-md-4">
                <ul class="list-inline social-buttons">
                    <li class="list-inline-item"><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li class="list-inline-item"><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li class="list-inline-item"><a href="#"><i class="fa fa-linkedin"></i></a></li>
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
<form method="post" action="AuthentificationServlet">
    <div class="modal fade" id="orangeModalSubscription" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog modal-notify modal-warning" role="document">
            <!--Content-->
            <div class="modal-content">
                <!--Header-->
                <div class="modal-header text-center">
                    <h4 class="modal-title white-text w-100 font-weight-bold py-2">S'authentifier</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true" class="white-text">&times;</span>
                    </button>
                </div>

                <!--Body-->
                <div class="modal-body">
                    <div class="md-form mb-5">
                        <input type="text" id="form3" name="identifiant" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="form3">Identifiant</label>
                    </div>

                    <div class="md-form">
                        <input type="text" id="form2" name="password" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="form2">Mot de passe</label>
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
<form method="post" action="InscriptionServlet">
    <div class="modal fade" id="modalInscription" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog modal-notify modal-warning" role="document">
            <!--Content-->
            <div class="modal-content">
                <!--Header-->
                <div class="modal-header text-center">
                    <h4 class="modal-title white-text w-100 font-weight-bold py-2">S'authentifier</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true" class="white-text">&times;</span>
                    </button>
                </div>

                <!--Body-->
                <div class="modal-body">
                    <div class="md-form mb-5">
                        <input type="text" id="nom" name="nom" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="nom">Nom</label>
                    </div>

                    <div class="md-form">
                        <input type="text" id="prenom" name="prenom" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="prenom">Prénom</label>
                    </div>

                    <div class="md-form">
                        <input type="text" id="mail" name="mail" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="mail">Email</label>
                    </div>

                    <div class="md-form">
                        <input type="text" id="login" name="login" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="login">Login</label>
                    </div>

                    <div class="md-form">
                        <input type="text" id="password" name="password" class="form-control validate">
                        <label data-error="wrong" data-success="right" for="password">Mot de passe</label>
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