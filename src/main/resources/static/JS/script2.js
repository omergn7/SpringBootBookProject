var loginForm = document.getElementById("loginForm");
var signupForm = document.getElementById("signupForm");
var btn = document.getElementById("btn");

function login() {
    loginForm.style.left = "50px";
    signupForm.style.left = "450px";
    btn.style.left = "0px";
}

function signup() {
    loginForm.style.left = "-400px";
    signupForm.style.left = "50px";
    btn.style.left = "110px";
}
{/* Arttırma butonu */}
<button disabled={item.quantity <= 1} onClick={() =>
    addToCart(item, parseInt(item.quantity) - 1)}
        className="bi bi-dash-lg"></button>
