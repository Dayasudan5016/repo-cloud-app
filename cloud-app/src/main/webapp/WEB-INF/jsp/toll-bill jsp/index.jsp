<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Welcome Page</title>
        <style>
            .bg {
                background-image: url("https://i.ibb.co/DtV7WJC/IMG-20210116-150759.jpg");
                background-repeat: no-repeat;
                height: 100vh;
                background-size: cover;
            }
            .form-container {
                border: 0px solid #fff;
                padding: 50px 60px;
                margin-top: 30vh;
                box-shadow: -1px 4px 26px 11px rgba(0,0,0,0.75);
            }
            h1 {
                background-color: skyblue;
                text-align: center;
                color: crimson;
                border-color: black;
                border: 1px solid black;
                font-family: "Times New Roman", serif;
            }
            .btn-primary {
                float: right;
            }
            b {
                color: indigo;
            }
            .usertype {
                float: right;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid bg">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <form class="form-container" method="post">
                        <h1>Toll Bill Generator</h1>
                        <br><br>
                        <div class="form-group">
                            <b>Choose your User Type</b>
                            <select name="usertype" class="usertype col-md-4" id="usertype">
                                <option value="Admin">Admin</option>
                                <option value="Manager">Manager</option>
                                <option value="User">User</option>
                            </select>
                        </div>
                        <br>
                        <button type="submit" class="btn btn-success col-md-4" name="submit" id="submit" value="login">Login</button>
                        <button type="submit" class="btn btn-primary col-md-4" name="submit" id="submit" value="register" onclick="adminRegisterDisabled()">Register</button>
                    </form>
                </div>
                <p id="demo"></p>
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
            </div>
        </div>
        <script>
            function adminRegisterDisabled() {
                var usertype = document.getElementById("usertype").value;
                if(usertype == "Admin") {
                    alert("Admin can't register");
                }
            }
        </script>
    </body>
</html>