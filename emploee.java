package q1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class emploee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String title;

    public emploee()
    {

    }

    public emploee(long id, String title)
    {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + title + "]";
	}

}
