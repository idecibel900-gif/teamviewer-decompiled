package io.sentry.android.core;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentLinkedDeque;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function1;
import o.ab2;
import o.ct1;
import o.ei1;
import o.eo;
import o.im3;
import o.in2;
import o.mc;
import o.mo8;
import o.p06;
import o.qo;
import o.rc1;
import o.sa7;
import o.yn1;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements sa7, eo {
    public long m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f129o;
    public Object p;
    public Object q;
    public final Object r;
    public final Object s;
    public final Object t;

    public v1(ei1 ei1Var, yn1 yn1Var, Object obj, qo qoVar) {
        rc1 rc1Var = new rc1(ei1Var.a);
        in2 in2Var = (in2) rc1Var.n;
        this.n = rc1Var;
        this.f129o = yn1Var;
        this.p = obj;
        qo qoVar2 = (qo) yn1Var.b().invoke(obj);
        this.q = qoVar2;
        this.r = mo8.j(qoVar);
        Function1 function1A = yn1Var.a();
        qo qoVarC = (qo) rc1Var.q;
        if (qoVarC == null) {
            qoVarC = qoVar2.c();
            rc1Var.q = qoVarC;
        }
        int iB = qoVarC.b();
        int i = 0;
        while (true) {
            qo qoVar3 = (qo) rc1Var.q;
            if (i >= iB) {
                if (qoVar3 == null) {
                    im3.e0("targetVector");
                    throw null;
                }
                this.t = function1A.invoke(qoVar3);
                qo qoVarC2 = (qo) rc1Var.p;
                if (qoVarC2 == null) {
                    qoVarC2 = qoVar2.c();
                    rc1Var.p = qoVarC2;
                }
                int iB2 = qoVarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    qoVar2.getClass();
                    jMax = Math.max(jMax, in2Var.r(qoVar.a(i2)));
                }
                this.m = jMax;
                qo qoVarJ = mo8.j(((rc1) this.n).d(jMax, (qo) this.q, qoVar));
                this.s = qoVarJ;
                int iB3 = qoVarJ.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    qo qoVar4 = (qo) this.s;
                    float fA = qoVar4.a(i3);
                    float f = ((rc1) this.n).m;
                    qoVar4.e(i3, ct1.u(fA, -f, f));
                }
                return;
            }
            if (qoVar3 == null) {
                im3.e0("targetVector");
                throw null;
            }
            qoVar3.e(i, in2Var.s(qoVar2.a(i), qoVar.a(i)));
            i++;
        }
    }

    @Override // o.eo
    public boolean a() {
        return false;
    }

    @Override // o.eo
    public long b() {
        return this.m;
    }

    @Override // o.eo
    public yn1 c() {
        return (yn1) this.f129o;
    }

    @Override // o.eo
    public qo d(long j) {
        return !e(j) ? ((rc1) this.n).d(j, (qo) this.q, (qo) this.r) : (qo) this.s;
    }

    @Override // o.sa7
    public synchronized void f(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        int iPosition = byteBuffer3.position();
        byte[] bArrI = mc.i((byte[]) this.r, this.m, false);
        ((Cipher) this.p).init(1, (SecretKeySpec) this.n, new IvParameterSpec(bArrI));
        this.m++;
        ((Cipher) this.p).update(byteBuffer, byteBuffer3);
        ((Cipher) this.p).doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        ((Mac) this.q).init((SecretKeySpec) this.f129o);
        ((Mac) this.q).update(bArrI);
        ((Mac) this.q).update(byteBufferDuplicate);
        byteBuffer3.put(((Mac) this.q).doFinal(), 0, ((mc) this.t).c);
    }

    @Override // o.eo
    public Object g(long j) {
        if (e(j)) {
            return this.t;
        }
        Function1 function1A = ((yn1) this.f129o).a();
        rc1 rc1Var = (rc1) this.n;
        qo qoVar = (qo) this.q;
        qo qoVar2 = (qo) this.r;
        qo qoVarC = (qo) rc1Var.f1913o;
        if (qoVarC == null) {
            qoVarC = qoVar.c();
            rc1Var.f1913o = qoVarC;
        }
        int iB = qoVarC.b();
        int i = 0;
        while (true) {
            qo qoVar3 = (qo) rc1Var.f1913o;
            if (i >= iB) {
                if (qoVar3 != null) {
                    return function1A.invoke(qoVar3);
                }
                im3.e0("valueVector");
                throw null;
            }
            if (qoVar3 == null) {
                im3.e0("valueVector");
                throw null;
            }
            qoVar3.e(i, ((in2) rc1Var.n).i(qoVar.a(i), qoVar2.a(i), j));
            i++;
        }
    }

    @Override // o.eo
    public Object h() {
        return this.t;
    }

    @Override // o.sa7
    public ByteBuffer i() {
        return ((ByteBuffer) this.s).asReadOnlyBuffer();
    }

    @Override // o.sa7
    public synchronized void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer2.position();
        byte[] bArrI = mc.i((byte[]) this.r, this.m, true);
        ((Cipher) this.p).init(1, (SecretKeySpec) this.n, new IvParameterSpec(bArrI));
        this.m++;
        ((Cipher) this.p).doFinal(byteBuffer, byteBuffer2);
        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        ((Mac) this.q).init((SecretKeySpec) this.f129o);
        ((Mac) this.q).update(bArrI);
        ((Mac) this.q).update(byteBufferDuplicate);
        byteBuffer2.put(((Mac) this.q).doFinal(), 0, ((mc) this.t).c);
    }

    public v1(mc mcVar, byte[] bArr) throws GeneralSecurityException {
        this.t = mcVar;
        this.m = 0L;
        this.p = (Cipher) ab2.e.a("AES/CTR/NoPadding");
        ab2 ab2Var = ab2.f;
        String str = mcVar.b;
        this.q = (Mac) ab2Var.a(str);
        this.m = 0L;
        int i = mcVar.a;
        byte[] bArrA = p06.a(i);
        byte[] bArrA2 = p06.a(7);
        this.r = bArrA2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mcVar.e());
        this.s = byteBufferAllocate;
        byteBufferAllocate.put((byte) mcVar.e());
        byteBufferAllocate.put(bArrA);
        byteBufferAllocate.put(bArrA2);
        byteBufferAllocate.flip();
        byte[] bArrX = ct1.x(mcVar.f, mcVar.g, bArrA, bArr, i + 32);
        this.n = new SecretKeySpec(bArrX, 0, i, "AES");
        this.f129o = new SecretKeySpec(bArrX, i, 32, str);
    }

    public v1(io.sentry.android.core.internal.util.t tVar) {
        this.f129o = null;
        this.q = null;
        this.p = null;
        this.r = new ConcurrentLinkedDeque();
        this.s = new ConcurrentLinkedDeque();
        this.t = new ConcurrentLinkedDeque();
        this.m = 0L;
        this.n = tVar;
    }
}
