package o;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ba6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[i41.values().length];
        try {
            iArr[14] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[ConnectionMode.values().length];
        try {
            iArr2[ConnectionMode.RemoteSupport.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        b = iArr2;
    }
}
