<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Staff Info</title>
    <script type="text/javascript" src="jquery-3.5.1.js"></script>
    <script type="text/javascript" src="main.js"></script>
</head>
<body>
<label>CustomerId</label>
<input type="text" name="customerId" id="customerId" value="${customerId}"/>
</br>
</br>
<label>ItemId</label>
<output type="text" name="itemId1" id="itemId1" value="1"/>
</br>
<label>ItemQuantity</label>
<input type="text" name="itemQuantity1" id="itemQuantity1" value="${itemQuantity1}"/>
</br>
</br>
<label>ItemId</label>
<output type="text" name="itemId2" id="itemId2" value="2"/>
</br>
<label>ItemQuantity</label>
<input type="text" name="itemQuantity2" id="itemQuantity2" value="${itemQuantity2}"/>
</br>
</br>
<label>ItemId</label>
<output type="text" name="itemId3" id="itemId3" value="3"/>
</br>
<label>ItemQuantity</label>
<input type="text" name="itemQuantity3" id="itemQuantity3" value="${itemQuantity3}"/>
</br>
</br>
<label>ItemId</label>
<output type="text" name="itemId4" id="itemId4" value="4"/>
</br>
<label>ItemQuantity</label>
<input type="text" name="itemQuantity4" id="itemQuantity4" value="${itemQuantity4}"/>
</br>
</br>
<button type="button" value="calculatePayment" onclick="{calculate()}">Calculate</button>
</br>
</br>
<output type="text" id="result" value=" ${result}"></output>

</body>
</html>