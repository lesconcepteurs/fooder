<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="les.concepteurs.fooder.metier.ListeRecettes"%>
<%@ page import="les.concepteurs.fooder.metier.Recette"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Fooder_V4</title>
<link rel="stylesheet" type="text/css" href="./asset/css/style.css">
<!-- chemin relatif pour acceder à la feuille de style -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<!-- Bloc haut Barre de navigation 3 boutons  -->
	<ul class="nav">
		<nav class="navbar navbar-inverse bg-faded navbar-fixed-top">
		<li>Fooder</li>
		<li><input type="image" id="image" title="Entrées" alt="Entrées"
			src="./asset/images/salade.png"></li>
		<li><input type="image" id="image" title="Plats" alt="Plats"
			src="./asset/images/plat.png"></li>
		<li><input type="image" id="image" title="Desserts" alt="Dessert"
			src="./asset/images/dessert.png"></li>
	</ul>

	<div class="box">
		<!-- obligation d'inserer le caroussel dans un bloc "box" afin de permettre la mise en page de celui-ci -->
		<div class="carousel">
			<!--  parcourir la liste de recettes et affichage dans le caroussel -->
			<%
				//ListeRecettes listeRecettes = (ListeRecettes) request.getAttribute("listeRecettes");
				List<Recette> listeRecettes = (List<Recette>) request.getAttribute("listeRecettes");		
				int i = 0;
				for (Recette rec : listeRecettes) { // iteration dans l'Arraylist Recette
					
					
			%>
			<input type="checkbox" class="faux-ui-facia">
			<div class="slide" slide="<%=i++%>"
				annot="<%=rec.getNomRec()%>">
				<!-- pour recuperer un nom de recette -->
				<img src="./asset/images/<%=rec.getPhotoRec()%>"
					alt="<%=rec.getNomRec()%>">
				<!-- pour recuperer une photo de recette -->
			</div>
			<%
				}
			%>

		</div>
	</div>

	<CENTER>
		<!-- seul moyen  trouvé pour centrer la div menu du bas -->
		<div class="box2">
			<!-- Bloc menu bas 3 boutons -->
			<ul class="nav2 " />
			<nav class="navbar navbar-inverse bg-faded navbar-fixed-top">
			<li><input type="image" id="image" title="Voir ma liste"
				alt="Panier" src="./asset/images/panier2.png"></li>
			<li><input type="image" id="image"
				title="Ajouter dans mon panier" alt="J'aime"
				src="./asset/images/like2.png"></li>
			<li><input type="image" id="image" title="Description"
				alt="Voir recette" src="./asset/images/loupe2.png"></li>
			</ul>
		</div>
	</CENTER>
	<label>Fooder</label>
	<!-- ce label n'apparaît en bas de page que pour le reponsive (hidden en mode web) -->
	<div>
		<p>From the recipe ... To your basket !!!</p>
	</div>

	<script src="js/jquery-3.2.1.min.js"></script>
</body>
</html>