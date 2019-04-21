package com.demotxt.LEMONDEDESANIMAUX;

/**
 * Created by Aws on 28/01/2018.
 */

public class Animal {

    private String Titre;
    private String Cat ;
    private String Description ;
    private int image ;

    public Animal() {
    }

    public Animal(String t, String c, String d, int i) {
        Titre = t;
        Cat = c;
        Description = d;
        image = i;
    }


    public String getTitre() {
        return Titre;
    }

    public String getCat() {
        return Cat;
    }

    public String getDescription() {
        return Description;
    }

    public int getImage() {
        return image;
    }


    public void setTitre(String t) {
        Titre = t;
    }

    public void setCat(String c) {
        Cat = c;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setImage(int i) {
        image = i;
    }
}
