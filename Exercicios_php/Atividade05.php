<?php
// carrinho[nome, preco, quantidade]
$carrinho = [
	["Arroz", 23, 2],
	["Feijão", 20, 4],
	["Carne", 50, 1],
	["Farinha de Trigo", 15, 1],
	["Caixa de Ovos", 1, 21],
];

$recibo = [];
$total = 0;
echo "Produto --- Qtd --- Preço<br>";
foreach($carrinho as $y => $item){
		$total += $item[1] * $item[2];
		echo $item[0] . " --- " . $item[2] . " --- " . $item[1] . "<br>";
}
echo "<br><br> Total: ".$total; 

?>