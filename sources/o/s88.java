package o;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class s88 extends AbstractList implements h54, RandomAccess {
    public final g54 m;

    public s88(g54 g54Var) {
        this.m = g54Var;
    }

    @Override // o.h54
    public final void Y(vh0 vh0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // o.h54
    public final List e() {
        return Collections.unmodifiableList(this.m.n);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.m.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        q88 q88Var = new q88((byte) 1);
        q88Var.n = this.m.iterator();
        return q88Var;
    }

    @Override // o.h54
    public final h54 j() {
        return this;
    }

    @Override // o.h54
    public final Object k0(int i) {
        return this.m.n.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p88 p88Var = new p88((byte) 1);
        p88Var.n = this.m.listIterator(i);
        return p88Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m.size();
    }
}
