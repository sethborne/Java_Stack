<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html lang='en'>

<head>
    <meta charset='utf-8'>
    <title></title>
    <link rel='stylesheet' href='css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id="head">
            <div class="left">
                <ul>
                    <li>
                        <h4>Assignment - Dojo Survey</h4>
                        <!--<h4><a href="results">Results</a></h4>-->
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <!--<li><h5><a href="/logout">Logout</a></h5></li>-->
                </ul>
            </div>
        </div>
        <div id="body">
            <hr>
            <br>
            <div id='body-top'>
                <div class='left'>
                    
                </div>
                <div class='right'></div>
            </div>
            <div id='top'>
                <div class="dojoForm">
                    <form action="/survey" method="POST">
                    
                    <label><h4 style='text-align: left' class='h4label'>Your Name:  </h4></label>
                    <input class='inputText' type='text' name="name" placeholder='Please Enter Your Name'>
                    <label><h4 style='text-align: left' class='h4label'>Dojo Location:  </h4></label>
                    <select class='inputText' name="location">
                        <option selected disabled></option>
                        <option value="Seattle">Seattle</option>
                        <option value="San Fransico">San Fransico</option>
                        <option value="Los Angeles">Los Angeles</option>
                        <option value="Chicago">Chicago</option>
                    </select>
                    <label><h4 style='text-align: left' class='h4label'>Favorite Language:  </h4></label>
                    <select class='inputText' name="language">
                        <option selected disabled></option>
                        <option value="Python">Python</option>
                        <option value="PHP">PHP</option>
                        <option value="Javascript">Javascript</option>
                        <option value="CSharp">CSharp</option>
                    </select>
                    <label><h4 style='text-align: left' class='h4label'>Description:  </h4></label>
                    <textarea class="textAreaIdea" rows="8" cols="20" name="description" placeholder="Please Enter Your Description Here"></textarea>
                    <input class='butInputSubmitGreen' type='submit' value='Submit'>

                    </form>
                </div>
            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>