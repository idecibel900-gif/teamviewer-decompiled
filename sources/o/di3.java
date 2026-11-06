package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class di3 implements u14, Serializable {
    public final Object m;

    public di3(Object obj) {
        this.m = obj;
    }

    @Override // o.u14
    public final boolean a() {
        return true;
    }

    @Override // o.u14
    public final Object getValue() {
        return this.m;
    }

    public final String toString() {
        return String.valueOf(this.m);
    }
}
