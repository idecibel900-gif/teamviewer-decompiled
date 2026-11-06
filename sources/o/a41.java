package o;

import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a41 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[ContactOnlineStatus.values().length];
        try {
            iArr[ContactOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContactOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContactOnlineStatus.Busy.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ContactOnlineStatus.Away.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ContactOnlineStatus.Standby.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[DeviceOnlineStatus.values().length];
        try {
            iArr2[DeviceOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeviceOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeviceOnlineStatus.Sleeping.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.values().length];
        try {
            iArr3[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[DeviceType.values().length];
        try {
            iArr4[DeviceType.Desktop.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[DeviceType.Mobile.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[DeviceType.IoT.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[DeviceType.NAS.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.values().length];
        try {
            iArr5[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.Desktop.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.Mobile.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.IoT.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[com.teamviewer.apidefinitions.legacydevices.models.DeviceType.NAS.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        e = iArr5;
        int[] iArr6 = new int[com.teamviewer.apidefinitions.recentconnections.models.ContactOnlineStatus.values().length];
        try {
            iArr6[com.teamviewer.apidefinitions.recentconnections.models.ContactOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[com.teamviewer.apidefinitions.recentconnections.models.ContactOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[com.teamviewer.apidefinitions.recentconnections.models.ContactOnlineStatus.Away.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[com.teamviewer.apidefinitions.recentconnections.models.ContactOnlineStatus.Busy.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[com.teamviewer.apidefinitions.recentconnections.models.ContactOnlineStatus.Standby.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        f = iArr6;
    }
}
