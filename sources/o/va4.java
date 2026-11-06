package o;

import com.teamviewer.chatviewmodel.swig.ListChangeArgs;
import com.teamviewer.chatviewmodel.swig.SizeTVector;

/* JADX INFO: loaded from: classes.dex */
public abstract class va4 extends d66 {
    public final lf1 h(ListChangeArgs listChangeArgs) {
        ListChangeArgs.ListChangeType listChangeTypeGetListChangeType = listChangeArgs.GetListChangeType();
        int i = listChangeTypeGetListChangeType == null ? -1 : ua4.a[listChangeTypeGetListChangeType.ordinal()];
        e66 e66Var = this.a;
        int iMax = 0;
        if (i == 1) {
            SizeTVector sizeTVectorGetNewPositions = listChangeArgs.GetNewPositions();
            sizeTVectorGetNewPositions.getClass();
            int iA = a();
            for (ta4 ta4Var : ct1.X(sizeTVectorGetNewPositions)) {
                int i2 = ta4Var.a;
                int i3 = ta4Var.b;
                e66Var.e(i2, i3);
                iA = (int) Math.min(i2, iA);
                iMax = (int) Math.max((i2 + i3) - 1, iMax);
            }
            return new lf1(iA, iMax, (byte) 3);
        }
        if (i == 2) {
            SizeTVector sizeTVectorGetOldPositions = listChangeArgs.GetOldPositions();
            sizeTVectorGetOldPositions.getClass();
            for (ta4 ta4Var2 : ct1.X(sizeTVectorGetOldPositions)) {
                e66Var.f(ta4Var2.a, ta4Var2.b);
            }
        } else {
            if (i == 3) {
                SizeTVector sizeTVectorGetOldPositions2 = listChangeArgs.GetOldPositions();
                sizeTVectorGetOldPositions2.getClass();
                SizeTVector sizeTVectorGetNewPositions2 = listChangeArgs.GetNewPositions();
                sizeTVectorGetNewPositions2.getClass();
                int iA2 = a();
                int size = sizeTVectorGetOldPositions2.size();
                if (size == sizeTVectorGetNewPositions2.size()) {
                    int iMax2 = 0;
                    while (iMax < size) {
                        int iLongValue = (int) sizeTVectorGetNewPositions2.get(iMax).longValue();
                        e66Var.c((int) sizeTVectorGetOldPositions2.get(iMax).longValue(), iLongValue);
                        double d = iLongValue;
                        iA2 = (int) Math.min(d, iA2);
                        iMax2 = (int) Math.max(d, iMax2);
                        iMax++;
                    }
                    iMax = iMax2;
                }
                return new lf1(iA2, iMax, (byte) 3);
            }
            if (i != 4) {
                if (i != 5) {
                    d();
                    return null;
                }
                d();
                return null;
            }
            SizeTVector sizeTVectorGetOldPositions3 = listChangeArgs.GetOldPositions();
            sizeTVectorGetOldPositions3.getClass();
            for (ta4 ta4Var3 : ct1.X(sizeTVectorGetOldPositions3)) {
                e66Var.d(ta4Var3.a, ta4Var3.b, null);
            }
        }
        return null;
    }
}
