
function deCelsius(temperatura) {
    return C = temperatura - 273
 }
 
 
 function deFahrenheit (temperatura) {
    let k = deCelsius(temperatura);
     return F=1.8*k+32
 }
 
 
 console.log(`Celsius: `+ deCelsius(300).toFixed(1)+`K 
 Fahrenheit: `+deFahrenheit(260).toFixed(1)+'F')
 