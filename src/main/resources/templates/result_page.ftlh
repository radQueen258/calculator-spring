<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Result Page</title>

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
            align-items: flex-start;
            padding: 30px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);

        }

        #tab {
            background-color: rgba(169, 168, 168, 0.44);
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            font-size: 2rem;
            margin-bottom: 20px;
            color: #333;
        }

        p {
            font-size: 1.2rem;
            margin-bottom: 20px;
            color: #333;
            text-align: center;
        }

        input[type="submit"] {
            background-color: #ec008c;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #ff6ec7;
        }
    </style>

</head>
<body>
<form action="user/${userId}/calculator/${calId}/result" method="get">
    <h1>Result</h1>
    <p>The result of the calculation is:${result}</p>
</form>

<div>
    <table id="tab" class="table table-stripped">
        <thead>
        <tr>
            <th scope="col">Number 1</th>
            <th scope="col">Sign</th>
            <th scope="col">Number 2</th>
            <th scope="col">...</th>
            <th scope="col">Result</th>
        </tr>
        </thead>
        <#list history as history>
            <tbody>
            <tr>
                <td>${history.num1}</td>
                <td>${history.signOp}</td>
                <td>${history.num2}</td>
                <td>=</td>
                <td>${history.result}</td>
            </tr>
            </tbody>
        </#list>
    </table>
</div>



</body>
</html>