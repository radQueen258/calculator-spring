<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Calculator Page</title>
    <style>
        body {
            background: linear-gradient(to right, #ff6ec7, #ec008c);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        form {
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input[type="number"],
        select {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: none;
            box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
        }

        input[type="submit"] {
            background-color: #ff6ec7;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #ec008c;
        }
    </style>
</head>
<body>
<form action="/user/{user-id}/calculator" method="post">
    <label for="num1">Number 1:</label>
    <input type="number" id="num1" name="num1" required><br>
    <label for="num2">Number 2:</label>
    <input type="number" id="num2" name="num2" required><br>
    <label for="operation">Operation:</label>
    <select id="operation" name="signOp">
        <option value="add">Add</option>
        <option value="subtract">Subtract</option>
        <option value="multiply">Multiply</option>
        <option value="divide">Divide</option>
    </select><br>
    <input type="submit" value="Calculate">
</form>
</body>
</html>