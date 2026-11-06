package o;

import java.text.Collator;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox0 implements Comparator {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Comparator f1686o;

    public /* synthetic */ ox0(Object obj, Comparator comparator, byte b) {
        this.m = b;
        this.n = obj;
        this.f1686o = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.m;
        Comparator comparator = this.f1686o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
            default:
                Function1 function1 = (Function1) obj3;
                Collator collator = (Collator) comparator;
                String string = ub7.y0((String) function1.invoke(obj)).toString();
                String string2 = ub7.y0((String) function1.invoke(obj2)).toString();
                int iB = qs1.B(string);
                int iB2 = qs1.B(string2);
                return iB != iB2 ? iB - iB2 : collator.compare(string, string2);
        }
    }
}
