package o;

import android.content.SharedPreferences;
import com.teamviewer.teamviewerlib.event.EventHub;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gi7 extends oe8 {
    public final EventHub n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SharedPreferences f896o;
    public final bg5 p;
    public final yf5 q;

    public gi7(EventHub eventHub, SharedPreferences sharedPreferences) {
        Object next;
        eventHub.getClass();
        sharedPreferences.getClass();
        this.n = eventHub;
        this.f896o = sharedPreferences;
        this.p = h57.p(Boolean.FALSE);
        String string = sharedPreferences.getString("ENABLE_AUTO_LOCKING", "");
        String str = string != null ? string : "";
        tz.f2155o.getClass();
        Iterator it = tz.r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((tz) next).m.equals(str));
        tz tzVar = (tz) next;
        this.q = new yf5((tzVar == null ? tz.AUTOMATIC : tzVar).n);
    }
}
