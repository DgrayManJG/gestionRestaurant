<jsp:include page="header.jsp" />
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row marketing">

	<form action="place/reservation" method="POST">
		<h4>Reservation pour la table ${place.number}</h4>
		
		<input type="hidden" value="${place.number}" name="idPlace">
		
		<div class="form-group row">
		  <label for="nom" class="col-2 col-form-label">Nom de la réservation</label>
		  <div class="col-10">
		    <input class="form-control" name="nom" type="text" value="" id="">
		  </div>
		</div>
		
		<div class="form-group row">
		  <label for="" class="col-2 col-form-label">Heure de la réservation</label>
		  <div class="col-10">
		    <input class="form-control" name="heureReservation" type="datetime-local" value="" id="">
		  </div>
		</div>
		
		<button type="submit" class="btn btn-primary"></button>
		
	</form>
 
</div>
 
 <jsp:include page="footer.jsp" />