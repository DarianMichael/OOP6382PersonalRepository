/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritance.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Sheep extends FarmAnimal {

    private Date lastSheering;
    private boolean hair;

    public Sheep(int id, String breed, Date bomOn, Date lastSheering, boolean hair) {
        super(id, breed, bomOn);
        this.lastSheering = lastSheering;
        this.hair = hair;
    }

    public Date getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void lackingTimeToShear() {
        while (!hair) {
            LocalDate today = LocalDate.now();
            LocalDate lastSheeringDate = (LocalDate) getLastSheering().toInstant()
                    .atZone(ZoneId.systemDefault()).toLocalDate();
            long timeAgo = ChronoUnit.DAYS.between(lastSheeringDate, today);
            if (timeAgo >= 365) {
                System.out.println(" The sheep is ready to be sheared\n");
                return;
            }else if(timeAgo < 365){
                int daysUntil = 365 - (int) timeAgo;
                System.out.println(" " + daysUntil + " days until the sheep is sheared\n");
                return;
            }
        }
        System.out.println(" This sheep has no wool\n");
    }

    @Override
    public String toString() {
        return "Sheep{ \n" + super.toString() + " lastSheering: " + lastSheering + "\n hair: " + hair;
    }
}
