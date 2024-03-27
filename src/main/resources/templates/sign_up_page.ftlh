<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>

    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(to right, #ff6ec7, #ec008c);
        }

        form {
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        input[type="username"],
        input[type="password"] {
            width: 80%;
            padding: 10px;
            border-radius: 5px;
            border: none;
            box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #ec008c;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
            margin-top: 10px;
        }

        input[type="submit"]:hover {
            background-color: #ff6ec7;
        }

        h1 {
            font-size: 2rem;
            margin-bottom: 20px;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #333;
        }

    </style>

</head>
<body>
<h1>Register</h1>
<form action="/signUp" method="post">
    <label>Username:</label>
    <input type="username" name="username" required="required"/>
    <br/>
    <label>Email:</label>
    <input type="email" name="email" required="required"/>
    <br/>
    <label>Password:</label>
    <input type="password" name="password" required="required"/>
    <br/>
    <button type="submit">Register</button>
</form>
</body>
</html>