package o;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;

/* JADX INFO: loaded from: classes.dex */
public final class xi3 implements wa3 {
    public ClientViewOpenGL a;
    public na3 b;
    public c1 c;
    public final j93 d;
    public final int e;
    public byte f;
    public byte g;
    public final PointF h;
    public long i;

    public xi3(ClientViewOpenGL clientViewOpenGL, na3 na3Var, c1 c1Var, j93 j93Var) {
        j93Var.getClass();
        this.a = clientViewOpenGL;
        this.b = na3Var;
        this.c = c1Var;
        this.d = j93Var;
        this.e = vn4.s0((j93Var.R() / 160.0f) * 5.0f);
        this.f = (byte) 1;
        this.g = (byte) 1;
        this.h = new PointF(0.0f, 0.0f);
    }

    @Override // o.wa3
    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getSource() != 8194 && motionEvent.getSource() != 12290) {
            return false;
        }
        c1 c1Var = this.c;
        int action = motionEvent.getAction();
        if (action == 0) {
            int buttonState = motionEvent.getButtonState();
            if (buttonState != 1) {
                if (buttonState != 2) {
                    if (buttonState == 4 && c1Var != null) {
                        c1Var.e(16);
                        return true;
                    }
                } else if (c1Var != null) {
                    c1Var.e(2);
                    return true;
                }
            } else if (c1Var != null) {
                c1Var.e(1);
            }
        } else {
            if (action != 1) {
                if (action != 2 && action != 7) {
                    return false;
                }
                e(motionEvent.getX(), motionEvent.getY());
                return true;
            }
            if (c1Var != null) {
                c1Var.e(0);
                return true;
            }
        }
        return true;
    }

    @Override // o.wa3
    public final void b(int i, int i2) {
        if (i > 0) {
            this.g = (byte) 6;
        }
        if (i2 < this.d.T().x) {
            this.f = (byte) 6;
        }
    }

    public final float c(int i, float f) {
        if (this.i == 0) {
            return 0.0f;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.i;
        if (jCurrentTimeMillis > 200) {
            return 0.0f;
        }
        return ((float) Math.pow(f / i, 2.0d)) * 0.025f * jCurrentTimeMillis;
    }

    @Override // o.wa3
    public final boolean d(MotionEvent motionEvent) {
        c1 c1Var;
        ub3 ub3Var;
        c1 c1Var2;
        ub3 ub3Var2;
        if (motionEvent.getSource() != 8194 && motionEvent.getSource() != 12290) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 || action == 7) {
            e(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 8) {
            return false;
        }
        float axisValue = motionEvent.getAxisValue(0) * motionEvent.getAxisValue(10);
        float axisValue2 = motionEvent.getAxisValue(1) * motionEvent.getAxisValue(9);
        if (Math.abs(axisValue) > Math.abs(axisValue2)) {
            int i = (int) (axisValue * 0.14f);
            if (i != 0 && (c1Var2 = this.c) != null && (ub3Var2 = c1Var2.i) != null) {
                ub3Var2.a(i, true);
                return true;
            }
        } else {
            int i2 = (int) (axisValue2 * 0.14f);
            if (i2 != 0 && (c1Var = this.c) != null && (ub3Var = c1Var.i) != null) {
                ub3Var.a(i2, false);
            }
        }
        return true;
    }

    @Override // o.wa3
    public final void destroy() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    public final void e(float f, float f2) {
        ClientViewOpenGL clientViewOpenGL;
        j97 dimensionView;
        i12 i12Var;
        float fC;
        float f3;
        float fC2;
        byte b;
        float f4;
        na3 na3Var;
        l97 l97Var;
        na3 na3Var2 = this.b;
        v97 v97Var = (na3Var2 == null || (l97Var = ((a1) na3Var2).e) == null) ? null : (v97) l97Var.getValue();
        PointF pointF = this.h;
        if (v97Var != null && ((v97Var.b > 0.0f || v97Var.c > 0.0f) && (clientViewOpenGL = this.a) != null && (dimensionView = clientViewOpenGL.getDimensionView()) != null && (i12Var = (i12) dimensionView.getValue()) != null)) {
            float f5 = v97Var.d;
            float f6 = v97Var.e;
            float f7 = pointF.x;
            int i = this.e;
            if (f >= f7) {
                int i2 = i12Var.a;
                byte b2 = this.f;
                int i3 = i * b2;
                if (f > i2 - i3) {
                    fC = c(b2, i3 - (i2 - f)) + f5;
                } else if (f <= f7) {
                    f3 = i;
                    if (f < f3) {
                        fC = f5 - c(1, f3 - f);
                    } else {
                        fC = f5;
                    }
                } else {
                    fC = f5;
                }
            } else if (f <= f7) {
                f3 = i;
                if (f < f3) {
                    fC = f5 - c(1, f3 - f);
                } else {
                    fC = f5;
                }
            } else {
                fC = f5;
            }
            float f8 = pointF.y;
            if (f2 >= f8) {
                int i4 = i12Var.b;
                int i5 = i * 6;
                if (f2 > i4 - i5) {
                    fC2 = c(6, i5 - (i4 - f2)) + f6;
                } else if (f2 <= f8) {
                    b = this.g;
                    f4 = i * b;
                    if (f2 < f4) {
                        fC2 = f6 - c(b, f4 - f2);
                    } else {
                        fC2 = f6;
                    }
                } else {
                    fC2 = f6;
                }
            } else if (f2 <= f8) {
                b = this.g;
                f4 = i * b;
                if (f2 < f4) {
                    fC2 = f6 - c(b, f4 - f2);
                } else {
                    fC2 = f6;
                }
            } else {
                fC2 = f6;
            }
            if ((fC != f5 || fC2 != f6) && (na3Var = this.b) != null) {
                na3Var.c(fC, fC2);
            }
        }
        c1 c1Var = this.c;
        if (c1Var != null) {
            c1Var.l(f, f2);
        }
        pointF.x = f;
        pointF.y = f2;
        this.i = System.currentTimeMillis();
    }
}
