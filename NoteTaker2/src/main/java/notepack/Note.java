package notepack;

import java.util.Date;
import java.util.Random;

import javax.persistence.*;



@Entity
@Table(name="notes")
public class Note {
	
	@Id
	private int id;
	private String title;
	private String content;
	
	@Column(name="dateTime")
	private Date AaddedDate;
	
	public Note() {
		
	}

	public Note(String title, String content, Date aaddedDate) {
		super();
		this.id = new Random().nextInt(10000) ;
		this.title = title;
		this.content = content;
		AaddedDate = aaddedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAaddedDate() {
		return AaddedDate;
	}

	public void setAaddedDate(Date aaddedDate) {
		AaddedDate = aaddedDate;
	}

	
	
	
	
}
