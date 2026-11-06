package o;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lb5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConnectionMode.values().length];
        try {
            iArr[ConnectionMode.RemoteControl.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConnectionMode.Filetransfer.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConnectionMode.RemoteSupport.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
