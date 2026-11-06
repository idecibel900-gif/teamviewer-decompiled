package o;

import com.teamviewer.outgoingsessionlib.swig.ICommonParticipantManager;
import com.teamviewer.outgoingsessionlib.swig.ParticipantManagerFactoryAndroid;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pg5 {
    public final ICommonParticipantManager a;
    public final int b;
    public a2 c;
    public final og5 d;

    public pg5(a2 a2Var) {
        long jToLong;
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object next;
        String hostAddress;
        du6 du6Var = a2Var.u;
        int i7 = du6Var.c;
        this.b = i7;
        this.c = a2Var;
        this.d = new og5(this);
        ICommonParticipantManager iCommonParticipantManagerCreate = ParticipantManagerFactoryAndroid.Create(i7, du6Var.a.swigValue(), du6Var.n);
        iCommonParticipantManagerCreate.getClass();
        this.a = iCommonParticipantManagerCreate;
        if (du6Var.n) {
            String str = "";
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                networkInterfaces.getClass();
                ArrayList list = Collections.list(networkInterfaces);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
                    inetAddresses.getClass();
                    ArrayList list2 = Collections.list(inetAddresses);
                    list2.getClass();
                    qv0.c0(arrayList, list2);
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    InetAddress inetAddress = (InetAddress) next;
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        break;
                    }
                }
                InetAddress inetAddress2 = (InetAddress) next;
                if (inetAddress2 != null && (hostAddress = inetAddress2.getHostAddress()) != null) {
                    str = hostAddress;
                }
                while (true) {
                    if (i2 >= length) {
                        if (i3 == 0 || i4 > 255 || i5 != 3) {
                            break;
                            break;
                            break;
                        } else {
                            i = (i6 << 8) + i4;
                            break;
                        }
                    }
                    char cCharAt = str.charAt(i2);
                    if ('0' <= cCharAt && cCharAt < ':') {
                        i4 = (i4 * 10) + (cCharAt - '0');
                        i3++;
                        if (i3 > 3) {
                            break;
                        } else {
                            i2++;
                        }
                    } else if (cCharAt != '.') {
                        if (cCharAt != ' ' && cCharAt != '\t') {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        if (i3 == 0 || i4 > 255 || (i5 = i5 + 1) > 3) {
                            break;
                        }
                        i6 = (i6 << 8) + i4;
                        i3 = 0;
                        i4 = 0;
                        i2++;
                    }
                }
            } catch (Exception e) {
                ye4.a.g("NetworkHelper", "getOwnIPAddress: " + e.getMessage());
            }
            length = str.length();
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            jToLong = i;
        } else {
            Settings.i.n();
            jToLong = Settings.e().ToLong();
        }
        this.a.SetMyParticipantIdentifier(ParticipantIdentifier.fromDyngateIdAndSessionId(jToLong, this.b));
        InterProcessGUIConnector.a.c(ICommonParticipantManager.getCPtr(this.a));
        EventHub.e.f().c(EventType.EVENT_MEETING_NEW_PARTICIPANT, this.d);
    }

    public final ParticipantIdentifier a() {
        ParticipantIdentifier participantIdentifierGetPIDOfUniquePartner = this.a.GetPIDOfUniquePartner();
        participantIdentifierGetPIDOfUniquePartner.getClass();
        return participantIdentifierGetPIDOfUniquePartner;
    }

    public final ParticipantIdentifier b() {
        ParticipantIdentifier participantIdentifierGetMyParticipantIdentifier = this.a.GetMyParticipantIdentifier();
        participantIdentifierGetMyParticipantIdentifier.getClass();
        return participantIdentifierGetMyParticipantIdentifier;
    }

    public final void c(int i, boolean z) {
        a2 a2Var = this.c;
        if (a2Var == null) {
            ye4.c("JParticipantManager", "subscribe stream failed because of missing session");
            return;
        }
        vv vvVar = no4.n;
        mo4 mo4Var = new mo4(g10.MeetingCommand, (byte) 3, (byte) 0);
        mo4Var.d(oo4.StreamIdentifier, i);
        mo4Var.b(po4.m, z ? (byte) 1 : (byte) 0);
        mo4Var.d(oo4.Error, 0);
        a2Var.m.e(mo4Var);
    }
}
