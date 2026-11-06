package o;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class wm3 {
    public final WorkDatabase_Impl a;
    public final e38 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final tg3 e;
    public final tg3 f;
    public final Object g;

    public wm3(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = workDatabase_Impl;
        e38 e38Var = new e38(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.j, new ew1(1, this, wm3.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 23));
        this.b = e38Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new tg3(this, (byte) 3);
        this.f = new tg3(this, (byte) 4);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        e38Var.k = new vm3((Object) this, (byte) 0);
    }

    public final Object a(og7 og7Var) {
        Object objF;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        return ((!workDatabase_Impl.j() || workDatabase_Impl.m()) && (objF = this.b.f(og7Var)) == ne1.m) ? objF : f88.a;
    }
}
