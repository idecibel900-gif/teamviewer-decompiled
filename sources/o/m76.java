package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class m76 extends kv0 {
    public final wt3 b;
    public final iw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m76(wt3 wt3Var, nw3 nw3Var) {
        super(nw3Var);
        nw3Var.getClass();
        this.b = wt3Var;
        fq6 fq6VarD = nw3Var.d();
        fq6VarD.getClass();
        this.c = new iw(fq6VarD, (byte) 0);
    }

    @Override // o.nw3
    public final fq6 d() {
        return this.c;
    }

    @Override // o.s0
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // o.s0
    public final Iterator g(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new j1(objArr);
    }

    @Override // o.s0
    public final int h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        throw null;
    }

    @Override // o.s0
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) et1.z(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // o.kv0
    public final void m(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
