function ocultar(){
    const menu = document.querySelector("#menu");
    menu.classList.toggle("mostrar");
}
function desplegarSubmenu(){
    const subMenuBtn = document.querySelector(".submenu1");
    subMenuBtn.classList.toggle("desplegar");

}
function desplegarSubmenu1(){
    const subMenuBtn = document.querySelector(".submenu2");
    subMenuBtn.classList.toggle("desplegar");

}
function desplegarSubmenu2(){
    const subMenuBtn2 = document.querySelector(".desplegableClases");
    subMenuBtn2.classList.toggle("clasesDesplegada");

}
function cerrar(){
    const close = document.querySelector(".popup-container");
    close.classList.toggle("cerrar-popup");
    setCookie();
}

function setCookie() {
    document.cookie = "Indomath=yes; path=/; ;domain=127.0.0.1";
}

function checkCookie() {
    let todasLasCookies = document.cookie;
    if (todasLasCookies != "") {
        cerrar();
    }else{

    }
}