package o;

/* JADX INFO: loaded from: classes2.dex */
public final class eu7 implements ce1 {
    public final ThreadLocal m;

    public eu7(ThreadLocal threadLocal) {
        this.m = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu7) && this.m.equals(((eu7) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.m + ')';
    }
}
