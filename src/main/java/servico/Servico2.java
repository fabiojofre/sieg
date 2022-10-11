package servico;

import java.io.IOException;
import java.net.UnknownHostException;

import org.apache.http.client.HttpResponseException;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;




public class Servico2 {

	
	private JSONObject resultadoConsulta;
	private String codSucesso; 
	    public JSONObject enviaXML(String apikey, String email, String xml){
	    	OkHttpClient client = new OkHttpClient().newBuilder().build();
	    	MediaType mediaType = MediaType.parse("application/json");
	    	 String webService = "https://api.sieg.com/aws/api-xml.ashx"+"?apikey="+apikey+"&email="+email;
			
				try {
				RequestBody body = RequestBody.create(mediaType, xml);
	    	
				Request request = new Request.Builder()
						  .url(webService)
						  .method("POST", body)
						  .addHeader("Content-Type", "application/json")
						  .build();
				
				
					Response response = client.newCall(request).execute();
						
					 codSucesso =  response.message();
					 
					 resultadoConsulta = new JSONObject(response.body().source().readUtf8().toString());
					 
					 return resultadoConsulta;
					 
				}catch (Exception e) {
					 
					System.out.println(e);
					
					return resultadoConsulta;
				}				
	    }
}
