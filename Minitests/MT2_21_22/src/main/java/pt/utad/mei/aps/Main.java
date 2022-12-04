package pt.utad.mei.aps;

public class Main {
    private static void problem1() {
        SendData sendData = new SendData();
        SendDataAdapter sendDataAdapter = new SendDataAdapter(sendData);
        System.out.println("Sending temperature data...");
        float temperature = 20.0f;
        System.out.println("Temperature in Celsius: " + temperature + "°C");
        sendDataAdapter.send(temperature);
    }

    private static void problem2() {
        RssFeed feed = new RssFeed("MEI", "Mestrado em Engenharia Informática",
                "https://mei.utad.pt", "2022-09-01");
        RssFeedReader reader = new RssFeedReader(feed);
        reader.read();

        RssItem item = new RssItem("Apresentação da Unidade Curricular",
                "Na aula de hoje vamos apresentar a unidade curricular.",
                "https://mei.utad.pt/uc/aps",
                "2022-10-01");
        feed.addItem(item);
        reader.read();
    }

    public static void main(String[] args) {
        problem1();
        System.out.println();
        problem2();
    }
}