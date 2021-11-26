function calculate() {
    //alert("1");
    var filter = {};

    let customerId = document.getElementById("customerId");
    let itemQuantity1 = document.getElementById("itemQuantity1");
    let itemQuantity2 = document.getElementById("itemQuantity2");
    let itemQuantity3 = document.getElementById("itemQuantity3");
    let itemQuantity4 = document.getElementById("itemQuantity4");

    let customerIdValue =customerId.value;
    let itemQuantity1Value =itemQuantity1.value;
    let itemQuantity2Value =itemQuantity2.value;
    let itemQuantity3Value =itemQuantity3.value;
    let itemQuantity4Value =itemQuantity4.value;



    if(customerId !==  undefined &&customerIdValue !== '')
        filter.customerId =  customerIdValue;

    if(itemQuantity1 !==  undefined && itemQuantity1Value !== '')
        filter.itemQuantity1 =  itemQuantity1Value.toString();

    if(itemQuantity2 !==  undefined && itemQuantity2Value !== '')
        filter.itemQuantity1 =  itemQuantity2Value.toString();

    if(itemQuantity3 !==  undefined && itemQuantity3Value !== '')
        filter.itemQuantity1 =  itemQuantity3Value.toString();

    if(itemQuantity4 !==  undefined && itemQuantity4Value !== '')
        filter.itemQuantity1 =  itemQuantity4Value.toString();

    //filter.age =  age.value.toString();
    // $('#fieldId')
    $.ajax({
        accept: "application/json charset=utf-8",
        dataType: "text",
        type: 'GET',
        data: filter,
        url: "/customer/calculate",
        success: function (data) {
            //alert('success!');
            document.getElementById("result").innerHTML = data;
        }, error: function (a, b, c) {
            alert('error!');
        }
    });
}