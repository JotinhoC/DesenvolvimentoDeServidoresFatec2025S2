<?php
$valor = 2003;
$notas = 0;
$saques = [20,50,100];

$saque = 1;

switch($saque){
	case 0:
		$valor_saque = $valor;
		while ($valor_saque >= 0){
			$valor_saque -= $saques[0];
			$notas += 1;
		}
		break;
	case 1:
		$valor_saque = $valor;
		while ($valor_saque >= 0){
			$valor_saque -= $saques[1];
			$notas += 1;
		}
		break;
	case 2:
		$valor_saque = $valor;
		while ($valor_saque >= 0){
			$valor_saque -= $saques[2];
			$notas += 1;
		}
		break;
}

echo "Valor para sacar: " . $valor . "<br>";
echo "Opção de saque: " . $saques[$saque] . "<br>";
echo "Notas sacadas: ". $notas . "<br>";
echo "Resto do valor: " . $valor_saque + $saques[$saque];

?>