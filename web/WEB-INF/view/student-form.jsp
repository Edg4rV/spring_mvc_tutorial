<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
    <title>Student Registration form</title>
</head>

<body>

    <form:form action = "processForm" modelAttribute="student">

        First name: <form:input path="firstName" />

        <br><br>

        Last name: <form:input path="lastName" />

        <br><br>

        Country

        <form:select path="country">
            <form:options items="${student.countryOptions}"/>

        </form:select>

        <br><br>

        <br><br>

        Favorite Language:

        Java <form:radiobutton path="favoriteLanguage" value="Java" />
        C# <form:radiobutton path="favoriteLanguage" value="C#" />
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
        C++ <form:radiobutton path="favoriteLanguage" value="C++" />


        <br><br>

        Operating System:

        Linux <form:checkbox path="operatingSystem" value="Linux" />
        MS Windows <form:checkbox path="operatingSystem" value="MS Windows" />
        Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />




        <br><br>

        <input type="submit" value="Submit" />



    </form:form>

</body>

</html>