package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tr6 {
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
        int[] iArr2 = new int[rr6.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
