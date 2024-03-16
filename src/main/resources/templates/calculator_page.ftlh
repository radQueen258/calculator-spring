<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
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


<#--<!DOCTYPE html>-->
<#--<html>-->
<#--<head>-->
<#--    <title>Calculator</title>-->
<#--</head>-->
<#--<body>-->
<#--<h1>Calculator</h1>-->
<#--<form id="calculation-form">-->
<#--    <label for="num1">Number 1:</label>-->
<#--    <input type="number" id="num1" name="num1" required><br>-->
<#--    <label for="num2">Number 2:</label>-->
<#--    <input type="number" id="num2" name="num2" required><br>-->
<#--    <input type="hidden" id="operation" name="operation" value="add">-->
<#--    <button type="submit">Calculate</button>-->
<#--</form>-->
<#--<div id="result"></div>-->
<#--<script>-->
<#--    document.getElementById('calculation-form').addEventListener('submit', function(event) {-->
<#--        event.preventDefault();-->
<#--        var num1 = parseFloat(document.getElementById('num1').value);-->
<#--        var num2 = parseFloat(document.getElementById('num2').value);-->
<#--        var operation = document.getElementById('operation').value;-->
<#--        var formData = new FormData();-->
<#--        formData.append('num1', num1);-->
<#--        formData.append('num2', num2);-->
<#--        fetch('/api/calculations/calculate', {-->
<#--            method: 'POST',-->
<#--            body: formData-->
<#--        })-->
<#--            .then(function(response) {-->
<#--                return response.json();-->
<#--            })-->
<#--            .then(function(data) {-->
<#--                document.getElementById('result').textContent = 'Result: ' + data.result;-->
<#--            });-->
<#--    });-->
<#--</script>-->
<#--</body>-->
<#--</html>-->