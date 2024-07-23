<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page import="java.util.List" %>
<%@ page import="com.intelsoft.entity.Book"%>


<!DOCTYPE html>
<html>
<head>
    <title>Books List</title>
    <style>
        table{
            background-color: orange;
        }
    </style>
</head>
<body>
    <%= new java.util.Date() %>
    <br>
    <%=new String("Dora Software Architect").toUpperCase() %>
    <br>
    <%= 5*5 %>
    <h1>List of Books </h1>
    <table border="1">
        <thead>
            <tr>
                <th>Book ID</th>
                <th>Book Name</th>
                <th>Book Price</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Book> books = (List<Book>) request.getAttribute("bookdata");
                if (books!= null) {
                    for (Book book : books) {
            %>
                <tr>
                    <td><%= book.getBookId() %></td>
                    <td><%= book.getBookName() %></td>
                    <td><%= book.getBookPrice() %></td>
                </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>


    <%
       for(int i=1;i<=5;i++){
        out.println("<br>I really love the code"+i);
       }
    %>



    
</body>
</html>
