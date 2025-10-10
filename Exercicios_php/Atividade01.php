<?php
// [nome,tamanho (P,M,G)]
$roupas = [
	["Calça Jeans", "M"],
	["Camisa Polo", "G"],
	["Camisa Polo", "M"],
	["Shorts Jeans", "P"],
	["Calça Moletom", "G"],
	["Blusa Moletom", "M"],
];

$precos = [
];

foreach($roupas as $y => $linha){
	$preco = 0;
	$aumento = FALSE;
	foreach ($linha as $x => $valor){
		if ($x == 0){
			switch ($linha[0]){
				case "Calça Jeans":
					$preco = 80;
					break;
				case "Camisa Polo":
					$preco = 60;
					break;
				case "Shorts Jeans":
					$preco = 70;
					break;
				case "Calça Moletom":
					$preco = 90;
					break;
				case "Blusa Moletom":
					$preco = 80;
					break;
			}
			
			
			switch ($linha[1]){
				case "G":
					$preco += $preco * 0.10;
					$aumento = TRUE;
					break;
				default:
					$aumento = FALSE;
					break;
			}
			$array = [
			[$linha[0], $linha[1], $preco, $aumento]
			];
			array_push($precos,$array);
		}
	}
}

foreach($precos as $y => $item){
	foreach($item as $x => $valor){
	if($valor[3]){
		echo "A roupa ". $valor[0] . " de tamanho " . $valor[1] . " custa " . $valor[2] . " (com um aumento de 10%) <br>";
	}else{
		echo "A roupa ". $valor[0] . " de tamanho " . $valor[1] . " custa " . $valor[2] . "<br>";
	}
}
}
?>