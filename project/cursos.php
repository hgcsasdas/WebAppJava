<!doctype html>
<html lang="es">
<?php
include "Includes/head.php";
include "Includes/nav.php";
require_once "php/Modelo/classes.bd.php";
require_once "php/Modelo/users.bd.php";
require "php/Controlador/Controller.php";
?>
<?php
//poner modulos en mayusculas
$controller = new controller();

$modulos =  $controller->leerEnDB("modules", "");
echo "<script type='module'>mostrarModulos($modulos)</script>";

//delete curso
if (isset($_POST) && !empty($_POST)) {
    echo json_encode($_POST);
    //echo "<script>window.location.replace(this)</script>";
}

?>
<script>
    function mostrarModulos(cursos) {
        let modulos = "";
        for (let i = 0; i < cursos.length; i++) {
            modulos += '<div class="item-cursos" ><div class="item-cursos-img"><a href="classAssetIntroduction.php?id=' + cursos[i]["id_modulo"] + '" ><img src="'+cursos[i]["foto"]+'" alt="'+cursos[i]["titulo"]+'"></a></div><div class="item-cursos-url"><a href="classAssetIntroduction.php?id=' + cursos[i]["id_modulo"] + '">' + cursos[i]["titulo"] + '</a></div><div class="item-cursos-editarCursosa"><a href="cursosEdit.php?id=' + cursos[i]["id_modulo"] + '">Editar</a></div></div>';
        }
        document.querySelector(".container-cursos").innerHTML = modulos;
    }
</script>
<section>

    <div class="container-cursos">

    </div>

</section>
<?php include "Includes/footer.php"?>

</body>
</html>