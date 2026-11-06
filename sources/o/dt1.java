package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dt1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[DeviceOnlineStatus.values().length];
        try {
            iArr[DeviceOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeviceOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeviceOnlineStatus.Sleeping.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.values().length];
        try {
            iArr2[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[DeviceType.values().length];
        try {
            iArr3[DeviceType.Desktop.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[DeviceType.Mobile.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[DeviceType.IoT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DeviceType.NAS.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.values().length];
        try {
            iArr4[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.Desktop.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.Mobile.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.IoT.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.NAS.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
    }
}
