package o;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k64 {
    public final View a;
    public final cj3 b;
    public j64 e;
    public pr7 f;
    public ee8 g;
    public Rect l;
    public final u54 m;
    public Function1 c = new ek3(10);
    public Function1 d = new ek3(11);
    public zr7 h = new zr7(4, gt7.b, "");
    public bf3 i = bf3.g;
    public final ArrayList j = new ArrayList();
    public final u14 k = ds1.X(l54.n, new vm3((Object) this, (byte) 3));

    public k64(View view, zi ziVar, cj3 cj3Var) {
        this.a = view;
        this.b = cj3Var;
        this.m = new u54(ziVar, cj3Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[PHI: r15
      0x00a5: PHI (r15v5 int) = (r15v0 int), (r15v4 int) binds: [B:36:0x00a3, B:48:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    public final t56 a(EditorInfo editorInfo) {
        int i;
        int i2;
        zr7 zr7Var = this.h;
        String str = zr7Var.a.n;
        long j = zr7Var.b;
        bf3 bf3Var = this.i;
        int i3 = bf3Var.e;
        int i4 = bf3Var.d;
        boolean z = bf3Var.a;
        int i5 = 3;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                hk0.l("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        kd4 kd4Var = bf3Var.f;
        byte b = 10;
        if (im3.n(kd4Var, kd4.f1251o)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(mv0.Z(kd4Var, 10));
            Iterator it = kd4Var.m.iterator();
            while (it.hasNext()) {
                arrayList.add(((jd4) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = i5;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else {
                    i5 = 18;
                    if (i4 == 8) {
                        i2 = i5;
                    } else if (i4 == 9) {
                        i2 = 8194;
                    } else if (i4 == 10) {
                        i2 = 145;
                    } else if (i4 == 11) {
                        i2 = 113;
                    } else if (i4 == 12) {
                        i2 = 97;
                    } else if (i4 == 13) {
                        i2 = 49;
                    } else if (i4 == 14) {
                        i2 = 65;
                    } else if (i4 == 15) {
                        i2 = 81;
                    } else if (i4 == 16) {
                        i2 = 177;
                    } else if (i4 == 17) {
                        i2 = 193;
                    } else if (i4 == 18) {
                        i2 = 4;
                    } else {
                        i2 = 20;
                        if (i4 != 19) {
                            if (i4 == 20) {
                                i2 = 36;
                            } else if (i4 == 21) {
                                i2 = 4098;
                            } else if (i4 == 22) {
                                i2 = 12290;
                            } else if (i4 == 23) {
                                i2 = 8210;
                            } else if (i4 == 24) {
                                i2 = 4114;
                            } else {
                                if (i4 != 25) {
                                    hk0.l("Invalid Keyboard Type");
                                    return null;
                                }
                                i2 = 12306;
                            }
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (bf3Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 15) == 1) {
            int i6 = bf3Var.b;
            if (i6 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i6 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i6 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (bf3Var.c) {
                i2 |= 32768;
                editorInfo.inputType = i2;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType = 2097152 | i2;
            }
        }
        int i7 = gt7.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        vt1.L(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!cd7.a || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            if (Build.VERSION.SDK_INT >= 35) {
                i82.b(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                i82.b(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(qf0.L(w7.l(), w7.y(), w7.u(), w7.w(), w7.z(), w7.A(), w7.B()));
            editorInfo.setSupportedHandwritingGesturePreviews(cx.h1(new Class[]{w7.l(), w7.y(), w7.u(), w7.w()}));
        }
        g64 g64Var = h64.a;
        if (a92.d()) {
            a92.a().i(editorInfo);
        }
        t56 t56Var = new t56(this.h, new nx3(this, b), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(t56Var));
        return t56Var;
    }
}
