package o;

import android.content.SharedPreferences;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fl7 extends oe8 {
    public final EventHub n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SharedPreferences f809o;
    public final Settings p;
    public final bg5 q;
    public final yf5 r;

    public fl7(EventHub eventHub, SharedPreferences sharedPreferences, Settings settings) {
        Object next;
        eventHub.getClass();
        sharedPreferences.getClass();
        settings.getClass();
        this.n = eventHub;
        this.f809o = sharedPreferences;
        this.p = settings;
        this.q = h57.p(Boolean.FALSE);
        int i = sharedPreferences.getInt("QUALITY_SETTINGS_INT", 0);
        ny5.f1611o.getClass();
        Iterator it = ny5.r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ny5) next).m != i);
        ny5 ny5Var = (ny5) next;
        this.r = new yf5((ny5Var == null ? ny5.AUTOMATIC : ny5Var).n);
    }
}
