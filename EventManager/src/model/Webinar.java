package model;

public class Webinar extends Event {
    private String presenter;
    private String platform;

    public Webinar(String name, String date, String location, String presenter, String platform) {
        super(name, date, location);
        this.presenter = presenter;
        this.platform = platform;
    }

    public String getPresenter() {
        return presenter;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public void scheduleEvent() {
        super.scheduleEvent();
        System.out.println("Webinar presenter: " + presenter + " on platform: " + platform);
    }
}
