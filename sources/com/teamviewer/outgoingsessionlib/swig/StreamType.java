package com.teamviewer.outgoingsessionlib.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum StreamType {
    StreamType_Unknown(0),
    StreamType_Misc(1),
    StreamType_Screen(2),
    StreamType_Audio(3),
    StreamType_Video(4),
    StreamType_Chat(5),
    StreamType_File(6),
    StreamType_VPN(7),
    StreamType_FileBox(8),
    StreamType_DragDrop(9),
    StreamType_ScreenVideo(10),
    StreamType_RemoteAudio(11),
    StreamType_RemoteAudioControl(12),
    StreamType_Print(13),
    StreamType_RemoteSupport(14),
    StreamType_RS_Misc(15),
    StreamType_RS_Monitoring(16),
    StreamType_RS_Apps(17),
    StreamType_RS_Processes(18),
    StreamType_RS_Configuration(19),
    StreamType_RS_Logs(20),
    StreamType_RS_Screenshot(21),
    StreamType_RS_Chat(22),
    StreamType_RS_Legacy(23),
    StreamType_Clipboard(24),
    StreamType_VoIP_Control(25),
    StreamType_VoIP_Data(26),
    StreamType_Beehive_Misc(27),
    StreamType_Beehive_WebControl(28),
    StreamType_Video_Control(29),
    StreamType_Beehive_RemoteShell(30),
    StreamType_Beehive_PortForwarding_High_Prio(31),
    StreamType_Beehive_PortForwarding_Normal_Prio(32),
    StreamType_Beehive_PortForwarding_Min_Prio(33),
    StreamType_Beehive_PortForwarding_Lossy(34),
    StreamType_PortForwardingData(35),
    StreamType_Last(36);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    StreamType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static StreamType swigToEnum(int i) {
        StreamType[] streamTypeArr = (StreamType[]) StreamType.class.getEnumConstants();
        if (i < streamTypeArr.length && i >= 0) {
            StreamType streamType = streamTypeArr[i];
            if (streamType.swigValue == i) {
                return streamType;
            }
        }
        for (StreamType streamType2 : streamTypeArr) {
            if (streamType2.swigValue == i) {
                return streamType2;
            }
        }
        hk0.g(ua5.k(i, StreamType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    StreamType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    StreamType(StreamType streamType) {
        int i = streamType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
