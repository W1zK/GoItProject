package Practika;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    static ObjectMapper mapper = new ObjectMapper();
    static User user = new User("PASA", 0, "PAVLOV", "21231", "male");
    static OkHttpClient client = new OkHttpClient();
    static String URL = "https://pingponggoit.herokuapp.com/";

    public static void main(String[] args) throws IOException {

        postCreatUser();
        //getUserById();
        creatUserList();


    }

    private static void postCreatUser() {
        String jsonStr = null;
        try {
            jsonStr = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Response response = null;
        try {
            response = client.newCall(new Request.Builder()
                    .url(URL + "/createUser")
                    .post(RequestBody.create(MediaType.parse("application/json"), jsonStr))
                    .build()).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(new String(Objects.requireNonNull(Objects.requireNonNull(response).body()).bytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void getUserById() {

        Response response = null;
        try {
            response = client.newCall(new Request.Builder()
                    .get()
                    .url(URL + "/getUserById?id=398")
                    .build()).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String id = null;
        try {
            id = new String(Objects.requireNonNull(Objects.requireNonNull(response).body()).bytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(id);

        response.body().close();


    }

    private static void creatUserList() throws IOException {
        Response response = client.newCall(new Request.Builder()
                .get()
                .url(URL+"/getUsers")
                .build())
                .execute();

        String massUsers = new String(response.body().bytes());
        System.out.println(massUsers);

        ArrayList<User> users = new ArrayList<>();
        List<User> usr = mapper.readValue(massUsers,new TypeReference<List<User>>(){});

        for (int i = 0; i <usr.size() ; i++) {
            System.out.println(usr.get(i));

        }




    }
}
