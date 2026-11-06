package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class kg5 implements Cloneable {
    public final o28 m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ig5 f1262o;
    public jn7 p;
    public final ReentrantLock q = new ReentrantLock();
    public final hg5 n = new hg5(0);

    public kg5(kg5 kg5Var) {
        this.m = kg5Var.m.l();
        ig5 ig5Var = kg5Var.f1262o;
        this.f1262o = new ig5(ig5Var.a, ig5Var.b);
        jn7 jn7VarG = kg5Var.p;
        if (jn7VarG == null) {
            jn7VarG = kg5Var.m.g();
            kg5Var.p = jn7VarG;
        }
        jn7 jn7Var = jn7VarG.b;
        HashMap map = jn7VarG.a;
        ArrayList arrayList = jn7VarG.c;
        jn7 jn7Var2 = new jn7(jn7Var, arrayList == null ? null : new ArrayList(arrayList));
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = new HashMap(((Map) entry.getValue()).size());
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    map2.put((String) entry2.getKey(), ((hn7) entry2.getValue()).clone());
                }
                jn7Var2.a.put((String) entry.getKey(), map2);
            }
        }
        this.p = jn7Var2;
    }

    public final i32 a(f07 f07Var, String str) {
        ReentrantLock reentrantLock = this.q;
        try {
            reentrantLock.lock();
            o28 o28Var = this.m;
            o28Var.j(f07Var, str, this);
            o28Var.q();
            return o28Var.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object clone() {
        return new kg5(this);
    }

    public kg5(o28 o28Var) {
        this.m = o28Var;
        this.f1262o = o28Var.f();
    }
}
