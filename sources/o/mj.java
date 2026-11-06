package o;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mj {
    public final qj a;
    public final int b;
    public final long c;
    public final ts7 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Code duplicated, block: B:102:0x0142  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0203  */
    /* JADX WARN: Code duplicated, block: B:137:0x0205  */
    /* JADX WARN: Code duplicated, block: B:139:0x021f  */
    /* JADX WARN: Code duplicated, block: B:141:0x023a  */
    /* JADX WARN: Code duplicated, block: B:143:0x023e A[LOOP:1: B:142:0x023c->B:143:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x0267  */
    /* JADX WARN: Code duplicated, block: B:147:0x026b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0283  */
    /* JADX WARN: Code duplicated, block: B:151:0x0299  */
    /* JADX WARN: Code duplicated, block: B:152:0x029b  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:141:0x023a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x026b, please report this as an issue */
    public mj(qj qjVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        ts7 ts7VarA;
        int i8;
        mj mjVar;
        int i9;
        int i10;
        int i11;
        Layout layout;
        Spanned spanned;
        jw6[] jw6VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i12;
        List list;
        int spanEnd;
        int iF;
        boolean z;
        boolean z2;
        boolean z3;
        int i13;
        int i14;
        CharSequence charSequence2 = qjVar.t;
        this.a = qjVar;
        this.b = i;
        this.c = j;
        if (r61.j(j) != 0 || r61.k(j) != 0) {
            li3.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            li3.a("maxLines should be greater than 0");
        }
        ot7 ot7Var = qjVar.n;
        if (i2 == 2) {
            i3 = 0;
            if (!qt7.a(ot7Var.a.h, h67.k(0)) && !qt7.a(ot7Var.a.h, qt7.c) && (i14 = ot7Var.b.a) != 0 && i14 != 5 && i14 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!m77.s(spannableString, pg3.class)) {
                    spannableString.setSpan(new pg3(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        gf5 gf5Var = ot7Var.b;
        int i15 = gf5Var.a;
        int i16 = i15 == 1 ? 3 : i15 == 2 ? 4 : i15 == 3 ? 2 : (i15 != 5 && i15 == 6) ? 1 : i3;
        int i17 = i15 == 4 ? 1 : i3;
        int i18 = gf5Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i19 = gf5Var.g;
        int i20 = i19 & 255;
        if (i20 == 1) {
            i4 = i3;
        } else if (i20 == 2) {
            i4 = 1;
        } else if (i20 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i21 = (i19 >> 8) & 255;
        if (i21 == 1) {
            i5 = i3;
        } else if (i21 == 2) {
            i5 = 1;
        } else if (i21 == 3) {
            i5 = 2;
        } else if (i21 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i22 = (i19 >> 16) & 255;
        if (i22 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i22 == 2 ? 1 : i3;
        }
        if (i2 == i6) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 != 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                    c = ' ';
                }
                ts7VarA = a(i16, i17, truncateAt, i, i18, i4, i5, i7, charSequence3);
                Layout layout2 = ts7VarA.f;
                i8 = i16;
                if (Build.VERSION.SDK_INT < 35 || qjVar.s.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                    mjVar = this;
                    i9 = i;
                    i10 = i8;
                    i11 = 2;
                } else {
                    int ellipsisStart = layout2.getEllipsisStart(0);
                    i11 = 2;
                    CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                    mjVar = this;
                    i9 = i;
                    i10 = i8;
                    ts7VarA = mjVar.a(i10, i17, truncateAt, i9, i18, i4, i5, i7, TextUtils.concat(charSequenceArr));
                }
                int i23 = ts7VarA.g;
                if (i2 == i11 || ts7VarA.a() <= r61.h(j) || i9 <= 1) {
                    mjVar.d = ts7VarA;
                } else {
                    int iH = r61.h(j);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if (ts7VarA.d(i24) > iH) {
                            i23 = i24;
                            break;
                        }
                    }
                    if (i23 >= 0 && i23 != mjVar.b) {
                        ts7VarA = mjVar.a(i10, i17, truncateAt, i23 < 1 ? 1 : i23, i18, i4, i5, i7, mjVar.e);
                    }
                    mjVar.d = ts7VarA;
                }
                mjVar.f = ts7VarA.a();
                mjVar.a.s.c(ot7Var.b(), (((long) Float.floatToRawIntBits(mjVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(mjVar.c())) << c), ot7Var.a.a.a());
                layout = ts7VarA.f;
                if (layout.getText() instanceof Spanned) {
                    CharSequence text = layout.getText();
                    text.getClass();
                    spanned = (Spanned) text;
                    if (spanned.nextSpanTransition(-1, spanned.length(), jw6.class) != spanned.length()) {
                        CharSequence text2 = layout.getText();
                        text2.getClass();
                        jw6VarArr = (jw6[]) ((Spanned) text2).getSpans(0, layout.getText().length(), jw6.class);
                    } else {
                        jw6VarArr = null;
                    }
                } else {
                    jw6VarArr = null;
                }
                if (jw6VarArr != null) {
                    for (jw6 jw6Var : jw6VarArr) {
                        jw6Var.f1208o.setValue(new y07((((long) Float.floatToRawIntBits(mjVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(mjVar.c())) << c)));
                    }
                }
                charSequence = mjVar.e;
                if (charSequence instanceof Spanned) {
                    spanned2 = (Spanned) charSequence;
                    Object[] spans = spanned2.getSpans(0, charSequence.length(), ml5.class);
                    arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        ml5 ml5Var = (ml5) obj;
                        int spanStart = spanned2.getSpanStart(ml5Var);
                        spanEnd = spanned2.getSpanEnd(ml5Var);
                        iF = mjVar.d.f(spanStart);
                        if (iF >= mjVar.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (mjVar.d.f.getEllipsisCount(iF) > 0 || spanEnd <= mjVar.d.f.getEllipsisStart(iF) + mjVar.d.f.getLineStart(iF)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (spanEnd > mjVar.d.e(iF)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && !z3 && !z) {
                            boolean z4 = mjVar.d.f.getParagraphDirection(iF) == 1;
                            boolean zIsRtlCharAt = mjVar.d.f.isRtlCharAt(spanStart);
                            if (z4 && !zIsRtlCharAt) {
                                mjVar.d.i(spanStart, false);
                                ml5Var.b();
                            } else if (z4 && zIsRtlCharAt) {
                                mjVar.d.j(spanStart, false);
                                ml5Var.b();
                            } else {
                                ts7 ts7Var = mjVar.d;
                                if (zIsRtlCharAt) {
                                    ts7Var.i(spanStart, false);
                                    ml5Var.b();
                                } else {
                                    ts7Var.j(spanStart, false);
                                    ml5Var.b();
                                }
                            }
                            throw null;
                        }
                        arrayList.add(null);
                    }
                    list = arrayList;
                } else {
                    list = ea2.m;
                }
                mjVar.g = list;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        truncateAt = truncateAt2;
        c = ' ';
        ts7VarA = a(i16, i17, truncateAt, i, i18, i4, i5, i7, charSequence3);
        Layout layout3 = ts7VarA.f;
        i8 = i16;
        if (Build.VERSION.SDK_INT < 35) {
            mjVar = this;
            i9 = i;
            i10 = i8;
            i11 = 2;
        } else {
            mjVar = this;
            i9 = i;
            i10 = i8;
            i11 = 2;
        }
        int i25 = ts7VarA.g;
        if (i2 == i11) {
            mjVar.d = ts7VarA;
        } else {
            mjVar.d = ts7VarA;
        }
        mjVar.f = ts7VarA.a();
        mjVar.a.s.c(ot7Var.b(), (((long) Float.floatToRawIntBits(mjVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(mjVar.c())) << c), ot7Var.a.a.a());
        layout = ts7VarA.f;
        if (layout.getText() instanceof Spanned) {
            jw6VarArr = null;
        } else {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned = (Spanned) text3;
            if (spanned.nextSpanTransition(-1, spanned.length(), jw6.class) != spanned.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                jw6VarArr = (jw6[]) ((Spanned) text4).getSpans(0, layout.getText().length(), jw6.class);
            } else {
                jw6VarArr = null;
            }
        }
        if (jw6VarArr != null) {
            while (i13 < r1) {
                jw6Var.f1208o.setValue(new y07((((long) Float.floatToRawIntBits(mjVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(mjVar.c())) << c)));
            }
        }
        charSequence = mjVar.e;
        if (charSequence instanceof Spanned) {
            list = ea2.m;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans2 = spanned2.getSpans(0, charSequence.length(), ml5.class);
            arrayList = new ArrayList(spans2.length);
            while (i12 < r4) {
                ml5 ml5Var2 = (ml5) obj;
                int spanStart2 = spanned2.getSpanStart(ml5Var2);
                spanEnd = spanned2.getSpanEnd(ml5Var2);
                iF = mjVar.d.f(spanStart2);
                if (iF >= mjVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (mjVar.d.f.getEllipsisCount(iF) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > mjVar.d.e(iF)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(null);
            }
            list = arrayList;
        }
        mjVar.g = list;
    }

    public final ts7 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        gm5 gm5Var;
        float fC = c();
        qj qjVar = this.a;
        hl hlVar = qjVar.s;
        int i8 = qjVar.x;
        o04 o04Var = qjVar.u;
        ot7 ot7Var = qjVar.n;
        nj njVar = oj.a;
        wm5 wm5Var = ot7Var.c;
        return new ts7(charSequence, fC, hlVar, i, truncateAt, i8, (wm5Var == null || (gm5Var = wm5Var.b) == null) ? false : gm5Var.a, i3, i5, i6, i7, i4, i2, o04Var);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    public final long b(v56 v56Var, int i, ds7 ds7Var) {
        un6 i03Var;
        int i2;
        int[] iArrE;
        RectF rectFK0 = ds1.k0(v56Var);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        t0 t0Var = new t0(ds7Var, (byte) 5);
        ts7 ts7Var = this.d;
        Layout layout = ts7Var.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArrE = q3.e(ts7Var, rectFK0, i3, t0Var);
        } else {
            yc4 yc4VarC = ts7Var.c();
            if (i3 == 1) {
                i03Var = new lh7(layout.getText(), ts7Var.k(), (byte) 15);
            } else {
                CharSequence text = layout.getText();
                i03Var = i4 >= 29 ? new i03(text, ts7Var.a) : new j03(text);
            }
            un6 un6Var = i03Var;
            int lineForVertical = layout.getLineForVertical((int) rectFK0.top);
            if (rectFK0.top <= ts7Var.d(lineForVertical) || (lineForVertical = lineForVertical + 1) < ts7Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFK0.bottom);
                if (lineForVertical2 != 0 || rectFK0.bottom >= ts7Var.h(0)) {
                    int iL = g57.l(ts7Var, layout, yc4VarC, i5, rectFK0, un6Var, t0Var, true);
                    while (true) {
                        i2 = i5;
                        if (iL != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iL = g57.l(ts7Var, layout, yc4VarC, i5, rectFK0, un6Var, t0Var, true);
                    }
                    if (iL == -1) {
                        iArrE = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iL2 = g57.l(ts7Var, layout, yc4VarC, i6, rectFK0, un6Var, t0Var, false);
                        while (iL2 == -1 && i2 < i6) {
                            i6--;
                            iL2 = g57.l(ts7Var, layout, yc4VarC, i6, rectFK0, un6Var, t0Var, false);
                        }
                        if (iL2 == -1) {
                            iArrE = null;
                        } else {
                            iArrE = new int[]{un6Var.c(iL + 1), un6Var.d(iL2 - 1)};
                        }
                    }
                } else {
                    iArrE = null;
                }
            } else {
                iArrE = null;
            }
        }
        return iArrE == null ? gt7.b : h57.a(iArrE[0], iArrE[1]);
    }

    public final float c() {
        return r61.i(this.c);
    }

    public final void d(ll0 ll0Var) {
        Canvas canvasB = dg.b(ll0Var);
        ts7 ts7Var = this.d;
        if (ts7Var.d) {
            canvasB.save();
            canvasB.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = ts7Var.h;
        if (canvasB.getClipBounds(ts7Var.f2140o)) {
            if (i != 0) {
                canvasB.translate(0.0f, i);
            }
            ThreadLocal threadLocal = xs7.a;
            Object so7Var = threadLocal.get();
            if (so7Var == null) {
                so7Var = new so7();
                threadLocal.set(so7Var);
            }
            so7 so7Var2 = (so7) so7Var;
            so7Var2.a = canvasB;
            try {
                ts7Var.f.draw(so7Var2);
                so7Var2.a = null;
                if (i != 0) {
                    canvasB.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                so7Var2.a = null;
                throw th;
            }
        }
        if (ts7Var.d) {
            canvasB.restore();
        }
    }

    public final void e(ll0 ll0Var, long j, lw6 lw6Var, vp7 vp7Var, v52 v52Var) {
        hl hlVar = this.a.s;
        byte b = hlVar.c;
        hlVar.d(j);
        hlVar.f(lw6Var);
        hlVar.g(vp7Var);
        hlVar.e(v52Var);
        hlVar.b(3);
        new i0(1, this, mj.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 16).invoke(ll0Var);
        hlVar.b(b);
    }

    public final void f(ll0 ll0Var, sb0 sb0Var, float f, lw6 lw6Var, vp7 vp7Var, v52 v52Var) {
        hl hlVar = this.a.s;
        byte b = hlVar.c;
        hlVar.c(sb0Var, (((long) Float.floatToRawIntBits(c())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        hlVar.f(lw6Var);
        hlVar.g(vp7Var);
        hlVar.e(v52Var);
        hlVar.b(3);
        new i0(1, this, mj.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 17).invoke(ll0Var);
        hlVar.b(b);
    }
}
