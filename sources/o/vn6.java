package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vn6 {
    public static final sn6 a = new sn6(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(sn6 sn6Var) {
        sn6Var.getClass();
        if (sn6Var.f != null || sn6Var.g != null) {
            hk0.g("Failed requirement.");
            return;
        }
        if (sn6Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        sn6 sn6Var2 = a;
        sn6 sn6Var3 = (sn6) atomicReference.getAndSet(sn6Var2);
        if (sn6Var3 == sn6Var2) {
            return;
        }
        int i = sn6Var3 != null ? sn6Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(sn6Var3);
            return;
        }
        sn6Var.f = sn6Var3;
        sn6Var.b = 0;
        sn6Var.c = i + 8192;
        atomicReference.set(sn6Var);
    }

    public static final sn6 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        sn6 sn6Var = a;
        sn6 sn6Var2 = (sn6) atomicReference.getAndSet(sn6Var);
        if (sn6Var2 == sn6Var) {
            return new sn6();
        }
        if (sn6Var2 == null) {
            atomicReference.set(null);
            return new sn6();
        }
        atomicReference.set(sn6Var2.f);
        sn6Var2.f = null;
        sn6Var2.c = 0;
        return sn6Var2;
    }
}
