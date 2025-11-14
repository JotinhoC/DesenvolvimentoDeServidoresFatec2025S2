<?php
session_start();
require 'usuarios.php';

$erro = '';

if ($_SERVER['REQUEST_METHOD'] === 'POST'){
	$email = $_POST['email'] ?? '';
	
	if ($email == 'jomefbaros@gmail.com') {
		header('Location: senhaConfirm.php');
		exit;
	} else {
		$erro = 'Email invalido!';
	}
}

?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Login com Hash</title>
</head>
<body>
	<h2>Login</h2>
	
	<?php if ($erro): ?>
		<p style="color: red;"><?= $erro ?></p>
	<?php endif; ?>
	<form method="post" action="">
		<label>Email:</label><br>
		<input type="text" name="email" required><br><br>
		
		<button type="submit">Entrar</button>
	</form>
	
</body>
</html>