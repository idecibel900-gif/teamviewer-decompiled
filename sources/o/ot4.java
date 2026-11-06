package o;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ot4 {
    public final ArrayList a = new ArrayList();
    public final ArrayDeque b = new ArrayDeque();
    public boolean c;
    public final /* synthetic */ pt4 d;

    public ot4(pt4 pt4Var) {
        this.d = pt4Var;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.c) {
            this.c = true;
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque.size() != 1 || ((nt4) arrayDeque.getFirst()).b != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    nt4 nt4Var = (nt4) itDescendingIterator.next();
                    sb.append("\nfor ");
                    Type type = nt4Var.a;
                    String str = nt4Var.b;
                    sb.append(type);
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z) {
        this.b.removeLast();
        if (this.b.isEmpty()) {
            this.d.c.remove();
            if (z) {
                synchronized (this.d.d) {
                    try {
                        int size = this.a.size();
                        for (int i = 0; i < size; i++) {
                            nt4 nt4Var = (nt4) this.a.get(i);
                            vp3 vp3Var = (vp3) this.d.d.put(nt4Var.c, nt4Var.d);
                            if (vp3Var != null) {
                                nt4Var.d = vp3Var;
                                this.d.d.put(nt4Var.c, vp3Var);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
