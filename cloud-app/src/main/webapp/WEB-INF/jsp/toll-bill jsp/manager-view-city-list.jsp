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
        <title>City List</title>
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
            <h1>City Details List</h1>
            <br><br>
            <form method="post" class="form-container">
                <table class="table table-bordered table-striped table-hover">
                    <tr>
                        <th rowspan="2">Id</th>
                        <th rowspan="2">City</th>
                        <th rowspan="2">No of lanes in toll</th>
                        <th colspan="2">Class A</th>
                        <th colspan="2">Class B</th>
                        <th colspan="2">Class C</th>
                        <th colspan="2">Class D</th>
                        <th rowspan="2">Approval</th>
                    </tr>
                    <tr>
                        <th>No of lanes</th>
                        <th>Allowed vehicles</th>
                        <th>No of lanes</th>
                        <th>Allowed vehicles</th>
                        <th>No of lanes</th>
                        <th>Allowed vehicles</th>
                        <th>No of lanes</th>
                        <th>Allowed vehicles</th>
                    </tr>
                    <c:forEach var="cityList" items="${cityList}">
                        <tr>
                            <td>${cityList.tollId}</td>
                            <td>${cityList.highwayCity}</td>
                            <td>${cityList.noOfLanes}</td>
                            <td>${cityList.classALaneNo}</td>
                            <td>${cityList.classALaneVehicles}</td>
                            <td>${cityList.classBLaneNo}</td>
                            <td>${cityList.classBLaneVehicles}</td>
                            <td>${cityList.classCLaneNo}</td>
                            <td>${cityList.classCLaneVehicles}</td>
                            <td>${cityList.classDLaneNo}</td>
                            <td>${cityList.classDLaneVehicles}</td>
                            <td>${cityList.approval}</td>
                        </tr>
                    </c:forEach>
                </table>
            </form>
            <br><br><br>
        </div>
    </body>
</html>