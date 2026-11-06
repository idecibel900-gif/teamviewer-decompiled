package o;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: loaded from: classes.dex */
public final class nm5 extends og7 implements hw2 {
    public my4 m;
    public om5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1579o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CharSequence r;
    public final /* synthetic */ long s;
    public final /* synthetic */ om5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm5(long j, CharSequence charSequence, hc1 hc1Var, om5 om5Var) {
        super(2, hc1Var);
        this.r = charSequence;
        this.s = j;
        this.t = om5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        nm5 nm5Var = new nm5(this.s, this.r, hc1Var, this.t);
        nm5Var.q = obj;
        return nm5Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((nm5) create((TextClassifier) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        long j;
        my4 my4Var;
        om5 om5Var;
        bp7 bp7Var;
        byte b = this.p;
        if (b == 0) {
            ct1.a0(obj);
            TextClassifier textClassifier = (TextClassifier) this.q;
            long j2 = this.s;
            int iF = gt7.f(j2);
            int iE = gt7.e(j2);
            CharSequence charSequence = this.r;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iF, iE);
            om5 om5Var2 = this.t;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(om5Var2.c());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jA = h57.a(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            ne1 ne1Var = ne1.m;
            if (i < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f1579o = jA;
                this.p = (byte) 2;
                if (this.t.a(this.r, jA, textClassifier, this) != ne1Var) {
                    j = jA;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                bp7 bp7VarB = om5Var2.b(charSequence, jA, textClassification);
                my4Var = om5Var2.e;
                this.q = bp7VarB;
                this.m = my4Var;
                this.n = om5Var2;
                this.f1579o = jA;
                this.p = (byte) 1;
                if (my4Var.e(this) != ne1Var) {
                    om5Var = om5Var2;
                    bp7Var = bp7VarB;
                    j = jA;
                    om5Var.g.setValue(bp7Var);
                }
            }
            return ne1Var;
        }
        if (b == 1) {
            j = this.f1579o;
            om5Var = this.n;
            my4Var = this.m;
            bp7Var = (bp7) this.q;
            ct1.a0(obj);
            try {
                om5Var.g.setValue(bp7Var);
            } finally {
                my4Var.j(null);
            }
        } else {
            if (b != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f1579o;
            ct1.a0(obj);
        }
        return new gt7(j);
    }
}
