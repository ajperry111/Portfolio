const loginBtn = document.querySelector('.login');
const signupBtn = document.querySelector('.signup');
const submitBtn = document.querySelector('.submit');
const goBtn = document.querySelector('.go');
const firstNameField = document.querySelector('.firstname');
const lastNameField = document.querySelector('.lastname');
const errorDiv = document.getElementById('error');
const form = document.getElementById('submit-to-google-sheets');

let isSignUpMode = false;
const scriptURL = 'https://script.google.com/macros/s/AKfycbw3y8R8sfkfQ-QqfG3FHIuFcjOlSqcZVZkachvleC6AX6RJbM6Tg4gSezGi4RasBbDk/exec';

signupBtn.addEventListener('click', () => {
    isSignUpMode = true;
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
    isSignUpMode = false;
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

form.addEventListener('submit', e => {
    e.preventDefault();
    const usernameInput = document.getElementById('username').value;
    const passwordInput = document.getElementById('password').value;

    gapi.client.sheets.spreadsheets.values.get({
        spreadsheetId: '1UtuNwcnkC_513gyL_HVp3vzXOKynS3HMzXUC4hPKTw8',
        range: 'Login!A:D'
    }).then((response) => {
        const rows = response.result.values || [];
        const userExists = rows.some(row => row[2] === usernameInput);

        if (isSignUpMode) {
            if (userExists) {
                errorDiv.textContent = "Error: Username already exists.";
            } else {
                fetch(scriptURL, { method: 'POST', body: new FormData(form)})
                    .then(response => {
                        alert("Account Created Successfully!");
                        form.reset();
                    })
                    .catch(error => errorDiv.textContent = "Error: " + error.message);
            }
        } else {
            const validUser = rows.find(row => row[2] === usernameInput && row[3] === passwordInput);
            if (validUser) {
                alert("Login Successful! Welcome, " + (validUser[0] || usernameInput));
            } else {
                errorDiv.textContent = "Error: Invalid username or password.";
            }
        }
    }).catch(error => {
        errorDiv.textContent = "Error accessing database: " + error.message;
    });
});
