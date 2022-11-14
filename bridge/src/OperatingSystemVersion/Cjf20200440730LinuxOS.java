package OperatingSystemVersion;

public class Cjf20200440730LinuxOS extends Cjf20200440730OperatingSystemVersion {

    @Override
    public void play(String fileName) {
        String ostype="Linux操作系统播放 ";
        this.cjf20200440730VideoFile.decode(ostype,fileName);
    }

}
