package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import io.sentry.m7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import o.cf5;
import o.ct1;
import o.qf0;
import o.u14;
import o.vd5;
import o.vn4;
import o.vs7;
import o.xu4;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends yz3 implements Function1 {
    public final /* synthetic */ e n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bitmap f171o;
    public final /* synthetic */ Matrix p;
    public final /* synthetic */ ArrayList q;
    public final /* synthetic */ Canvas r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Bitmap bitmap, Matrix matrix, ArrayList arrayList, Canvas canvas) {
        super(1);
        this.n = eVar;
        this.f171o = bitmap;
        this.p = matrix;
        this.q = arrayList;
        this.r = canvas;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vd5 vd5Var;
        vd5 vd5Var2;
        Integer num;
        int lineCount;
        List listK;
        float lineRight;
        int lineTop;
        int lineBottom;
        int i;
        io.sentry.android.replay.viewhierarchy.g gVar = (io.sentry.android.replay.viewhierarchy.g) obj;
        e eVar = this.n;
        u14 u14Var = eVar.f172o;
        u14 u14Var2 = eVar.m;
        gVar.getClass();
        if (gVar.d && gVar.a > 0 && gVar.b > 0) {
            Rect rect = gVar.f;
            if (rect == null) {
                return Boolean.FALSE;
            }
            Integer numValueOf = null;
            int iIntValue = -16777216;
            if (gVar instanceof io.sentry.android.replay.viewhierarchy.d) {
                List listK2 = qf0.K(rect);
                Rect rect2 = gVar.f;
                Bitmap bitmap = this.f171o;
                if (!bitmap.isRecycled() && !((Bitmap) u14Var2.getValue()).isRecycled()) {
                    Rect rect3 = new Rect(rect2);
                    RectF rectF = new RectF(rect3);
                    Matrix matrix = this.p;
                    if (matrix != null) {
                        matrix.mapRect(rectF);
                    }
                    rectF.round(rect3);
                    ((Canvas) eVar.n.getValue()).drawBitmap(bitmap, rect3, new Rect(0, 0, 1, 1), (Paint) null);
                    iIntValue = ((Bitmap) u14Var2.getValue()).getPixel(0, 0);
                }
                vd5Var2 = new vd5(listK2, Integer.valueOf(iIntValue));
            } else {
                if (gVar instanceof io.sentry.android.replay.viewhierarchy.f) {
                    io.sentry.android.replay.viewhierarchy.f fVar = (io.sentry.android.replay.viewhierarchy.f) gVar;
                    m7 m7Var = fVar.h;
                    if (m7Var != null) {
                        switch (m7Var.m) {
                            case 2:
                                Layout layout = (Layout) m7Var.n;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
                                    foregroundColorSpanArr.getClass();
                                    int i2 = Integer.MIN_VALUE;
                                    Integer numValueOf2 = null;
                                    for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
                                        CharSequence text3 = layout.getText();
                                        text3.getClass();
                                        int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
                                        if (spanStart != -1 && spanEnd != -1 && (i = spanEnd - spanStart) > i2) {
                                            numValueOf2 = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                                            i2 = i;
                                        }
                                    }
                                    if (numValueOf2 != null) {
                                        numValueOf = Integer.valueOf(numValueOf2.intValue() | (-16777216));
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                break;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            num = fVar.i;
                            if (num != null) {
                                iIntValue = num.intValue();
                            }
                        }
                    } else {
                        num = fVar.i;
                        if (num != null) {
                            iIntValue = num.intValue();
                        }
                    }
                    Rect rect4 = gVar.f;
                    int i3 = fVar.j;
                    int i4 = fVar.k;
                    rect4.getClass();
                    if (m7Var == null) {
                        listK = qf0.K(rect4);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        switch (m7Var.m) {
                            case 2:
                                lineCount = ((Layout) m7Var.n).getLineCount();
                                break;
                            default:
                                lineCount = ((vs7) m7Var.n).b.f;
                                break;
                        }
                        for (int i5 = 0; i5 < lineCount; i5++) {
                            float lineLeft = 0.0f;
                            switch (m7Var.m) {
                                case 2:
                                    Layout layout2 = (Layout) m7Var.n;
                                    if (layout2.getEllipsizedWidth() <= 0 || layout2.getEllipsizedWidth() >= layout2.getWidth()) {
                                        lineLeft = layout2.getLineLeft(i5);
                                    }
                                    break;
                                default:
                                    vs7 vs7Var = (vs7) m7Var.n;
                                    if (vs7Var.b.d <= ((int) (vs7Var.c >> 32))) {
                                        lineLeft = vs7Var.e(i5);
                                    }
                                    break;
                            }
                            int i6 = (int) lineLeft;
                            switch (m7Var.m) {
                                case 2:
                                    Layout layout3 = (Layout) m7Var.n;
                                    lineRight = (layout3.getEllipsizedWidth() <= 0 || layout3.getEllipsizedWidth() >= layout3.getWidth()) ? layout3.getLineRight(i5) : layout3.getEllipsizedWidth();
                                    break;
                                default:
                                    vs7 vs7Var2 = (vs7) m7Var.n;
                                    xu4 xu4Var = vs7Var2.b;
                                    if (xu4Var.d > ((float) ((int) (vs7Var2.c >> 32)))) {
                                        xu4Var.m(i5);
                                        ArrayList arrayList2 = xu4Var.h;
                                        cf5 cf5Var = (cf5) arrayList2.get(ct1.G(i5, arrayList2));
                                        lineRight = cf5Var.a.d.f.getLineWidth(i5 - cf5Var.d);
                                    } else {
                                        lineRight = vs7Var2.f(i5);
                                    }
                                    break;
                            }
                            int i7 = (int) lineRight;
                            switch (m7Var.m) {
                                case 2:
                                    lineTop = ((Layout) m7Var.n).getLineTop(i5);
                                    break;
                                default:
                                    lineTop = vn4.s0(((vs7) m7Var.n).b.f(i5));
                                    break;
                            }
                            switch (m7Var.m) {
                                case 2:
                                    lineBottom = ((Layout) m7Var.n).getLineBottom(i5);
                                    break;
                                default:
                                    lineBottom = vn4.s0(((vs7) m7Var.n).b.b(i5));
                                    break;
                            }
                            Rect rect5 = new Rect();
                            rect5.left = rect4.left + i3 + i6;
                            rect5.right = rect4.left + i3 + i7;
                            int i8 = rect4.top + i4 + lineTop;
                            rect5.top = i8;
                            rect5.bottom = (lineBottom - lineTop) + i8;
                            arrayList.add(rect5);
                        }
                        listK = arrayList;
                    }
                    vd5Var = new vd5(listK, Integer.valueOf(iIntValue));
                } else {
                    vd5Var = new vd5(qf0.K(rect), -16777216);
                }
                vd5Var2 = vd5Var;
            }
            List list = (List) vd5Var2.m;
            ((Paint) u14Var.getValue()).setColor(((Number) vd5Var2.n).intValue());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.r.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) u14Var.getValue());
            }
            this.q.addAll(list);
        }
        return Boolean.TRUE;
    }
}
