function checkform(){
    var ID=document.getElementById("demo").value ;
      if(ID.length!=8)
        {
            alert("Error, Id must contain 8 characters");
            document.getElementById("demo").focus();
            return false;
        }
    
    var PhoneNumber=document.getElementById("demo1").value ;
    
    
        if(PhoneNumber.length!=11)
        {
            alert("Error, phone number must contain 11 characters");
            document.getElementById("demo1").focus();
            return false;
        }
    
 
 
 }