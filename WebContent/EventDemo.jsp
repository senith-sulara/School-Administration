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
<link rel="stylesheet" type="text/css" href="styles/footer.css">
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="styles/body.css">
<br><br><br><br><br>
<table border="1" cellpadding="12" align="center" colour="white">
		 <caption><h2>Events List</h2></caption>
		 
		  <tr>
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
				<td> <%=event.getEventName() %> </td>
				<td> <%=event.getDate() %> </td>
				<td> <%=event.getDescription() %> </td>
				
			</tr>			
			<%	
			   }
            %>     
		</table>
	</div>	<br>
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</body>
</html>