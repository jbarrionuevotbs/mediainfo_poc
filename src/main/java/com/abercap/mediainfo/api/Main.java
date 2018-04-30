package com.abercap.mediainfo.api;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start mediainfo test");
        MediaInfo info = new MediaInfo();
        File f = new File("C:\\Users\\jbarrionuevo\\Videos\\_B3AT3-A_01.mov");
        info.open(f);
        String inform = info.inform();

        int i = 0;
        String format = info.get(MediaInfo.StreamKind.Video, i, "Format",
                MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);

        String audioChannels = info.get(MediaInfo.StreamKind.Audio, i, "Channels",
                MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);

        String bitRate = info.get(MediaInfo.StreamKind.Video, i, "BitRate",
                MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        String frameRate = info.get(MediaInfo.StreamKind.Video, i, "FrameRate",
                MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name);
        System.out.println("#Inform: " + inform);
        System.out.println("#Format: " + format);
        System.out.println("#AudioChannels: " + audioChannels);
        System.out.println("#bitRate: " + bitRate);
        System.out.println("#frameRate: " + frameRate);
    }

}
