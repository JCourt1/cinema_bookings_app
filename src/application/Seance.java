package application;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import application.LocalDateAdapter;


/*This class is based on the following source:
	 * Title: JavaFX 8 Tutorial - Part 5: Storing Data as XML
	 * Author: Marco Jakob 
	 * Date: 12/03/2015
	 * Availability: http://code.makery.ch/library/javafx-8-tutorial/part5/
	 *
	 ***************************************************************************************/

	/**
	 * Model class for a booking. This will be used in conjunction with the BookingWrapper.java class to read/write data to/from the Bookings.xml files.
	 * 
	 *
	 * @author David Rudolf
	 */
public class Seance {
	
	
	private final ObjectProperty<LocalDate> day;
	private final StringProperty time;
	private final StringProperty film;
	
	
	public Seance() {
        this(null, null, null);
    }
	
	
	public Seance(LocalDate date, String time, String film){
		this.day = new SimpleObjectProperty<LocalDate>(date);
		this.time = new SimpleStringProperty(time);
		this.film = new SimpleStringProperty(film);
	}
	
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public LocalDate getDay(){
		return day.get();
	}
	
	public void setDay(LocalDate day) {
        this.day.set(day);
    }

    public ObjectProperty<LocalDate> dayProperty() {
        return day;
    }
	
	
	
	
	
	
	public String getFilm() {
        return film.get();
    }

    public void setFilm(String film) {
        this.film.set(film);
    }
    
    public StringProperty filmProperty() {
        return film;
    }
    
    
    public String getTime() {
        return time.get();
    }

    public void setTime(String time) {
        this.time.set(time);
    }

    public StringProperty timeProperty() {
        return time;
    }

	
	
	

}