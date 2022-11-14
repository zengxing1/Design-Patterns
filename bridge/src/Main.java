import OperatingSystemVersion.Cjf20200440730OperatingSystemVersion;
import OperatingSystemVersion.Cjf20200440730WindowOS;
import OperatingSystemVersion.Cjf20200440730HarmonyOS;
import VideoFile.Cjf20200440730AVIFileCjf20200440730;
import VideoFile.Cjf20200440730MP4FileCjf20200440730;


public class Main {
    public static void main(String[] args) {
        Cjf20200440730OperatingSystemVersion win=new Cjf20200440730WindowOS();
        Cjf20200440730MP4FileCjf20200440730 mp4=new Cjf20200440730MP4FileCjf20200440730();
        win.setVideoFile(mp4);
        win.play("我和我的祖国");

        Cjf20200440730OperatingSystemVersion Harmong=new Cjf20200440730HarmonyOS();
        Cjf20200440730AVIFileCjf20200440730 aviFile=new Cjf20200440730AVIFileCjf20200440730();
        Harmong.setVideoFile(aviFile);
        Harmong.play("斗罗大陆");

        win.setVideoFile(aviFile);
        win.play("斗破苍穹");

    }
}