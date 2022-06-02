package modelo;

import java.util.ArrayList;

class DAOUsers{//
    // extends BD {


    //public int function insertarUsuarios(Usuario usuario){

/*
        int registroExitoso = 1;
        int campoEmail = 3;
        int contadorCampos=0;
        ArrayList<String> $claves = new ArrayList<String>();
        ArrayList<String> $valores = new ArrayList<String>();

        foreach (String datos as $clave => $valor){

            if($clave != "id" && $clave != "confirmacion" && $clave != "h-captcha-response" && $clave != "g-recaptcha-response") {
                $claves[] = addslashes($clave);
                if($clave == "mail") {
                    $campoEmail=$contadorCampos;
                }
                    if($clave != "contrasena") {
                    $valores[] = ("'" . addslashes($valor) . "'");
                }else{
                    $valores[] = ("'" . $this->asignarContrasena($valor) . "'");
                }
            }
            $contadorCampos++;
        }

        if($this->verificarUsuario($valores[$campoEmail])==0) {
            $sql = "insert into users (" . implode(', ', $claves) . ") values (" . implode(', ', $valores) . ")";
            $resultado = $this->conexion->query($sql);
        }else{
            $registroExitoso=0;
        }

        return $registroExitoso;
    }

    public function verificarUsuario($email){
        $userExistente = 0;
        $existeEmail = 'select * from users where mail = ' . $email;
        $result = $this->conexion->query($existeEmail)->num_rows;
        if ($result != 0){
            $userExistente = 1;
        }
        return $userExistente;
    }

    public function asignarContrasena($contrasena){
        return password_hash($contrasena, PASSWORD_DEFAULT);
    }



    public function consultarUsuarios($datos){
        $tabla = "users";
        $validadoCorrecto = 0;
        foreach ($datos as $clave => $valor){
            $$clave = $valor;
        }
        $sql = 'select contrasena from '.$tabla.' where mail = "' . $mail.'"';
        $resultado =   $this->conexion->query($sql);
        try {
            $pass = implode(mysqli_fetch_assoc($resultado));
            if (password_verify($contrasena, $pass)) {
                $validadoCorrecto = 1;
            }
        }catch (TypeError $te){
            $validadoCorrecto = 0;
        }
        return $validadoCorrecto;
    }
*/
}