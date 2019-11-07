/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan57.vehicle;

/**
 *
 * @author ASUS
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setMyBoardLength(54.5);
        
        System.out.println("SkateBoard");
        System.out.println("Brand: " + getMyBrand());
        System.out.println("Model: " + getMyModel());
        System.out.println("Jumlah Gear: " + getMyBoardLength());
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
    
}
