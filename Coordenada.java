package edu.ufp.inf.lp2.projecto;

public class Coordenada {

    public float latitude;

    public float longitude;
    
    public Coordenada(float latitude) {
        this.latitude = latitude;
    }
    

    //Construtor 
    public Coordenada(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Gets/Sets
    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    
    //Imprimir Coordenada "x"
    @Override
    public String toString() {
        return "Coordenada{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
    }
}
