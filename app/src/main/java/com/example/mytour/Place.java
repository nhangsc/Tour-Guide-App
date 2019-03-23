package com.example.mytour;

public class Place {
    //Name of the place
    private String mName;

    //Address of the place
    private String mAddress;

    //Phone of the place
    private String mPhone;

    //Image resource ID for place
    private int mImageResourceId;



    public Place(String name, String address, String phone, int imageResourceId) {
        mName = name;
        mAddress = address;
        mPhone = phone;
        mImageResourceId = imageResourceId;
    }

    //Get name
    public String getmName() {
        return mName;
    }

    //Get address
    public String getmAddress() {
        return mAddress;
    }

    //Get phone
    public String getmPhone() {
        return mPhone;
    }

    //Get image
    public int getImageResourceId() {
        return mImageResourceId;


    }
}
