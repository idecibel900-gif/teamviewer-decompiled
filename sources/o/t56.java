package o;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class t56 implements InputConnection {
    public final nx3 a;
    public final boolean b;
    public final j64 c;
    public final pr7 d;
    public final ee8 e;
    public int f;
    public zr7 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public t56(zr7 zr7Var, nx3 nx3Var, boolean z, j64 j64Var, pr7 pr7Var, ee8 ee8Var) {
        this.a = nx3Var;
        this.b = z;
        this.c = j64Var;
        this.d = pr7Var;
        this.e = ee8Var;
        this.g = zr7Var;
    }

    public final void a(e82 e82Var) {
        this.f++;
        try {
            this.j.add(e82Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((k64) this.a.n).c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((k64) this.a.n).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (im3.n(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new cx0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new dn1(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new en1(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new ql2());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        zr7 zr7Var = this.g;
        return TextUtils.getCapsMode(zr7Var.a.n, gt7.f(zr7Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return lq1.M(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (gt7.c(this.g.b)) {
            return null;
        }
        return r47.v(this.g).n;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return r47.w(this.g, i).n;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return r47.x(this.g, i).n;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new dv6(0, this.g.a.n.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        io.sentry.android.core.v0.j("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((k64) this.a.n).d.invoke(new af3(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x026d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        xo xoVar;
        long jH;
        int i;
        int iQ;
        ws7 ws7VarD;
        int iQ2;
        ws7 ws7VarD2;
        int iQ3;
        int iQ4;
        int iQ5;
        int iQ6;
        int iQ7;
        us7 us7Var;
        if (Build.VERSION.SDK_INT >= 34) {
            byte bQ = 3;
            bQ = 3;
            bQ = 3;
            y46 y46Var = new y46(this, bQ);
            j64 j64Var = this.c;
            if (j64Var != null && (xoVar = j64Var.j) != null) {
                ws7 ws7VarD3 = j64Var.d();
                if (xoVar.equals((ws7VarD3 == null || (us7Var = ws7VarD3.a.a) == null) ? null : us7Var.a)) {
                    boolean zQ = w7.q(handwritingGesture);
                    byte b = 1;
                    pr7 pr7Var = this.d;
                    if (zQ) {
                        SelectGesture selectGestureK = w7.k(handwritingGesture);
                        long jM = ds1.M(j64Var, ds1.m0(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() != 1 ? 0 : 1);
                        if (gt7.c(jM)) {
                            iQ7 = lq1.q(t43.n(selectGestureK), y46Var);
                        } else {
                            y46Var.invoke(new dv6((int) (jM >> 32), (int) (jM & 4294967295L)));
                            if (pr7Var != null) {
                                pr7Var.e(true);
                            }
                            bQ = 1;
                        }
                    } else if (t43.A(handwritingGesture)) {
                        DeleteGesture deleteGestureL = t43.l(handwritingGesture);
                        int i2 = deleteGestureL.getGranularity() != 1 ? 0 : 1;
                        long jM2 = ds1.M(j64Var, ds1.m0(deleteGestureL.getDeletionArea()), i2);
                        if (gt7.c(jM2)) {
                            iQ6 = lq1.q(t43.n(deleteGestureL), y46Var);
                        } else {
                            lq1.y(jM2, xoVar, i2 == 1, y46Var);
                            bQ = 1;
                        }
                    } else if (t43.C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureQ = t43.q(handwritingGesture);
                        long jN = ds1.N(j64Var, ds1.m0(selectRangeGestureQ.getSelectionStartArea()), ds1.m0(selectRangeGestureQ.getSelectionEndArea()), selectRangeGestureQ.getGranularity() != 1 ? 0 : 1);
                        if (gt7.c(jN)) {
                            iQ5 = lq1.q(t43.n(selectRangeGestureQ), y46Var);
                        } else {
                            y46Var.invoke(new dv6((int) (jN >> 32), (int) (jN & 4294967295L)));
                            if (pr7Var != null) {
                                pr7Var.e(true);
                            }
                            bQ = 1;
                        }
                    } else if (t43.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM = t43.m(handwritingGesture);
                        int i3 = deleteRangeGestureM.getGranularity() != 1 ? 0 : 1;
                        long jN2 = ds1.N(j64Var, ds1.m0(deleteRangeGestureM.getDeletionStartArea()), ds1.m0(deleteRangeGestureM.getDeletionEndArea()), i3);
                        if (gt7.c(jN2)) {
                            iQ4 = lq1.q(t43.n(deleteRangeGestureM), y46Var);
                        } else {
                            lq1.y(jN2, xoVar, i3 == 1, y46Var);
                            bQ = 1;
                        }
                    } else {
                        boolean zV = t43.v(handwritingGesture);
                        ee8 ee8Var = this.e;
                        if (zV) {
                            JoinOrSplitGesture joinOrSplitGestureO = t43.o(handwritingGesture);
                            if (ee8Var == null) {
                                iQ3 = lq1.q(t43.z(joinOrSplitGestureO), y46Var);
                            } else {
                                int iL = ds1.L(j64Var, ds1.p0(joinOrSplitGestureO.getJoinOrSplitPoint()), ee8Var);
                                if (iL == -1 || ((ws7VarD2 = j64Var.d()) != null && ds1.S(ws7VarD2.a, iL))) {
                                    bQ = lq1.q(t43.n(joinOrSplitGestureO), y46Var);
                                } else {
                                    int iCharCount = iL;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(xoVar, iCharCount);
                                        if (!ds1.V(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iL < xoVar.n.length()) {
                                        int iCodePointAt = Character.codePointAt(xoVar, iL);
                                        if (!ds1.V(iCodePointAt)) {
                                            break;
                                        } else {
                                            iL += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jA = h57.a(iCharCount, iL);
                                    if (gt7.c(jA)) {
                                        int i4 = (int) (jA >> 32);
                                        y46Var.invoke(new u43(new e82[]{new dv6(i4, i4), new cx0(" ", 1)}));
                                    } else {
                                        lq1.y(jA, xoVar, false, y46Var);
                                    }
                                    bQ = 1;
                                }
                            }
                        } else if (w7.v(handwritingGesture)) {
                            InsertGesture insertGestureJ = w7.j(handwritingGesture);
                            if (ee8Var == null) {
                                iQ2 = lq1.q(t43.z(insertGestureJ), y46Var);
                            } else {
                                int iL2 = ds1.L(j64Var, ds1.p0(insertGestureJ.getInsertionPoint()), ee8Var);
                                if (iL2 == -1 || ((ws7VarD = j64Var.d()) != null && ds1.S(ws7VarD.a, iL2))) {
                                    bQ = lq1.q(t43.n(insertGestureJ), y46Var);
                                } else {
                                    y46Var.invoke(new u43(new e82[]{new dv6(iL2, iL2), new cx0(insertGestureJ.getTextToInsert(), 1)}));
                                    bQ = 1;
                                }
                            }
                        } else if (w7.x(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureP = t43.p(handwritingGesture);
                            ws7 ws7VarD4 = j64Var.d();
                            vs7 vs7Var = ws7VarD4 != null ? ws7VarD4.a : null;
                            long jP0 = ds1.p0(removeSpaceGestureP.getStartPoint());
                            long jP1 = ds1.p0(removeSpaceGestureP.getEndPoint());
                            i04 i04VarC = j64Var.c();
                            if (vs7Var != null) {
                                xu4 xu4Var = vs7Var.b;
                                if (i04VarC == null) {
                                    jH = gt7.b;
                                } else {
                                    long jN3 = i04VarC.N(jP0);
                                    long jN4 = i04VarC.N(jP1);
                                    int iK = ds1.K(xu4Var, jN3, ee8Var);
                                    int iK2 = ds1.K(xu4Var, jN4, ee8Var);
                                    if (iK != -1) {
                                        if (iK2 != -1) {
                                            iK = Math.min(iK, iK2);
                                        }
                                        iK2 = iK;
                                    } else if (iK2 == -1) {
                                        jH = gt7.b;
                                    }
                                    float fB = (xu4Var.b(iK2) + xu4Var.f(iK2)) / 2.0f;
                                    int i5 = (int) (jN3 >> 32);
                                    int i6 = (int) (jN4 >> 32);
                                    jH = xu4Var.h(new v56(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB - 0.1f, Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB + 0.1f), 0, d82.N);
                                }
                            } else {
                                jH = gt7.b;
                            }
                            if (gt7.c(jH)) {
                                iQ = lq1.q(t43.n(removeSpaceGestureP), y46Var);
                            } else {
                                i76 i76Var = new i76();
                                i76Var.m = -1;
                                i76 i76Var2 = new i76();
                                i76Var2.m = -1;
                                String strE = new e96("\\s+").e(xoVar.subSequence(gt7.f(jH), gt7.e(jH)).n, new o43(i76Var, i76Var2, b));
                                int i7 = i76Var.m;
                                if (i7 == -1 || (i = i76Var2.m) == -1) {
                                    bQ = lq1.q(t43.n(removeSpaceGestureP), y46Var);
                                } else {
                                    int i8 = (int) (jH >> 32);
                                    y46Var.invoke(new u43(new e82[]{new dv6(i8 + i7, i8 + i), new cx0(strE.substring(i7, strE.length() - (gt7.d(jH) - i76Var2.m)), 1)}));
                                    bQ = 1;
                                }
                            }
                        } else {
                            bQ = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                bQ = iQ;
                bQ = iQ2;
                bQ = iQ3;
                bQ = iQ4;
                bQ = iQ5;
                bQ = iQ6;
                bQ = iQ7;
                return;
            }
            if (executor != null) {
                executor.execute(new jq((byte) 0, bQ, intConsumer));
            } else {
                intConsumer.accept(bQ);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        j64 j64Var;
        xo xoVar;
        us7 us7Var;
        if (Build.VERSION.SDK_INT >= 34 && (j64Var = this.c) != null && (xoVar = j64Var.j) != null) {
            ws7 ws7VarD = j64Var.d();
            if (xoVar.equals((ws7VarD == null || (us7Var = ws7VarD.a.a) == null) ? null : us7Var.a)) {
                boolean zQ = w7.q(previewableHandwritingGesture);
                byte b = 1;
                n43 n43Var = n43.m;
                pr7 pr7Var = this.d;
                if (zQ) {
                    SelectGesture selectGestureK = w7.k(previewableHandwritingGesture);
                    if (pr7Var != null) {
                        long jM = ds1.M(j64Var, ds1.m0(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() != 1 ? 0 : 1);
                        j64 j64Var2 = pr7Var.d;
                        if (j64Var2 != null) {
                            j64Var2.f(jM);
                        }
                        j64 j64Var3 = pr7Var.d;
                        if (j64Var3 != null) {
                            j64Var3.e(gt7.b);
                        }
                        if (!gt7.c(jM)) {
                            pr7Var.u(false);
                            pr7Var.r(n43Var);
                        }
                    }
                } else if (t43.A(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureL = t43.l(previewableHandwritingGesture);
                    if (pr7Var != null) {
                        long jM2 = ds1.M(j64Var, ds1.m0(deleteGestureL.getDeletionArea()), deleteGestureL.getGranularity() != 1 ? 0 : 1);
                        j64 j64Var4 = pr7Var.d;
                        if (j64Var4 != null) {
                            j64Var4.e(jM2);
                        }
                        j64 j64Var5 = pr7Var.d;
                        if (j64Var5 != null) {
                            j64Var5.f(gt7.b);
                        }
                        if (!gt7.c(jM2)) {
                            pr7Var.u(false);
                            pr7Var.r(n43Var);
                        }
                    }
                } else if (t43.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureQ = t43.q(previewableHandwritingGesture);
                    if (pr7Var != null) {
                        long jN = ds1.N(j64Var, ds1.m0(selectRangeGestureQ.getSelectionStartArea()), ds1.m0(selectRangeGestureQ.getSelectionEndArea()), selectRangeGestureQ.getGranularity() != 1 ? 0 : 1);
                        j64 j64Var6 = pr7Var.d;
                        if (j64Var6 != null) {
                            j64Var6.f(jN);
                        }
                        j64 j64Var7 = pr7Var.d;
                        if (j64Var7 != null) {
                            j64Var7.e(gt7.b);
                        }
                        if (!gt7.c(jN)) {
                            pr7Var.u(false);
                            pr7Var.r(n43Var);
                        }
                    }
                } else if (t43.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM = t43.m(previewableHandwritingGesture);
                    if (pr7Var != null) {
                        long jN2 = ds1.N(j64Var, ds1.m0(deleteRangeGestureM.getDeletionStartArea()), ds1.m0(deleteRangeGestureM.getDeletionEndArea()), deleteRangeGestureM.getGranularity() != 1 ? 0 : 1);
                        j64 j64Var8 = pr7Var.d;
                        if (j64Var8 != null) {
                            j64Var8.e(jN2);
                        }
                        j64 j64Var9 = pr7Var.d;
                        if (j64Var9 != null) {
                            j64Var9.f(gt7.b);
                        }
                        if (!gt7.c(jN2)) {
                            pr7Var.u(false);
                            pr7Var.r(n43Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new uz0(pr7Var, b));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        u54 u54Var;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            u54Var = ((k64) this.a.n).m;
            synchronized (u54Var.c) {
                try {
                    u54Var.f = z2;
                    u54Var.g = z3;
                    u54Var.h = z5;
                    u54Var.i = z;
                    if (z6) {
                        u54Var.e = true;
                        if (u54Var.j != null) {
                            u54Var.a();
                        }
                    }
                    u54Var.d = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        u54Var = ((k64) this.a.n).m;
        synchronized (u54Var.c) {
            u54Var.f = z2;
            u54Var.g = z3;
            u54Var.h = z5;
            u54Var.i = z;
            if (z6) {
                u54Var.e = true;
                if (u54Var.j != null) {
                    u54Var.a();
                }
            }
            u54Var.d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((k64) this.a.n).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new av6(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new bv6(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new dv6(i, i2));
        return true;
    }
}
