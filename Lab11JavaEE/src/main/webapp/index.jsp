<%-- 
    Document   : index
    Created on : 30 нояб. 2022 г., 21:30:21
    Author     : Kate Nikitenko
--%>

<%@page import="java.util.*"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h1 {
                text-align: center;
            }
            #page {
                width: 800px;
                margin: auto;
            }
            form {
                width: 400px;
                margin: auto;
            }
            input[type=submit] {
                margin: auto;
            }
            body {
                background-image: url('https://img.freepik.com/premium-photo/empty-horizontal-picture-frame-on-cream-wall-in-modern-living-room-mock-up-interior-in-scandinavian-style-free-copy-space-for-your-picture-poster-sofa-table-dried-grass-books-3d-rendering_429124-1929.jpg?w=1380');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: 100% 100%;
            }
        </style>
    </head>
    <body>
        <div id="page">
            <h1>Welcome</h1>
            <form method="post">
                <table>
                    <tbody>
                        <tr>
                            <td><label for="name">Name</td>
                            <td><input id="name" type="text" name="name"></td>
                        </tr>
                        <tr>
                            <td><label for="surname">Surname</td>
                            <td><input id="surname" type="text" name="surname"></td>
                        </tr>
                         <tr>
                            <td><label for="email">Email</td>
                            <td><input id="email" type="text" name="email"></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" name="send" value="Send">
            </form>
            <c:if test="${not empty param.send}">
                <c:set var="id" value="${id+1}" scope="application"/>
                
                <c:if test="${not empty param.name}">
                    <c:set var="name" value="${param.name}" scope="session"></c:set>
                    <p>
                        Name: ${param.name}
                    </p>
                </c:if>
                <c:if test="${not empty param.surname}">
                    <c:set var="surname" value="${param.surname}" scope="session"></c:set>
                    <p>
                        Surname: ${param.surname}
                    </p>
                </c:if>
                <c:if test="${not empty param.email}">
                    <c:set var="email" value="${param.email}" scope="session"></c:set>
                    <p>
                        Email: ${param.email}
                    </p>
                </c:if>
            </c:if>
        </div>
    </body>
</html>