<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminHome</title>
<link rel="stylesheet" type="text/css" href="styles/adminHome.css">
<link rel="stylesheet" type="text/css" href="styles/master.css">
</head>
<body style="background-image: url(image/az.jpg)">
    <div class="header">
        <img id="logo" src="image/ab.png" alt="scllogo">
		
        <div id="divProfile">
            <img id="imageProfile" src="image/m3.png">
            <div class="divWelcomeLabel">Welcome</div>
            <div class="divWelcomeLabel email">Rikki@gmail.com</div>
        </div>
    </div>
    <div class="footer">
        <ul>
            <li><a href="#">About</a></li>
            <li><a href="#">Privacy Policy</a></li>
            <li><a href="#">Contact Us</a></li>
        </ul>
    </div>


    <!-- Side navigation -->
    <div id="mysidenav" class="sidenav">
        <!--<a href="siteJs:void(0)" class="closebtn" onclick="closenav()">&times;</a>-->
        <a href="#"><img class="home" src="image/home-white.png" />Dashboard</a><br />
        <a href="#"><img class="home" src="image/organization-white.png" />Organization</a><br />
        <a href="#"><img class="home" src="image/users-white.png" />User</></a><br />
        <a href="EventAdminDis.jsp"><img class="home" src="image/leaves-white.png" />Events</a><br />
        <a href="#"><img class="home" src="image/reports-white.png" />Reports</a>
    </div>

    <!-- Page content -->
    <div class="main">
        <a href="#">
            <div class="seg1">
                <h2>Organization</h2>
                <br />
                <i class="material-icons"></i>
                <div>
                    <div class="seg-div">Manage School Core Info</div>
                    <div class="img-div"><img class="seg-img" src="image/organization.png"></div>
                </div>
            </div>
        </a>


        <a href="AdminHome.jsp">
            <div class="seg2">
                <h2>Users</h2>
                <br />
                <i class="material-icons"></i>
                <div>
                    <div class="seg-div">User Management</div>
                    <div class="img-div"><img class="seg-img" src="image/users.png"></div>
                </div>
            </div>
        </a>

        <a href="AddEvent.jsp">
            <div class="seg3">
                <h2>Events</h2>
                <br />
                <i class="material-icons"></i>
                <div>
                    <div class="seg-div">Event Management</div>
                    <div class="img-div"><img class="seg-img" src="image/leaves.png"></div>
                </div>
            </div>
        </a>

        <a href="#">
            <div class="seg4">
                <h2>Reports</h2>
                <br />
                <i class="material-icons"></i>
                <div>
                    <div class="seg-div">Manage Reports</div>
                    <div class="img-div"><img class="seg-img" src="image/reports.png"></div>
                </div>
            </div>
        </a>

    </div>

</body>
</html>