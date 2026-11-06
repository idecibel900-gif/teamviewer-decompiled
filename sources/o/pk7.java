package o;

import android.content.SharedPreferences;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pk7 extends oe8 {
    public final EventHub n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SharedPreferences f1743o;
    public final bg5 p;
    public final yf5 q;
    public final yf5 r;

    public pk7(EventHub eventHub, SharedPreferences sharedPreferences) {
        Object next;
        eventHub.getClass();
        sharedPreferences.getClass();
        this.n = eventHub;
        this.f1743o = sharedPreferences;
        this.p = h57.p(Boolean.FALSE);
        int i = sharedPreferences.getInt("INPUT_METHOD_INT", 0);
        dj3.f627o.getClass();
        Iterator it = dj3.r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((dj3) next).m != i);
        dj3 dj3Var = (dj3) next;
        this.q = new yf5((dj3Var == null ? dj3.MOUSE : dj3Var).n);
        String string = this.f1743o.getString("PREFERRED_RESOLUTION", "DontChange");
        string = string == null ? "" : string;
        this.r = new yf5((!string.equals("DontChange") && string.equals("BestFit")) ? R.string.tv_options_PreferredResolutionBestFit : R.string.tv_options_PreferredResolutionDontChange);
    }
}
