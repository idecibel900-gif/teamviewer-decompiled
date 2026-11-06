package o;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class om5 implements jm5 {
    public final de1 a;
    public final Context b;
    public final go6 c;
    public final kd4 d;
    public TextClassifier f;
    public final my4 e = new my4();
    public final bg5 g = h57.p(null);
    public final Object h = new Object();

    public om5(de1 de1Var, Context context, go6 go6Var, kd4 kd4Var) {
        this.a = de1Var;
        this.b = context;
        this.c = go6Var;
        this.d = kd4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(CharSequence charSequence, long j, TextClassifier textClassifier, jc1 jc1Var) throws Throwable {
        lm5 lm5Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        my4 my4Var;
        Object obj;
        Object obj2;
        bp7 bp7VarB;
        Object obj3;
        ky4 ky4Var;
        if (jc1Var instanceof lm5) {
            lm5Var = (lm5) jc1Var;
            int i = lm5Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                lm5Var.s = i - Integer.MIN_VALUE;
            } else {
                lm5Var = new lm5(this, jc1Var);
            }
        } else {
            lm5Var = new lm5(this, jc1Var);
        }
        Object obj4 = lm5Var.q;
        int i2 = lm5Var.s;
        bg5 bg5Var = this.g;
        f88 f88Var = f88.a;
        my4 my4Var2 = this.e;
        ne1 ne1Var = ne1.m;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = lm5Var.p;
                        my4 my4Var3 = lm5Var.f1381o;
                        textClassifier2 = (TextClassifier) lm5Var.n;
                        charSequence2 = (CharSequence) lm5Var.m;
                        ct1.a0(obj4);
                        my4Var = my4Var3;
                    } else {
                        if (i2 != 2) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ky4 ky4Var2 = (ky4) lm5Var.n;
                        bp7VarB = (bp7) lm5Var.m;
                        ct1.a0(obj4);
                        obj3 = null;
                        ky4Var = ky4Var2;
                    }
                    bg5Var.setValue(bp7VarB);
                    return f88Var;
                }
                ct1.a0(obj4);
                lm5Var.m = charSequence;
                lm5Var.n = textClassifier;
                lm5Var.f1381o = my4Var2;
                j2 = j;
                lm5Var.p = j2;
                lm5Var.s = 1;
                if (my4Var2.e(lm5Var) == ne1Var) {
                    return ne1Var;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                my4Var = my4Var2;
                bg5Var.setValue(bp7VarB);
                return f88Var;
            } finally {
                ky4Var.j(obj3);
            }
            bp7 bp7Var = (bp7) bg5Var.getValue();
            if (bp7Var != null) {
                try {
                    if (gt7.b(j2, bp7Var.b) && im3.n(charSequence2, bp7Var.a)) {
                        my4Var.j(null);
                        return f88Var;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    my4Var.j(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            my4Var.j(obj2);
            bp7VarB = b(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, gt7.f(j2), gt7.e(j2)).setDefaultLocales(c()).build()));
            lm5Var.m = bp7VarB;
            lm5Var.n = my4Var2;
            obj3 = null;
            lm5Var.f1381o = null;
            lm5Var.s = 2;
            Object objE = my4Var2.e(lm5Var);
            ky4Var = my4Var2;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final bp7 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction remoteAction = (RemoteAction) obj;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteAction2 = (RemoteAction) obj;
            if (remoteAction2 != null && (icon = remoteAction2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new bp7(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        kd4 kd4Var = this.d;
        if (kd4Var == null) {
            return new LocaleList(((jd4) vl5.a.y().m.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(mv0.Z(kd4Var, 10));
        Iterator it = kd4Var.m.iterator();
        while (it.hasNext()) {
            arrayList.add(((jd4) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
