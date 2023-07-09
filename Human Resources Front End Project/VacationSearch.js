// JavaScript source code
function search() {
    var ddlFruits = document.getElementById("emp");
    if (ddlFruits.value == "") {
        
        alert("Please select the employee!");
    }
    else {
        location.href = "VactionForm.html";
	}
}
function home() {
    location.href = "home.html";
}
function add() {
    location.href = "page1.html";
}
function table() {
    location.href = "searchphase.html";
}
function vacation() {
    location.href = "VacationSearch.html";
}
