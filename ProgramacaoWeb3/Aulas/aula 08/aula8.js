//variaveis simples
var nome = "Cesar";
var sobrenome = "Quadros";
var idade = "28";

//objeto
var pessoa = {
	"nome":nome,
	"sobrenome":sobrenome,
	"idade":idade
};

//criando um construtor

var listaPessoa = [];
function Pessoa(n,s,i){
	this.nome = n;
	this.sobrenome = s;
	this.idade = i;
	this.getNomeCompleto = function (){return this.nome + " " + this.sobrenome};
}

//instanciando uma pessoa
var p1 = new Pessoa("Cesar", "Quadros", "28");
var p2 = new Pessoa("pessoa2", "teste2", "29");
var p3 = new Pessoa("pessoa3", "teste3", "30");

listaPessoa.push(p1);
listaPessoa.push(p2);
listaPessoa.push(p3);

//imprime no console do navegador
/*console.log(p1);
console.log(pessoa);
*/





/*
var lista = [];
//for para preencher o vetor
for(var i =0; i<5; i++){
	lista.push(i+1);
}
*/