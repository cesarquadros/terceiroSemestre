var nomes = ["Daniel","Renato","Luiz","Abel","Maria","Sílvia","Luana"];

var sobrenomes = ["Silva","Souza","Savoy","Figueira","Teles"];

var lista = [];

const MIN = 18;
const MAX = 99;

var ALTURA = window.innerHeight;
var LARGURA = window.innerWidth;

function Pessoa(n,s,i,r){
	this.id = 0;
	this.nome = n;
	this.sobrenome = s;
	this.idade = i;
	this.r = r;
	this.getResponsavel = function(){
		return lista[this.responsavel];
	}
}

function criar(){
	var n = nomes[~~(Math.random()*nomes.length)];
	var s = sobrenomes[~~(Math.random()*sobrenomes.length)];
	var i = ~~(MIN + Math.random()*(MAX-MIN));
	var r = lista.length < 1 ? -1 : ~~(Math.random()*lista.length);
	var p = new Pessoa(n,s,i,r);
	lista.push(p);
	p.id = lista.length;
	return p;
}

function criarArvore(qtde){
	for(var i = 0; i < qtde; i++) criar();
}

function desenhar(pessoa){
	var caixa = document.createElement("div");
	caixa.classList.add("caixa");
	caixa.setAttribute("id","pessoa"+pessoa.id);
	caixa.setAttribute("title",pessoa.nome +" "+pessoa.sobrenome);
	var cor = (pessoa.idade - MIN)/(MAX-MIN)*50;
	caixa.style.background = "hsl(0,100%,"+cor+"%)";
	caixa.esquerda = Math.random()*(LARGURA-20);
	caixa.topo = Math.random()*(ALTURA-20);
	caixa.direcao = Math.random() *  2 * Math.PI;
	document.body.appendChild(caixa);
	return caixa;
}

function iniciar(){
	criarArvore(5);
	lista.map(desenhar);
	animar();
}

window.addEventListener("load",iniciar);


function mudar(n){
	var caixa = document.querySelector(".caixa:nth-of-type("+n+")");
	var cor = Math.random()*360;
	caixa.style.background = "hsl("+cor+",100%,50%)";
	caixa.classList.add("marcado");
}

function remover(n){
	var caixa = document.querySelector(".caixa:nth-of-type("+n+")");
	caixa.parentNode.removeChild(caixa);
}

function animar(){
	var bolas = document.querySelectorAll(".caixa");
	for(var i = 0; i < bolas.length; i++){
		var t = bolas[i].topo;
		var e = bolas[i].esquerda;
		 t += Math.sin(bolas[i].direcao) * 5;
		 e += Math.cos(bolas[i].direcao) * 5;
		if(e < 0 || t < 0 || e > LARGURA-20 || t > ALTURA-20){
			bolas[i].direcao = Math.random() * 2 * Math.PI;
		} else {
			bolas[i].topo = t;
			bolas[i].esquerda = e;
			bolas[i].style.left = e +"px";
			bolas[i].style.top = t +"px";
		}
	}
	window.requestAnimationFrame(animar);
}
























