

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
            function submitDataOfUser () {
                const nameOfUser = $("#name").val()
                const lasNameOfUser = $("#lastname").val()
                const ageOfUser = $("#age").val()


                console.log(nameOfUser)
                console.log(lasNameOfUser)
                console.log(ageOfUser)
    
            
            }
            function closeSuccessMsg() {
          
                $("#success-record-msg").css('display', 'none')
            
          
                 document.getElementById('success-record-msg').style.display = 'none'
            } 
        function submitDataOfUser() {
                const nameOfUser = $("#name").val()
                const lasNameOfUser = $("#lastname").val()
                const ageOfUser = $("#age").val()      

                $.ajax({
                    "url": 
                    "http://localhost:5000/insert-data",
                    "method": "POST",
                    "timeout": 0,
                    "headers": {
                      "Content-Type": "application/json; charset=UTF-8"
                    },
                    "data": JSON.stringify({
                        name:nameOfUser,
                        lastName:lasNameOfUser,
                        age:ageOfUser
                    }) 

                }).done(function (response) {
                    
                    if (response.success) {
                        $("#success-record-msg").css('display','block')
            
                        $("#name").val('')
                        $("#lastname").val('')
                        $("#age").val('')            
                    } else {
                        $("#error-record-msg").css('display','block')
                        document.getElementById("error-record-msg").innerHTML += response.message;
                    }
            
                });
            } 


        

    
