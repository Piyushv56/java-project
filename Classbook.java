/**
 * 
 */
package collection;
public class Classbook {
private int bid;
private String author;
private String subject;
public Classbook() {
	super();
	// TODO Auto-generated constructor stub
}
public Classbook(int bid, String author, String subject) {
	super();
	this.bid = bid;
	this.author = author;
	this.subject = subject;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "Classbook [bid=" + bid + ", author=" + author + ", subject=" + subject + "]";
}

}
