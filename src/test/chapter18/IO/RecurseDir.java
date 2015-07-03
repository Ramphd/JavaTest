package test.chapter18.IO;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class PPrint{
	public static String pformat(Collection<?> c){
		if(c.size() == 0 ) return "[]";
		StringBuilder result = new StringBuilder("[");
		for(Object elem : c){
			if(c.size() != 1)
				result.append("\n ");
			result.append(elem);
		}
		if(c.size() != 1)
			result.append("\n ");
		result.append("]");
		return result.toString();
	}
	public static void pprint(Collection<?> c){
		System.out.println(pformat(c));
	}
	public static void pprint(Object[] c){
		System.out.println(pformat(Arrays.asList(c)));
	}
}
class Treeinfo implements Iterable<File>{
	public List<File> files = new ArrayList<File>();
	public List<File> dirs = new ArrayList<File>();
	@Override
	public Iterator<File> iterator() {
		// TODO Auto-generated method stub
		return files.iterator();
	}
	void addAll(Treeinfo others){
		files.addAll(others.files);
		dirs.addAll(others.dirs);
	}
	public String toString(){
		return "dirs: " + PPrint.pformat(dirs) + "\n\nfiles:" + PPrint.pformat(files);
	}
	
}
public class RecurseDir {
	static Treeinfo recurseDir(File startDir){
		Treeinfo ti = new Treeinfo();
		for(File item : startDir.listFiles()){
			if(item.isDirectory()){
			ti.dirs.add(item);
			ti.addAll(recurseDir(item));
			}else
				ti.files.add(item);
		}
		return ti;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recurseDir(new File("./src")));
	}

}
