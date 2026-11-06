package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class l34 implements Comparator {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ae n;

    public /* synthetic */ l34(ae aeVar, byte b) {
        this.m = b;
        this.n = aeVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.m;
        ae aeVar = this.n;
        switch (b) {
            case 0:
                return Integer.valueOf(aeVar.g(((p44) obj).i)).compareTo(Integer.valueOf(aeVar.g(((p44) obj2).i)));
            case 1:
                return Integer.valueOf(aeVar.g(((p44) obj).i)).compareTo(Integer.valueOf(aeVar.g(((p44) obj2).i)));
            case 2:
                return Integer.valueOf(aeVar.g(((p44) obj2).i)).compareTo(Integer.valueOf(aeVar.g(((p44) obj).i)));
            default:
                return Integer.valueOf(aeVar.g(((p44) obj2).i)).compareTo(Integer.valueOf(aeVar.g(((p44) obj).i)));
        }
    }
}
