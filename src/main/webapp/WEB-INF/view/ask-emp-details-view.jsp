<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<body>
<h2>Dear employee enter your details!!!</h2>

</br>
</br>

<form:form action="showDetails" modelAttribute="employee">

    <%--Для каждой формы срабатывает геттер по типу getName, getSurname, getSalary.--%>
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    </br>
    </br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    </br>
    </br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    </br>
    </br>
    Salary: <form:select path="department">
    <%--                <form:option value="Information Technology" label="IT"/>--%>
    <%--                <form:option value="Human Resources" label="HR"/>--%>
    <%--                <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
</form:select>
    </br>
    </br>
    Wich car do you want?
    </br>
    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
    <%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
    <%--    Mercedes-Benz <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    </br>
    </br>
    Foreign Languages(s)
    <%--    EN <form:checkbox path="languages" value="English"/>--%>
    <%--    DE <form:checkbox path="languages" value="Deuch"/>--%>
    <%--    FR <form:checkbox path="languages" value="French"/>--%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    </br>
    </br>
    Phone Number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    </br>
    </br>
    Email : <form:input path="email"/>
    <form:errors path="email"/>
    </br>
    </br>
    <input type="submit" value="OK">
    <%--после нажатия кнопки ОК срабатывают сеттеры которые мы увидем в  show emp details--%>


</form:form>

</body>
</html>