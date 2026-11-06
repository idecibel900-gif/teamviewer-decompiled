package o;

/* JADX INFO: loaded from: classes.dex */
public final class rc {
    public final /* synthetic */ byte a;

    public /* synthetic */ rc(byte b) {
        this.a = b;
    }

    public final Object a(s1 s1Var) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.a) {
            case 0:
                oc ocVar = (oc) s1Var;
                yh0 yh0VarM = ocVar.m();
                int size = yh0VarM.size();
                if (size == 0) {
                    bArr = sl3.b;
                } else {
                    byte[] bArr3 = new byte[size];
                    yh0VarM.d(bArr3, size);
                    bArr = bArr3;
                }
                return new mc(bArr, n67.u(ocVar.n().p()), ocVar.n().o(), n67.u(ocVar.n().q().n()), ocVar.n().q().o(), ocVar.n().m());
            default:
                yc ycVar = (yc) s1Var;
                yh0 yh0VarM2 = ycVar.m();
                int size2 = yh0VarM2.size();
                if (size2 == 0) {
                    bArr2 = sl3.b;
                } else {
                    byte[] bArr4 = new byte[size2];
                    yh0VarM2.d(bArr4, size2);
                    bArr2 = bArr4;
                }
                return new wc(ycVar.n().o(), ycVar.n().m(), n67.u(ycVar.n().p()), bArr2);
        }
    }
}
