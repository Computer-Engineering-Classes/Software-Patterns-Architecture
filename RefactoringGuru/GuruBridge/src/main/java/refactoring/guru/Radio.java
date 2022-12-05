package refactoring.guru;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else this.volume = Math.max(percent, 0);
        System.out.println("Radio volume set to " + this.volume + "%");
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio channel set to " + this.channel);
    }

    @Override
    public void printStatus() {
        System.out.println("Radio is " + (on ? "enabled" : "disabled"));
        System.out.println("Radio volume is at " + volume + "%");
        System.out.println("Radio channel is " + channel);
    }
}
