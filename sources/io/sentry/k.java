package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import o.an4;
import o.hk0;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractCollection implements Queue, Serializable {
    public final transient Object[] m;
    public transient int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient int f207o = 0;
    public transient boolean p = false;
    public final int q;

    public k(int i) {
        if (i <= 0) {
            hk0.g("The size must be greater than 0");
            throw null;
        }
        Object[] objArr = new Object[i];
        this.m = objArr;
        this.q = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        int i = 0;
        if (obj == null) {
            yq4.l("Attempted to add null object to queue");
            return false;
        }
        int size = size();
        int i2 = this.q;
        if (size == i2) {
            remove();
        }
        int i3 = this.f207o;
        int i4 = i3 + 1;
        this.f207o = i4;
        this.m[i3] = obj;
        if (i4 >= i2) {
            this.f207o = 0;
        } else {
            i = i4;
        }
        if (i == this.n) {
            this.p = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.p = false;
        this.n = 0;
        this.f207o = 0;
        Arrays.fill(this.m, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (!isEmpty()) {
            return peek();
        }
        an4.j("queue is empty");
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new j(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.m[this.n];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            an4.j("queue is empty");
            return null;
        }
        int i = this.n;
        Object[] objArr = this.m;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.n = i2;
            objArr[i] = null;
            if (i2 >= this.q) {
                this.n = 0;
            }
            this.p = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f207o;
        int i2 = this.n;
        int i3 = this.q;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.p) {
            return i3;
        }
        return 0;
    }
}
