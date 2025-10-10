<?php
$salarios = [1800,1900,2200,2500,1500,3000];
$salarios_aumento = [];

foreach($salarios as $salario){
	$aumento = 0;
	if ($salario < 2000){
		$aumento += $salario * 0.10;
		echo "Salario: ". $salario;
		$salario += $aumento;
		echo " === Aumento: ". $aumento . " === Total: ". $salario . "<br>";
	}else{
		echo "Salario: ". $salario . "<br>";
	}
}
?>