/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperadoresEnJava;

import java.util.Scanner;


public class main {
    public static void main ( String[] args ) {
        double a = 3;
        double b = 2;
        double c = a + 5 - b;
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++OPERACIONES CON OPERADORES DE ASIGNACION++++++++++++++++++++");
        var suma = a + b;
        System.out.println( "Resultado de la Suma: " + suma );
        
        var resta =  a - b;
        System.out.println( "Resultado de la Resta: " + resta );
        
        var multiplicacion = a * b;
        System.out.println( "Resultado de la Multiplicacion: " + multiplicacion );
        
        double division = a / b;
        System.out.println( "Resultado de la Division: " + division );
        
        double modulo = a % b;
        System.out.println( "Resultado del Modulo: " + modulo );
        
        if ( a % b == 0 ) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }
        
        System.out.println( "Valor de c: " + c ); 
        
        a += 3;
        System.out.println( "a Incrementado en 3: " + a ); // 6
        b -= 1;
        System.out.println( "b Decrementado en 2: " + b ); // 1
        a *= 3;
        System.out.println( "a multiplicado por 3: " + a ); // 18
        b /= 2;
        System.out.println( "b dividido entre 2: " + b ); // 0.5
        
        var num1 =3;
        var num2 = -num1;
        System.out.println( "Valor Numero 1 : " + num1 );
        System.out.println( "Valor Numero 2 : " + num2 );
         
        var boolTrueValue = true;
        var boolFalseValue = !boolTrueValue;
        
        System.out.println( "Valor primer boleano: " + boolTrueValue );
        System.out.println( "Valor primer boleano: " + boolFalseValue );
        
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++OPERADORES DE INCREMENTO Y DECREMENTO++++++++++++++++++++");
                                            // Incrementadores
         // 1 - Pre Incremento
        var i = 3;
        var k = ++i; // primero se incrementa i a 4 y despues usa el valor 4 y lo pone en k
        System.out.println( "Contador --i: " + i  );
        System.out.println( "Contador --k: " + k );
         
         // 2 - Post Incremento
        var g = 5;
        var j = g++;
        System.out.println( "Contador g--: " + g  );
        System.out.println( "Contador j--: " + j );
         
                                            // Decrementadores
        // 1 - Pre Decremento
        var contadorDecrementado = 5;
        var contadorDosDecremento = --contadorDecrementado;
        System.out.println( "Decremento con --valor: " + contadorDecrementado );
        System.out.println( "Decremento con --valor2: " + contadorDosDecremento );
        
        // 2 - Post Decremento
        contadorDecrementado = 5;
        contadorDosDecremento = contadorDecrementado--;
        System.out.println( "Decremento con valor--: " + contadorDecrementado );
        System.out.println( "Decremento con valor2--: " + contadorDosDecremento ); 
        
        
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++COMPARANDO CADENAS+++++++++++++++++++++++");
        var numeroUno = 3;
        var numeroDos = 2;
    
        var sonIguales = ( numeroUno == numeroDos ); // false
        System.out.println( numeroUno + " y " + numeroDos + " son iguales: " + sonIguales );    
        
        var noSonIguales = ( numeroUno != numeroDos ); // true
        System.out.println( numeroUno + " y " + numeroDos + " no son iguales: " + noSonIguales );
        
        System.out.println( numeroUno + " es mayor o igual que " + numeroDos + ": " + ( numeroUno >= numeroDos )); // true
        System.out.println( numeroUno + " es menor o igual que " + numeroDos + ": " + ( numeroUno <= numeroDos )); //false
        
        var nombreCompleto = "Bryan Ariel Sanchez Anariba";
        var nombreCompleto2 = "Maria Fernanda Sanchez Anariba";
        var nombreUnoEsIgualNombreDos = ( nombreCompleto.equals( nombreCompleto2 ) ); // false
        System.out.println( 
            nombreCompleto + 
            " ES IGUAL A " +  
            nombreCompleto2 + 
            " : " + 
            nombreUnoEsIgualNombreDos  
        );
        
        var edad = 30;
        if ( edad >= 18 ) {
            System.out.println( "Eres un adulto" );
        } else {
            System.out.println( "Eres un joven" );
        }
        
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++OPERADORES CONDICIONALESS++++++++++++++++++++");
        
