package o;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public final class ff6 implements Iterator {
    public final Stack m = new Stack();
    public pc4 n;

    public ff6(zh0 zh0Var) {
        while (zh0Var instanceof hf6) {
            hf6 hf6Var = (hf6) zh0Var;
            this.m.push(hf6Var);
            zh0Var = hf6Var.f968o;
        }
        this.n = (pc4) zh0Var;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pc4 next() {
        pc4 pc4Var;
        pc4 pc4Var2 = this.n;
        pc4 pc4Var3 = null;
        if (pc4Var2 == null) {
            yq4.p();
            return null;
        }
        do {
            Stack stack = this.m;
            if (!stack.isEmpty()) {
                zh0 zh0Var = ((hf6) stack.pop()).p;
                while (zh0Var instanceof hf6) {
                    hf6 hf6Var = (hf6) zh0Var;
                    stack.push(hf6Var);
                    zh0Var = hf6Var.f968o;
                }
                pc4Var = (pc4) zh0Var;
            }
            this.n = pc4Var3;
            return pc4Var2;
        } while (pc4Var.n.length == 0);
        pc4Var3 = pc4Var;
        this.n = pc4Var3;
        return pc4Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
