package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p97 implements Map.Entry, uu3 {
    public final Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q97 f1718o;

    public p97(q97 q97Var) {
        this.f1718o = q97Var;
        Map.Entry entry = q97Var.p;
        entry.getClass();
        this.m = entry.getKey();
        Map.Entry entry2 = q97Var.p;
        entry2.getClass();
        this.n = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        q97 q97Var = this.f1718o;
        l57 l57Var = q97Var.m;
        if (l57Var.b().d != q97Var.f1813o) {
            gk0.c();
            return null;
        }
        Object obj2 = this.n;
        l57Var.put(this.m, obj);
        this.n = obj;
        return obj2;
    }
}
