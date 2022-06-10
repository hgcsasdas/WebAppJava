<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<link rel="stylesheet" href="Css/crearClase.css">
<script src="https://cdn.tiny.cloud/1/xdvnk6dzaz519bjr5uc1teocywbt1optp7hlrn0rodbhump8/tinymce/5/tinymce.min.js"
        referrerpolicy="origin"></script>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

<%@include file="Includes/head.jsp" %>
<%@include file="Includes/nav.jsp" %>
<!--
<?php
require "php/modelo/Usuario.php";
require "php/modelo/classes.bd.php";
require "php/Controlador/Controller.php";
?>

<?php
$controller = new controller();

if (isset($_POST) && !empty($_POST)) {
    if (isset($_GET['id']) && !empty($_GET['id'])) {
        //actualizaregistro
        $_POST['id'] = $_GET['id'];
        $_PUT = $_POST;
        if ($controller->actualizarEnDB("classes", $_PUT)) {
            echo '<div><script type="module">correctUpdater()</script></div>';
        } else {
            echo '<div><script type="module">failedUpdater()</script></div>';
        }

    } else {
        $fotoURL = "";
        try {
            $path = 'Imgs/modulos/';

            if (move_uploaded_file($_FILES['foto']['tmp_name'], $path . $_FILES['foto']['name'])) {

                $fotoURL = $path . $_FILES['foto']['name'];
            }
        } catch (Exception $e) {
            $fotoURL = 'Imgs/modulos/1bach.jpg';
        }
        $_POST['foto'] = $fotoURL;

        if ($controller->guardarEnDB("modulos", $_POST)) {
            echo '<div><script type="module">correctRegister()</script></div>';
        } else {
            echo '<div><script type="module">failedRegister()</script></div>';
        }
    }
}
if(isset($_GET) && !empty($_GET)){
    try {
        $id = $_GET['id'];
        $datos = ($controller->leerEnDB("modules", $_GET));
        echo $datos[$id];
        echo '<div><script type="module">llenarDatos(' . $id . ' , ' . $datos .' );</script></div>'; //Comprobar que la clase exista
    } catch (Exception $e) {
        header("Location: cursos.php"); //redireccionar
        echo "Debe crear una clase primero";
    }
}
?>
-->
<script>
    var id = 0;

    function cambiaForm() {
        document.getElementById("rellenarDatos").action = 'CrearCurso';

    }

    function llenarDatos(id, clase) {
        //PROBLEMA
        for (let i = 0; i < clase.length; i++) {
            if (id === clase[i]["id_modulo"]) {
                var idClase = i;
            }
        }

        let leccion = clase[idClase];
        this.id = leccion['id_modulo'];
        document.getElementById("titulo").value = leccion['titulo'];
        document.getElementById("foto").src = leccion['foto'];
        document.getElementById("resumen").value = leccion['resumen'];


        let eliminarLista = document.createElement("li");
        let eliminarOption = document.createElement("a");
        let eliminarText = document.createTextNode("Eliminar");
        eliminarOption.setAttribute("href", "javascript:confirmationDelete()");
        eliminarOption.setAttribute("class", "eliminar");
        eliminarOption.appendChild(eliminarText);
        eliminarLista.appendChild(eliminarOption);
        document.getElementsByClassName("listaFormulario")[0].appendChild(eliminarLista);
    }

    //Eliminar curso
    function confirmationDelete() {
        Swal.fire({
            title: '¿Desea eliminar la clase?',
            text: "¡No podrá revertir esta acción!",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: '¡Si, eliminarla!',
            cancelButtonText: '¡No, mantenerla!'
        }).then(async (result) => {
            if (result.isConfirmed) {
                window.location.replace('eliminar.jsp?id=' + id);
            }
        })
    }

</script>
<script class="sweetAlertFunctions">
    function correctRegister() {
        Swal.fire({
            icon: 'success',
            title: 'Se ha creado el curso satisfactoriamente!',
            showConfirmButton: false,
            timer: 1500
        });
    }

    function failedRegister() {
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Ha habido un error, intentalo de nuevo!'
        });
    }

</script>
<script class="textArea-Tiny" type="text/javascript">
    tinymce.init({
        selector: '.descripcion',
        language: 'es',
        plugins: 'lists pagebreak code emoticons image table paste lists advlist link hr charmap directionality',
        toolbar: 'undo | redo | formatselect | fontselect | fontsizeselect | bold | italic | underline | strikethrough | forecolor | backcolor | subscript | superscript | bullist | numlist | aligncenter | alignleft | alignright | alignjustify | outdent | indent | emoticons | link | charmap',
        toolbar_mode: 'floating',
        statusbar: false,
        browser_spellcheck: true,
        contextmenu: false,
        menubar: false,

    });
</script>
<body onload="cambiaForm()">
<section>

    <div class="container-formulario-anadir">
        <form class="rellenar" id="rellenarDatos" action="../java/servlets/CrearCurso.java" method="post" autocomplete="off"
              onsubmit="//alert(examen.innerText)" enctype="multipart/form-data">
            <ul class="listaFormulario">
                <li><label for="titulo"> Título del curso:</label><input name="titulo" id="titulo" type="text" required>
                </li>
                <li><label for="foto"> Foto del curso:</label><input name="foto" id="foto" type="file" required></li>
                <li><label for="resumen"> Resumen:</label></li>
                <br>
                <li><textarea name="resumen" id="resumen" class="descripcion"></textarea></li>

                <li><input class="buttonFormulario" type="submit"></li>
            </ul>

        </form>
    </div>

</section>

<%@include file="Includes/footer.jsp" %>

</body>
</html>