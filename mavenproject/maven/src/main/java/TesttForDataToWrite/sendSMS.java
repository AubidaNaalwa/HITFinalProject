package TesttForDataToWrite;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;



public class sendSMS {

		public void send(String phone,int rand) throws Exception{
			// TODO Auto-generated method stub
			String URL = OpenBrowser.getURL();
			String message = new String("your Code is : "+ rand +" \nEnter the to the URL: \n" + URL );
			
			Httpsend httpsend = new Httpsend();
			String PhoneNumber = new String ("972");
			if(phone.length() == 10 ) { 
				PhoneNumber += phone.substring(1);
			}else {
				PhoneNumber += phone;
			}
			String username = "Aubida";
			String password = "1234";
			String address = "http://10.0.0.9";
			String port = "8090";
			URL url = new URL(
			        address+":"+port+"/SendSMS?username="+username+"&password="+password+
			        "&phone="+PhoneNumber+"&message="+URLEncoder.encode(message,"UTF-8"));

			URLConnection connection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			httpsend.sendinformationtohttp(Integer.toString(rand), "");
			while((inputLine = bufferedReader.readLine()) !=null){
			    System.out.println(inputLine);
			}
			bufferedReader.close();
			}
			
}