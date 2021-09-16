<%@page import="com.model.Event"%>
<%@page import="java.io.Writer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.EventServiceImpl"%>
<%@page import="com.service.IEventService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event List</title>
<link rel="stylesheet" type="text/css" href="styles/adminHome.css">
<link rel="stylesheet" type="text/css" href="styles/master.css">
<link rel="stylesheet" type="text/css" href="styles/footer.css">

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

	<div id="mysidenav" class="sidenav">
        <!--<a href="siteJs:void(0)" class="closebtn" onclick="closenav()">&times;</a>-->
        <a href="AdminHome.jsp"><img class="home" src="image/home-white.png" />Dashboard</a><br />
        <a href="#"><img class="home" src="image/organization-white.png" />Organization</a><br />
        <a href="#"><img class="home" src="image/users-white.png" />User</></a><br />
        <a href="EventAdminDis.jsp"><img class="home" src="image/leaves-white.png" />Events</a><br />
        <a href="#"><img class="home" src="image/reports-white.png" />Reports</a>
    </div>
<br><br><br><br><br>
<table border="1" cellpadding="12" align="center" colour="white">
		 <caption><h2>Events List</h2></caption>
		 
		  <tr>
                <th>Event ID</th>
                <th>Event Name</th>
                <th>Date</th>
                <th>About Event</th>
                
                
            </tr>
            <%
            IEventService iEventService = new EventServiceImpl();
			ArrayList<Event> arrayList = iEventService.getEvents();
			
			for(Event event : arrayList){
			%>
			 <tr>
				<td> <%=event.getEventID() %> </td>
				<td> <%=event.getEventName() %> </td>
				<td> <%=event.getDate() %> </td>
				<td> <%=event.getDescription() %> </td>
				
			</tr>			
			<%	
			   }
            %>     
		</table>
	</div>	
</body>
</html>