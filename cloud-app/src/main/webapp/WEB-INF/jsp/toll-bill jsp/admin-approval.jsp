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
        <title>Admin Approval Page</title>
        <style>
            .bg {
                background: url("https://i.ibb.co/z6KBCWQ/20200912-162055.jpg");
                background-repeat: no-repeat;
                height: 100vh;
                background-size: cover;
            }
            .row {
                margin-top: 16vh;
            }
            h1 {
                text-align: center;
                color: aliceblue;
                text-shadow: 0 0 5px darkblue;
                padding-top: 16vh;
            }
            .button-1 {
                width: 10%;
                text-align: center;
            }
            .button-2 {
                width: 10%;
                text-align: center;
            }
            .button-3 {
                width: 10%;
                text-align: center;
            }         
        </style>
    </head>
    <body>
        <div class="container-fluid bg">
            <h1>Admin Approval Page</h1>
            <br><br><br><br>
            <form method="post" class="form-container">
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-12 button-1">
                        <button type="submit" class="btn btn-success" name="approval" value="managerlist">Get Manager List</button>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-12 button-2">
                        <button type="submit" class="btn btn-info" name="approval" value="citylist">Get Toll City List</button>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-12 button-3">
                        <button type="submit" class="btn btn-primary" name="approval" value="tolllist">Get Toll List</button>
                    </div>
                </div>
            </form>
        </div>
        <script>
        
        </script>
    </body>
</html>