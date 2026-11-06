package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk implements Comparator {
    public final /* synthetic */ byte m;

    public /* synthetic */ hk(byte b) {
        this.m = b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return im3.t(((vs5) obj2).a ? 1 : 0, ((vs5) obj).a ? 1 : 0);
            case 1:
                return ((String) obj2).length() - ((String) obj).length();
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 3:
                return im3.t(((tm3) obj).b, ((tm3) obj2).b);
            case 4:
                yk3 yk3Var = (yk3) obj;
                yk3 yk3Var2 = (yk3) obj2;
                return (yk3Var.n - yk3Var.m) - (yk3Var2.n - yk3Var2.m);
            case 5:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                return layoutNode.J() == layoutNode2.J() ? im3.t(layoutNode.G(), layoutNode2.G()) : Float.compare(layoutNode.J(), layoutNode2.J());
            case 6:
                return im3.t(((p44) obj).a, ((p44) obj2).a);
            case 7:
                return ((h00) obj).a.compareTo(((h00) obj2).a);
            case 8:
                j22 j22Var = (j22) obj;
                j22 j22Var2 = (j22) obj2;
                j22Var.getClass();
                j22Var2.getClass();
                int i2 = j22Var.m;
                int i3 = j22Var2.m;
                if (i2 != i3) {
                    if (i2 > i3) {
                        return -1;
                    }
                    return 1;
                }
                int i4 = j22Var.n;
                int i5 = j22Var2.n;
                if (i4 != i5) {
                    if (i4 > i5) {
                        return -1;
                    }
                    return 1;
                }
                int i6 = j22Var.f1122o;
                int i7 = j22Var2.f1122o;
                if (i6 != i7) {
                    if (i6 > i7) {
                        return -1;
                    }
                    return 1;
                }
                int i8 = j22Var.p;
                int i9 = j22Var2.p;
                if (i8 == i9) {
                    return 0;
                }
                if (i8 > i9) {
                    return -1;
                }
                return 1;
            default:
                return ((Number) pp6.b.invoke(obj, obj2)).intValue();
        }
    }
}
