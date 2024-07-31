const firstname = document.querySelector('#firstname'); 
const lastname = document.querySelector('#lasttname');
const passkey = document.querySelector('#password');

const generate = document.querySelector('#generate'); 


const signup=document.querySelector('#signup');
const createpassword= document.querySelector('#createpassword');
const seebtn = document.querySelector('#seebtn'); 
const email = document.querySelector('#email'); 
const mobile= document.querySelector('#mobile'); 

function seepassword(){
    if(createpassword.type==='password'){
        createpassword.type='text';
        seebtn.innerText='Hide'
    }
    else{
        createpassword.type='password';
        seebtn.innerText='See';
    }
}
seebtn.addEventListener('click',seepassword);