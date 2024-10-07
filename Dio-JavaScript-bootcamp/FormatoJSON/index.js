/*JSON - JavaScript Object Notation, formato de objeto baseado em chave e valor*/

let invoice = {
    name: "Silas",
    age: 25,
    products: {
        0:["Mouse", 29.90],
        1:["Teclado Mecanico", 129.99],
        2:["Monitor 32'", 1997.87]

    },
    valorTotal: 2157.76,
    parcelas: 1 
}

genreateInvoice(invoice)

function genreateInvoice(invoice){
    console.log(`O comprador é ${invoice.name}`)
    console.log(`A idade é ${invoice.age}`)
    console.log("-----------------")
    console.log("Produtos: ")
    for(let index in invoice.products){
        let[productName , productPrice] = invoice.products[index]
        console.log(`- ${productName}: R$ ${productPrice}`)
    }
    console.log("-----------------")
    console.log(`O valor total é ${invoice.valorTotal}`)
    console.log(`Forma de pagamento é ${invoice.parcelas} x`)

}