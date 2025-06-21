package com.weatherapp.service;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class WeatherService {

    // ✅ Your actual OpenWeatherMap API key
    private final String apiKey = "16505fc2599faf3becfb748f7dbe981c";

    public String getWeather(String city) {
        try {
            // Build URL with metric units for Celsius temperature
            String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                               "&appid=" + apiKey + "&units=metric";

            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            // Check if the connection is successful
            if (responseCode != 200) {
                return "Error: Unable to fetch weather data (HTTP code " + responseCode + ")";
            }

            // Read the API response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder responseContent = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                responseContent.append(line);
            }
            in.close();

            return responseContent.toString();

        } catch (Exception e) {
            return "Exception occurred: " + e.getMessage();
        }
    }
}
