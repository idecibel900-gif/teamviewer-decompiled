package o;

import android.content.res.Resources;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ns6 extends oe8 {
    public final Resources n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ax0 f1599o;
    public final int q;
    public final HashSet p = new HashSet();
    public String r = "";

    public ns6(Resources resources, ax0 ax0Var) {
        this.n = resources;
        this.f1599o = ax0Var;
        this.q = resources.getInteger(R.integer.tv_comment_session_max_comment_length);
    }

    public final void V0() {
        HashSet hashSet = this.p;
        hashSet.getClass();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            weakReference.getClass();
            if (weakReference.get() == null) {
                it.remove();
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            yc3 yc3Var = (yc3) ((WeakReference) it2.next()).get();
            if (yc3Var != null) {
                ((ms6) yc3Var).P0();
            }
        }
    }
}
