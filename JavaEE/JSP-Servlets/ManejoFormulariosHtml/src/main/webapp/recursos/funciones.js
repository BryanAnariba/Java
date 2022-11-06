function validarForm ( formData ) {
    const usuario = formData.nombreUsuario;
    if ( usuario.value === "" || usuario.value === "Escribe Usuario" ) {
        alert("Digite nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    const password = formData.passwordUsuario;
    if ( !password.value === "" || password.length < 3 ) {
        alert("Digite clave de usuario, debe ser mayor a 3 caracteres");
        password.focus();
        password.selec();
        return false;
    }
    
    const tecnologias = formData.tecnologia;
    let checkTecnologia = false;
    for ( let i=0; i<tecnologias.length;i++ ) {
        if ( tecnologias[i].checked ) {
            checkTecnologia = true;
        }
    }
    if ( !checkTecnologia ) {
        alert( "Seleccione una tecnologia" );
        return false;
    }
    
    const generos = formData.genero;
    const generoSeleccionado = false;
    for ( let i=0; i<generos.length; i++ ) {
        if ( generos[i].checked ) {
            generoSeleccionado = true;
        }
    }
    
    if ( !generoSeleccionado ) {
        alert( "Debe seleccionar un genero" );
        return false;
    }
    
    var ocupacion = formData.ocupacion;
    if ( ocupacion.value === "" ) {
        alert( "Debe seleccionar una ocupacion" );
        return false;
    }
    
    // Formulario es valido si llega aqui
    alert( "La informacion parece correcta." );
    return true;
}


