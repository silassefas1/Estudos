let ehLigado = true

if (ehLigado){
    console.log("Computador ligado")
}

let possuiOvos = true
let compraItens = ""

if(possuiOvos){
    compraItens= "Leite"
}

possuiOvos = false

console.log("Itens comprados: ", compraItens )

if(possuiOvos){
    console.log("comprar leite!")
}else{
    console.log("Comprar lasanha congelada! ")
}

let temLasanha = false

if(possuiOvos){
    console.log("comprar leite!")
}else if(temLasanha){
    console.log("Comprar lasanha congelada! ")
}else{
    console.log("Comprar torta")
}