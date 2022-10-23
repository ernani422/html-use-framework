
/*

function requestOfServer() {

    $.ajax({
        type: 'get',
        url: "http://localhost:8000/hello-world?info=OlaMundo"
    }).done(function(data) { 
        document.getElementById('developer').innerHTML = data.name
        document.getElementById('version').innerHTML = data.version
        document.getElementById('value-of-variable').innerHTML = data.value_of_variable_info
        document.getElementById('company-site').innerHTML = data.web_site_company

        $("#show-values").css('display', 'block')

    });

}

*/

function submitDataOfCar() {

    const nameOfCar = $("#nomeCarro").val()
    const modelOfCar = $("#modelo").val()
    console.log(nameOfCar)  

    $.ajax({
        "url": "http://localhost:8000/carro-insert",
        "method": "POST",
        "timeout": 0,
        "headers": {
          "Content-Type": "application/json; charset=UTF-8"
        },
        "data": JSON.stringify({
            nomeCarro:nameOfCar, 
            modelo:modelOfCar
        }) 
    }).done(function (response) {
        if (response.includes('true')) {
            console.log("ESTÁ ENTRRANDO EM CIMA")
            $("#success-record-msg").css('display', 'block')
            $("#error-record-msg").css('display','none')

            $("#nomeCarro").val('')
            $("#modelo").val('')           
        } else {
            console.log("ESTÁ ENTRRANDO EM BAIXO")
            let errorMsg;
            let errorWidth = '350px'

            if (response.missingAttribute === 'nome_carro') {
                errorMsg = 'O campo de nome do carro está ausente, pode preencher'
                errorWidth = '415px'
            }

            if (response.missingAttribute === 'modelo_carro') {
                errorMsg = 'O campo modelo está ausente, pode preencher'
                errorWidth = '435px'
            }

            $("#error-record-msg").css('display','block')
            $("#success-record-msg").css('display','none')
            $("#content-error-record-msg").html(errorMsg)
            $("#error-record-msg").css('width',errorWidth)
           
        }

    });
}


function closeSuccessMsg() {
    /* Jquery */
    $("#success-record-msg").css('display', 'none')

    /* vanila */
    // document.getElementById('success-record-msg').style.display = 'none'
}

function closeErrorMsg() {
    $("#error-record-msg").css('display', 'none')
}
