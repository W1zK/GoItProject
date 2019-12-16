package HTTP;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://pingponggoit.herokuapp.com/");
//        URLConnection urlConnection = url.openConnection();
//        urlConnection.connect();
//        InputStream inputStream = urlConnection.getInputStream();
//
//        BufferedReader bufferedStream = new BufferedReader(new InputStreamReader(inputStream));
//        StringBuffer buffer = new StringBuffer();
//        String response;
//        while ((response= bufferedStream.readLine()) !=null){
//            buffer.append(response);
//        }
//        System.out.println(buffer);

        //OkHttpClient();
        //postRequest();
        getWithQuery();


    }

    private static void OkHttpClient() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://pingponggoit.herokuapp.com/")
                .get()
                .build();
        Response response = client.newCall(request).execute();
        String header = response.headers().toString();
        String body = new String(response.body().bytes());
        System.out.println("Header: " + header);
        System.out.println("Body:  " + body);
    }

    private static void postRequest() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(new Request.Builder()
                .url("https://pingponggoit.herokuapp.com/sendMessage")
                .post(RequestBody.create(MediaType.parse("application/json"), "new message"))
                .build()).execute();
        System.out.println(new String(response.body().bytes()));
    }

    private static void getWithQuery() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(new Request.Builder()
                .get()
                .url("https://pingponggoit.herokuapp.com/getUser?name=Alexandr&surname=Yanov&salary=123123123&gender=male").build()).execute();
        ObjectMapper mapper = new ObjectMapper();
        String s = new String(response.body().bytes());
        User user = null;
        user = mapper.readValue(s,User.class);
        System.out.println(user);


    }




}
