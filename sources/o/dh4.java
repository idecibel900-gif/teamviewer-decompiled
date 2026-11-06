package o;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class dh4 extends ao7 {
    public final g32 e;
    public final f32 f;
    public final AtomicReference g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh4(io7 io7Var, g32 g32Var, f32 f32Var) {
        super(f32Var.a.concat(" dns"), false);
        io7Var.getClass();
        this.e = g32Var;
        this.f = f32Var;
        this.g = new AtomicReference(ah4.b);
    }

    @Override // o.ao7
    public final long a() {
        Object obj;
        ah4 ah4Var = ah4.a;
        AtomicReference atomicReference = this.g;
        try {
            this.e.a(this.f.a);
            loop0: while (true) {
                obj = atomicReference.get();
                ch4 ch4Var = (ch4) obj;
                ch4Var.getClass();
                if (!(ch4Var instanceof bh4)) {
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(obj, ah4Var)) {
                        break loop0;
                    }
                } while (atomicReference.get() == obj);
            }
            return -1L;
        } catch (UnknownHostException unused) {
            while (true) {
                Object obj2 = atomicReference.get();
                ch4 ch4Var2 = (ch4) obj2;
                ch4Var2.getClass();
                if (!(ch4Var2 instanceof bh4)) {
                    return -1L;
                }
                while (!atomicReference.compareAndSet(obj2, ah4Var)) {
                    if (atomicReference.get() != obj2) {
                    }
                }
                return -1L;
            }
        }
    }
}
