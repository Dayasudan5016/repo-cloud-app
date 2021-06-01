<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Toll List</title>
        <style>
            .bg {
                border: 0px solid #fff;
                padding: 50px 60px;
                background-color: lightcyan;
            }
            .form-container {
                background-color: lightblue;
            }
            th, h1 {
                text-align: center;
                font-family: "Times New Roman", Times, serif;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid bg">
            <h1>Toll Details List</h1>
            <br><br>
            <form method="post" class="form-container">
                <table class="table table-bordered table-striped table-hover list">
                    <tr>
                        <th>Id</th>
                        <th>From place</th>
                        <th>To place</th>
                        <th>No of Tolls</th>
                        <th>Cities in the route</th>
                        <th>Average amount per toll</th>
                        <th>Approval</th>
                    </tr>
                    <c:forEach var="tollList" items="${tollList}">
                        <tr>
                            <td>${tollList.id}</td>
                            <td>${tollList.fromPlace}</td>
                            <td>${tollList.toPlace}</td>
                            <td>${tollList.noOfTolls}</td>
                            <td>${tollList.citiesCrossingBy}</td>
                            <td>${tollList.avgRate}</td>
                            <td>${tollList.approval}</td>
                        </tr>
                    </c:forEach>
                </table>
            </form>
        </div>
    </body>
</html>