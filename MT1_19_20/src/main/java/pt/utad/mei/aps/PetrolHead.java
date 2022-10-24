package pt.utad.mei.aps;

import java.util.ArrayList;

public class PetrolHead {
    public static void main(String[] args) {
        var racers = new ArrayList<DragRacer>();

        racers.add(new FlyRacer());
        racers.add(new Slow());
        racers.add(new Slow());
        racers.add(new FlyRacer());

        for (var racer: racers) {
            racer.show();
        }

        var racersClone = racers.stream()
                .map(DragRacer::clone)
                .toList();

        System.out.println("\nAre they equal?");
        for (int i = 0; i < racers.size(); i++) {
            System.out.printf("[%s] Same object? %s\n", i, racers.get(i) == racersClone.get(i));
            System.out.printf("[%s] Equal objects? %s\n", i, racers.get(i).equals(racersClone.get(i)));
        }
    }
}
