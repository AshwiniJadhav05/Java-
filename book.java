class book 
{
	String author;
	String title;

book(String author, String title){
this.author=author;
this.title=title;

}
void display(){
	System.out.println("title name : " + title );
	System.out.println("author name : " + author);
}
public static void main(String[] args){
	book b=new book("two states", "Chetan");
	b.display();
}
}
