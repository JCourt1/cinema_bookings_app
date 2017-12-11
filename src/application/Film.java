package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Film {

    private final StringProperty name;
    private final StringProperty path;
    private final StringProperty description;
    private final IntegerProperty ticketPrice;
    private final StringProperty trailerPath;
    
    
    
    public Film() {
        this(null, null, null, 0, null);
    }
    

    public Film(String name, String path, String description, Integer ticketPrice, String trailerPath) {
        this.name = new SimpleStringProperty(name);
        this.path = new SimpleStringProperty(path);
        this.description = new SimpleStringProperty(description);
        this.ticketPrice = new SimpleIntegerProperty(ticketPrice);
        this.trailerPath = new SimpleStringProperty(trailerPath);
    }

    public String getName() {
        return name.get();
    }
    
    public void setName(String name) {
        this.name.set(name);
    }
    
    public StringProperty nameProperty() {
        return name;
    }
    
    
    
    
    
    public String getPath() {
        return path.get();
    }

    public void setPath(String path) {
        this.path.set(path);
    }
    
    public StringProperty pathProperty() {
        return path;
    }


    
	public String getDescription() {
		return description.get();
	}
	public void setDescription(String description) {
		this.description.set(description);;
	}
	public StringProperty descriptionProperty() {
		return description;
	}
	
	
	public Integer getTicketPrice() {
		return ticketPrice.get();
	}
	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice.set(ticketPrice);;
	}
	public IntegerProperty ticketPriceProperty() {
		return ticketPrice;
	}
	
    
    public String gettrailerPath() {
        return trailerPath.get();
    }

    public void settrailerPath(String trailerPath) {
        this.trailerPath.set(trailerPath);
    }
    
    public StringProperty trailerPathProperty() {
        return trailerPath;
    }

    
    
    
    
    
    
    
    

}