package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        RssFeed feed = new RssFeed("MEI", "Mestrado em Engenharia Informática",
                "https://side.utad.pt/rss.pl?MEI", "2022-09-01");
        RssFeed feed2 = new RssFeed("MEEC", "Mestrado em Engenharia Eletrotécnica e de Computadores",
                "https://side.utad.pt/rss.pl?MEEC", "2022-09-01");

        RssFeedReader reader = new RssFeedReader("al70633", feed, feed2);
        System.out.println("Reader: " + reader);
        RssFeedReader reader2 = new RssFeedReader("al70579", feed);
        System.out.println("Reader2: " + reader2);

        feed.addItem(new RssItem("Deep Learning Aplicado", "Submissão do projeto",
                "https://side.utad.pt/rss.pl?MEI/DLAP", "2023-01-09"));
        feed.addItem(new RssItem("Desenvolvimento de Aplicações Web", "Inscrições abertas",
                "https://side.utad.pt/rss.pl?MEI/DAW", "2023-01-09"));
        feed2.addItem(new RssItem("Sistemas de Controlo", "Programação da aula",
                "https://side.utad.pt/rss.pl?MEEC/SC", "2023-01-09"));

        reader.removeFeed(feed2);
        System.out.println("Reader: " + reader);

        feed.details();
        feed2.details();
    }
}