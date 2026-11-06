package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.EndpointActivationResponseCode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bl4 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[yl4.values().length];
        try {
            iArr[yl4.ManagedDeviceV2.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[ViewModelOnlineState.values().length];
        try {
            iArr2[ViewModelOnlineState.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ViewModelOnlineState.OnlineAway.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ViewModelOnlineState.OnlineBusy.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ViewModelOnlineState.Offline.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[EndpointActivationResponseCode.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[4] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[6] = 7;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
