package o;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class r88 extends AbstractList implements RandomAccess, i54 {
    public final f54 m;

    public r88(f54 f54Var) {
        this.m = f54Var;
    }

    @Override // o.i54
    public final zh0 J(int i) {
        return this.m.J(i);
    }

    @Override // o.i54
    public final void c0(pc4 pc4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // o.i54
    public final List e() {
        return Collections.unmodifiableList(this.m.m);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.m.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        q88 q88Var = new q88((byte) 0);
        q88Var.n = this.m.iterator();
        return q88Var;
    }

    @Override // o.i54
    public final r88 j() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p88 p88Var = new p88((byte) 0);
        p88Var.n = this.m.listIterator(i);
        return p88Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m.size();
    }
}
