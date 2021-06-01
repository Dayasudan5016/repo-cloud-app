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
        <title>Add City Details</title>
        <style>
            .bg {
                background-image: url("https://i.ibb.co/BVBL6fx/IMG-20201024-173055.jpg");
                background-repeat: no-repeat;
                height: 100vh;
                background-size: cover;
            }
            h1 {
                text-align: center;
                color: blue;
            }
            .form-container {
                border: 0px solid #fff;
                padding: 50px 60px;
                margin-top: 5vh;
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
                        <h1>Edit City Details</h1>
                        <br><br>
                        <div class="form-group">
                            <input type="number" id="id" name="id" class="form-control" placeholder="Enter city id" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="name" name="name" class="form-control" placeholder="Enter city name" required>
                        </div>
                        <div class="form-group">
                            <input type="number" id="nooflanes" name="nooflanes" class="form-control" placeholder="Enter no.of lanes in the toll" required>
                        </div>
                        <div class="form-group">
                            <input type="number" id="classAlaneno" name="classAlaneno" class="form-control" placeholder="Enter no.of lanes for class A vehicles" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="classAlanevehicles" name="classAlanevehicles" class="form-control" placeholder="Enter allowed vehicles in Class A lanes" required>
                        </div>
                        <div class="form-group">
                            <input type="number" id="classBlaneno" name="classBlaneno" class="form-control" placeholder="Enter no.of lanes for class B vehicles" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="classBlanevehicles" name="classBlanevehicles" class="form-control" placeholder="Enter allowed vehicles in Class B lanes" required>
                        </div>
                        <div class="form-group">
                            <input type="number" id="classClaneno" name="classClaneno" class="form-control" placeholder="Enter no.of lanes for class C vehicles" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="classClanevehicles" name="classClanevehicles" class="form-control" placeholder="Enter allowed vehicles in Class C lanes" required>
                        </div>
                        <div class="form-group">
                            <input type="number" id="classDlaneno" name="classDlaneno" class="form-control" placeholder="Enter no.of lanes for class D vehicles" required>
                        </div>
                        <div class="form-group">
                            <input type="text" id="classDlanevehicles" name="classDlanevehicles" class="form-control" placeholder="Enter allowed vehicles in Class D lanes" required>
                        </div>
                        <br>
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