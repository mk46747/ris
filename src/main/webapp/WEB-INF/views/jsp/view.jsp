<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix = "spring" uri = "http://www.springframework.org/tags"%>


<h2>Nanny: ${nanny.getName()} ${nanny.getSurname()}</h2>
<br>
Offers:
<br>
<c:forEach items="${offers}" var="offer">
<a href="http://localhost:8080/nannyapp/view?offerId=${offer.getId()}&nannyId=${nanny.getId()}">${offer.getName()}</a> | 
</c:forEach>
<br>
<h3>Offer details:</h3>
Offer name: ${offerToDisplay.getName()}
<br>
Price: ${offerToDisplay.getPrice()} kn/h
<br>
Experience:  ${offerToDisplay.getExperience()}
<br>
Babysitting place: ${offerToDisplay.getBabySittingPlace()}
<br>
Start time: ${offerToDisplay.getStartTime()}
<br>
End time: ${offerToDisplay.getEndTime()}
<br>
City: ${offerToDisplay.getCity()}
<br>
Address: ${offerToDisplay.getAddress()}
<br>
Children number: ${offerToDisplay.getChildrenNumber()}
<br>
Max children age: ${offerToDisplay.getMaxChildrenAge()}
<br>
Min children age: ${offerToDisplay.getMinChildrenAge()}
<br>
Deadline: ${offerToDisplay.getDeadline()}
<br>
Notice: ${offerToDisplay.getNotice()}
<br>
Offer is opened: ${offerToDisplay.isOpened()}

<br>
<a href="http://localhost:8080/nannyapp/delete?offerId=${offerToDisplay.getId()}&nannyId=${nanny.getId()}">DELETE</a><br> 
<a href="http://localhost:8080/nannyapp/edit?offerId=${offerToDisplay.getId()}&nannyId=${nanny.getId()}">EDIT</a><br>
<a href="http://localhost:8080/nannyapp/create?nannyId=${nanny.getId()}">CREATE NEW OFFER</a>
