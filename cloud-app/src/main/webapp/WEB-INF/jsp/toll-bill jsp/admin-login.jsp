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
        <title>Admin Login Form</title>
        <style>
            .bg {
                background-image: url("https://i.ibb.co/DDfhLx1/IMG-20210210-065006.jpg");
                background-repeat: no-repeat;
                height: 100vh;
                background-size: cover;
            }
            h1 {
                color: blue;
                box-shadow: 0 0 10px blue;
                text-align: center;
            }
            
            h6 {
                text-align: center;
                color: red;
            }
            .form-container {
                border: 0px solid #fff;
                padding: 50px 60px;
                margin-top: 24vh;
                box-shadow: -1px 4px 26px 11px rgba(0,0,0,0.75);
            }
            .form-control {
                margin: 10px;
            }
            .usertype {
                float: right;
            }
            b {
                color: brown;
            }
            .button {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid bg">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <form class="form-container" method="post" modelAttribute="login">
                        <h1>Admin Login Form</h1>
                        <br><br>
                        <div class="form-group">
                            <input type="text" name="name" id="name" class="form-control" placeholder="Enter your username" required>
                        </div>
                        <div class="form-group">
                            <input type="number" name="userid" id="userid" class="form-control" placeholder="Enter your user id" required>
                        </div>
                        <div class="form group">
                            <input class="form-control" id="password" name="password" placeholder="Enter your password" type="password" required>
                        </div>
                        <br>
                        <h6>${Invalid}</h6>
                        <br>
                        <div class="button">
                            <button type="submit" class="btn btn-primary col-md-4" name="submit" value="login">Login</button>
                        </div>
                    </form>
                </div>
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
            </div>
        </div>
        <script>
            
        </script>
    </body>
</html>