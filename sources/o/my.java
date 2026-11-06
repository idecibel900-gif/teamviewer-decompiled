package o;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class my {
    public static final nw4 a = new nw4(Boolean.FALSE);

    public static AudioDeviceInfo a(AudioManager audioManager) {
        List listG1;
        Object next;
        audioManager.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            listG1 = audioManager.getAvailableCommunicationDevices();
            listG1.getClass();
        } else {
            AudioDeviceInfo[] devices = audioManager.getDevices(1);
            devices.getClass();
            listG1 = cx.g1(devices);
        }
        Set setH1 = i >= 31 ? cx.h1(new Integer[]{7, 26}) : lv1.V(7);
        Iterator it = listG1.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (setH1.contains(Integer.valueOf(((AudioDeviceInfo) next).getType()))) {
                return (AudioDeviceInfo) next;
            }
        }
        next = null;
        return (AudioDeviceInfo) next;
    }

    public static void b(AudioManager audioManager) {
        Object next;
        if (Build.VERSION.SDK_INT < 33) {
            audioManager.setSpeakerphoneOn(true);
            return;
        }
        List availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        availableCommunicationDevices.getClass();
        Iterator it = availableCommunicationDevices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioDeviceInfo) next).getType() != 2);
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) next;
        if (audioDeviceInfo != null) {
            audioManager.setCommunicationDevice(audioDeviceInfo);
        }
    }
}
