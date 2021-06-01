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
        <title>Home Page</title>
        <style>
            .bg {
                border: 0px solid #fff;
                padding: 50px 60px;
                background-color: lightcyan;
                background-size: cover;
            }
            .table {
                background-color: lightblue;
            }
            h3, th {
                text-align: center;
                font-family: "Times New Roman", Times, serif;
            }
            .from-label, .to-label {
                float: left;
            }
            .from, .to {
                float: right;
            }
            .button {
                text-align: center;            
            }
            h6 {
                text-align: center;
                color: red;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid bg">
            <form method="post" class="form-container" id="myform">
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-12"></div>
                    <div class="col-md-4 col-sm-4 col-xs-12">
                        <h3>Welcome to Home Page</h3>
                        <br><br>
                        <div class="form-group">
                            <span id="from-label"><b>Select starting point</b></span>
                            <select name="from" class="from col-md-4">
                                <option >chennai</option>
                                <option>coimbatore</option>
                                <option>salem</option>
                                <option>madurai</option>
                                <option>tirunelveli</option>
                                <option>thoothukudi</option>
                                
                            </select> 
                        </div>
                        <br>
                        <div class="form-group">
                            <span id="to-label"><b>Select ending point</b></span>
                            <select name="to" class="to col-md-4">
                                <!--<c:forEach var="dropDownList" items="${dropDownList}">
                                    <option>${dropDownList.toPlace}</option>
                                </c:forEach>-->
                                <option >thoothukudi</option>
                                <option>tirunelveli</option>
                                <option>madurai</option>
                                <option>theni</option>
                                <option>salem</option>
                                <option>coimbatore</option>
                                <option>chennai</option>
                            </select> 
                        </div>
                        <br>
                        <h6>${Invalid}</h6>
                        <br>
                        <div class="button">
                            <button type="submit" class="btn btn-primary col-md-4" name="submit" value="generate">Generate</button><br><br><br>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-12"></div>
                </div>
                <br><br>
                <div id="view">
                    <div id="toll">
                        <table class="table table-bordered table-striped table-hover" id="toll1">             <tr>
                                <th>From place</th>
                                <th>To place</th>
                                <th>Total count of tolls</th>
                                <th>Cities in the route</th>
                                <th>Total amount</th>
                            </tr>
                            <c:forEach var="tollList" items="${tollList}">
                                <tr>
                                    <td>${tollList.fromPlace}</td>
                                    <td>${tollList.toPlace}</td>
                                    <td>${tollList.noOfTolls}</td>
                                    <td>${tollList.citiesCrossingBy}</td>
                                    <td>${tollList.avgRate}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <br><br><br><br>
                    <div id="city">
                        <table class="table table-bordered table-striped table-hover" id="city1">
                            <tr>
                                <th rowspan="2">City</th>
                                <th rowspan="2">No of lanes in toll</th>
                                <th colspan="2">Class A</th>
                                <th colspan="2">Class B</th>
                                <th colspan="2">Class C</th>
                                <th colspan="2">Class D</th>
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
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </form>
        </div>
        <script>
            var a = document.getElementById("toll1").rows.length;
            if(a==1) 
                document.getElementById("toll1").style.visibility = "hidden";
            else 
                document.getElementById("toll1").style.visibility = "visible";
            
            var b = document.getElementById("city1").rows.length;
            if(b==2) 
                document.getElementById("city1").style.visibility = "hidden";
            else 
                document.getElementById("city1").style.visibility = "visible";
        </script>
    </body>
</html>