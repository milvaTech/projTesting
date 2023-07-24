package com.sta.projTest02.model;
//https://www.boredapi.com/api/activity
public class Activity {
    private String activity;
    private String type;
    private int participants;
    private String price;
    private String link;
    private String key;
    private String accessibility;

    public Activity() {
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activity='" + activity + '\'' +
                ", type='" + type + '\'' +
                ", participants=" + participants +
                ", price='" + price + '\'' +
                ", link='" + link + '\'' +
                ", key='" + key + '\'' +
                ", accessibility='" + accessibility + '\'' +
                '}';
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }
}
