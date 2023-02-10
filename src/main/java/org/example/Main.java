package org.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception
    {
        String url ="https://api.weatherbit.io/v2.0/subscription/usage?key=c49afd2f49bb4bf7bf0670f66bb41373";
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient httpClient=HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse =httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}