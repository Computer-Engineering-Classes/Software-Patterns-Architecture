package pt.utad.mei.aps;

import java.util.Comparator;
import java.util.List;

public class AmountAvailableStrategy implements ClientStrategy {
    @Override
    public void sort(List<Client> clients) {
        // Sort by getAmountAvailable in descending order
        clients.sort(Comparator.comparingDouble(Client::getAmountAvailable).reversed());
    }
}
