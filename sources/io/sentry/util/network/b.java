package io.sentry.util.network;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.cp4;
import o.nd;
import o.pc8;
import o.q46;
import o.xd3;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final /* synthetic */ byte a;
    public long b;
    public final Object c;
    public final Object d;

    public b() {
        this.a = (byte) 1;
        this.c = new pc8();
        this.d = new pc8();
    }

    public void a(long j, long j2) {
        ((pc8) this.c).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((pc8) this.d).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public void b(cp4 cp4Var, xd3 xd3Var, Map map, long j) {
        io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.d;
        long j2 = cVar.n;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.m;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(cp4Var);
            if (objRemove != null) {
                cVar.f153o = cVar.d() - cVar.g(cp4Var, objRemove);
                cVar.c(cp4Var, objRemove, null);
            }
            ((nd) this.c).s(cp4Var, xd3Var, map, j);
            return;
        }
        q46 q46Var = new q46(xd3Var, map, j);
        Object objPut = linkedHashMap.put(cp4Var, q46Var);
        cVar.f153o = cVar.g(cp4Var, q46Var) + cVar.d();
        if (objPut != null) {
            cVar.f153o = cVar.d() - cVar.g(cp4Var, objPut);
            cVar.c(cp4Var, objPut, q46Var);
        }
        cVar.i(cVar.n);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "NetworkBody{body=" + this.c + ", warnings=" + ((List) this.d) + '}';
            default:
                return super.toString();
        }
    }

    public b(Object obj, List list, long j) {
        this.a = (byte) 0;
        this.c = obj;
        this.d = list;
        this.b = j;
    }

    public b(long j, nd ndVar) {
        this.a = (byte) 2;
        this.b = j;
        this.c = ndVar;
        this.d = new io.sentry.android.replay.gestures.c(this, j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Object obj, List list) {
        this(obj, list, -1L);
        this.a = (byte) 0;
    }
}
