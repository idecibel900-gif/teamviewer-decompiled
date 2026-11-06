package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gt6 {
    public static final /* synthetic */ int[] a;

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
    }
}
