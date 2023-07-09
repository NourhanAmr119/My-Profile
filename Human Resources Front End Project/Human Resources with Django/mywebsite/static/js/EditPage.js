function validate()
{
        var ID = document.getElementById("id").value;
        var Name = document.getElementById("name").value;
        var Phone=document.getElementById("phone").value ;
        var Address = document.getElementById("address").value;
        var Email = document.getElementById("email").value;
        var vdays = document.getElementById("vdays").value;
        var avdays = document.getElementById("avdays").value;
        var Salary = document.getElementById("salary").value;
    
        if (ID.value == "") {
            
            alert("Please enter the ID!");
        }
        else if (ID.length!=8){
            alert("Error, Id must contain 8 characters");
            document.getElementById("id").focus();
            return false;
        }
        else if(ID.length==8 && ID.value!="")
        {
    
            if (Name.value == "") {
                
                alert("Please enter the Name!");
        }
        }
         if(Phone.value==" ")
        {    
            alert("Please enter the phone Number!");
        }
         if(Phone.length!=11)
            {
                alert("Error, phone number must contain 11 characters");
                document.getElementById("phone").focus();
                return false;
            }     
        
            
         if (Address.value == "") {
            
            alert("Please enter the Address!");
        }
       
        
        if (Email.value == "") {
            
            alert("Please enter the Email!");
        }
        
        
         if (vdays.value == "") {
            
            alert("Please select the Number of available vacation days!");
        }
        
        if (avdays.value == "") {
            
            alert("Please select the Number of actual approved vacation days!");
        }
        
         if (Salary.value == "") {
            
            alert("Please select the Salary!");
        }
        var msg;
        if (confirm("Are you sure you want to update/delete this employee data?")) {
          msg = "successful update";
        } else {
          msg = "changes not done";
        }
        return true;
    
    
}


 