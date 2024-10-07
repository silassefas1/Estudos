class formaDeBolo{

    constructor(saborDaMassa, saborRecheio ){
        this.saborDaMassa = saborDaMassa
        this.saborRecheio = saborRecheio
    }

    escrever(){
        console.log(`Um delicioso bolo de ${this.saborDaMassa} com recheio de ${this.saborRecheio}`)
    }
    
}

let boloFeste = new formaDeBolo("Chocolate", "Nutela")
let boloDeNoiva = new formaDeBolo("Vinho com passas", "Chocolate Trufado")

boloFeste.escrever()
boloDeNoiva.escrever()