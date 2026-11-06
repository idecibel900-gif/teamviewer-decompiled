package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xq6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SupportSessionRecipientStatus.values().length];
        try {
            iArr[SupportSessionRecipientStatus.Ready.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportSessionRecipientStatus.NotReady.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SupportSessionType.values().length];
        try {
            iArr2[SupportSessionType.RemoteControl.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
    }
}
