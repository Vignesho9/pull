package Helper;

public class File_Reader_Manager {

private File_Reader_Manager(){
}
public static File_Reader_Manager getInstanceFRM(){
File_Reader_Manager frm = new File_Reader_Manager();
return frm;
}
public config_Reader getInstanceCR()throws Throwable{
config_Reader reader = new config_Reader();
return reader;
}
}


