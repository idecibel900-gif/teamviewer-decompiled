package o;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bp7 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public bp7(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp7)) {
            return false;
        }
        bp7 bp7Var = (bp7) obj;
        return im3.n(this.a, bp7Var.a) && gt7.b(this.b, bp7Var.b) && im3.n(this.c, bp7Var.c) && this.d.equals(bp7Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = gt7.c;
        return this.d.hashCode() + ((this.c.hashCode() + fx3.c(iHashCode, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + gt7.h(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
