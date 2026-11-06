package o;

import android.content.Context;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class je0 implements t93 {
    public final /* synthetic */ byte m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1154o;

    public je0(w36 w36Var) {
        this.m = (byte) 2;
        this.f1154o = w36Var;
        this.n = 262144L;
    }

    public static long e(je0 je0Var, long j, float f) {
        long jE = t65.e(je0Var.n, j);
        je0Var.n = jE;
        float fC = ((gb5) je0Var.f1154o) == null ? t65.c(jE) : Math.abs(je0Var.g(jE));
        if (fC <= 0.0f || fC < f) {
            return 9205357640488583168L;
        }
        gb5 gb5Var = (gb5) je0Var.f1154o;
        long j2 = je0Var.n;
        if (gb5Var == null) {
            float fC2 = t65.c(j2);
            return t65.d(je0Var.n, t65.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fC2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fC2)) & 4294967295L)));
        }
        float fG = je0Var.g(j2) - (Math.signum(je0Var.g(je0Var.n)) * f);
        long j3 = je0Var.n;
        gb5 gb5Var2 = (gb5) je0Var.f1154o;
        gb5 gb5Var3 = gb5.n;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gb5Var2 == gb5Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((gb5) je0Var.f1154o) == gb5Var3) {
            return (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fG)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public void a(int i) {
        if (i < 64) {
            this.n &= ~(1 << i);
            return;
        }
        je0 je0Var = (je0) this.f1154o;
        if (je0Var != null) {
            je0Var.a(i - 64);
        }
    }

    public int b(int i) {
        je0 je0Var = (je0) this.f1154o;
        if (je0Var == null) {
            long j = this.n;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.n);
        }
        return Long.bitCount(this.n) + je0Var.b(i - 64);
    }

    public void c() {
        if (((je0) this.f1154o) == null) {
            this.f1154o = new je0();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.n) != 0;
        }
        c();
        return ((je0) this.f1154o).d(i - 64);
    }

    public void f(int i, boolean z) {
        if (i >= 64) {
            c();
            ((je0) this.f1154o).f(i - 64, z);
            return;
        }
        long j = this.n;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.n = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            k(i);
        } else {
            a(i);
        }
        if (z2 || ((je0) this.f1154o) != null) {
            c();
            ((je0) this.f1154o).f(0, z2);
        }
    }

    public float g(long j) {
        return Float.intBitsToFloat((int) (((gb5) this.f1154o) == gb5.n ? j >> 32 : j & 4294967295L));
    }

    public k53 h() {
        nm nmVar = new nm((byte) 5);
        while (true) {
            String strC0 = ((w36) this.f1154o).c0(this.n);
            this.n -= (long) strC0.length();
            if (strC0.length() == 0) {
                return i67.i(nmVar);
            }
            int iY = ub7.Y(strC0, ':', 1, 4);
            if (iY != -1) {
                i67.h(nmVar, strC0.substring(0, iY), strC0.substring(iY + 1));
            } else if (strC0.charAt(0) == ':') {
                i67.h(nmVar, "", strC0.substring(1));
            } else {
                i67.h(nmVar, "", strC0);
            }
        }
    }

    public boolean i(int i) {
        if (i >= 64) {
            c();
            return ((je0) this.f1154o).i(i - 64);
        }
        long j = 1 << i;
        long j2 = this.n;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.n = j3;
        long j4 = j - 1;
        this.n = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        je0 je0Var = (je0) this.f1154o;
        if (je0Var != null) {
            if (je0Var.d(0)) {
                k(63);
            }
            ((je0) this.f1154o).i(0);
        }
        return z;
    }

    public void j() {
        this.n = 0L;
        je0 je0Var = (je0) this.f1154o;
        if (je0Var != null) {
            je0Var.j();
        }
    }

    public void k(int i) {
        if (i < 64) {
            this.n |= 1 << i;
        } else {
            c();
            ((je0) this.f1154o).k(i - 64);
        }
    }

    @Override // o.t93
    public void n() {
        Object obj = ((cj3) this.f1154o).n;
        Context context = d82.M;
        if (context == null) {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return;
        }
        String string = context.getString(R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
        string.getClass();
        fx3.r(string, 1, context, bu7.MAIN);
    }

    public String toString() {
        switch (this.m) {
            case 1:
                if (((je0) this.f1154o) == null) {
                    return Long.toBinaryString(this.n);
                }
                return ((je0) this.f1154o).toString() + "xx" + Long.toBinaryString(this.n);
            default:
                return super.toString();
        }
    }

    @Override // o.t93
    public void y() {
        cj3 cj3Var = (cj3) this.f1154o;
        long j = this.n;
        y87 y87Var = new y87((l07) cj3Var.n, (byte) 1);
        MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(j), true, false);
        machineListViewModelO.getClass();
        gk7.O0(l07.A(machineListViewModelO, y87Var), ((ie0) cj3Var.f531o).C());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public je0(gb5 gb5Var) {
        this((byte) 3, 0L, gb5Var);
        this.m = (byte) 3;
    }

    public /* synthetic */ je0(byte b, long j, Object obj) {
        this.m = b;
        this.f1154o = obj;
        this.n = j;
    }

    public je0() {
        this.m = (byte) 1;
        this.n = 0L;
    }
}
