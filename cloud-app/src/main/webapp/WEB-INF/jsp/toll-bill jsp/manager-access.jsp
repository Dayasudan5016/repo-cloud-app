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
        <title>Manager Access Form</title>
        <style>
            .bg {
                background-image: url("https://i.ibb.co/9w6Zr7Q/IMG-20201218-111543.jpg");
                background-repeat: no-repeat;
                height: 100vh;
                background-size: cover;
            }
            .form-container {
                border: 0px solid #fff;
                padding: 50px 60px;
            }
            th, h1, h3 {
                text-align: center;
            }
            h1 {
                color: deepskyblue;
                text-shadow: 0 0 5px darkblue;
            }
            .edit {
                float: inherit;
            }
            .toll {
                width: 30%
                float: left;
                margin-left: 25%;
            }
            .city {
                width: 30%;
                float: right;
                margin-right: 25%;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid bg">
            <br><br>
            <h1>Manager Access Page</h1>
            <br><br><br><br>
            <form method="post" class="form-container">
                <button type="submit" name="submit" id="submit" class="btn btn-info col-md-1 toll" value="viewtoll">View Toll Table</button>
                <button type="submit" name="submit" id="submit" class="btn btn-info col-md-1 city" value="viewcity">View City Table</button>
                <br><br><br><br><br><br>
                <button type="submit" name="submit" id="submit" class="btn btn-primary col-md-1 toll" value="addtoll">Add Toll</button>
                <button type="submit" name="submit" id="submit" class="btn btn-primary col-md-1 city" value="addcity">Add City</button>
                <br><br><br><br><br><br>
                <button type="submit" name="submit" id="submit" class="btn btn-success col-md-1 toll" value="edittoll">Edit Toll</button>
                <button type="submit" name="submit" id="submit" class="btn btn-success col-md-1 city" value="editcity">Edit City</button>
            </form>
        </div>
    </body>
</html>