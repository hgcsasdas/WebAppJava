<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">

<%@include file="Includes/head.jsp" %>
<%@include file="Includes/nav.jsp" %>
<!--
<?php
require_once "php/modelo/classes.bd.php";
require_once "php/modelo/users.bd.php";
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
-->
<script>
    function mostrarModulos(cursos) {
        let modulos = "";
        for (let i = 0; i < cursos.length; i++) {
            modulos += '<div class="item-cursos" ><div class="item-cursos-img"><a href="classAssetIntroduction.jsp?id=' + cursos[i]["id_modulo"] + '" ><img src="'+cursos[i]["foto"]+'" alt="'+cursos[i]["titulo"]+'"></a></div><div class="item-cursos-url"><a href="classAssetIntroduction.jsp?id=' + cursos[i]["id_modulo"] + '">' + cursos[i]["titulo"] + '</a></div><div class="item-cursos-editarCursosa"><a href="moduleCreator.jsp?id=' + cursos[i]["id_modulo"] + '">Editar</a></div></div>';
        }
        document.querySelector(".container-cursos").innerHTML = modulos;
    }
</script>
<section>

    <div class="container-cursos">

    </div>

</section>

<%@include file="Includes/footer.jsp" %>

</body>
</html>