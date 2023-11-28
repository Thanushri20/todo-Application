<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo home</title>
<style>
		div {
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
		}
	</style>
</head>
<body>
<div>
<h1>Todo home</h1>
<table border="2px">
<tr>
<th>Task name</th>
<th>Task description</th>
<th>Date Created</th>
<th>Status</th>
<th>Delete</th>
<th>Edit</th>
</tr>

<tr>
   <td>Swimming</td>
   <td>Water</td>
   <td>12-nov-2023</td>
   <td>Complete</td>
   <td><button>Delete</button>
   <td><button>Edit</button>
</table>
<br>
<a href="session-add-task"><button>Add task</button></a><br>
<a href="logout"><button>Log out</button></a>
</div>
</body>
</html>