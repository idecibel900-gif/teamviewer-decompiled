package io.sentry.cache.tape;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import o.hk0;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    public final j m;
    public final c n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f186o;

    public e(j jVar, f fVar) {
        this.m = jVar;
        this.f186o = fVar;
    }

    @Override // io.sentry.cache.tape.g
    public final void G(Comparable comparable) throws IOException {
        long j;
        long j2;
        long j3;
        long jP0;
        long j4;
        long j5;
        c cVar = this.n;
        cVar.reset();
        this.f186o.d(comparable, cVar);
        j jVar = this.m;
        byte[] bArr = jVar.s;
        byte[] bArrE = cVar.e();
        int size = cVar.size();
        if (bArrE == null) {
            yq4.l("data == null");
            return;
        }
        if (size < 0 || size > bArrE.length) {
            throw new IndexOutOfBoundsException();
        }
        if (jVar.w) {
            hk0.l("closed");
            return;
        }
        int i = jVar.u;
        if (i != -1 && jVar.p == i) {
            jVar.L0(1);
        }
        long j6 = ((long) size) + 4;
        long j7 = jVar.f188o;
        if (jVar.p == 0) {
            j = 4;
            j3 = 32;
            j2 = 32;
        } else {
            h hVar = jVar.r;
            long j8 = hVar.a;
            j = 4;
            long j9 = jVar.q.a;
            int i2 = hVar.b;
            if (j8 >= j9) {
                j3 = (j8 - j9) + 4 + ((long) i2) + 32;
                j2 = 32;
            } else {
                j2 = 32;
                j3 = (((j8 + 4) + ((long) i2)) + j7) - j9;
            }
        }
        long j10 = j7 - j3;
        if (j10 < j6) {
            do {
                j10 += j7;
                j7 <<= 1;
            } while (j10 < j6);
            jVar.m.setLength(j7);
            jVar.m.getChannel().force(true);
            h hVar2 = jVar.r;
            long jP1 = jVar.P0(hVar2.a + j + ((long) hVar2.b));
            if (jP1 <= jVar.q.a) {
                FileChannel channel = jVar.m.getChannel();
                channel.position(jVar.f188o);
                j4 = jP1 - j2;
                if (channel.transferTo(32L, j4, channel) != j4) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            } else {
                j4 = 0;
            }
            long j11 = jVar.r.a;
            long j12 = jVar.q.a;
            if (j11 < j12) {
                long j13 = (jVar.f188o + j11) - j2;
                j5 = j7;
                jVar.Q0(j5, jVar.p, j12, j13);
                jVar.r = new h(jVar.r.b, j13);
            } else {
                j5 = j7;
                jVar.Q0(j5, jVar.p, j12, j11);
            }
            jVar.f188o = j5;
            long j14 = j2;
            long j15 = j4;
            while (j15 > 0) {
                int iMin = (int) Math.min(j15, 4096L);
                jVar.O0(iMin, j14, j.x);
                long j16 = iMin;
                j15 -= j16;
                j14 += j16;
            }
        }
        boolean z = jVar.p == 0;
        if (z) {
            jP0 = j2;
        } else {
            h hVar3 = jVar.r;
            jP0 = jVar.P0(hVar3.a + j + ((long) hVar3.b));
        }
        h hVar4 = new h(size, jP0);
        j.R0(bArr, 0, size);
        jVar.O0(4, jP0, bArr);
        jVar.O0(size, jP0 + j, bArrE);
        jVar.Q0(jVar.f188o, jVar.p + 1, z ? jP0 : jVar.q.a, jP0);
        jVar.r = hVar4;
        jVar.p++;
        jVar.t++;
        if (z) {
            jVar.q = hVar4;
        }
    }

    @Override // io.sentry.cache.tape.g
    public final void H0() throws IOException {
        j jVar = this.m;
        if (jVar.v) {
            return;
        }
        jVar.m.getChannel().force(false);
    }

    @Override // io.sentry.cache.tape.g
    public final void clear() throws IOException {
        this.m.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this, new i(this.m));
    }

    @Override // io.sentry.cache.tape.g
    public final void l0(int i) throws IOException {
        this.m.L0(i);
    }

    @Override // io.sentry.cache.tape.g
    public final int size() {
        return this.m.p;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.m + '}';
    }
}
