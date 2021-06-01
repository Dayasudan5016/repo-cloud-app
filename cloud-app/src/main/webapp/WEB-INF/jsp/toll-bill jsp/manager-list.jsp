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
        <title>Manager Approval Page</title>
        <style>
            .bg {
                border: 0px solid #fff;
                padding: 50px 60px;
                background-color: lightcyan;
                height: 100vh;
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
            <h1>Manager Approval List</h1>
            <br><br><br><br>
            <form method="post" class="form-container">
                <table class="table table-bordered table-striped table-hover">
                    <tr>
                        <th>User id</th>
                        <th>First name</th>
                        <th>Last name</th>
                        <th>Age</th>
                        <th>Gender</th>
                        <th>Phone number</th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>Approval</th>
                    </tr>
                    <c:forEach var="managerList" items="${managerList}">
                        <tr>
                            <td>${managerList.id}</td>
                            <td>${managerList.firstName}</td>
                            <td>${managerList.lastName}</td>
                            <td>${managerList.age}</td>
                            <td>${managerList.gender}</td>
                            <td>${managerList.phoneNumber}</td>
                            <td>${managerList.address}</td>
                            <td>${managerList.email}</td>
                            <td>${managerList.approval}</td>
                        </tr>
                    </c:forEach>
                </table>
                <br><br>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-12"></div>
                    <div class="col-md-4 col-sm-4 col-xs-12">
                        <div class="form-group">
                            <input type="number" id="userid" name="userid" class="form-control" placeholder="Enter id to approve/reject" required>
                        </div><br>
                        <button type="submit" class="btn btn-success" name="approval" value="accept">Accept</button>
                        <button type="submit" class="btn btn-danger" name="approval" value="reject">Reject</button>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-12"></div>
                </div>
            </form>
        </div>
    </body>
</html>