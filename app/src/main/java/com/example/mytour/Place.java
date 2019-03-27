package com.example.mytour;

public class Place {
    //Name of the place
    private String Name;

    //Address of the place
    private String Address;

    //Phone of the place
    private String Phone;

    //Image resource ID for place
    private int ImageResourceId;



    public Place(String name, String address, String phone, int imageResourceId) {
        Name = name;
        Address = address;
        Phone = phone;
        ImageResourceId = imageResourceId;
    }

    //Get name
    public String getName() {
        return Name;
    }

    //Get address
    public String getAddress() {
        return Address;
    }

    //Get phone
    public String getPhone() {
        return Phone;
    }

    //Get image
    public int getImageResourceId() {
        return ImageResourceId;


    }
}
