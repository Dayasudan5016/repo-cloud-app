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
        <title>Toll Approval Page</title>
        <style>
            .bg {
                border: 0px solid #fff;
                padding: 50px 60px;
                background-color: lightcyan;
                height: 100%;
            }
            .table {
                background-color: lightblue;
            }
            th,h1 {
                text-align: center;
                font-family: "Times New Roman", Times, serif;
            }
            .btn-success {
                float: left;
                width: 45%;
            }
            .btn-danger {
                float: right;
                width: 45%;
            }    
        </style>
    </head>
    <body>
        <div class="container-fluid bg">
            <h1>Toll Approval List</h1>
            <br><br><br><br>
            <form method="post" class="form-container">
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-12"></div>
                    <div class="col-md-4 col-sm-4 col-xs-12">
                        <div class="form-group">
                            <input type="number" id="id" name="id" class="form-control" placeholder="Enter id to approve/reject" required>
                        </div>
                        <br>
                        <button type="submit" class="btn btn-success" name="approval" value="accept">Accept</button>
                        <button type="submit" class="btn btn-danger" name="approval" value="reject">Reject</button>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-12"></div>
                </div>
                <br><br>
                <table class="table table-bordered table-striped table-hover">
                     <tr>
                        <th>Id</th>
                        <th>From place</th>
                        <th>To place</th>
                        <th>Total count of tolls</th>
                        <th>Cities in the route</th>
                        <th>Average rate per toll</th>
                        <th>Approval</th>
                    </tr>
                    <c:forEach var="tollDetails" items="${tollDetails}">
                        <tr>
                            <td>${tollDetails.id}</td>
                            <td>${tollDetails.fromPlace}</td>
                            <td>${tollDetails.toPlace}</td>
                            <td>${tollDetails.noOfTolls}</td>
                            <td>${tollDetails.citiesCrossingBy}</td>
                            <td>${tollDetails.avgRate}</td>
                            <td>${tollDetails.approval}</td>
                        </tr>
                    </c:forEach>
                </table>
            </form>
        </div>
    </body>
</html>