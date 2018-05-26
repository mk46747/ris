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
<h3>Create offer:</h3>

<form:form method="post" action="create" modelAttribute="offerForm" >





Offer name: <form:input path="name" type="text" /><br>
Price: <form:input path="price" type="text" /><br>
Experience: <form:input path="experience" type="text" /><br>
Babysitting place: <form:input path="babySittingPlace" type="text" /><br>
Start time:<form:input path="startTime" type="text" /><br>
End time: <form:input path="endTime" type="text" /><br>
City: <form:input path="city" type="text" /><br>
Address:<form:input path="address" type="text" /><br>
Children number: <form:input path="childrenNumber" type="text" /><br>
Max children age: <form:input path="maxChildrenAge" type="text" /><br>
Min children age: <form:input path="minChildrenAge" type="text" /><br>
Deadline: <form:input path="deadline" type="text" /><br>
Notice: <form:input path="notice" type="text" /><br>

<br>
	<button type="submit">SAVE</button>
</form:form>
	
