<?php
$alunos = [
	["Mario Cortela", 8, 6, 4, 5],
	["Antonio Almeida", 7, 7, 9, 8],
	["Maria Antonia", 8, 5, 8, 7],
	["Marcia Lucia", 2, 4, 5, 5],
];

$alunos_media = [];

foreach($alunos as $y => $linha){
	$media = 0;
	$aprovado = "Aprovado";
	foreach($linha as $x => $valor){
		if ($x == 0){
			$media = ($linha[1] + $linha[2] + $linha[3] + $linha[4]) / 4;
			
			if ($media <= 6){
				$aprovado = "Reprovado"; 
			}
			
			$array = [$linha[0], $media, $aprovado];
			array_push($alunos_media,$array);

		}
	}
}
foreach($alunos_media as $y => $linha){

		echo "Aluno: ". $linha[0] . " | Media Final: | ". $linha[1] . " ==== " . $linha[2] . "<br>";

}
?>