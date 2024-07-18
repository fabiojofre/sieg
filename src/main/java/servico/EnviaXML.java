package servico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexao.ConexaoServidor;
public class EnviaXML {
	
	private String NOTASAIDA = "SELECT id, id_situacaonfe,id_notasaida, xml FROM notasaidanfe WHERE id_situacaonfe = 1 AND (cofre = 0 OR cofre is null) ORDER BY 1 desc LIMIT 10";
	private String UPDATE_NOTASAIDA = "update notasaidanfe set cofre = 1 where id = ?";
	
	private String NOTAENTRADA = "SELECT id, id_situacaonfe,numeronota, xml FROM notaentradanfe WHERE id_situacaonfe = 1 AND (cofre = 0 OR cofre is null) ORDER BY 1 desc LIMIT 10";
	private String UPDATE_NOTAENTRADA = "update notaentradanfe set cofre = 1 where id = ?";
	
	private String NFCE ="SELECT id, id_situacaonfce,id_venda, xml FROM pdv.vendanfce WHERE id_situacaonfce = 1 AND (cofre = 0 OR cofre is null) ORDER BY 1 desc LIMIT 10";
	private String UPDATE_NFCE = "update pdv.vendanfce set cofre = 1 where id = ?";
		
	ConexaoServidor con = new ConexaoServidor();
	
		PreparedStatement stmt = null;
		
		public static String mensagemSaida="";
	
				
	public void enviaNotaSaida() {
		try {
			con.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			Service service = new Service();
			
			
			stmt = con.prepareStatement(NOTASAIDA);
			PreparedStatement stmt_up = con.prepareStatement(UPDATE_NOTASAIDA);
			ResultSet rs = stmt.executeQuery();
			int cont = 0;
			while(rs.next()){
			
				String mensagem = service.enviaXML(rs.getString("xml"));	
			
				
//				
//			String mensagem = Util.retornaResultadoConsulta(msg);
			
			System.out.println(mensagem);
			if(mensagem.contains("Importado")) {
				System.out.println("Nota: "+rs.getInt("id_notasaida")+" "+mensagem);
				
				stmt_up.setInt(1, rs.getInt("id"));
				int rowsInserted = stmt_up.executeUpdate(); 
				 if (rowsInserted > 0) {
				     System.out.println("Update executado!");
				 }else {
					 System.out.println("Update Falhou!");
				 }
				 cont ++;
			}else if(mensagem.equals("")) {
				System.out.println("Retorno: Falha no retono do cliente com a SIEG \nVerifique se o email e(ou) chave etao corretos");
				System.out.println(mensagem);
			}else {
				System.out.println("Retorno: "+mensagem);
			}
				
			}
			if(cont >0) {
			mensagemSaida = cont+" Notas de saida importadas!";
			System.out.println(mensagemSaida);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Falha temporária na conexão...\n");
			System.out.print("Tentando reconectar");
			
			for (int c = 10; c >= 0; c--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.print(".");
			}

		}
	}
		
	public void enviaCupom() {
			try {
				con.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
				Service service = new Service();
				
				
				
				stmt = con.prepareStatement(NFCE);
				PreparedStatement stmt_up = con.prepareStatement(UPDATE_NFCE);
				ResultSet rs = stmt.executeQuery();
				int cont = 0;
				while(rs.next()){
				
					String mensagem = service.enviaXML(rs.getString("xml"));
				
//				String mensagem = Util.retornaResultadoConsulta(msg);
				if(mensagem.contains("Importado")) {
					System.out.println("Cupom: "+rs.getInt("id_venda")+" "+mensagem);
					
					stmt_up.setInt(1, rs.getInt("id"));
					int rowsInserted = stmt_up.executeUpdate(); 
					 if (rowsInserted > 0) {
					     System.out.println("Update executado!");
					 }else {
						 System.out.println("Update Falhou!");
					 }
					 cont ++;
				}else if(mensagem.equals("")) {
					System.out.println("Retorno: Falha no retono do cliente com a SIEG \nVerifique se o email e(ou) chave etao corretos");
					System.out.println(mensagem);
				}else {
					System.out.println("Retorno: "+mensagem);
				}
					
				}
				if(cont >0) {
				mensagemSaida = cont+" Cupons Fiscais importados!";
				System.out.println(mensagemSaida);
				}
				
				
			} catch (Exception e)  {
				// TODO Auto-generated catch block
				System.out.println("Falha temporária na conexão...\n");
				System.out.print("Tentando reconectar");
				
				for (int c = 10; c >= 0; c--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.print(".");
				}

			}
		
	}
	
	public void enviaNotaEntrada() {
		try {
			con.abrirConexao(Config.host, Config.porta, Config.base, Config.usuario, Config.senha);
			Service service = new Service();
			
			
			stmt = con.prepareStatement(NOTAENTRADA);
			PreparedStatement stmt_up = con.prepareStatement(UPDATE_NOTAENTRADA);
			ResultSet rs = stmt.executeQuery();
			int cont = 0;
			while(rs.next()){
			
				String mensagem = service.enviaXML(rs.getString("xml"));
			
//			String mensagem = Util.retornaResultadoConsulta(msg);
			if(mensagem.contains("Importado")) {
				System.out.println("Nota de Entrada: "+rs.getInt("numeronota")+" "+mensagem);
				
				stmt_up.setInt(1, rs.getInt("id"));
				int rowsInserted = stmt_up.executeUpdate(); 
				 if (rowsInserted > 0) {
				     System.out.println("Update executado!");
				 }else {
					 System.out.println("Update Falhou!");
				 }
				 cont ++;
			}else if(mensagem.equals("")) {
				System.out.println("Retorno: Falha no retono do cliente com a SIEG \nVerifique se o email e(ou) chave etao corretos");
				System.out.println(mensagem);
			}else {
				System.out.println("Retorno: "+mensagem);
			}
				
			}
			if(cont >0) {
			mensagemSaida = cont+" Notas de entrada importadas!";
			System.out.println(mensagemSaida);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Falha temporária na conexão...\n");
			System.out.print("Tentando reconectar");
			
			for (int c = 10; c >= 0; c--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.print(".");
			}

		}
	}
	
	

}
