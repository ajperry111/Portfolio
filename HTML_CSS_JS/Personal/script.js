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
    
    signupBtn.style.backgroundColor = '#E21C3D';
    signupBtn.style.color = 'beige';
    loginBtn.style.backgroundColor = 'white';
    loginBtn.style.color = '#510205ab';
    errorDiv.textContent = '';
});

loginBtn.addEventListener('click', () => {
    firstNameField.style.display = 'none';
    lastNameField.style.display = 'none';
    submitBtn.style.display = 'none';
    goBtn.style.display = 'block';
    
    loginBtn.style.backgroundColor = '#E21C3D';
    loginBtn.style.color = 'beige';
    signupBtn.style.backgroundColor = 'white';
    signupBtn.style.color = '#510205ab';
    errorDiv.textContent = '';
});

const form = document.getElementById('submit-to-google-sheets');
form.addEventListener('submit', e => {
    e.preventDefault();
    console.log("Form submitted. Integrating with Google Sheets logic...");
});
