<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'vendor/autoload.php'; // Autoload do Composer


	$email_destino = 'jomefbaros@gmail.com';
	$assunto = 'Reset de senha';
	$mensagem = 'Nova senha temporaria é Fatec2025SI';
	
	$mail = new PHPMAiler(true);
	
	try {
		//Configurações do servidor
		$mail->isSMTP();
		$mail->Host = 'smtp.gmail.com';
		$mail->SMTPAuth = true;
		$mail->Username = 'jomefbaros@gmail.com';
		$mail->Password = 'bxbg hwyu exvm enxc';
		$mail->SMTPSecure = PHPMailer::ENCRYPTION_SMTPS;
		$mail->Port = 465;
		
		//Remetente e destinatario
		$mail->setFrom('jomefbaros@gmail.com', 'Aula de PHP');
		$mail->addAddress($email_destino);
		
		//Conteudo
		$mail->isHTML(true);
		$mail->Subject = $assunto;
		//A função nl2br() no PHP é usada para converter quebras de linha (\n)
		//em <br> no HTML.
		$mail->Body = nl2br($mensagem);
		
		//A função strip_tags() no PHP é usada para remover todas as tags HTML
		//e PHP de uma string
		$mail->AltBody = strip_tags($mensagem);
		
		$mail->send();
		echo 'Mensagem enviada com sucesso!';
	} catch (Exception $e) {
		echo "Erro ao enviar: {$mail->ErrorInfo}";
	}

?>