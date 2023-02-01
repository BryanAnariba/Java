const procesaInformacion = ( formData ) => {
    const nombreUsuario = formData.nombreUsuario;
    
    if ( nombreUsuario.value === '' || nombreUsuario.value === 'Escribir Usuario' ) {
        alert( 'Digite un nombre de usuario' );
        nombreUsuario.focus();
        nombreUsuario.select();
        return false;
    }
    
    const passwordUsuario = formData.passwordUsuario;
    
    if ( passwordUsuario.value === '' || passwordUsuario.value.length <= 3 ) {
        alert( 'Digite el password de usuario o password debil' );
        passwordUsuario.focus();
        passwordUsuario.select();
        return false;
    }
    
    const tecnologias = formData.tecnologia;
    let checkedTecnologias = false;
    tecnologias.forEach( tecnologia => {
        if ( tecnologia.checked ) {
            checkedTecnologias = true; // SI ENTRO AQUI SIGNIFICA QUE SELECCIONO UNO Y NO ESTA VACIA
        }
    });       
 
    if ( !checkedTecnologias ) {
        alert( 'Debe seleccionar al menos una tecnologia' );
        return false;
    }
    
    const generos = formData.genero;
    let seleccionoGenero = false;
    generos.forEach( genero => {
        if ( genero.checked ) {
            seleccionoGenero = true;
        }
    });
    if ( !seleccionoGenero ) {
        alert( 'Debe seleccionar un genero' )
        return false;
    }
    
    const profesion = formData.profesion;
    if ( profesion.trim() === '') {
        alert( 'Debe seleccionar una profesion ya que es obligatorio' );
        return false;
    }
    
    // SI LLEGO HASTA AQUI
    return true;
}