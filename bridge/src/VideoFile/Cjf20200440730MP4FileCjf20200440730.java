package VideoFile;

public class Cjf20200440730MP4FileCjf20200440730 implements Cjf20200440730VideoFile {
    @Override
    public void decode(String ostype, String FileName) {
        System.out.println(ostype+"MP4格式 "+FileName);
    }
}
