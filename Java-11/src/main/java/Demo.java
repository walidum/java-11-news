import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

    }

    public static List<String> newStringMethods() {
        String multilineString = "All Algeria \n \n Java \n Community.";
        return multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
    }

    public static String newFileMethods() {
        String home = System.getProperty("user.home");
        Path filePath = Paths.get(home, "test.txt");
        try {
            Files.writeString(filePath, "Hello World !!");
            return Files.readString(filePath);
        } catch (IOException e) {
            return "";
        }
    }

    public static String[] collectiontoArray() {
        var sampleList = Arrays.asList("Algiers", "Setif");
        return sampleList.toArray(String[]::new);
    }

    public static String httpClient() {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
                .build();
        try {
            HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(httpResponse.body().toString());
            return httpResponse.body().toString();
        } catch (IOException | InterruptedException e) {
            return null;
        }
    }

}
