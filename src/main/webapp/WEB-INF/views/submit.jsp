<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Submit Form</title></head>
<body>
    <h2>Submit Your Name</h2>
    <form action="submit" method="post">
        Name: <input type="text" name="name" required />
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
