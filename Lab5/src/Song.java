
public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {}
	public Song(int year,String country,String artist, String title) {
		this.year=year;
		this.country=country;
		this.artist=artist;
		this.title=title;
	}
	public void show() {  
		System.out.println(this.year+"�� "+this.country+"������ "+this.artist+"�� �θ� "+this.title);
		
	}
	
	public static void main(String[] args) {
		Song mySong= new Song(1978,"������","ABBA","Dancing Queen");
		mySong.show();
	}

}
