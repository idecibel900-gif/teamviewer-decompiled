package o;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y41 implements wa3 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;

    public y41(Context context, c1 c1Var) {
        this.c = c1Var;
        this.d = new GestureDetector(context, new ko0(this, (byte) 2));
    }

    @Override // o.wa3
    public boolean a(MotionEvent motionEvent) {
        if (motionEvent.getSource() != 8194 && motionEvent.getSource() != 12290) {
            return false;
        }
        if (motionEvent.getActionMasked() == 5) {
            this.a = true;
            this.b = false;
            return false;
        }
        if (motionEvent.getActionMasked() == 6) {
            this.a = false;
            return false;
        }
        if (!this.a) {
            boolean zOnTouchEvent = ((GestureDetector) this.d).onTouchEvent(motionEvent);
            if (!zOnTouchEvent && this.b && motionEvent.getActionMasked() == 1) {
                this.b = false;
            }
            if (zOnTouchEvent || this.b) {
                return true;
            }
        }
        return false;
    }

    @Override // o.wa3
    public void b(int i, int i2) {
    }

    public z41 c() {
        return new z41(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    @Override // o.wa3
    public boolean d(MotionEvent motionEvent) {
        ub3 ub3Var;
        if ((motionEvent.getSource() != 8194 && motionEvent.getSource() != 12290) || motionEvent.getActionMasked() != 8) {
            return false;
        }
        c1 c1Var = (c1) this.c;
        float axisValue = motionEvent.getAxisValue(0) * motionEvent.getAxisValue(10);
        float axisValue2 = motionEvent.getAxisValue(1) * motionEvent.getAxisValue(9);
        if (Math.abs(axisValue) > Math.abs(axisValue2)) {
            int i = (int) (axisValue * 0.14f);
            if (i != 0 && c1Var != null) {
                int i2 = -i;
                ub3 ub3Var2 = c1Var.i;
                if (ub3Var2 != null) {
                    ub3Var2.a(i2, true);
                    return true;
                }
            }
        } else {
            int i3 = (int) (axisValue2 * 0.14f);
            if (i3 != 0 && c1Var != null && (ub3Var = c1Var.i) != null) {
                ub3Var.a(i3, false);
            }
        }
        return true;
    }

    @Override // o.wa3
    public void destroy() {
    }

    public void e(mr0... mr0VarArr) {
        if (!this.a) {
            hk0.g("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(mr0VarArr.length);
        for (mr0 mr0Var : mr0VarArr) {
            arrayList.add(mr0Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            hk0.g("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            hk0.g("At least one cipher suite is required");
        }
    }

    public void f(sv7... sv7VarArr) {
        if (!this.a) {
            hk0.g("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(sv7VarArr.length);
        for (sv7 sv7Var : sv7VarArr) {
            arrayList.add(sv7Var.m);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            hk0.g("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            hk0.g("At least one TLS version is required");
        }
    }

    public y41() {
        this.a = true;
    }
}
