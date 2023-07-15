package cofrinho.classes;


// para tratar exceptions
import java.io.IOException;

// fazer requisições http
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// ler, manipular o json
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Price {
    private float USDBRL;
    private float EURBRL;
    private float BTCBRL;
    private JsonObject jsonObject;

    public Price (){
        getPrice(); // sempre que o objeto for estanciado os atributos receberão estados mais atual
    }
    public void getPrice() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://economia.awesomeapi.com.br/json/last/USD-BRL,EUR-BRL,BTC-BRL"))
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody;
            responseBody = response.body(); 

            // criando um objeto Gson para guardar o responseBody
            Gson gson = new Gson();
            this.jsonObject = gson.fromJson(responseBody, JsonObject.class);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao consumir a API: " + e.getMessage());
        }
    }
    public void setUSDBRL(){
        getPrice(); // atualizar as cotações das moedas
        if (jsonObject.has("USDBRL")) {
            JsonElement usdElement = jsonObject.get("USDBRL");
            JsonObject usdObject = usdElement.getAsJsonObject();
            if (usdObject.has("bid")) {
                this.USDBRL = usdObject.get("bid").getAsFloat();
            }
        }
    }
    public void setEURBRL(){
        getPrice(); // atualizar as cotações das moedas
        if (jsonObject.has("EURBRL")) {
            JsonElement eurElement = jsonObject.get("EURBRL");
            JsonObject eurObject = eurElement.getAsJsonObject();
            if (eurObject.has("bid")) {
                this.EURBRL = eurObject.get("bid").getAsFloat();
            }
        }
        
    }
    public void setBTCBRL(){
        getPrice(); // atualizar as cotações das moedas
        if (jsonObject.has("BTCBRL")) {
            JsonElement btcElement = jsonObject.get("BTCBRL");
            JsonObject btcObject = btcElement.getAsJsonObject();
            if (btcObject.has("bid")) {
                this.BTCBRL = btcObject.get("bid").getAsFloat();
            }
        }
    }
    public float getUSDBRL() {
        setUSDBRL(); // atualizar as cotações da moeda USD em relação ao BRL
        return this.USDBRL;
    }
    public float getEURBRL() {
        setEURBRL(); // atualizar as cotações da moeda EUR em relação ao BRL
        return this.EURBRL;
    }
    public float getBTCBRL() {
        setBTCBRL(); // atualizar as cotações da moeda BTC em relação ao BRL
        return this.BTCBRL;
    }
}
