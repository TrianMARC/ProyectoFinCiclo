$(document).ready(function(){
    $('#password').on('blur',checkPassword);
    $('#confpassword').on('blur',checkPassword);
    $('#nif').on('blur',checkNIF);
});

function checkPassword(){
   var pass=$('#password').val();
   var pass2 = $('#confpassword').val();
   if(pass.length>0){
    if(pass!==pass2) $("#errorpassword").fadeIn("slow",function(){ $("#errorpassword").html("Password Mismatch");});
   else $("#errorpassword").fadeOut();
   }
}

function checkNIF(event){
    var nif = event.currentTarget.value;
    var num = nif.substr(0,nif.length-1);
    var let = nif.substr(nif.length-1,1);
    num = num % 23;
    var char='TRWAGMYFPDXBNJZSQVHLCKET';
    char=char.substring(num,num+1);
    if (char!=let){ 
        $("#errorpassword").fadeIn("slow",function(){ $("#errorpassword").html("Incorrect NIF.");});
         $("#submit").prop('disabled', true);
         event.currentTarget.focus();
    }
    else{
        var dataString = "action=CheckNIF&nif=" + nif;
        var request = $.ajax({
          url: "../Dispatcher",
          type: "POST",
          data: dataString,
          dataType: "html"
        });

        request.done(function(msg) {
          if(msg.indexOf("OK") === -1){
              $("#errorpassword").fadeIn("slow",function(){ $("#errorpassword").html(msg);});
              $("#submit").prop('disabled', true);
              event.currentTarget.focus();
          }
        });
    }
}