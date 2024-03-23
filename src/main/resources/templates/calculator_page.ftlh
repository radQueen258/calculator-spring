<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Calculator Page</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="post">
    <label for="num1">Number 1:</label>
    <input type="number" id="num1" name="num1" required><br>
    <label for="num2">Number 2:</label>
    <input type="number" id="num2" name="num2" required><br>
    <input type="hidden" id="operation" name="operation" value="add">
    <input type="submit" value="Calculate">
</form>
</body>
</html>