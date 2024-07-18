package servico;

import java.io.IOException;

import org.json.JSONObject;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Service2 {
//	static String webService = "http://metaassessoria2.ddns.net:23145";

	public JSONObject enviaXML(String xml) {
		JSONObject retorno = null;
//		String webService = "https://api.sieg.com/aws/api-xml.ashx" + "?apikey=" + Config.siegApikey + "&email="
//				+ Config.siegEmail;

		String webService = "https://api.sieg.com/aws/api-xml.ashx?apikey=YEzLyNsCX8SUjSBEWj2BwA%3d%3d&email=ti@bomfimnet.com";
		OkHttpClient client = new OkHttpClient().newBuilder().build();

		MediaType mediaType = MediaType.parse("application/xml");

		RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
				.addPart(RequestBody.create(mediaType, xml))
				.build();
		Request request = new Request.Builder()
				.url(webService)
				.method("POST", body)
				.addHeader("Content-Type", "application/x-www-form-urlencoded")
				.build();
				
				Call call = client.newCall(request);
				try {
				Response response = call.execute();
		 
				if(response.isSuccessful()) {
					retorno = new JSONObject(response.body().source().readUtf8().toString());
					
				}
				response.body().close();  //fecha a conexao
				client.connectionPool().evictAll(); //limpa a piscina de conexao
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		System.out.println(webService2+"\n"+webService);
		return retorno;
	}
}
