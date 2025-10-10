<?php
$pares = [];
$soma = 0;
$i = 0;
while ($i <= 50){
	if ($i % 2 == 0){
		$soma = $soma + $i;
		array_push($pares,$i);
	}
	$i++;
}

echo "Lista de Pares: <br>";
foreach($pares as $num){
	echo $num . "<br>";
}
echo "<br> Soma Total: ". $soma;

?>