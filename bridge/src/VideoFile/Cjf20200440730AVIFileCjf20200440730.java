package VideoFile;

public class Cjf20200440730AVIFileCjf20200440730 implements Cjf20200440730VideoFile {
    @Override
    public void decode(String ostype, String FileName) {
        System.out.println(ostype+"AVI格式 "+FileName);
    }
}
