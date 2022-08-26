

    function requestOfServer(){
        $.ajax({
            type: 'get',
                   url: "http://localhost:4000/hello-world?info=testonly"
               }).done(function (data) {
                   console.log(data);
                   document.getElementById('developer').innerHTML = data.name
                   document.getElementById('version').innerHTML = data.version
                   document.getElementById('value-of-variable').innerHTML = data.value_of_variable_info
                   document.getElementById('company-site').innerHTML = data.web_site_company
                   $("#show-values").css('display','block');
               });

            

    }