package test.chapter18.IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

class SortedDirList {
	private File path;

	public SortedDirList() {
		path = new File(".");
	}

	public SortedDirList(File path) {
		this.path = path;
	}

	public String[] list() {
		String[] list = path.list();
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}

	public String[] list(final String regex) {
		String[] list = path.list(new FilenameFilter() {
			private Pattern pa = Pattern.compile(regex);

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pa.matcher(name).matches();
			}
		});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}
}

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = Quiz2.class.getResource(".").getFile().toString();
		SortedDirList sd = new SortedDirList(new File("./src/test/chapter18/IO"));
		System.out.println(Arrays.asList(sd.list(".*\\.java")));
		System.out.println(Arrays.asList(sd.list(".*")));
//		System.out.println(Quiz2.class.getResource("."));
//		System.out.println(Quiz2.class.getResource(""));
	}
}
