package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class vc implements sa7, oe2 {
    public long m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2297o;
    public final Object p;
    public final Object q;

    public vc(wc wcVar, byte[] bArr) {
        this.m = 0L;
        this.f2297o = (Cipher) ab2.e.a("AES/GCM/NoPadding");
        this.m = 0L;
        int i = wcVar.a;
        byte[] bArrA = p06.a(i);
        byte[] bArrA2 = p06.a(7);
        this.p = bArrA2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(wcVar.e());
        this.q = byteBufferAllocate;
        byteBufferAllocate.put((byte) wcVar.e());
        byteBufferAllocate.put(bArrA);
        byteBufferAllocate.put(bArrA2);
        byteBufferAllocate.flip();
        this.n = new SecretKeySpec(ct1.x(wcVar.d, wcVar.e, bArrA, bArr, i), "AES");
    }

    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.p;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            zf6 zf6Var = (zf6) it.next();
            zf6Var.cancel();
            zf6 zf6VarA = zf6Var.a();
            if (zf6VarA != null) {
                ((o46) this.n).p.addLast(zf6VarA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public yf6 b() {
        zf6 lh2Var;
        o46 o46Var = (o46) this.n;
        if (o46Var.a(null)) {
            try {
                lh2Var = o46Var.b();
            } catch (Throwable th) {
                lh2Var = new lh2(th);
            }
            if (lh2Var.c()) {
                return new yf6(lh2Var, (Throwable) null, 6);
            }
            if (lh2Var instanceof lh2) {
                return ((lh2) lh2Var).a;
            }
            ((CopyOnWriteArrayList) this.p).add(lh2Var);
            ((io7) this.f2297o).d().c(new qh2(ro8.b + " connect " + o46Var.i.h.f(), lh2Var, this), 0L);
        }
        return null;
    }

    @Override // o.oe2
    public b46 d() throws IOException {
        yf6 yf6VarB;
        long j;
        yf6 yf6Var;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.p).isEmpty() && !((o46) this.n).a(null)) {
                    break;
                }
                if (((o46) this.n).k.C) {
                    throw new IOException("Canceled");
                }
                l07 l07Var = ((io7) this.f2297o).a;
                long jNanoTime = System.nanoTime();
                long j2 = this.m - jNanoTime;
                if (((CopyOnWriteArrayList) this.p).isEmpty() || j2 <= 0) {
                    yf6VarB = b();
                    j = 250000000;
                    this.m = jNanoTime + 250000000;
                } else {
                    j = j2;
                    yf6VarB = null;
                }
                if (yf6VarB == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.p;
                    if (copyOnWriteArrayList.isEmpty() || (yf6Var = (yf6) ((LinkedBlockingDeque) this.q).poll(j, timeUnit)) == null) {
                        yf6VarB = null;
                    } else {
                        copyOnWriteArrayList.remove(yf6Var.a);
                        yf6VarB = yf6Var;
                    }
                    if (yf6VarB == null) {
                    }
                }
                boolean z = false;
                if (yf6VarB.b == null && yf6VarB.c == null) {
                    a();
                    if (!yf6VarB.a.c()) {
                        yf6VarB = yf6VarB.a.g();
                    }
                    if (yf6VarB.b == null && yf6VarB.c == null) {
                        z = true;
                    }
                    if (z) {
                        b46 b46VarB = yf6VarB.a.b();
                        a();
                        return b46VarB;
                    }
                }
                Throwable th = yf6VarB.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        ct1.q(iOException, th);
                    }
                    if (((IOException) th) instanceof s72) {
                        break;
                    }
                }
                zf6 zf6Var = yf6VarB.b;
                if (zf6Var != null) {
                    ((o46) this.n).p.addFirst(zf6Var);
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
        a();
        iOException.getClass();
        throw iOException;
    }

    @Override // o.sa7
    public synchronized void f(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        try {
            ((Cipher) this.f2297o).init(1, (SecretKeySpec) this.n, wc.i((byte[]) this.p, this.m, false));
            this.m++;
            boolean zHasRemaining = byteBuffer2.hasRemaining();
            Cipher cipher = (Cipher) this.f2297o;
            if (zHasRemaining) {
                cipher.update(byteBuffer, byteBuffer3);
                ((Cipher) this.f2297o).doFinal(byteBuffer2, byteBuffer3);
            } else {
                cipher.doFinal(byteBuffer, byteBuffer3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.oe2
    public o46 g() {
        return (o46) this.n;
    }

    @Override // o.sa7
    public ByteBuffer i() {
        return ((ByteBuffer) this.q).asReadOnlyBuffer();
    }

    @Override // o.sa7
    public synchronized void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ((Cipher) this.f2297o).init(1, (SecretKeySpec) this.n, wc.i((byte[]) this.p, this.m, true));
        this.m++;
        ((Cipher) this.f2297o).doFinal(byteBuffer, byteBuffer2);
    }

    public vc(uu7 uu7Var, uu7 uu7Var2) {
        this.n = uu7Var;
        this.f2297o = uu7Var2;
        this.p = ck3.a(1.0f);
        this.q = wn4.a();
        this.m = d18.b;
    }

    public vc(o46 o46Var, io7 io7Var) {
        io7Var.getClass();
        this.n = o46Var;
        this.f2297o = io7Var;
        this.m = Long.MIN_VALUE;
        this.p = new CopyOnWriteArrayList();
        this.q = new LinkedBlockingDeque();
    }
}
