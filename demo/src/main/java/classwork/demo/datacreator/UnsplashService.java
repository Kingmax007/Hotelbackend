package classwork.demo.datacreator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;

public class UnsplashService {
    private static final String UNSPLASH_API_URL = "https://api.unsplash.com/photos/random?query=hotel+room&count=5&client_id=YOUR_ACCESS_KEY";

    public static List<String> getRandomHotelRoomPictures() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(UNSPLASH_API_URL, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<UnsplashPhoto> photos = null;
        try {
            photos = objectMapper.readValue(response, new TypeReference<List<UnsplashPhoto>>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return photos.stream()
                .map(UnsplashPhoto::getUrls)
                .map(UnsplashPhoto.Urls::getRegular)
                .collect(Collectors.toList());
    }

    public static class UnsplashPhoto {
        private Urls urls;

        public Urls getUrls() {
            return urls;
        }

        public void setUrls(Urls urls) {
            this.urls = urls;
        }

        public static class Urls {
            private String regular;

            public String getRegular() {
                return regular;
            }

            public void setRegular(String regular) {
                this.regular = regular;
            }
        }
    }
}
