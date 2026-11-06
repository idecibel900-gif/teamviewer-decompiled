package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dm8 {
    public static final String i = we4.i("WorkContinuationImpl");
    public final nm8 a;
    public final String b;
    public final gf2 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public ta5 h;

    public dm8(nm8 nm8Var, String str, gf2 gf2Var, List list) {
        this.a = nm8Var;
        this.b = str;
        this.c = gf2Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (gf2Var == gf2.m && ((e95) list.get(i2)).b.u != Long.MAX_VALUE) {
                hk0.g("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((e95) list.get(i2)).a.toString();
            string.getClass();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static HashSet b(dm8 dm8Var) {
        HashSet hashSet = new HashSet();
        dm8Var.getClass();
        return hashSet;
    }

    public final ta5 a() {
        if (this.g) {
            we4.f().j(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            nm8 nm8Var = this.a;
            this.h = yo1.I((aw) nm8Var.b.r, "EnqueueRunnable_" + this.c.name(), (iq6) nm8Var.d.m, new ks7(this, (byte) 8));
        }
        return this.h;
    }
}
