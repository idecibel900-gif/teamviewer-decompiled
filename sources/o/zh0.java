package o;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zh0 implements Iterable {
    public static final pc4 m = new pc4(new byte[0]);

    public static zh0 a(Iterator it, int i) {
        if (i == 1) {
            return (zh0) it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public static xh0 i() {
        return new xh0();
    }

    public final zh0 b(zh0 zh0Var) {
        int size = size();
        int size2 = zh0Var.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = hf6.t;
        hf6 hf6Var = this instanceof hf6 ? (hf6) this : null;
        if (zh0Var.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return zh0Var;
        }
        int size3 = zh0Var.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = zh0Var.size();
            byte[] bArr = new byte[size4 + size5];
            c(0, 0, size4, bArr);
            zh0Var.c(0, size4, size5, bArr);
            return new pc4(bArr);
        }
        if (hf6Var != null) {
            zh0 zh0Var2 = hf6Var.p;
            if (zh0Var.size() + zh0Var2.size() < 128) {
                int size6 = zh0Var2.size();
                int size7 = zh0Var.size();
                byte[] bArr2 = new byte[size6 + size7];
                zh0Var2.c(0, 0, size6, bArr2);
                zh0Var.c(0, size6, size7, bArr2);
                return new hf6(hf6Var.f968o, new pc4(bArr2));
            }
        }
        if (hf6Var != null) {
            zh0 zh0Var3 = hf6Var.p;
            zh0 zh0Var4 = hf6Var.f968o;
            if (zh0Var4.f() > zh0Var3.f() && hf6Var.r > zh0Var.f()) {
                return new hf6(zh0Var4, new hf6(zh0Var3, zh0Var));
            }
        }
        if (size3 >= hf6.t[Math.max(f(), zh0Var.f()) + 1]) {
            return new hf6(this, zh0Var);
        }
        g95 g95Var = new g95((byte) 16);
        g95Var.B(this);
        g95Var.B(zh0Var);
        Stack stack = (Stack) g95Var.m;
        zh0 hf6Var2 = (zh0) stack.pop();
        while (!stack.isEmpty()) {
            hf6Var2 = new hf6((zh0) stack.pop(), hf6Var2);
        }
        return hf6Var2;
    }

    public final void c(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            gk0.f(30, i, "Source offset < 0: ");
            return;
        }
        if (i2 < 0) {
            gk0.f(30, i2, "Target offset < 0: ");
            return;
        }
        if (i3 < 0) {
            gk0.f(23, i3, "Length < 0: ");
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            gk0.f(34, i4, "Source end offset < 0: ");
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            gk0.f(34, i5, "Target end offset < 0: ");
        } else if (i3 > 0) {
            d(i, i2, i3, bArr);
        }
    }

    public abstract void d(int i, int i2, int i3, byte[] bArr);

    public int f() {
        return 0;
    }

    public boolean g() {
        return true;
    }

    public abstract boolean h();

    public abstract int k(int i, int i2, int i3);

    public abstract int l(int i, int i2, int i3);

    public abstract int m();

    public abstract String n();

    public final String o() {
        try {
            return n();
        } catch (UnsupportedEncodingException e) {
            an4.n("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void p(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
