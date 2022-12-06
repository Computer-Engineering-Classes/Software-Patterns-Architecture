package pt.utad.mei.aps;

import java.util.Comparator;
import java.util.List;

public class AmountInvestedStrategy implements ClientStrategy {
    @Override
    public void sort(List<Client> clients) {
        clients.sort(Comparator.comparingDouble(Client::getAmountInvested).reversed());
    }
}
