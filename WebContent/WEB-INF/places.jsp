<jsp:include page="header.jsp" />
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row marketing">

	<c:forEach items="${places}" var="place">
		<div class="col-lg-6">
		   <h4><c:out value="${place.number}" /></h4>
		   <p><c:out value="${place.statut.libelle}" /></p>
		   <a href="place/reservation?idPlace=${place.id}">Reservation</a>
		</div>
	</c:forEach>
 
</div>
 
 <jsp:include page="footer.jsp" />