        var valorNumero = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var estaEnElRango = valorNumero >= valorMinimo && valorNumero <= valorMaximo;
        if ( estaEnElRango  ) {
            System.out.println( valorNumero + " SE ENCUENTRA ENTRE " + valorMinimo + " Y " + valorMaximo );
        } else {
            System.out.println( valorNumero + " NO SE ENCUENTRA ENTRE " + valorMinimo + " Y " + valorMaximo );
        }
        
        valorNumero = -10;
        valorMinimo = 0;
        valorMaximo = 10;
        estaEnElRango = valorNumero >= valorMinimo && valorNumero <= valorMaximo;
        if ( estaEnElRango  ) {
            System.out.println( valorNumero + " SE ENCUENTRA ENTRE " + valorMinimo + " Y " + valorMaximo );
        } else {
            System.out.println( valorNumero + " NO SE ENCUENTRA ENTRE " + valorMinimo + " Y " + valorMaximo );
        }
        
        var tieneVacaciones = false;
        var tieneDiaDeDescanso = true;
        if ( tieneVacaciones || tieneDiaDeDescanso ) {
            System.out.println( "El padre puede ir al partido de su hijo" );
        } else {
            System.out.println( "El padre no puede ir al partido de su hijo" );
        }
        
        
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++OPERADORE TERNARIOS++++++++++++++++++++");
        
        var resultadoDeComprobacionNumeros = ( -3 > 2 ) ? "-3 Es Mayor 2" : "-3 Es Menor 2" ;
        System.out.println( resultadoDeComprobacionNumeros );
        
        var n1 = 10;
        resultadoDeComprobacionNumeros = ( n1 % 2 == 0 ) ? ( n1 + " :Es Par" ) :( n1 + " :Es Impar" ) ;
        System.out.println( resultadoDeComprobacionNumeros );
        
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++PRECEDENCIA DE OPERADORES++++++++++++++++++++");
        var xValue = 5;
        var yValue = 10;
        var zValue = ++xValue + yValue--; // 6 + 10, 10 se usa primero y despues de decrementa 6 se incremente y despues se usa
        System.out.println( xValue ); // 6
        System.out.println( yValue ); // 9
        System.out.println( zValue ); // 16
        
        var res = 4 + 5 * 6 / 3; // 4 + 5*2 = 14
        System.out.println( "Resultado = " + res );
        
        // EJERCICIO UNO CALCULAR AREA Y PERIMETRO DE UN RECTANGULO
        // L = LONGITUD, W = ANCHO
        // PERIMETRO = 2 l + 2 w
        // AREA = lw
        double longitudRectangulo = 0;
        double anchoRectangulo = 0;
        double perimetroRectangulo = 0;
        double areaRectangulo = 0;
        Scanner entradaDatos = new Scanner( System.in );
        System.out.println("DIGITE LA LONGITUD DEL RECTANGULO: ");
        longitudRectangulo = Double.parseDouble( entradaDatos.nextLine() );
        System.out.println("DIGITE EL ANCHO DEL RECTANGULO: ");
        anchoRectangulo = Double.parseDouble( entradaDatos.nextLine() );
        perimetroRectangulo = 2 * ( longitudRectangulo  + anchoRectangulo );
        areaRectangulo = longitudRectangulo * anchoRectangulo;
        System.out.println("Perimetro del rectangulo: " + perimetroRectangulo + ", Area rectangulo: " + areaRectangulo );
        
        // DETERMINAR EL NUMERO MAYOR ENTRE DOS VALORES
        double verificaNumeroUno = 0;
        double verificaNumeroDos = 0;
        System.out.println("Digite el primer numero: ");
        verificaNumeroUno = Double.parseDouble( entradaDatos.nextLine() );
        System.out.println("Digite el segundo numero: ");
        verificaNumeroDos = Double.parseDouble( entradaDatos.nextLine() );
        
        var verifica = 
            ( verificaNumeroUno > verificaNumeroDos ) 
            ? 
                ( verificaNumeroUno + " es mayor que " + verificaNumeroDos ) 
            : 
                ( verificaNumeroUno < verificaNumeroDos ) 
                ? 
                    ( verificaNumeroDos + " es mayor que " + verificaNumeroUno )
                :
                    verificaNumeroUno + " es igual que " + verificaNumeroDos
                ;
        System.out.println( verifica );
        
        
    }
}
