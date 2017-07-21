<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang='en'>

<head>
    <meta charset='utf-8'>
    <title></title>
    <link rel='stylesheet' href='../css/style.css'>
</head>

<body>
    <div id='mainContainer'>
        <div id="head">
            <div class="left">
                <ul>
                    <li>
                        <h4>Java Spring Data I: Assignment Three: Lookify: Show Song</h4>
                    </li>
                </ul>
            </div>
            <div class="right">
                <ul>
                    <li><h4><a href="/songs/dashboard">Dashboard</a></h4></li>
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
                    <label><h4 style='text-align: left' class='h4label'>Title:  </h4></label>
                    <h4 class='h4Space'><c:out value="${song.title}"/></h4><br>                    
                    <label><h4 style='text-align: left' class='h4label'>Artist:  </h4></label>
                    <h4 class='h4Space'><c:out value="${song.artist}"/></h4><br>                    
                    <label><h4 style='text-align: left' class='h4label'>Rating:  </h4></label>
                    <h4 class='h4Space'><c:out value="${song.rating}"/></h4><br>                    
                    
                    <!--<a href="/"><input class='butInputSubmitGreen' type='submit' value='Return'></a>-->
                </div>
            </div>
            <div id="bot">

            </div>
        </div>
    </div>
</body>

</html>
