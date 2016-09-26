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
//criando lista vazia
var lista = [];

//for para preencher o vetor
for(var i =0; i<5; i++){
	lista.push(i+3);
}

function soma (a){return a + 1;}

function somatoria(v,a){return v + a / i}

var lista2 = lista.map(soma);
var lista3 = lista.reduce(somatoria,0);


//colocando o objeto pessoa na lista após os numeros. Uma lista pode possuir varios tipos
/*lista.push(pessoa);
lista.push(lista);
console.log(lista);
*/