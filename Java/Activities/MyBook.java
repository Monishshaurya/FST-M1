
public class MyBook extends Activity5

{

	public static void main(String[] args) {

		MyBook book=new MyBook();
		book.setTitle("Java Full stack");
		String TitleofBook=book.getTitle();
		System.out.println("Title of the Book is...."+TitleofBook);
	}

	@Override
	public void setTitle(String str) {
		Title=str;
	}

}
