package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ui3 {
    public final /* synthetic */ byte a;
    public final e63 b;
    public final e63 c;
    public final e63 d;
    public final e63 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public ui3(ui3[] ui3VarArr) {
        final byte b = 0;
        this.a = (byte) 0;
        this.f = ui3VarArr;
        int length = ui3VarArr.length;
        final e63[] e63VarArr = new e63[length];
        for (int i = 0; i < length; i++) {
            e63VarArr[i] = ((ui3[]) this.f)[i].b();
        }
        final byte b2 = 1;
        this.b = new e63(new hw2() { // from class: o.jd8
            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                float fW;
                byte b3 = b2;
                e63[] e63VarArr2 = e63VarArr;
                il5 il5Var = (il5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fW = lq1.w(il5Var, false, e63VarArr2, fFloatValue);
                        break;
                    default:
                        fW = lq1.w(il5Var, true, e63VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fW);
            }
        }, (byte) 1);
        int length2 = ((ui3[]) this.f).length;
        final e63[] e63VarArr2 = new e63[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            e63VarArr2[i2] = ((ui3[]) this.f)[i2].d();
        }
        this.c = new e63(new hw2() { // from class: o.d63
            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                float fW;
                byte b3 = b2;
                e63[] e63VarArr3 = e63VarArr2;
                il5 il5Var = (il5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fW = lq1.w(il5Var, false, e63VarArr3, fFloatValue);
                        break;
                    default:
                        fW = lq1.w(il5Var, true, e63VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fW);
            }
        }, (byte) 0);
        int length3 = ((ui3[]) this.f).length;
        final e63[] e63VarArr3 = new e63[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            e63VarArr3[i3] = ((ui3[]) this.f)[i3].c();
        }
        this.d = new e63(new hw2() { // from class: o.jd8
            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                float fW;
                byte b3 = b;
                e63[] e63VarArr4 = e63VarArr3;
                il5 il5Var = (il5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fW = lq1.w(il5Var, false, e63VarArr4, fFloatValue);
                        break;
                    default:
                        fW = lq1.w(il5Var, true, e63VarArr4, fFloatValue);
                        break;
                }
                return Float.valueOf(fW);
            }
        }, (byte) 1);
        int length4 = ((ui3[]) this.f).length;
        final e63[] e63VarArr4 = new e63[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            e63VarArr4[i4] = ((ui3[]) this.f)[i4].a();
        }
        this.e = new e63(new hw2() { // from class: o.d63
            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                float fW;
                byte b3 = b;
                e63[] e63VarArr5 = e63VarArr4;
                il5 il5Var = (il5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fW = lq1.w(il5Var, false, e63VarArr5, fFloatValue);
                        break;
                    default:
                        fW = lq1.w(il5Var, true, e63VarArr5, fFloatValue);
                        break;
                }
                return Float.valueOf(fW);
            }
        }, (byte) 0);
    }

    public final e63 a() {
        byte b = this.a;
        return this.e;
    }

    public final e63 b() {
        byte b = this.a;
        return this.b;
    }

    public final e63 c() {
        byte b = this.a;
        return this.d;
    }

    public final e63 d() {
        byte b = this.a;
        return this.c;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return cx.Z0((ui3[]) obj, null, "innermostOf(", ")", null, 57);
            default:
                return fx3.g("RectRulers(", (String) obj, ")");
        }
    }

    public ui3(String str) {
        this.a = (byte) 1;
        this.f = str;
        this.b = new e63(null, (byte) 1);
        this.c = new e63(null, (byte) 0);
        this.d = new e63(null, (byte) 1);
        this.e = new e63(null, (byte) 0);
    }
}
