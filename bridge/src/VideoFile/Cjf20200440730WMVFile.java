package VideoFile;

public class Cjf20200440730WMVFile implements Cjf20200440730VideoFile {
    @Override
    public void decode(String ostype, String FileName) {
        System.out.println(ostype+"WMV格式 "+FileName);
    }
}
