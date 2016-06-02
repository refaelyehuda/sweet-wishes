package com.menachi.class3demo.Model;
import android.util.Log;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by refael yehuda on 6/1/2016.
 */
public class Product {
    String productId;
    String name;
    String price;
    String imageName;
    String createDate;
    String lastUpdate;
    //key = userId , value = {comment,grade}
    JSONObject comments;
    static Integer Ids = 0;
    //iterate over JSONObject
//    Iterator<?> keys = jObject.keys();
//
//    while( keys.hasNext() ) {
//        String key = (String)keys.next();
//        Log.d("Tag", key + " : " + jObject.get(key));
//    }
//    String key = (String)keys.next();
//    if ( jObject.get(key) instanceof JSONObject ) {
//
//    }

    Product(){

    }

    public Product(String name, String price, String imageName){
        //this is a static variable that grow in each call to the constructor
        Ids++;
        this.name = name;
        this.price = price;
        this.imageName = imageName;
        this.productId = productId;
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String currenDate = df.format(today);
        this.createDate = currenDate;
        this.lastUpdate = currenDate;
        this.productId = Ids.toString();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public JSONObject getComments() {
        return comments;
    }

    public void setComments(JSONObject comments) {
        this.comments = comments;
    }

}
