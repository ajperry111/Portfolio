const loginBtn = document.querySelector('.login');
const signupBtn = document.querySelector('.signup');
const submitBtn = document.querySelector('.submit');
const goBtn = document.querySelector('.go');
const firstNameField = document.querySelector('.firstname');
const lastNameField = document.querySelector('.lastname');
const errorDiv = document.getElementById('error');

signupBtn.addEventListener('click', () => {
    firstNameField.style.display = 'block';
    lastNameField.style.display = 'block';
    submitBtn.style.display = 'block';
    goBtn.style.display = 'none';
    
    signupBtn.style.backgroundColor = '#D57A09';
    signupBtn.style.color = '#ffffff';
    signupBtn.style.border = 'none';
    
    loginBtn.style.backgroundColor = '#f4f4f4';
    loginBtn.style.color = '#2d2d2d';
    loginBtn.style.border = '1px solid #ddd';
    
    errorDiv.textContent = '';
});

loginBtn.addEventListener('click', () => {
    firstNameField.style.display = 'none';
    lastNameField.style.display = 'none';
    submitBtn.style.display = 'none';
    goBtn.style.display = 'block';
    
    loginBtn.style.backgroundColor = '#D57A09';
    loginBtn.style.color = '#ffffff';
    loginBtn.style.border = 'none';
    
    signupBtn.style.backgroundColor = '#f4f4f4';
    signupBtn.style.color = '#2d2d2d';
    signupBtn.style.border = '1px solid #ddd';
    
    errorDiv.textContent = '';
});

const scriptURL = 'YOUR_GOOGLE_APPS_SCRIPT_URL_HERE';
const form = document.getElementById('submit-to-google-sheets');

form.addEventListener('submit', e => {
    e.preventDefault();
    
    fetch(scriptURL, { method: 'POST', body: new FormData(form)})
        .then(response => {
            alert("Success!");
            form.reset();
        })
        .catch(error => {
            errorDiv.textContent = "Error: " + error.message;
        });
});
