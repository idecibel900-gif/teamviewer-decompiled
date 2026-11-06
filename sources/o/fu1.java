package o;

import com.teamviewer.apidefinitions.legacydevices.models.DeviceType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.policies.models.PolicyChangeOperation;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByKnownDeviceMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fu1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[PolicyChangeOperation.values().length];
        try {
            iArr[PolicyChangeOperation.Created.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PolicyChangeOperation.Updated.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PolicyChangeOperation.Deleted.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DeviceType.values().length];
        try {
            iArr2[DeviceType.Desktop.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DeviceType.Mobile.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DeviceType.IoT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeviceType.NAS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[DeviceOnlineStatus.values().length];
        try {
            iArr3[DeviceOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DeviceOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DeviceOnlineStatus.Sleeping.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.values().length];
        try {
            iArr4[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
        int[] iArr5 = new int[ConnectByKnownDeviceMode.values().length];
        try {
            iArr5[ConnectByKnownDeviceMode.RemoteControl.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[ConnectByKnownDeviceMode.RemoteControlWithPrompt.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[ConnectByKnownDeviceMode.FileTransfer.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[ConnectByKnownDeviceMode.RemoteControlWinAuth.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[ConnectByKnownDeviceMode.RemoteTerminal.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[ConnectByKnownDeviceMode.PortForwarding.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[ConnectByKnownDeviceMode.VPN.ordinal()] = 7;
        } catch (NoSuchFieldError unused19) {
        }
        e = iArr5;
    }
}
