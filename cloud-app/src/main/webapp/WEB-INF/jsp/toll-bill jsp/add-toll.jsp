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
        <title>Add Toll Details</title>
        <style>
            .bg {
                background-image: url("https://i.ibb.co/SVkZmRV/IMG-20210116-155231.jpg");
                background-repeat: no-repeat;
                height: 100vh;
                background-size: cover;
            }
            h1 {
                text-align: center;
                color: blue
            }
            .form-container {
                border: 0px solid #fff;
                padding: 50px 60px;
                margin-top: 16vh;
                box-shadow: -1px 4px 26px 11px rgba(0,0,0,0.75);
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
                    <form class="form-container" method="post">
                        <h1>Add Toll Details</h1>
                        <br><br>
                        <div class="form-group">
                            <input type="number" id="id" name="id" class="form-control" placeholder="Enter toll id" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="from" name="from" class="form-control" placeholder="Enter from place" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="to" name="to" class="form-control" placeholder="Enter to place" required>
                        </div>
                        <div class="form-group">
                            <input type="number" id="count" name="count" class="form-control" placeholder="Enter toll count" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="cities" name="cities" class="form-control" placeholder="Enter cities present between from and to places" required>
                        </div>
                        <div class="form-group">
                            <input type="number" id="amount" name="amount" class="form-control" placeholder="Enter average amount per toll" required>
                        </div>
                        <br><br>
                        <div class="button">
                            <button type="submit" class="btn btn-primary col-md-4" name="submit" value="submit">Submit</button>
                        </div>
                    </form>
                </div>
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
            </div>
        </div>
    </body>
</html>