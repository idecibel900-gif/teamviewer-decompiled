package o;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class aa6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConnectionMode.values().length];
        try {
            iArr[ConnectionMode.RemoteControl.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
