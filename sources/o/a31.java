package o;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConnectionMode.values().length];
        try {
            iArr[ConnectionMode.RemoteSupport.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConnectionMode.RemoteControl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
