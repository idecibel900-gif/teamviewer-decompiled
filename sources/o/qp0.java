package o;

import com.teamviewer.chatviewmodel.swig.ChatEndpointTypeUI;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChatEndpointTypeUI.values().length];
        try {
            iArr[ChatEndpointTypeUI.ComputerEndpoint.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatEndpointTypeUI.SessionCodeEndpoint.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
