<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Manager Registration Form</title>
        <style>
            .bg {
                background-image: url("https://i.ibb.co/zFxBg0w/IMG-20201023-155135.jpg");
                background-repeat: no-repeat;
                height: 100vh;
                background-size: cover;
            }
            h1 {
                color: indigo;
                box-shadow: 0 0 10px indigo;
                text-align: center;
            }
            .form-container {
                border: 0px solid #fff;
                padding: 50px 60px;
                margin-top: 10vh;
                box-shadow: -1px 4px 26px 11px rgba(0,0,0,0.75);
            }
            .form-control {
                margin: 10px;
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
                        <h1>Manager Registration</h1>
                        <br><br>
                        <div class="form group">
                            <input class="form-control" id="userid" name="userid" placeholder="Enter your user id" type="number" required>
                        </div>
                        <div class="form group">
                            <input type="text" name="firstname" id="firstname" class="form-control" placeholder="Enter your first name" required>
                        </div>
                        <div class="form group">
                            <input type="text" name="lastname" id="lastname" class="form-control" placeholder="Enter your last name" required>
                        </div>
                        <div class="form group">
                            <input class="form-control" id="age" name="age" placeholder="Enter your age" type="number" required>
                        </div>
                        <div class="form group">
                            <input class="form-control" id="phonenumber" name="phoneNumber" placeholder="Enter your phone number" type="text" required>
                        </div>
                        <div class="form group">
                            <input type="text" name="address" id="address" class="form-control" placeholder="Enter your address" required>
                        </div>
                        <div class="form group">
                            <select name="gender" id="gender" class="gender form-control" required>
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                            </select>
                        </div>
                        <div class="form group">
                            <input class="form-control" id="email" name="email" placeholder="Enter your email" type="email" required>
                        </div>
                        <div class="form group">
                            <input class="form-control" id="password" name="password" placeholder="Enter your password" type="password" required>
                        </div>
                        <br>
                        <h6>${Invalid}</h6>
                        <br>
                        <div class="button">
                            <button type="submit" class="btn btn-primary col-md-4" value="submit">Submit</button>
                        </div>
                    </form>
                </div>
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
            </div>
        </div>
    </body>
</html>