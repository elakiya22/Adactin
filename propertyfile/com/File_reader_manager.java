package propertyfile.com;

public class File_reader_manager {
	private File_reader_manager() {
		
	}

	public static   File_reader_manager getinstance_frm() {
		 File_reader_manager frm = new File_reader_manager ();
		 return frm;

	}
	
	public   Configuration_reader getinstance_cr() throws Throwable {
		Configuration_reader cr = new Configuration_reader();
		return cr;
	}
}
