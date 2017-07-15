<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.codingdojo.assignmentfour.pets.models.Cat" %>

    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Pets Home</title>
        <link rel="stylesheet" type="text/css" href="./css/style.css">
    </head>

    <body>
        <div id="mainContainer">
            <div id="header">
                <div class="left">
                    <ul>
                        <li>
                            <h4>Java on the Web - Pets</h4>
                        </li>
                        <!--<li>
                            <h4><a href="pages/dashboard.html">To Dashboard</a></h4>
                        </li>-->
                    </ul>
                </div>
                <div class="right">
                    <ul>
                        <!--<li><h4><a href="pages/dashboard.html">To Dashboard</a></h4></li>-->
                        <!--<li>
                            <h4><a href="index.html">Logout</a></h4>
                        </li>-->
                    </ul>
                </div>
            </div>
            <hr>
            <div id="body">
                <div id='top'>
                    <div class='left'>
                        <h3>Make a Dog:</h3>
                        <form action="/Pets/Dogs" method="POST">
                            <label><h4 class="h4label">Name:</h4></label>
                            <input class="inputTextLeft" type="text" name="name" placeholder="Enter Your Dog's Name">

                            <label><h4 class="h4label">Breed:</h4></label>
                            <input class="inputTextLeft" type="text" name="breed" placeholder="Enter Breed Name">

                            <label><h4 class="h4label">Weight:</h4></label>
                            <input class="inputTextLeft" type="text" name="weight" placeholder="Enter Weight">

                            <div class="btn-left">
                                <input class='btnSubmit btnGreen' type='submit' value='Submit Button'>
                            </div>
                        </form>
                    </div>
                    <div class='right'>
                        <h3>Make a Cat:</h3>
                        <form action="/Pets/Cats" method="POST">
                            <label><h4 class="h4label">Name:</h4></label>
                            <input class="inputTextLeft" type="text" name="name" placeholder="Enter Your Cat's Name">

                            <label><h4 class="h4label">Breed:</h4></label>
                            <input class="inputTextLeft" type="text" name="breed" placeholder="Enter Breed Name">

                            <label><h4 class="h4label">Weight:</h4></label>
                            <input class="inputTextLeft" type="text" name="weight" placeholder="Enter Weight">

                            <div class="btn-left">
                                <input class='btnSubmit btnGreen' type='submit' value='Submit Button'>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <!--<hr>-->
            <!--<div id='body-top'>
                <div class='left'>
                    <h2>Enter Your Information - Left</h2>
                </div>
                <div class='right'>
                    <h2>Enter Your Information - Right</h2>
                </div>
            </div>-->

        </div>
    </body>

    </html>