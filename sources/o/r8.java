package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r8 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public r8(c66 c66Var) {
        this.a = (byte) 0;
        this.c = new vo5(30);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.f = c66Var;
        this.g = new g95(this);
    }

    public static /* synthetic */ void r(r8 r8Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = r8Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        r8Var.q(i, str, str2);
        throw null;
    }

    public void A(int i) {
        ColorStateList colorStateListG;
        this.b = i;
        us usVar = (us) this.d;
        if (usVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (usVar) {
                colorStateListG = usVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        J(colorStateListG);
        b();
    }

    public String B(String str) {
        str.getClass();
        int i = this.b;
        try {
            if (g() == 6 && im3.n(D(), str)) {
                this.e = null;
                if (g() == 5) {
                    return D();
                }
            }
            return null;
        } finally {
            this.b = i;
            this.e = null;
        }
    }

    public byte C() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int iG = G(i);
            if (iG == -1) {
                this.b = iG;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iG);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iG;
                return e8.j(cCharAt);
            }
            i = iG + 1;
        }
    }

    public String D() {
        if (C() != 1) {
            return null;
        }
        String strL = l();
        this.e = strL;
        return strL;
    }

    public void E(q8 q8Var) {
        c66 c66Var = (c66) this.f;
        ((ArrayList) this.e).add(q8Var);
        byte b = q8Var.a;
        if (b == 1) {
            c66Var.d(q8Var.b, q8Var.d);
            return;
        }
        if (b == 2) {
            int i = q8Var.b;
            int i2 = q8Var.d;
            RecyclerView recyclerView = c66Var.m;
            recyclerView.T(i, i2, false);
            recyclerView.v0 = true;
            return;
        }
        if (b == 4) {
            c66Var.c(q8Var.b, q8Var.d, q8Var.c);
        } else if (b == 8) {
            c66Var.g(q8Var.b, q8Var.d);
        } else {
            an4.i(q8Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:104:0x019c  */
    /* JADX WARN: Code duplicated, block: B:188:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    public void F() {
        boolean z;
        byte b;
        q8 q8VarY;
        int i;
        int i2;
        int i3;
        q8 q8VarY2;
        boolean z2;
        boolean z3;
        Object obj;
        q8 q8Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        vo5 vo5Var = (vo5) this.c;
        c66 c66Var = (c66) this.f;
        g95 g95Var = (g95) this.g;
        ArrayList arrayList = (ArrayList) this.d;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((q8) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            r8 r8Var = (r8) g95Var.m;
            vo5 vo5Var2 = (vo5) r8Var.c;
            q8 q8Var2 = (q8) arrayList.get(size);
            q8 q8Var3 = (q8) arrayList.get(i12);
            byte b2 = q8Var3.a;
            if (b2 == 1) {
                int i13 = q8Var2.d;
                int i14 = q8Var3.b;
                int i15 = i13 < i14 ? -1 : 0;
                int i16 = q8Var2.b;
                if (i16 < i14) {
                    i15++;
                }
                if (i14 <= i16) {
                    q8Var2.b = i16 + q8Var3.d;
                }
                int i17 = q8Var3.b;
                if (i17 <= i13) {
                    q8Var2.d = i13 + q8Var3.d;
                }
                q8Var3.b = i17 + i15;
                arrayList.set(size, q8Var3);
                arrayList.set(i12, q8Var2);
            } else if (b2 == 2) {
                int i18 = q8Var2.b;
                int i19 = q8Var2.d;
                int i20 = q8Var3.b;
                if (i18 < i19) {
                    if (i20 == i18 && q8Var3.d == i19 - i18) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i20 == i19 + 1 && q8Var3.d == i18 - i19) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i19 < i20) {
                    i20--;
                    q8Var3.b = i20;
                } else {
                    int i21 = q8Var3.d;
                    if (i19 < i20 + i21) {
                        q8Var3.d = i21 - 1;
                        q8Var2.a = (byte) 2;
                        q8Var2.d = 1;
                        if (q8Var3.d == 0) {
                            arrayList.remove(i12);
                            q8Var3.c = null;
                            vo5Var2.c(q8Var3);
                        }
                    }
                }
                int i22 = q8Var2.b;
                if (i22 <= i20) {
                    q8Var3.b = i20 + 1;
                } else {
                    int i23 = i20 + q8Var3.d;
                    if (i22 < i23) {
                        obj = null;
                        q8 q8VarY3 = r8Var.y(null, 2, i22 + 1, i23 - i22);
                        q8Var3.d = q8Var2.b - q8Var3.b;
                        q8Var = q8VarY3;
                    }
                    if (z3) {
                        arrayList.set(size, q8Var3);
                        arrayList.remove(i12);
                        q8Var2.c = obj;
                        vo5Var2.c(q8Var2);
                    } else {
                        if (z2) {
                            if (q8Var != null) {
                                i10 = q8Var2.b;
                                if (i10 > q8Var.b) {
                                    q8Var2.b = i10 - q8Var.d;
                                }
                                i11 = q8Var2.d;
                                if (i11 > q8Var.b) {
                                    q8Var2.d = i11 - q8Var.d;
                                }
                            }
                            i8 = q8Var2.b;
                            if (i8 > q8Var3.b) {
                                q8Var2.b = i8 - q8Var3.d;
                            }
                            i9 = q8Var2.d;
                            if (i9 > q8Var3.b) {
                                q8Var2.d = i9 - q8Var3.d;
                            }
                        } else {
                            if (q8Var != null) {
                                i6 = q8Var2.b;
                                if (i6 >= q8Var.b) {
                                    q8Var2.b = i6 - q8Var.d;
                                }
                                i7 = q8Var2.d;
                                if (i7 >= q8Var.b) {
                                    q8Var2.d = i7 - q8Var.d;
                                }
                            }
                            i4 = q8Var2.b;
                            if (i4 >= q8Var3.b) {
                                q8Var2.b = i4 - q8Var3.d;
                            }
                            i5 = q8Var2.d;
                            if (i5 >= q8Var3.b) {
                                q8Var2.d = i5 - q8Var3.d;
                            }
                        }
                        arrayList.set(size, q8Var3);
                        if (q8Var2.b != q8Var2.d) {
                            arrayList.set(i12, q8Var2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (q8Var != null) {
                            arrayList.add(size, q8Var);
                        }
                    }
                }
                obj = null;
                q8Var = null;
                if (z3) {
                    arrayList.set(size, q8Var3);
                    arrayList.remove(i12);
                    q8Var2.c = obj;
                    vo5Var2.c(q8Var2);
                } else {
                    if (z2) {
                        if (q8Var != null) {
                            i10 = q8Var2.b;
                            if (i10 > q8Var.b) {
                                q8Var2.b = i10 - q8Var.d;
                            }
                            i11 = q8Var2.d;
                            if (i11 > q8Var.b) {
                                q8Var2.d = i11 - q8Var.d;
                            }
                        }
                        i8 = q8Var2.b;
                        if (i8 > q8Var3.b) {
                            q8Var2.b = i8 - q8Var3.d;
                        }
                        i9 = q8Var2.d;
                        if (i9 > q8Var3.b) {
                            q8Var2.d = i9 - q8Var3.d;
                        }
                    } else {
                        if (q8Var != null) {
                            i6 = q8Var2.b;
                            if (i6 >= q8Var.b) {
                                q8Var2.b = i6 - q8Var.d;
                            }
                            i7 = q8Var2.d;
                            if (i7 >= q8Var.b) {
                                q8Var2.d = i7 - q8Var.d;
                            }
                        }
                        i4 = q8Var2.b;
                        if (i4 >= q8Var3.b) {
                            q8Var2.b = i4 - q8Var3.d;
                        }
                        i5 = q8Var2.d;
                        if (i5 >= q8Var3.b) {
                            q8Var2.d = i5 - q8Var3.d;
                        }
                    }
                    arrayList.set(size, q8Var3);
                    if (q8Var2.b != q8Var2.d) {
                        arrayList.set(i12, q8Var2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (q8Var != null) {
                        arrayList.add(size, q8Var);
                    }
                }
            } else if (b2 == 4) {
                int i24 = q8Var2.d;
                int i25 = q8Var3.b;
                if (i24 < i25) {
                    q8Var3.b = i25 - 1;
                } else {
                    int i26 = q8Var3.d;
                    if (i24 < i25 + i26) {
                        q8Var3.d = i26 - 1;
                        q8VarY = r8Var.y(q8Var3.c, 4, q8Var2.b, 1);
                    }
                    i = q8Var2.b;
                    i2 = q8Var3.b;
                    if (i <= i2) {
                        q8Var3.b = i2 + 1;
                    } else {
                        i3 = i2 + q8Var3.d;
                        if (i < i3) {
                            int i27 = i3 - i;
                            q8VarY2 = r8Var.y(q8Var3.c, 4, i + 1, i27);
                            q8Var3.d -= i27;
                        }
                        arrayList.set(i12, q8Var2);
                        if (q8Var3.d > 0) {
                            arrayList.set(size, q8Var3);
                        } else {
                            arrayList.remove(size);
                            q8Var3.c = null;
                            vo5Var2.c(q8Var3);
                        }
                        if (q8VarY != null) {
                            arrayList.add(size, q8VarY);
                        }
                        if (q8VarY2 != null) {
                            arrayList.add(size, q8VarY2);
                        }
                    }
                    q8VarY2 = null;
                    arrayList.set(i12, q8Var2);
                    if (q8Var3.d > 0) {
                        arrayList.set(size, q8Var3);
                    } else {
                        arrayList.remove(size);
                        q8Var3.c = null;
                        vo5Var2.c(q8Var3);
                    }
                    if (q8VarY != null) {
                        arrayList.add(size, q8VarY);
                    }
                    if (q8VarY2 != null) {
                        arrayList.add(size, q8VarY2);
                    }
                }
                q8VarY = null;
                i = q8Var2.b;
                i2 = q8Var3.b;
                if (i <= i2) {
                    q8Var3.b = i2 + 1;
                } else {
                    i3 = i2 + q8Var3.d;
                    if (i < i3) {
                        int i28 = i3 - i;
                        q8VarY2 = r8Var.y(q8Var3.c, 4, i + 1, i28);
                        q8Var3.d -= i28;
                    }
                    arrayList.set(i12, q8Var2);
                    if (q8Var3.d > 0) {
                        arrayList.set(size, q8Var3);
                    } else {
                        arrayList.remove(size);
                        q8Var3.c = null;
                        vo5Var2.c(q8Var3);
                    }
                    if (q8VarY != null) {
                        arrayList.add(size, q8VarY);
                    }
                    if (q8VarY2 != null) {
                        arrayList.add(size, q8VarY2);
                    }
                }
                q8VarY2 = null;
                arrayList.set(i12, q8Var2);
                if (q8Var3.d > 0) {
                    arrayList.set(size, q8Var3);
                } else {
                    arrayList.remove(size);
                    q8Var3.c = null;
                    vo5Var2.c(q8Var3);
                }
                if (q8VarY != null) {
                    arrayList.add(size, q8VarY);
                }
                if (q8VarY2 != null) {
                    arrayList.add(size, q8VarY2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i29 = 0; i29 < size2; i29++) {
            q8 q8VarY4 = (q8) arrayList.get(i29);
            byte b3 = q8VarY4.a;
            if (b3 == 1) {
                E(q8VarY4);
            } else if (b3 == 2) {
                int i30 = q8VarY4.b;
                int i31 = q8VarY4.d + i30;
                int i32 = i30;
                int i33 = 0;
                byte b4 = -1;
                while (i32 < i31) {
                    if (c66Var.b(i32) != null || d(i32)) {
                        if (b4 == 0) {
                            o(y(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b4 == 1) {
                            E(y(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i32 -= i33;
                        i31 -= i33;
                        i33 = 1;
                    } else {
                        i33++;
                    }
                    i32++;
                    b4 = b;
                }
                if (i33 != q8VarY4.d) {
                    q8VarY4.c = null;
                    vo5Var.c(q8VarY4);
                    q8VarY4 = y(null, 2, i30, i33);
                }
                if (b4 == 0) {
                    o(q8VarY4);
                } else {
                    E(q8VarY4);
                }
            } else if (b3 == 4) {
                int i34 = q8VarY4.b;
                int i35 = q8VarY4.d + i34;
                int i36 = i34;
                int i37 = 0;
                byte b5 = -1;
                while (i34 < i35) {
                    if (c66Var.b(i34) != null || d(i34)) {
                        if (b5 == 0) {
                            o(y(q8VarY4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 1;
                    } else {
                        if (b5 == 1) {
                            E(y(q8VarY4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 0;
                    }
                    i37++;
                    i34++;
                }
                if (i37 != q8VarY4.d) {
                    Object obj2 = q8VarY4.c;
                    q8VarY4.c = null;
                    vo5Var.c(q8VarY4);
                    q8VarY4 = y(obj2, 4, i36, i37);
                }
                if (b5 == 0) {
                    o(q8VarY4);
                } else {
                    E(q8VarY4);
                }
            } else if (b3 == 8) {
                E(q8VarY4);
            }
        }
        arrayList.clear();
    }

    public int G(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    public void H(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q8 q8Var = (q8) arrayList.get(i);
            q8Var.c = null;
            ((vo5) this.c).c(q8Var);
        }
        arrayList.clear();
    }

    public void I(e63 e63Var) {
        int iW0 = cx.W0(e63Var, (e63[]) this.c);
        if (iW0 >= 0) {
            e63[] e63VarArr = (e63[]) this.c;
            int i = iW0 + 1;
            cx.G0(iW0, i, this.b, e63VarArr, e63VarArr);
            e63[] e63VarArr2 = (e63[]) this.c;
            int i2 = this.b;
            e63VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.d;
            System.arraycopy(fArr, i, fArr, iW0, i2 - i);
            byte[] bArr = (byte[]) this.e;
            cx.E0(iW0, i, this.b, bArr, bArr);
            this.b--;
        }
    }

    public void J(ColorStateList colorStateList) {
        if (colorStateList != null) {
            y41 y41Var = (y41) this.e;
            if (y41Var == null) {
                y41Var = new y41();
                this.e = y41Var;
            }
            y41Var.c = colorStateList;
            y41Var.b = true;
        } else {
            this.e = null;
        }
        b();
    }

    public void K(ColorStateList colorStateList) {
        y41 y41Var = (y41) this.f;
        if (y41Var == null) {
            y41Var = new y41();
            this.f = y41Var;
        }
        y41Var.c = colorStateList;
        y41Var.b = true;
        b();
    }

    public void L(PorterDuff.Mode mode) {
        y41 y41Var = (y41) this.f;
        if (y41Var == null) {
            y41Var = new y41();
            this.f = y41Var;
        }
        y41Var.d = mode;
        y41Var.a = true;
        b();
    }

    public int M() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean N() {
        int iM = M();
        String str = (String) this.g;
        if (iM >= str.length() || iM == -1 || str.charAt(iM) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public void O(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strM = m();
                this.b = i;
                if (im3.n(strM, "null")) {
                    q(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strA = e8.A(e8.j(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        r(this, fx3.h("Expected ", strA, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int P(int i, int i2) {
        int i3;
        int i4;
        vo5 vo5Var = (vo5) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q8 q8Var = (q8) arrayList.get(size);
            byte b = q8Var.a;
            int i5 = q8Var.b;
            if (b == 8) {
                int i6 = q8Var.d;
                if (i5 < i6) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i < i3 || i > i4) {
                    if (i < i5) {
                        if (i2 == 1) {
                            q8Var.b = i5 + 1;
                            q8Var.d = i6 + 1;
                        } else if (i2 == 2) {
                            q8Var.b = i5 - 1;
                            q8Var.d = i6 - 1;
                        }
                    }
                } else if (i3 == i5) {
                    if (i2 == 1) {
                        q8Var.d = i6 + 1;
                    } else if (i2 == 2) {
                        q8Var.d = i6 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        q8Var.b = i5 + 1;
                    } else if (i2 == 2) {
                        q8Var.b = i5 - 1;
                    }
                    i--;
                }
            } else if (i5 <= i) {
                if (b == 1) {
                    i -= q8Var.d;
                } else if (b == 2) {
                    i += q8Var.d;
                }
            } else if (i2 == 1) {
                q8Var.b = i5 + 1;
            } else if (i2 == 2) {
                q8Var.b = i5 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            q8 q8Var2 = (q8) arrayList.get(size2);
            byte b2 = q8Var2.a;
            int i7 = q8Var2.d;
            if (b2 == 8) {
                if (i7 == q8Var2.b || i7 < 0) {
                    arrayList.remove(size2);
                    q8Var2.c = null;
                    vo5Var.c(q8Var2);
                }
            } else if (i7 <= 0) {
                arrayList.remove(size2);
                q8Var2.c = null;
                vo5Var.c(q8Var2);
            }
        }
        return i;
    }

    public int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (t(i + 3, charSequence) + (t(i, charSequence) << 12) + (t(i + 1, charSequence) << 8) + (t(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((y41) this.e) != null) {
                y41 y41Var = (y41) this.g;
                if (y41Var == null) {
                    y41Var = new y41();
                    this.g = y41Var;
                }
                y41Var.c = null;
                y41Var.b = false;
                y41Var.d = null;
                y41Var.a = false;
                WeakHashMap weakHashMap = be8.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    y41Var.b = true;
                    y41Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    y41Var.a = true;
                    y41Var.d = backgroundTintMode;
                }
                if (y41Var.b || y41Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = us.b;
                    bc6.i(background, y41Var, drawableState);
                    return;
                }
            }
            y41 y41Var2 = (y41) this.f;
            if (y41Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = us.b;
                bc6.i(background, y41Var2, drawableState2);
            } else {
                y41 y41Var3 = (y41) this.e;
                if (y41Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = us.b;
                    bc6.i(background, y41Var3, drawableState3);
                }
            }
        }
    }

    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public boolean d(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q8 q8Var = (q8) arrayList.get(i2);
            byte b = q8Var.a;
            if (b != 8) {
                if (b == 1) {
                    int i3 = q8Var.b;
                    int i4 = q8Var.d + i3;
                    while (i3 < i4) {
                        if (s(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (s(q8Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(int i, String str) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                r(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String f() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        i('\"');
        int i = this.b;
        int iY = ub7.Y(str, '\"', i, 4);
        if (iY == -1) {
            m();
            int i2 = this.b;
            r(this, fx3.g("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iY) {
            if (str.charAt(i3) == '\\') {
                int iG = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iG, i3);
                        int iG2 = G(i3 + 1);
                        if (iG2 == -1) {
                            r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iG2 + 1;
                        char cCharAt2 = str.charAt(iG2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c = cCharAt2 < 'u' ? on0.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iG = G(iA);
                        if (iG == -1) {
                            r(this, "Unexpected EOF", iG, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iG, i3);
                            iG = G(i3);
                            if (iG == -1) {
                                r(this, "Unexpected EOF", iG, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iG;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iG, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iG, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iY + 1;
        return str.substring(i, iY);
    }

    public byte g() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return e8.j(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte h(byte b) {
        String str = (String) this.g;
        byte bG = g();
        if (bG == b) {
            return bG;
        }
        String strA = e8.A(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        r(this, fx3.h("Expected ", strA, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void i(char c) {
        int i = this.b;
        if (i == -1) {
            O(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                O(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        O(c);
        throw null;
    }

    public long j() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        double dPow;
        int iG = G(M());
        String str = (String) this.g;
        if (iG >= str.length() || iG == -1) {
            r(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iG) == '\"') {
            iG++;
            if (iG == str.length()) {
                r(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iG;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                z3 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z;
                if (cCharAt == '-' && z5) {
                    if (i == iG) {
                        r(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z5) {
                    z3 = z5;
                    if (cCharAt != '-') {
                        if (e8.j(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j3 = (j3 * 10) - ((long) i3);
                            if (j3 > 0) {
                                r(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z5 = z3;
                    } else {
                        if (i != iG) {
                            r(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = z3;
                        z6 = true;
                    }
                } else {
                    if (i == iG) {
                        r(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = true;
                }
            } else {
                if (i == iG) {
                    r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iG;
        if (iG == i || (z6 && iG == i - 1)) {
            r(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z2) {
            if (!z7) {
                r(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                r(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z3) {
            double d = j4;
            if (!z4) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z4) {
                    gk0.s();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                r(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                r(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z6) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        r(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c66) this.f).a((q8) arrayList.get(i));
        }
        H(arrayList);
        this.b = 0;
    }

    public String l() {
        String str = (String) this.e;
        if (str == null) {
            return f();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    public String m() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        String str2 = (String) this.e;
        if (str2 != null) {
            str2.getClass();
            this.e = null;
            return str2;
        }
        int iM = M();
        if (iM >= str.length() || iM == -1) {
            r(this, "EOF", iM, null, 4);
            throw null;
        }
        byte bJ = e8.j(str.charAt(iM));
        if (bJ == 1) {
            return l();
        }
        if (bJ != 0) {
            r(this, "Expected beginning of the string, but got " + str.charAt(iM), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (e8.j(str.charAt(iM)) == 0) {
            iM++;
            if (iM >= str.length()) {
                sb.append((CharSequence) str, this.b, iM);
                int iG = G(iM);
                if (iG == -1) {
                    this.b = iM;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM = iG;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iM);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iM).toString();
        }
        this.b = iM;
        return string;
    }

    public void n() {
        c66 c66Var = (c66) this.f;
        k();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q8 q8Var = (q8) arrayList.get(i);
            byte b = q8Var.a;
            if (b == 1) {
                c66Var.a(q8Var);
                c66Var.d(q8Var.b, q8Var.d);
            } else if (b == 2) {
                c66Var.a(q8Var);
                int i2 = q8Var.b;
                int i3 = q8Var.d;
                RecyclerView recyclerView = c66Var.m;
                recyclerView.T(i2, i3, true);
                recyclerView.v0 = true;
                recyclerView.s0.c += i3;
            } else if (b == 4) {
                c66Var.a(q8Var);
                c66Var.c(q8Var.b, q8Var.d, q8Var.c);
            } else if (b == 8) {
                c66Var.a(q8Var);
                c66Var.g(q8Var.b, q8Var.d);
            }
        }
        H(arrayList);
        this.b = 0;
    }

    public void o(q8 q8Var) {
        int i;
        vo5 vo5Var = (vo5) this.c;
        byte b = q8Var.a;
        if (b == 1 || b == 8) {
            hk0.g("should not dispatch add or move for pre layout");
            return;
        }
        int iP = P(q8Var.b, b);
        int i2 = q8Var.b;
        byte b2 = q8Var.a;
        if (b2 == 2) {
            i = 0;
        } else {
            if (b2 != 4) {
                an4.i(q8Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i3 = 1;
        for (int i4 = 1; i4 < q8Var.d; i4++) {
            int iP2 = P((i * i4) + q8Var.b, q8Var.a);
            byte b3 = q8Var.a;
            if (b3 == 2 ? iP2 != iP : !(b3 == 4 && iP2 == iP + 1)) {
                q8 q8VarY = y(q8Var.c, b3, iP, i3);
                p(q8VarY, i2);
                q8VarY.c = null;
                vo5Var.c(q8VarY);
                if (q8Var.a == 4) {
                    i2 += i3;
                }
                i3 = 1;
                iP = iP2;
            } else {
                i3++;
            }
        }
        Object obj = q8Var.c;
        q8Var.c = null;
        vo5Var.c(q8Var);
        if (i3 > 0) {
            q8 q8VarY2 = y(obj, q8Var.a, iP, i3);
            p(q8VarY2, i2);
            q8VarY2.c = null;
            vo5Var.c(q8VarY2);
        }
    }

    public void p(q8 q8Var, int i) {
        c66 c66Var = (c66) this.f;
        c66Var.a(q8Var);
        byte b = q8Var.a;
        if (b != 2) {
            if (b == 4) {
                c66Var.c(i, q8Var.d, q8Var.c);
                return;
            } else {
                hk0.g("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i2 = q8Var.d;
        RecyclerView recyclerView = c66Var.m;
        recyclerView.T(i, i2, true);
        recyclerView.v0 = true;
        recyclerView.s0.c += i2;
    }

    public void q(int i, String str, String str2) {
        String strF = ((gy8) this.d).f();
        String str3 = (String) this.g;
        str3.getClass();
        throw new jq3(vs1.u(str, strF, i, str2, ((dq3) this.c).g ? vs1.I(i, str3).toString() : null));
    }

    public int s(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i2 < size) {
            q8 q8Var = (q8) arrayList.get(i2);
            byte b = q8Var.a;
            int i3 = q8Var.b;
            if (b == 8) {
                if (i3 == i) {
                    i = q8Var.d;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (q8Var.d <= i) {
                        i++;
                    }
                }
            } else if (i3 > i) {
                continue;
            } else if (b == 2) {
                int i4 = q8Var.d;
                if (i < i3 + i4) {
                    return -1;
                }
                i -= i4;
            } else if (b == 1) {
                i += q8Var.d;
            }
            i2++;
        }
        return i;
    }

    public int t(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                return e41.j(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public ColorStateList u() {
        y41 y41Var = (y41) this.f;
        if (y41Var != null) {
            return (ColorStateList) y41Var.c;
        }
        return null;
    }

    public PorterDuff.Mode v() {
        y41 y41Var = (y41) this.f;
        if (y41Var != null) {
            return (PorterDuff.Mode) y41Var.d;
        }
        return null;
    }

    public boolean w() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void x(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.c;
        Context context = view.getContext();
        int[] iArr = zz5.A;
        ep3 ep3VarX = ep3.x(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        View view2 = (View) this.c;
        be8.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) ep3VarX.f733o, i);
        try {
            if (typedArray.hasValue(0)) {
                this.b = typedArray.getResourceId(0, -1);
                us usVar = (us) this.d;
                Context context2 = view.getContext();
                int i2 = this.b;
                synchronized (usVar) {
                    colorStateListG = usVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    J(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(ep3VarX.i(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(h62.c(typedArray.getInt(2, -1), null));
            }
            ep3VarX.B();
        } catch (Throwable th) {
            ep3VarX.B();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q8 y(Object obj, int i, int i2, int i3) {
        q8 q8Var = (q8) ((vo5) this.c).a();
        if (q8Var != null) {
            q8Var.a = i;
            q8Var.b = i2;
            q8Var.d = i3;
            q8Var.c = obj;
            return q8Var;
        }
        q8 q8Var2 = new q8();
        q8Var2.a = i;
        q8Var2.b = i2;
        q8Var2.d = i3;
        q8Var2.c = obj;
        return q8Var2;
    }

    public void z() {
        this.b = -1;
        J(null);
        b();
    }

    public r8(View view) {
        this.a = (byte) 1;
        this.b = -1;
        this.c = view;
        this.d = us.a();
    }

    public r8(String str, dq3 dq3Var) {
        this.a = (byte) 3;
        str.getClass();
        this.c = dq3Var;
        this.d = new gy8(dq3Var);
        this.f = new StringBuilder();
        this.g = str;
    }

    public r8() {
        this.a = (byte) 2;
        this.c = new e63[32];
        this.d = new float[32];
        this.e = new byte[32];
        kx4 kx4Var = ui6.a;
        this.f = new kx4();
        this.g = new kx4();
    }
}
