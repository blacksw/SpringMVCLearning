<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>You are welcome!!!</h2>

<br/>
<br/>
<br/>

<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br/>
Your surname: ${employee.surname}
<br/>
Your salary: ${employee.salary}
<br/>
Your department : ${employee.department}
<br/>
Your car : ${employee.carBrand}
<br/>
Languages :
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br/>
Your Phone Number : ${employee.phoneNumber}
<br/>
Your Email : ${employee.email}
<br/>
<br/><br/>


</body>
</html>