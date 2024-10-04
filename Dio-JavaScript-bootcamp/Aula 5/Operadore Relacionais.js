let numero = "1";
console.log(numero == 1)

// == se o conteudo é igual
// === se o valor e o formato é igual

// != diferente de
let marca = "Apple"
console.log(marca != "Apple")

let cpfBloqueado = "123.445.222-09"
let cpfUsuario = "222.111.222-02"

let ehCpfBloqueado = cpfBloqueado !== cpfUsuario

console.log("É um usuario valido ? "+ ehCpfBloqueado);


let idadeMinima = 18
let idadeUsuario = 17
let usuarioAutorizado = idadeUsuario > idadeMinima
console.log(" Usuario pode passar ? " + usuarioAutorizado);

console.log(true&&false)