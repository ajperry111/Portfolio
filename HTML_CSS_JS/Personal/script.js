var login=document.querySelector(".login")
var signup=document.querySelector(".signup")
var submit=document.querySelector(".submit")
var go=document.querySelector(".go")
var firstname=document.querySelector(".firstname")
var firstnamebox=document.querySelector("#firstname")
var lastname=document.querySelector(".lastname")
var lastnamebox=document.querySelector("#lastname")
var cloud9=document.querySelector(".cloud9")
var smiley=document.querySelector(".smiley")
window.onload = function(){
cloud9.onmouseover = function(){
  smiley.style.display="block"
}
cloud9.onmouseout = function(){
  smiley.style.display="none"
}}
function validateForm() {
  let x = firstnamebox.value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
}
login.onclick = function(){
  submit.style.display="none";
  go.style.display="block";
  signup.style.backgroundColor="white";
  signup.style.color="#510205ab";
  login.style.backgroundColor="#E21C3D";
  login.style.color="beige"
  lastname.style.display="none"
  firstname.style.display="none"
  firstnamebox.style.display="none"
  lastnamebox.style.display="none"
}
signup.onclick = function(){
  submit.style.display="block";
  go.style.display="none";
  login.style.backgroundColor="white";
  login.style.color="#510205ab";
  signup.style.backgroundColor="#E21C3D";
  signup.style.color="beige";
  lastname.style.display="block";
  firstname.style.display="block";
  firstnamebox.style.display="inline-block";
  lastnamebox.style.display="inline-block";
}

document.getElementById("submit-to-google-sheets").addEventListener("go", function(event){
  event.preventDefault();
  if (submit.style.display.value==="block"){
    validateForm();
  }
  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;
  function usernameTrue() {
    var range = "https://docs.google.com/spreadsheets/d/1UtuNwcnkC_513gyL_HVp3vzXOKynS3HMzXUC4hPKTw8/edit#gid=0&range=B:B"
    console.log(range)
    for (let i=0; i<range; i++){
      if (username===`https://docs.google.com/spreadsheets/d/1UtuNwcnkC_513gyL_HVp3vzXOKynS3HMzXUC4hPKTw8/edit#gid=0&range=B${i}`){
        return true;
      }
    }
    function passwordTrue() {
      var range1 = "https://docs.google.com/spreadsheets/d/1UtuNwcnkC_513gyL_HVp3vzXOKynS3HMzXUC4hPKTw8/edit#gid=0&range=C:C"
      console.log(range1)
      for (let i=0; i<range; i++){
        if (password===`https://docs.google.com/spreadsheets/d/1UtuNwcnkC_513gyL_HVp3vzXOKynS3HMzXUC4hPKTw8/edit#gid=0&range=C${i}`){
          return true;
        }
      }
    }
    // Validate username and password
    if (usernameTrue() === true && passwordTrue() === true){
      window.location.href = "http://www.w3schools.com"; // Redirect to welcome page
    } 
    else if (usernameTrue() === true && passwordTrue() !== true){
      document.getElementById("error").textContent = "Invalid password.";
    } 
    else {
      document.getElementById("error").textContent = "Invalid username or password.";
    }
  }});


 