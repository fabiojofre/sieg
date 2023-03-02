package servico;

import javax.swing.JOptionPane;

import vrrecifeframework.classes.VrProperties;

public class ServicoConfig {

	private void lerProperties() {
		VrProperties vp = new VrProperties();
		Config.host = vp.getString("database.ip");
		Config.base = vp.getString("database.nome");
		Config.porta = vp.getInt("database.porta");
		Config.usuario = vp.getString("database.usuario");
		Config.senha = vp.getString("database.senha");
		
		Config.siegEmail = vp.getString("sieg.email");
		Config.siegApikey = vp.getString("sieg.apikey");

		String dadosProp ="";
		int cont = 0;
		if(Config.siegEmail == null) {
			dadosProp = dadosProp+"\n sieg.email";
			cont=cont+1;
		}
		if(Config.siegApikey == null) {
			dadosProp = dadosProp+"\n sieg.apikey ";
			cont=cont+1;
		}
		
		if(cont >0) {
			JOptionPane.showMessageDialog(null, "Verifique se os dados abaixo estão inseridos corretamnte no vr.properties.\n"+dadosProp+"","Erro de configuração!",JOptionPane.ERROR_MESSAGE);
		}
	}

	public void trataConfig() {
		lerProperties();
		

		System.out.println("\nOs dados carregados sao: ");
		System.out.println("\n**** Dados da conexao: **** ");
		System.out.println("Servidor: " + Config.host);
		System.out.println("Banco: " + Config.base);
		System.out.println("Porta: " + Config.porta);
		System.out.println("Usuario: " + Config.usuario);
		System.out.println("Senha: " + Config.senha);
		
		System.out.println("Email: "+Config.siegEmail);
		System.out.println("ApiKeyS: "+Config.siegApikey);

		
	}
}
