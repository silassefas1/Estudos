//Swtch/case/default/break

let fruta = "Uva"

switch(fruta){
    case "Laranja": 
        console.log("Suco de laranja")
        break
    case "Banana":
        console.log("Vitamina de Banana")
        break
    case "Maça":
        console.log("Suco de Maça")
        break
    default:
        console.log("Hoje não tem suco")
    
}

/* o case pode ser aninhando ex:
switch(fruta){
    case "Banana": 
    case "Abacate"
        console.log("Saida")
        break
        */