package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class bw0 {
    public static final h72 a = new h72(new vr1((byte) 19), (byte) 1);

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    public static final long a(long j, ux2 ux2Var) {
        ux2Var.W(89373914);
        zv0 zv0Var = ((rn4) ux2Var.j(un4.a)).a;
        long j2 = zv0Var.a;
        long j3 = zv0Var.U;
        long j4 = zv0Var.Q;
        long j5 = zv0Var.M;
        long j6 = zv0Var.q;
        int i = rv0.i;
        if (z68.a(j, j2)) {
            j3 = zv0Var.b;
        } else if (z68.a(j, zv0Var.f)) {
            j3 = zv0Var.g;
        } else if (z68.a(j, zv0Var.j)) {
            j3 = zv0Var.k;
        } else if (z68.a(j, zv0Var.n)) {
            j3 = zv0Var.f2738o;
        } else if (z68.a(j, zv0Var.w)) {
            j3 = zv0Var.x;
        } else if (z68.a(j, zv0Var.c)) {
            j3 = zv0Var.d;
        } else if (z68.a(j, zv0Var.h)) {
            j3 = zv0Var.i;
        } else if (z68.a(j, zv0Var.l)) {
            j3 = zv0Var.m;
        } else if (z68.a(j, zv0Var.y)) {
            j3 = zv0Var.z;
        } else if (z68.a(j, zv0Var.u)) {
            j3 = zv0Var.v;
        } else if (z68.a(j, zv0Var.p)) {
            j3 = j6;
        } else if (z68.a(j, zv0Var.r)) {
            j3 = zv0Var.s;
        } else if (z68.a(j, zv0Var.D) || z68.a(j, zv0Var.F) || z68.a(j, zv0Var.G) || z68.a(j, zv0Var.H) || z68.a(j, zv0Var.I) || z68.a(j, zv0Var.J) || z68.a(j, zv0Var.E)) {
            j3 = j6;
        } else if (z68.a(j, zv0Var.K) || z68.a(j, zv0Var.L)) {
            j3 = j5;
        } else if (z68.a(j, zv0Var.O) || z68.a(j, zv0Var.P)) {
            j3 = j4;
        } else if (!z68.a(j, zv0Var.S) && !z68.a(j, zv0Var.T)) {
            j3 = rv0.h;
        }
        if (j3 == 16) {
            j3 = ((rv0) ux2Var.j(wa1.a)).a;
        }
        ux2Var.p(false);
        return j3;
    }

    public static final long b(zv0 zv0Var, aw0 aw0Var) {
        switch (aw0Var.ordinal()) {
            case 0:
                return zv0Var.n;
            case 1:
                return zv0Var.w;
            case 2:
                return zv0Var.y;
            case 3:
                return zv0Var.v;
            case 4:
                return zv0Var.e;
            case 5:
                return zv0Var.u;
            case 6:
                return zv0Var.f2738o;
            case 7:
                return zv0Var.x;
            case 8:
                return zv0Var.z;
            case ep1.b /* 9 */:
                return zv0Var.b;
            case ep1.c /* 10 */:
                return zv0Var.d;
            case 11:
                return zv0Var.M;
            case ep1.d /* 12 */:
                return zv0Var.N;
            case 13:
                return zv0Var.g;
            case 14:
                return zv0Var.i;
            case 15:
                return zv0Var.Q;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return zv0Var.R;
            case 17:
                return zv0Var.q;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return zv0Var.s;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return zv0Var.k;
            case 20:
                return zv0Var.m;
            case 21:
                return zv0Var.U;
            case 22:
                return zv0Var.V;
            case 23:
                return zv0Var.A;
            case 24:
                return zv0Var.B;
            case 25:
                return zv0Var.a;
            case 26:
                return zv0Var.c;
            case 27:
                return zv0Var.K;
            case 28:
                return zv0Var.L;
            case 29:
                return zv0Var.C;
            case 30:
                return zv0Var.f;
            case 31:
                return zv0Var.h;
            case 32:
                return zv0Var.O;
            case 33:
                return zv0Var.P;
            case 34:
                return zv0Var.p;
            case 35:
                return zv0Var.D;
            case 36:
                return zv0Var.F;
            case 37:
                return zv0Var.G;
            case 38:
                return zv0Var.H;
            case 39:
                return zv0Var.I;
            case 40:
                return zv0Var.J;
            case 41:
                return zv0Var.E;
            case 42:
                return zv0Var.t;
            case 43:
                return zv0Var.r;
            case 44:
                return zv0Var.j;
            case 45:
                return zv0Var.l;
            case 46:
                return zv0Var.S;
            case 47:
                return zv0Var.T;
            default:
                gk0.s();
                return 0L;
        }
    }

    public static final long c(aw0 aw0Var, ux2 ux2Var) {
        return b(((rn4) ux2Var.j(un4.a)).a, aw0Var);
    }

    public static zv0 d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, int i, int i2) {
        long j34 = (i & 1) != 0 ? wv0.z : j;
        return new zv0(j34, (i & 2) != 0 ? wv0.j : j2, (i & 4) != 0 ? wv0.A : j3, (i & 8) != 0 ? wv0.k : j4, (i & 16) != 0 ? wv0.e : j5, (i & 32) != 0 ? wv0.E : j6, (i & 64) != 0 ? wv0.n : j7, (i & 128) != 0 ? wv0.F : j8, (i & 256) != 0 ? wv0.f2448o : j9, (i & 512) != 0 ? wv0.R : j10, (i & 1024) != 0 ? wv0.t : j11, (i & 2048) != 0 ? wv0.S : j12, (i & 4096) != 0 ? wv0.u : j13, (i & 8192) != 0 ? wv0.a : j14, (i & 16384) != 0 ? wv0.g : j15, (32768 & i) != 0 ? wv0.I : j16, (65536 & i) != 0 ? wv0.r : j17, (131072 & i) != 0 ? wv0.Q : j18, (262144 & i) != 0 ? wv0.s : j19, (524288 & i) != 0 ? j34 : j20, (1048576 & i) != 0 ? wv0.f : j21, (2097152 & i) != 0 ? wv0.d : j22, (4194304 & i) != 0 ? wv0.b : j23, (8388608 & i) != 0 ? wv0.h : j24, (16777216 & i) != 0 ? wv0.c : j25, (33554432 & i) != 0 ? wv0.i : j26, (67108864 & i) != 0 ? wv0.x : j27, (134217728 & i) != 0 ? wv0.y : j28, (268435456 & i) != 0 ? wv0.D : j29, wv0.J, wv0.P, wv0.K, (i & Integer.MIN_VALUE) != 0 ? wv0.L : j30, (i2 & 1) != 0 ? wv0.M : j31, (i2 & 2) != 0 ? wv0.N : j32, wv0.O, wv0.B, (i2 & 32) != 0 ? wv0.C : j33, wv0.l, wv0.m, wv0.G, wv0.H, wv0.p, wv0.q, wv0.T, wv0.U, wv0.v, wv0.w);
    }
}
