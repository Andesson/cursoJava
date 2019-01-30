
var a = 2;
var b= 5;
var c= 1; 

validaA(a);

function validaA() {
    
    var valida = new Boolean
    if (a > 0 ) {
     valida= true;
     console.log('A é maior que Zero');
    
    }
     else{
        console.log('A tem que ser maior que Zero');
        valida = false;
    }

    return valida;
}


function validaDelta() {
    var valorDelta;
    var valida = new Boolean();

    if(validaDelta()){

        valorDelta = ((b*2)-(4*a*c));

        if(valorDelta > 1){
            console.log('true'+ valorDelta);
            valida = true;
        }else{
            valida = false;
            delta = console.log('Valor de Delta é menor que 1');

        }
    }
}

function delta() {
    if(validaDelta()){
        console.log('ok');

    }else{
        console.log('erro')
    }
    
}

delta();
